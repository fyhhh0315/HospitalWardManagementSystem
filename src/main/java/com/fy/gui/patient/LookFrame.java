package com.fy.gui.patient;

import com.fy.builder.Pro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class LookFrame {
    static JTextArea adviceTextField;
     static void createAndShowGUI() {
        JFrame frame = new JFrame("医嘱");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());



        adviceTextField = new JTextArea(20, 45); // 设置输入框的列数和行数相同
        adviceTextField.setFont(new Font("宋体",0, 20));
         adviceTextField.setEditable(false);


         JScrollPane jScrollPane = new JScrollPane(adviceTextField);


        panel.add(jScrollPane);

        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(1);
    }
}
