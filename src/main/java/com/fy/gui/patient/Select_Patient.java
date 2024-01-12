package com.fy.gui.patient;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.fy.bean.Patient;
import com.fy.builder.PatientMybatisBuilder;

public class Select_Patient extends JTable implements ActionListener{

	private JFrame frame;
	private JLabel label;
	private JComboBox comboBox;
	private JTextField textField;
	private JButton button1 = new JButton("查询");
	private JButton button2 = new JButton("取消");
	private JTable table = new JTable();
	private DefaultTableModel dm = null;
	private JScrollPane scrollPane;//滚动面板来使得需要被显示的区域显示
	private JPopupMenu popupMenu;//弹出式菜单
	
	public Select_Patient() {
		// TODO Auto-generated constructor stub
		frame = new JFrame("查询病人信息");
		frame.setBounds(100, 100, 1050, 550);
		frame.getContentPane().setLayout(null);

		label = new JLabel("选择查询条件");
		label.setFont(new Font("宋体", Font.PLAIN, 30));
		label.setBounds(15,90,210,40);
		frame.getContentPane().add(label);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("宋体",Font.PLAIN, 25));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"病历号", "姓名","性别","诊断","病房号","病床号","主治医生工作证号","联系电话","入院日期","出院日期","全部"}));
		comboBox.setBounds(15,150,210,40);
		frame.getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setFont(new Font("宋体",Font.PLAIN, 20));
		textField.setBounds(15,220,210,40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		button1.setBounds(15,290,85,30);
		frame.getContentPane().add(button1);
		button1.addActionListener(this);
		
		button2.setBounds(140,290,85,30);
		frame.getContentPane().add(button2);
		button2.addActionListener(this);
		
		String[] columnNames={"病历号", "姓名","性别","诊断","病房号","病床号","主医证号","联系电话","入院日期","出院日期"};
		dm = new DefaultTableModel(columnNames, 0);
		table.setModel(dm);
		scrollPane = new JScrollPane(table);
		table.setBounds(250, 15, 765, 475);
		scrollPane.setBounds(250, 15, 765, 475);
		frame.getContentPane().add(scrollPane);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		Patient patient = new Patient();
		List<Patient> patients= null;
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String select = (String) comboBox.getSelectedItem();
		String text = textField.getText().trim();
		dm.getDataVector().clear();

			if(source == button1) {

				if(select.equals("病历号")) {
					String sql = "SELECT Pno,Pname,Psex,Pdiagnose,Wno,Bno,Dno,Ptel,Pindate,Poutdate from Patient where Pno=?";
					patient.setPno(text);

				}

			if(select.equals("姓名")) {
				String sql = "SELECT Pno,Pname,Psex,Pdiagnose,Wno,Bno,Dno,Ptel,Pindate,Poutdate from Patient where Pname=?";
				patient.setPname(text);
			}
			if(select.equals("性别")) {
				String sql = "SELECT Pno,Pname,Psex,Pdiagnose,Wno,Bno,Dno,Ptel,Pindate,Poutdate from Patient where Psex=?";
				patient.setPsex(text);
			}
			if(select.equals("诊断结果")) {
				String sql = "SELECT Pno,Pname,Psex,Pdiagnose,Wno,Bno,Dno,Ptel,Pindate,Poutdate from Patient where Pdiagnose=?";
				LocalDate date = LocalDate.parse(text, fmt);
				patient.setPindate(date);
			}
			if(select.equals("病房号")) {
				String sql = "SELECT Pno,Pname,Psex,Pdiagnose,Wno,Bno,Dno,Ptel,Pindate,Poutdate from Patient where Wno=?";
				patient.setWno(text);
			}
			if(select.equals("病床号")) {
				String sql = "SELECT Pno,Pname,Psex,Pdiagnose,Wno,Bno,Dno,Ptel,Pindate,Poutdate from Patient where Bno=?";
				patient.setBno(text);
			}
			if(select.equals("主治医生工作证号")) {
				String sql = "SELECT Pno,Pname,Psex,Pdiagnose,Wno,Bno,Dno,Ptel,Pindate,Poutdate from Patient where Dno=?";
				patient.setDno(text);
			}
			if(select.equals("全部")) {

			}
		patients = PatientMybatisBuilder.getPatientBaseMapper().queryPatient(patient);


		if(patients.size() <1){
			JOptionPane.showMessageDialog(null, "相关信息不存在，请重新输入!","系统提示", JOptionPane.ERROR_MESSAGE);
		}
		for (Patient patient1 : patients) {
			String Pno = patient1.getPno();
			String Pname = patient1.getPname();
			String Psex = patient1.getPsex();
			String Pdiagnose = patient1.getPdiagnose();
			String Wno = patient1.getWno();
			String Bno = patient1.getBno();
			String Dno = patient1.getDno();
			String Ptel = patient1.getPtel();
			String Pindate = patient1.getPindate().toString();
			String Poutdate = patient1.getPoutdate().toString();
			dm.addRow(new Object[]{Pno,Pname,Psex,Pdiagnose,Wno,Bno,Dno,Ptel,Pindate,Poutdate});
		}
				dm.fireTableDataChanged();

			/*
			JTable table=new JTable(dm);
			table.setBounds(250, 15, 765, 475);
			JScrollPane scrollPane = new JScrollPane(table);
			scrollPane.setBounds(250, 15, 765, 475);
			frame.getContentPane().add(scrollPane);
			*/
			table = new JTable(dm);
			table.setBounds(250, 15, 765, 475);
			frame.getContentPane().add(scrollPane);
			}
		if(source == button2) {
			frame.dispose();
		}
	}

}
