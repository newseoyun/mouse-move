package com.seoyun;

import java.awt.*;

public class MouseMove {

    public static void main(String[] args) {

        new WindowBox();

        try {
            Robot robot = new Robot();

            while (true) {
                PointerInfo pInfo = MouseInfo.getPointerInfo();
                robot.mouseMove(pInfo.getLocation().x + 1, pInfo.getLocation().y);
                robot.mouseMove(pInfo.getLocation().x, pInfo.getLocation().y);
                robot.delay(3000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
