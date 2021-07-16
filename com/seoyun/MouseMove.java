package com.seoyun;

import java.awt.*;

public class MouseMove {

    public static void main(String[] args) {

        new WindowBox();

        try {
            while (true) {
                Robot robot = new Robot();

                robot.mouseMove(100, 100);
                robot.delay(5000);
                robot.mouseMove(300, 100);
                robot.delay(5000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}