package com.fy.gui.patient;

import com.fy.builder.Pro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class InputFrame {

     static void createAndShowGUI(String did,String pid) {
        JFrame frame = new JFrame("ҽ������");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());



        JTextArea adviceTextField = new JTextArea(20, 45); // ����������������������ͬ
        adviceTextField.setFont(new Font("����",0, 20));

        JButton submitButton = new JButton("�ύ");
        JScrollPane jScrollPane = new JScrollPane(adviceTextField);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String medicalAdvice = adviceTextField.getText();

                Pro.getPatientBaseMapper().insertprescriptions(com.fy.model.prescriptions.Build().PatientID(pid)
                        .DoctorID(did).PrescriptionDetails(medicalAdvice).DateIssued(LocalDate.now()).build());

                // �����ﴦ��ҽ�����룬���Խ��䷢�͵����ݿ��ִ�������߼�
                JOptionPane.showMessageDialog(frame, "ҽ�����ύ: " + medicalAdvice);
                frame.dispose();
            }
        });

        panel.add(jScrollPane);
        panel.add(submitButton);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(1);
        frame.setVisible(true);
    }
}
