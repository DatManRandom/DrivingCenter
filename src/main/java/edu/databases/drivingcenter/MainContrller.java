package edu.databases.drivingcenter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.databases.drivingcenter.Entities.Customer;
import edu.databases.drivingcenter.Entities.Request;
import edu.databases.drivingcenter.Repositories.CustomerRepository;
import edu.databases.drivingcenter.Repositories.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/DrivingCenter")
public class MainContrller {
    @Autowired
    RequestRepository requestRepository;

    @Autowired
    CustomerRepository customerRepository;

    /*@GetMapping(path = "findCustomers", produces = "application/json")
    public RequestEntity<String> findCustomers(@RequestParam int ID) {
        userRepository.findByCustomer_ID(ID).toString();
    }*/

    @PostMapping(path = "/saveRequest", consumes = "application/json", produces = "application/json")
    public ResponseEntity test(@RequestBody String request) throws JsonProcessingException {
        ObjectMapper ob = new ObjectMapper();
        Request in = ob.readValue(request, Request.class);
        System.out.println(in);
        requestRepository.save(in);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping(path = "/saveCustomer", consumes = "application/json", produces = "application/json")
    public ResponseEntity test2(@RequestBody String customer) throws JsonProcessingException {
        ObjectMapper ob = new ObjectMapper();
        Customer in = ob.readValue(customer, Customer.class);
        System.out.println(in);
        customerRepository.save(in);
        return new ResponseEntity(HttpStatus.OK);
    }
}
