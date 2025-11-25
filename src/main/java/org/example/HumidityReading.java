package org.example;

public class HumidityReading extends SensorReading {
    private int insideHumidity;
    private int outsideHumidity;
    private boolean dehumifierON;
    public HumiditySensor(String sensorname, int insideHumidity, int outsideHumidity, boolean dehumifierON) {
        super(sensorname);
        this.insideHumidity = insideHumidity;
        this.outsideHumidity = outsideHumidity;
        this.dehumifierON =false ;
    }
    public int getInsideHumidity() {
        return insideHumidity;
    }
    public int getOutsideHumidity() {
        return outsideHumidity;
    }
    public boolean dehumifierON(){
        return dehumifierON;
    }
}
