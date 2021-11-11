package com.example.DBSpringBootProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
    @Autowired
    HitachiHD hitachiHD;
    public void showDetails()

    {
        hitachiHD.setId(1);
        hitachiHD.setCapacity(521);
        System.out.println("Hitachi Hard Drive Id :" + hitachiHD.getId() + "and Capacity is " + hitachiHD.getCapacity());
    }
}
