package com.seoyun;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class WindowBox extends JFrame {

    JLabel jl = new JLabel();
    JLabel jl2 = new JLabel();
    JPanel jPanel = new JPanel();

    public WindowBox() {

        super("move move");

        setSize(400, 200);

        myMouseListener listener = new myMouseListener();

        jl.setText("이것은 그저 마우스를 주기적으로 움직이는 프로그램이다.");
        jl.setFont(new Font("바탕체", Font.PLAIN, 14));
        addMouseMotionListener(listener);
        jPanel.add(jl);
        jPanel.add(jl2);

        add(jPanel);

        setLocation(0, 0);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }

    class myMouseListener implements MouseMotionListener {

        @Override
        public void mouseDragged(MouseEvent e) {

        }

        @Override
        public void mouseMoved(MouseEvent e) {
            LocalTime localTime = LocalTime.now();
            DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm:ss");
            String time = localTime.format(f);
            jl2.setText("[" + time + "] " + e.getX() + "." + e.getY() + " 으로 이동했음");
        }
    }

}
