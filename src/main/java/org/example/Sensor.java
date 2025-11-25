package org.example;

import javax.swing.*;
import java.util.ArrayList;

public class Sensor {
    private String name;
    private ArrayList<SensorReading> readings = new ArrayList<>();

    public Room(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }


    public void addReading(SensorReading reading) {
        readings.add(reading);
    }

    public ArrayList<SensorReading> getReadings() {
        return readings;
    }