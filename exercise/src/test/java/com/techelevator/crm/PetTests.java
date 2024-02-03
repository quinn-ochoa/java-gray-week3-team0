package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PetTests {
    //test if vaccinations list if it printed outcorrectly
    
    @Test
    public void return_vaccination_list() {
        //arrange
        Pet test = new Pet("Zoie", "Corgi");

        List<String> sampleLists = new ArrayList<>();
        sampleLists.add("rabies");
        sampleLists.add("distemper");
        sampleLists.add("parvo");

        test.setVaccinations(sampleLists);

        String actual = test.listVaccinations();

        //act

        String result = "rabies, distemper, parvo";
        //assert

        Assert.assertEquals( result, actual);
        }

    }

