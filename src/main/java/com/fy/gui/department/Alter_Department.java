package com.fy.gui.department;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.fy.bean.Department;
import com.fy.builder.DepartmentMybatisBuilder;

public class Alter_Department implements ActionListener{

	private JFrame frame;
	private JTextField textField;
	private JComboBox comboBox;
	private JButton button1 = new JButton("�޸�");
	private JButton button2 = new JButton("ȡ��");
	private String Deptname;
	
	public Alter_Department(String Deptname) {
		// TODO Auto-generated constructor stub
		frame = new JFrame("�޸Ŀ�����Ϣ");
		frame.setBounds(380,100,550,400);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label1 = new JLabel("��ѡ����Ҫ�޸ĵ���");
		label1.setFont(new Font("����",Font.PLAIN, 25));
		label1.setBounds(50,60,250,40);
		frame.getContentPane().add(label1);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("����",Font.PLAIN, 25));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"���ҵ�ַ","���ҵ绰"}));
		comboBox.setBounds(300,60,160,40);
		frame.getContentPane().add(comboBox);
		
		JLabel label2 = new JLabel("�������޸ĺ������");
		label2.setFont(new Font("����",Font.PLAIN, 25));
		label2.setBounds(50,130,250,40);
		frame.getContentPane().add(label2);
		
		textField = new JTextField();
		textField.setFont(new Font("����",Font.PLAIN, 25));
		textField.setBounds(300,130,160,40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		button1.setBounds(100, 220, 110, 40);
		frame.getContentPane().add(button1);
		button1.addActionListener(this);
		
		button2.setBounds(330, 220, 110, 40);
		frame.getContentPane().add(button2);
		button2.addActionListener(this);
		
		this.Deptname = Deptname;
		frame.setVisible(true);
		frame.setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		Department department = new Department();

		if(source == button1) {

			
			String select = (String) comboBox.getSelectedItem();
			String alter = textField.getText().trim();
			

				int a =JOptionPane.showConfirmDialog(null, "ȷ���޸Ŀ�����Ϣ��","ϵͳ��ʾ",JOptionPane.YES_NO_OPTION);
				if(a == JOptionPane.YES_OPTION) {
					if(select.equals("���ҵ�ַ")) {
						String sql = "UPDATE Department SET Deptaddress = ? where Deptname = ?";
						department.setDeptaddress(alter);
						department.setDeptname(Deptname);

						frame.dispose();
					}
					if(select.equals("���ҵ绰")) {
						String sql = "UPDATE Department SET Dtel = ? where Dname = ?";
						department.setDepttel(alter);
						department.setDeptname(Deptname);

						frame.dispose();
					}
					DepartmentMybatisBuilder.getBedBaseMapper().updateDepartment(department);
					JOptionPane.showMessageDialog(null, "�޸ĳɹ�","ϵͳ��ʾ",JOptionPane.ERROR_MESSAGE);
				}
		}

		if(source == button2) {
			frame.dispose();
		}

}
}

