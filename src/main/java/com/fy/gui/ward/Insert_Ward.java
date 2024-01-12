package com.fy.gui.ward;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.fy.bean.Ward;
import com.fy.builder.WardMybatisBuilder;

public class Insert_Ward implements ActionListener {

	private JFrame frame;
	private JTextField text_Wno;
	private JTextField text_Dname;
	private JTextField text_Wcharge;
	private JButton button1 = new JButton("����");
	private JButton button2 = new JButton("ȡ��");
	private String sql;
	
	public Insert_Ward() {
		// TODO Auto-generated constructor stub
		frame = new JFrame("���벡����Ϣ");
		frame.setBounds(380,100,600,600);
		frame.getContentPane().setLayout(null);
		
		JLabel label_Wno = new JLabel("�� �� ��");
		label_Wno.setFont(new Font("����", Font.PLAIN, 25));
		label_Wno.setBounds(120,120,120,30);
		frame.getContentPane().add(label_Wno);
		text_Wno = new JTextField();
		text_Wno.setFont(new Font("����", Font.PLAIN, 20));
		text_Wno.setBounds(240,120,130,30);
		text_Wno.setColumns(10);
		frame.getContentPane().add(text_Wno);
		
		JLabel label_Dname = new JLabel("��������");
		label_Dname.setFont(new Font("����", Font.PLAIN, 25));
		label_Dname.setBounds(120,220,120,30);
		frame.getContentPane().add(label_Dname);
		text_Dname = new JTextField();
		text_Dname.setFont(new Font("����", Font.PLAIN, 20));
		text_Dname.setBounds(240,220,130,30);
		text_Dname.setColumns(10);
		frame.getContentPane().add(text_Dname);
		
		JLabel label_Wcharge = new JLabel("�շѱ�׼");
		label_Wcharge.setFont(new Font("����", Font.PLAIN, 25));
		label_Wcharge.setBounds(120,320,120,30);
		frame.getContentPane().add(label_Wcharge);
		text_Wcharge = new JTextField();
		text_Wcharge.setFont(new Font("����", Font.PLAIN, 20));
		text_Wcharge.setBounds(240,320,130,30);
		text_Wcharge.setColumns(10);
		frame.getContentPane().add(text_Wcharge);
		
		button1.setBounds(90, 470, 120, 40);
		frame.getContentPane().add(button1);
		button1.addActionListener(this);
		
		button2.setBounds(280, 470, 120, 40);
		frame.getContentPane().add(button2);
		button2.addActionListener(this);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Ward ward = new Ward();
		List<Ward> wards = null;
		// TODO Auto-generated method stub
		Object source = e.getSource();
		if(source == button1) {
			String Wno = text_Wno.getText().trim();
			String Deptname = text_Dname.getText().trim();
			String Wcharge =text_Wcharge.getText().trim();


				if("".equals(Wno) || "".equals(Deptname) || "".equals(Wcharge)) {
					JOptionPane.showMessageDialog(null, "������������Ϣ��","ϵͳ��ʾ",JOptionPane.ERROR_MESSAGE);
				}else {
					ward.setWno(Wno);
					wards = WardMybatisBuilder.getWardBaseMapper().queryWard(ward);

					if(wards.size() <1) {
						int a =JOptionPane.showConfirmDialog(null, "ȷ�ϲ��벡����Ϣ��","ϵͳ��ʾ",JOptionPane.YES_NO_OPTION);
						if(a == JOptionPane.YES_OPTION) {
							ward.setWcharge(Integer.getInteger(Wcharge));
							ward.setWno(Wno);
							ward.setDeptname(Deptname);
							WardMybatisBuilder.getWardBaseMapper().insertWard(ward);
							JOptionPane.showMessageDialog(null, "����ɹ���", "ϵͳ��ʾ",JOptionPane.PLAIN_MESSAGE);
							frame.dispose();
						}
					}else {
						JOptionPane.showMessageDialog(null, "�ò����Ѿ����ڣ��޷�����!","ϵͳ��ʾ",JOptionPane.ERROR_MESSAGE);
					}

				}
		}
		if(source == button2) {
			frame.dispose();
		}
	}

}
