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
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

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
    public ResponseEntity saveRequest(@RequestBody String request) throws JsonProcessingException {
        ObjectMapper ob = new ObjectMapper();
        Request in = ob.readValue(request, Request.class);
        return new ResponseEntity(requestRepository.save(in), HttpStatus.OK);
    }

    @PostMapping(path = "/saveCustomer", consumes = "application/json", produces = "application/json")
    public ResponseEntity saveCustomer(@RequestBody String customer) throws JsonProcessingException {
        ObjectMapper ob = new ObjectMapper();
        Customer in = ob.readValue(customer, Customer.class);
        return new ResponseEntity(customerRepository.save(in), HttpStatus.OK);
    }

    @GetMapping(path = "/getAllCustomers", produces = "application/json")
    public ResponseEntity<String> getAllCustomer() {
        List<Customer> customerList = customerRepository.findAll();
        String out = "[";
        for (Customer customer : customerList) {
            out += customer.toString() + ",";
        }
        out = out.substring(0, out.length() - 1) + "]";

        return new ResponseEntity<>(out, HttpStatus.OK);
    }

    @GetMapping(path = "/getCustomerById", produces = "application/json")
    public ResponseEntity<String> getCustomerByFirstName(@RequestParam int Id) {
        Optional<Customer> customer = customerRepository.findById(Id);
        return new ResponseEntity<>(customer.get().toString(), HttpStatus.OK);
    }
}
