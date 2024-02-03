package com.techelevator.crm;

import com.techelevator.hr.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class EmployeeTests {
        Employee employee = new Employee("Person", "Name");
        @Test
        public void test(){
            Map<String,Double> employeeFee = new HashMap<>();
            employeeFee.put("Walking", 30.0);
            employeeFee.put("Bathing", 20.0);
            employeeFee.put("Grooming", 30.0);
            employeeFee.put("Dancing Lessons", 500.0);
            double actual = employee.getBalanceDue(employeeFee);
            Assert.assertEquals(565.0,actual,.001);
        }
    }

