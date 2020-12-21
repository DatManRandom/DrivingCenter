package edu.databases.drivingcenter.Repositories;

import edu.databases.drivingcenter.Entities.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    List<Customer> findAll();
}
