package com.fy.gui.patient;

import javax.swing.*;

public class YIZHU2 {
    static JFrame j = new JFrame();
    public YIZHU2(String p) throws Exception {
        JPanel jPanel = new JPanel();
        j.add(jPanel.add(new testD(j,1,p)));
        j.setVisible(true);
        j.setDefaultCloseOperation(2);
    }
}
