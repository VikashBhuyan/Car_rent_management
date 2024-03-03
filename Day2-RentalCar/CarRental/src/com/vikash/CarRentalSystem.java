package com.vikash;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CarRentalSystem {
	private List<Car> cars;
    private List<Booking> bookings;
    private List<CarOwner> carOwners;
    private List<Customer> customers;

     public CarRentalSystem(){
        this.cars = new ArrayList<>();
        this.bookings = new ArrayList<>();
        this.carOwners = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    // Method to add a car to the system
    public void addCar(Car car) {
        cars.add(car);
    }

    // Method to add a booking to the system
    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    // Method to add a car owner to the system
    public void addCarOwner(CarOwner carOwner) {
        carOwners.add(carOwner);
    }

    // Method to add a customer to the system
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Method to save data to a file
    public void saveDataToFile() {
        try {
            FileOutputStream fileOut = new FileOutputStream("data.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(cars);
            out.writeObject(bookings);
            out.writeObject(carOwners);
            out.writeObject(customers);
            out.close();
            fileOut.close();
            System.out.println("Data saved to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to load data from a file
    public void loadDataFromFile() {
        try {
            FileInputStream fileIn = new FileInputStream("data.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            cars = (List<Car>) in.readObject();
            bookings = (List<Booking>) in.readObject();
            carOwners = (List<CarOwner>) in.readObject();
            customers = (List<Customer>) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Data loaded from file successfully.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
