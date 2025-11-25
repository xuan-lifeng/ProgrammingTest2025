package org.example;


public class TemperatureReading extends SensorReading {
    private String wardname;
    private double currentTemperature;
    private double idealTemperature;
    private boolean heatingON;
    public TemperatureReading(String sensorname, String wardname, double currentTemperature, double idealTemperature, boolean heatingON) {
        super(sensorname);
        this.wardname = wardname;
        this.currentTemperature = currentTemperature;
        this.idealTemperature = idealTemperature;
        this.heatingON = false;
    }
    public String getWardname() {
        return wardname;
    }
    public double getCurrentTemperature() {
        return currentTemperature;
    }
    public double getIdealTemperature() {
        return idealTemperature;
    }
    public boolean isHeatingON() {
    return heatingON;
    }
}
