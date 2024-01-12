package com.fy.gui.patient;

import javax.swing.*;

public class YIZHU {
    static JFrame j = new JFrame();
    public YIZHU(String p) throws Exception {
        JPanel jPanel = new JPanel();
        j.add(jPanel.add(new testC(j,1,p)));
        j.setVisible(true);
        j.setDefaultCloseOperation(2);
    }
}
