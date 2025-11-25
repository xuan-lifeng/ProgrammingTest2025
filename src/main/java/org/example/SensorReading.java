package org.example;

import javax.swing.*;

public abstract class SensorReading {
    private String sensorName;
    public SensorReading(String sensorName) {
        this.sensorName = sensorName;
    }
    public String getSensorName() {
        return sensorName;
    }
    public abstract String getSensorSummary();

    public JComponent getDashboardComponent() {
        return new JLabel(getSensorSummary());
    }
}

