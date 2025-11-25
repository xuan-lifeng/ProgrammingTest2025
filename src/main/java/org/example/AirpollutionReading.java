package org.example;

public class AirpollutionReading extends SensorReading {
    private int currentPollution;
    private boolean airPurifierON;
    public AirpollutionReading(String sensorname, int currentPollution, boolean airPurifierON) {
        super(sensorname);
        this.currentPollution = currentPollution;
        this.airPurifierON = false;
    }
    public int getCurrentPollution() {
        return currentPollution;
    }
    public boolean isAirPurifierON() {
        return airPurifierON;
    }
    @Override
    public String getSensorSummary() {
        return "Current air pollution " + currentPollution ;
    }
}
