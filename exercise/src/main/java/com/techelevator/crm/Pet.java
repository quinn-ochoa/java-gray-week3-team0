package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    //properties
    private String name;
    private String species;
    private List<String> vaccinations = new ArrayList<>();
    //constructors
    public Pet (String name, String species) {
        this.name = name;
        this.species = species;

    }
    public Pet (String name, String species, List vaccinations) {
        this.name = name;
        this.species = species;

    }

    //getters and setters
    public String getName() {
        return name;
    }
    public String getSpecies() {
        return species;
    }
    public List<String> getVaccinations() {
        return vaccinations;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public void setVaccinations(List<String> vaccinations) {
        this.vaccinations = vaccinations;
    }
    //methods
    public String listVaccinations() {
        String message = "";

        for (int i = 0; i < vaccinations.size(); i++) {
            int lastIndex = vaccinations.size() -1;

            message += vaccinations.get(i).toString() +(i== lastIndex ? "":", ");
//            return ( vaccination.toString() + );
        }
        System.out.println(message);
        return message;
    }
}
