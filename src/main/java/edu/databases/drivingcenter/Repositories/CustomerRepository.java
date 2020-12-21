package edu.databases.drivingcenter.Repositories;

import edu.databases.drivingcenter.Entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
