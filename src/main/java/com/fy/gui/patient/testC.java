package com.fy.gui.patient;

import com.fy.bean.Doctor;
import com.fy.builder.DoctorMybatisBuilder;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;


    public class testC extends Box {


        final int WIDTH = 400;
        final int HEIGHT = 500;
        static  JTable jTable;
        Box topBox = Box.createHorizontalBox();

        static Vector<String> title = new Vector<>();
        static Vector<Vector> data = new Vector<>();
        static DefaultTableModel tableModel;
        static String spid;
        public testC(JFrame f, int axis,String pid) throws Exception {

            super(axis);
            spid = pid;
            f.setSize(WIDTH,HEIGHT);
            JButton insertCourse = new JButton("选择");
            f.setDefaultCloseOperation(1);
            insertCourse.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String dname = (String) jTable.getValueAt(jTable.getSelectedRow(), 0);
                    String nickname = (String) jTable.getValueAt(jTable.getSelectedRow(), 1);
                    Doctor doctor = DoctorMybatisBuilder.getDoctorBaseMapper().queryDoctor(Doctor.Build().Dname(dname).Dtitle(nickname).build()).get(0);

                    InputFrame.createAndShowGUI(doctor.getDno(),pid);
                    f.dispose();


                }
            });

            insertCourse.setBorderPainted(false);
            topBox.add(Box.createHorizontalStrut(80));
            topBox.add(insertCourse);

            topBox.add(Box.createHorizontalStrut(40));
            topBox.add(Box.createHorizontalStrut(40));
            JPanel centerPanel = new JPanel();
            centerPanel.setMaximumSize(new Dimension(500, 150));
            title.add("医生名");
            title.add("医生职位");

            tableModel = new DefaultTableModel(data, title);
            jTable = new JTable(tableModel) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            jTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);





            JScrollPane bottomPane = new JScrollPane(jTable);

            bottomPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
            topBox.setMaximumSize(new Dimension(WIDTH, 60));

            this.add(Box.createVerticalStrut(10));
            this.add(topBox);
            this.add(Box.createVerticalStrut(5));
            this.add(centerPanel);
            this.add(bottomPane);
        }
    }


