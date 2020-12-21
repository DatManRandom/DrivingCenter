package edu.databases.drivingcenter.Repositories;

import edu.databases.drivingcenter.Entities.Request;
import org.springframework.data.repository.CrudRepository;

public interface RequestRepository extends CrudRepository<Request, Integer> {

}
