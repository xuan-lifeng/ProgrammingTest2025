package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            //Create sensors and readings

            List<SensorReading> sensors = new ArrayList<>();
            Sensor s1 = new Sensor("NorthTemp");
            s1.addReading(new TemperatureReading("Temperature Sensor", "North ward", 23.8,25.7);
            Sensor s2 = new Sensor("CentralTemp");
            s2.addReading(new TemperatureReading("Temperature Sensor", "Central ward", 23.8,25.7);
            Sensor s3 = new Sensor("SouthTemp");
            s3.addReading(new TemperatureReading("Temperature Sensor", "South ward", 23.8,25.7);
            Sensor s4 = new Sensor("Humidity Sensor");
            s4.addReading(new HumidityReading()"Humidity Sensor");
            Sensor s5 = new Sensor("Air pollution");
            s4.addReading(new AirpollutionReading()"Air pollution Sensor");



            JFrame frame;

            //Build GUI

            JFrame frame = new JFrame("Sensor Monitoring");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(900, 600);
            frame.setLayout(new BorderLayout());

            frame.add(BorderLayout.CENTER);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}