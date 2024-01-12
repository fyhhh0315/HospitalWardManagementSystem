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
import javax.swing.JTextField;

import com.fy.bean.Bed;
import com.fy.bean.Patient;
import com.fy.builder.BedMybatisBuilder;
import com.fy.builder.PatientMybatisBuilder;

public class Insert_Patient implements ActionListener {

	private JFrame frame;
	private JTextField text_Pno;
	private JTextField text_Pname;
	private JComboBox comboBox_Psex;
	private JTextField text_Pdiagnose;
	private JTextField text_Wno;
	private JTextField text_Bno;
	private JTextField text_Dno;
	private JTextField text_Ptel;
	private JTextField text_Pindate;
	private JTextField text_Poutdate;
	private JButton button1 = new JButton("����");
	private JButton button2 = new JButton("ȡ��");
	private String sql;
	
	public Insert_Patient() {
		// TODO Auto-generated constructor stub
		frame = new JFrame("���벡����Ϣ");
		frame.setBounds(380,50,600,670);
		frame.getContentPane().setLayout(null);
		
		JLabel label_Pno = new JLabel("�� �� ��");
		label_Pno.setFont(new Font("����", Font.PLAIN, 25));
		label_Pno.setBounds(120, 50, 120, 30);
		frame.getContentPane().add(label_Pno);

		text_Pno = new JTextField();
		text_Pno.setFont(new Font("����", Font.PLAIN, 20));
		text_Pno.setBounds(240, 50, 130, 30);
		frame.getContentPane().add(text_Pno);;
		text_Pno.setColumns(10);
		
		JLabel label_Pname = new JLabel("��    ��");
		label_Pname.setFont(new Font("����", Font.PLAIN, 25));
		label_Pname.setBounds(120,100,120,30);
		frame.getContentPane().add(label_Pname);
		text_Pname= new JTextField();
		text_Pname.setFont(new Font("����", Font.PLAIN, 20));
		text_Pname.setBounds(240,100,130,30);
		frame.getContentPane().add(text_Pname);
		text_Pname.setColumns(10);
		
		JLabel label_Psex = new JLabel("��    ��");
		label_Psex.setFont(new Font("����", Font.PLAIN, 25));
		label_Psex.setBounds(120,150,120,30);
		frame.getContentPane().add(label_Psex);
		comboBox_Psex = new JComboBox();
		comboBox_Psex.setFont(new Font("����", Font.PLAIN, 20));
		comboBox_Psex.setModel(new DefaultComboBoxModel(new String[] {"��","Ů"}));
		comboBox_Psex.setToolTipText("��");
		comboBox_Psex.setBounds(240,150,130,30);
		frame.getContentPane().add(comboBox_Psex);
	
		JLabel label_Pdiagnose = new JLabel("��Ͻ��");
		label_Pdiagnose.setFont(new Font("����", Font.PLAIN, 25));
		label_Pdiagnose.setBounds(120, 200, 120, 30);
		frame.getContentPane().add(label_Pdiagnose);
		text_Pdiagnose = new JTextField();
		text_Pdiagnose.setFont(new Font("����", Font.PLAIN, 20));
		text_Pdiagnose.setBounds(240,200,130,30);
		frame.getContentPane().add(text_Pdiagnose);
		text_Pdiagnose.setColumns(10);
		
		JLabel label_Wno = new JLabel("�� �� ��");
		label_Wno.setFont(new Font("����", Font.PLAIN, 25));
		label_Wno.setBounds(120,250,120,30);
		frame.getContentPane().add(label_Wno);
		text_Wno = new JTextField();
		text_Wno.setFont(new Font("����", Font.PLAIN, 20));
		text_Wno.setBounds(240,250,130,30);
		frame.getContentPane().add(text_Wno);
		text_Wno.setColumns(10);
		
		JLabel label_Bno = new JLabel("�� �� ��");
		label_Bno.setFont(new Font("����", Font.PLAIN, 25));
		label_Bno.setBounds(120,300,120,30);
		frame.getContentPane().add(label_Bno);
		text_Bno = new JTextField();
		text_Bno.setFont(new Font("����", Font.PLAIN, 20));
		text_Bno.setBounds(240,300,130,30);
		frame.getContentPane().add(text_Bno);
		text_Bno.setColumns(10);
		
		JLabel label_Dno = new JLabel("��ҽ֤��");
		label_Dno.setFont(new Font("����", Font.PLAIN, 25));
		label_Dno.setBounds(120,350,450,30);
		frame.getContentPane().add(label_Dno);
		text_Dno = new JTextField();
		text_Dno.setFont(new Font("����", Font.PLAIN, 20));
		text_Dno.setBounds(240,350,130,30);
		frame.getContentPane().add(text_Dno);
		text_Dno.setColumns(10);
		
		JLabel label_Ptel = new JLabel("��ϵ�绰");
		label_Ptel.setFont(new Font("����", Font.PLAIN, 25));
		label_Ptel.setBounds(120,400,120,30);
		frame.getContentPane().add(label_Ptel);
		text_Ptel = new JTextField();
		text_Ptel.setFont(new Font("����", Font.PLAIN, 20));
		text_Ptel.setBounds(240,400,130,30);
		frame.getContentPane().add(text_Ptel);
		text_Ptel.setColumns(10);
		
		JLabel label_Pindate = new JLabel("��Ժ����");
		label_Pindate.setFont(new Font("����", Font.PLAIN, 25));
		label_Pindate.setBounds(120,450,120,30);
		frame.getContentPane().add(label_Pindate);
		text_Pindate = new JTextField();
		text_Pindate.setFont(new Font("����", Font.PLAIN, 20));
		text_Pindate.setBounds(240,450,130,30);
		frame.getContentPane().add(text_Pindate);
		text_Pindate.setColumns(10);
		
		JLabel label_Poutdate = new JLabel("��Ժ����");
		label_Poutdate.setFont(new Font("����", Font.PLAIN, 25));
		label_Poutdate.setBounds(120,500,120,30);
		frame.getContentPane().add(label_Poutdate);
		text_Poutdate = new JTextField();
		text_Poutdate.setFont(new Font("����", Font.PLAIN, 20));
		text_Poutdate.setBounds(240,500,130,30);
		frame.getContentPane().add(text_Poutdate);
		text_Poutdate.setColumns(10);
		
		button1.setBounds(90, 570, 120, 40);
		frame.getContentPane().add(button1);
		button1.addActionListener(this);
		
		button2.setBounds(280, 570, 120, 40);
		frame.getContentPane().add(button2);
		button2.addActionListener(this);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		Patient patient = new Patient();
		Bed bed = new Bed();
		List<Patient> patients = null;
		if(source == button1) {
			String Pno = text_Pno.getText().trim();
			String Pname = text_Pname.getText().trim();
			String Psex = (String) comboBox_Psex.getSelectedItem();
			String Pdiagnose = text_Pdiagnose.getText().trim();
			String Wno =text_Wno.getText().trim();
			String Bno =text_Bno.getText().trim();
			String Dno =text_Dno.getText().trim();
			String Ptel = text_Ptel.getText().trim();
			String Pindate = text_Pindate.getText().trim();
			String Poutdate = text_Poutdate.getText().trim();
			

			if("".equals(Pno) || "".equals(Pname) || "".equals(Bno) || "".equals(Pdiagnose) || "".equals(Wno) || "".equals(Psex.trim())||"".equals(Dno)||"".equals(Ptel)||"".equals(Pindate)) {
				JOptionPane.showMessageDialog(null, "������������Ϣ��","ϵͳ��ʾ",JOptionPane.ERROR_MESSAGE);
			}else {
				patient.setPno(Pno);
				patients = PatientMybatisBuilder.getPatientBaseMapper().queryPatient(patient);
					if(patients.size() < 1 ) {
						int a =JOptionPane.showConfirmDialog(null, "ȷ�ϲ��벡����Ϣ��","ϵͳ��ʾ",JOptionPane.YES_NO_OPTION);
						if(a == JOptionPane.YES_OPTION) {
							sql="INSERT INTO Patient(Pno,Pname,Psex,Pdiagnose,Wno,Bno,Dno,Ptel,Pindate,Poutdate) VALUES(?,?,?,?,?,?,?,?,?,?)";
							patient.setPname(Pname);//2
							patient.setPsex(Psex);//3
							patient.setPdiagnose(Pdiagnose);//4
							patient.setWno(Wno);//5
							patient.setBno(Bno);//6
							patient.setDno(Dno);//7
							patient.setPtel(Ptel);//8
							DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
							LocalDate date = LocalDate.parse(Pindate, fmt);

							//9
							patient.setPindate(date);
							date= LocalDate.parse(Poutdate, fmt);
							patient.setPoutdate(date);
							//10
							PatientMybatisBuilder.getPatientBaseMapper().insertPatient(patient);
							JOptionPane.showMessageDialog(null, "����ɹ���", "ϵͳ��ʾ",JOptionPane.PLAIN_MESSAGE);
							frame.dispose();

							sql = "UPDATE Bed SET Bstate = ? where Wno = ? and Bno = ?";
							bed.setBstate("ʹ����");
							bed.setWno(Wno);
							bed.setBno(Bno);
							BedMybatisBuilder.getBedBaseMapper().updateBed(bed);
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
