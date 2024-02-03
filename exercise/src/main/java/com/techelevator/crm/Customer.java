package com.techelevator.crm;

import com.techelevator.Billable;
import com.techelevator.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Customer extends Person implements Billable {
    private String phoneNumber;
    private List<Pet> pets = new ArrayList<>();

    public Customer(String firstName, String lastName, String phoneNumber){
        super (firstName, lastName);
        this.phoneNumber = phoneNumber;
    }

    public Customer(String firstName, String lastName){
        this(firstName, lastName, "");
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public List<Pet> getPets(){
        return pets;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setPets(List pets){
        this.pets = pets;
    }
    public double getBalanceDue(Map<String, Double> customerFee){
        double totalFee = 0.0;
        for(Double cost: customerFee.values()){
            totalFee += cost;
        }
        return totalFee;
    }

}
