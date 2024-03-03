package com.vikash;

import java.util.Date;

public class Main {


    public static void main(String[] args) {
        // Example usage
        Car car1 = new Car("AS01 3024", "Toyota Corolla",23,200);
        Car car2 = new Car("AS01 2034", "Aprilia RS457" , 30 ,150);

        Customer customer1 = new Customer("John Doe", "1234567890");
        Customer customer2 = new Customer("Jane Doe", "0987654321");

        CarOwner carOwner1 = new CarOwner("Alice", "1111111111");
        CarOwner carOwner2 = new CarOwner("Bob", "2222222222");

        Booking booking1 = new Booking(car1, new Date(), new Date(), customer1);
        Booking booking2 = new Booking(car2, new Date(), new Date(), customer2);

        CarRentalSystem carRentalSystem = new CarRentalSystem();
        carRentalSystem.addCar(car1);
        carRentalSystem.addCar(car2);
        carRentalSystem.addCustomer(customer1);
        carRentalSystem.addCustomer(customer2);
        carRentalSystem.addCarOwner(carOwner1);
        carRentalSystem.addCarOwner(carOwner2);
        carRentalSystem.addBooking(booking1);
        carRentalSystem.addBooking(booking2);

        // Save data to file
        carRentalSystem.saveDataToFile();

        // Load data from file
        CarRentalSystem newCarRentalSystem = new CarRentalSystem();
        newCarRentalSystem.loadDataFromFile();
    }

}
