package seb.com.weekeight.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import seb.com.weekeight.Model.Car;
import seb.com.weekeight.Repository.CarRepository;

@RestController
@RequestMapping

public class Controller {

    @Autowired
    CarRepository cars;


    @GetMapping("/listcars")
    @CrossOrigin
    public Iterable<Car> listCars(){

        return cars.findAll();
    }
    @PostMapping("/savecar")
    @CrossOrigin
    public String saveCar(@RequestBody Car car){
         cars.save(car);
        return "A car is been added";
    }

    @PostMapping("/delete")
    @CrossOrigin
    public String deletecar(@RequestBody Car car){
        cars.delete(car);
        return "A car is been deleted";
    }
    @PostMapping("/edit")
    @CrossOrigin
    public String editcar(@RequestBody Car car){

        return "A car is been edited";
    }
}
