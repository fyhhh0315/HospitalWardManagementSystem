package com.fy.gui.doctor;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.xml.crypto.Data;

import com.fy.bean.Doctor;
import com.fy.builder.DoctorMybatisBuilder;
import com.fy.config.linkdatabase;

public class Alter_Doctor implements ActionListener{

	private JFrame frame;
	private JTextField textField;
	private JComboBox comboBox;
	private JButton button1 = new JButton("修改");
	private JButton button2 = new JButton("取消");
	private String Dno;
	
	public Alter_Doctor(String Dno) {
		// TODO Auto-generated constructor stub
		frame = new JFrame("修改医生信息");
		frame.setBounds(380,100,550,400);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label1 = new JLabel("请选择需要修改的项");
		label1.setFont(new Font("宋体",Font.PLAIN, 25));
		label1.setBounds(50,60,250,40);
		frame.getContentPane().add(label1);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("宋体",Font.PLAIN, 25));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"姓名","性别","职称","年龄","联系电话","所属科室"}));
		comboBox.setBounds(300,60,160,40);
		frame.getContentPane().add(comboBox);
		
		JLabel label2 = new JLabel("请输入修改后的内容");
		label2.setFont(new Font("宋体",Font.PLAIN, 25));
		label2.setBounds(50,130,250,40);
		frame.getContentPane().add(label2);
		
		textField = new JTextField();
		textField.setFont(new Font("宋体",Font.PLAIN, 25));
		textField.setBounds(300,130,160,40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		button1.setBounds(100, 220, 110, 40);
		frame.getContentPane().add(button1);
		button1.addActionListener(this);
		
		button2.setBounds(330, 220, 110, 40);
		frame.getContentPane().add(button2);
		button2.addActionListener(this);
		
		this.Dno = Dno;
		frame.setVisible(true);
		frame.setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		if(source == button1) {
			String select = (String) comboBox.getSelectedItem();
			String alter = textField.getText().trim();
			Doctor doctor = new Doctor();

				int a =JOptionPane.showConfirmDialog(null, "确认修改医生信息？","系统提示",JOptionPane.YES_NO_OPTION);
				if(a == JOptionPane.YES_OPTION) {
					if(select.equals("姓名")) {
						String sql = "UPDATE Doctor SET Dname = ? where Dno = ?";
						doctor.setDno(Dno);
						doctor.setDname(alter);
						JOptionPane.showMessageDialog(null, "修改成功","系统提示",JOptionPane.ERROR_MESSAGE);
					}
					if(select.equals("性别")) {
						String sql = "UPDATE Doctor SET Dsex = ? where Dno = ?";
						doctor.setDno(Dno);
						doctor.setDsex(alter);
						JOptionPane.showMessageDialog(null, "修改成功","系统提示",JOptionPane.ERROR_MESSAGE);
					}
					if(select.equals("职称")) {
						String sql = "UPDATE Doctor SET Dtitle = ? where Dno = ?";
						doctor.setDno(Dno);
						doctor.setDtitle(alter);
						JOptionPane.showMessageDialog(null, "修改成功","系统提示",JOptionPane.ERROR_MESSAGE);
						frame.dispose();
					}
					if(select.equals("年龄")) {
						String sql = "UPDATE Doctor SET Dage = ? where Dno = ?";
						doctor.setDno(Dno);
						doctor.setDage(Integer.valueOf(alter));
						JOptionPane.showMessageDialog(null, "修改成功","系统提示",JOptionPane.ERROR_MESSAGE);

					}
					if(select.equals("联系电话")) {
						String sql = "UPDATE Doctor SET Dtel = ? where Dno = ?";
						doctor.setDno(Dno);
						doctor.setDtel(alter);
						JOptionPane.showMessageDialog(null, "修改成功","系统提示",JOptionPane.ERROR_MESSAGE);

					}
					if(select.equals("所属科室")) {
						String sql = "UPDATE Doctor SET Ddeptname = ? where Dno = ?";
						doctor.setDno(Dno);
						doctor.setDeptname(alter);
						JOptionPane.showMessageDialog(null, "修改成功","系统提示",JOptionPane.ERROR_MESSAGE);

					}
					DoctorMybatisBuilder.getDoctorBaseMapper().updateDoctor(doctor);
					frame.dispose();
				}

		}
		if(source == button2) {
			frame.dispose();
		}
	}
}
