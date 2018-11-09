package seb.com.weekeight.Repository;

import org.springframework.data.repository.CrudRepository;
import seb.com.weekeight.Model.Car;

public interface CarRepository extends CrudRepository<Car,Long> {

}
