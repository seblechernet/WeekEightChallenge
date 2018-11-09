package seb.com.weekeight.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import seb.com.weekeight.Model.Car;
import seb.com.weekeight.Repository.CarRepository;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CarRepository cars;

    @Override
    public void run(String... strings) throws Exception {





        Car car1=new Car();
        car1.setVinNumber("1111");
        car1.setMake("Toyota");
        car1.setModel("TYT001");
        car1.setYear("2014");
        cars.save(car1);

        Car car2=new Car();
        car2.setVinNumber("2222");
        car2.setMake("Mazda");
        car2.setModel("MZD002");
        car2.setYear("2018");
        cars.save(car2);

        Car car3=new Car();
        car3.setVinNumber("3333");
        car3.setMake("Honda");
        car3.setModel("HND003");
        car3.setYear("2016");
        cars.save(car3);






    }
}
