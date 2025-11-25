package org.example;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class SensorPanel extends JPanel {

    public SensorPanel(Sensor sensor) {
        setLayout(new BorderLayout(10, 10));


        // Right: sensor details + readings
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));

        JLabel infoLabel = new JLabel("<html>"
                + "Room: " + sensor.getName() + "<br>"

        rightPanel.add(infoLabel);
        rightPanel.add(Box.createVerticalStrut(10));

        // Add readings (polymorphism used to format summary)
        for (SensorReading reading : sensor.getReadings()) {
            rightPanel.add(reading.getDashboardComponent());
        }

        add(rightPanel, BorderLayout.CENTER);
    }
}