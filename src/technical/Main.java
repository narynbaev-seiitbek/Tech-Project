package technical;

import technical.appliaces.Blender;
import technical.appliaces.Fridge;
import technical.appliaces.Microwave;
import technical.militaryEquipment.Rocket;
import technical.militaryEquipment.Tank;
import technical.vehicle.Bus;
import technical.vehicle.Car;
import technical.vehicle.Truck;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Mercedes Benz","Germany",
                LocalDate.of(2010,04,15),"S-Class",4.5);
        Bus bus = new Bus("Honda","Japan",LocalDate.of(1998,02,
                10), "Bus15",48);
        Truck truck = new Truck("Ford","USA",
                LocalDate.of(2005,05,21),"Ford Truck");

        Blender blender = new Blender("Blender","Red","Appliances","Stationary");
        Microwave microwave = new Microwave("Microwave","Black","Appliances","Sensory");
        Fridge fridge = new Fridge("Fridge","Blue","Appliances",80.5,195,"Samsung");

        Tank tank = new Tank("Tank","Russia",30,"T-34","Armor steel");
        Rocket rocket = new Rocket("Rocket","Russia",500,"cruise missile",5500);

        System.out.println(tank);
        System.out.println(blender);
        System.out.println(car);














    }
}
