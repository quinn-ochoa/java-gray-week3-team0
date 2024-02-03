package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CustomerTests {
    Customer customer = new Customer("Person", "Name");
    @Test
    public void test(){
        Map<String,Double> customerFee = new HashMap<>();
        customerFee.put("Walking", 15.0);
        customerFee.put("Bathing", 20.0);
        customerFee.put("Grooming", 30.0);
        customerFee.put("Dancing Lessons", 500.0);
        double actual = customer.getBalanceDue(customerFee);
        Assert.assertEquals(565.0,actual,.001);
    }
}
