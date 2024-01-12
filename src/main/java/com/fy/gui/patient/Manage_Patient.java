package com.fy.gui.patient;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.fy.bean.Doctor;
import com.fy.bean.Patient;
import com.fy.builder.DoctorMybatisBuilder;
import com.fy.builder.PatientMybatisBuilder;
import com.fy.builder.Pro;
import com.fy.model.prescriptions;
import com.fy.tools.SqlDelete;
import lombok.SneakyThrows;


public class Manage_Patient extends JTable implements ActionListener{

	private JFrame frame;
	private JLabel label;
	private JComboBox comboBox;
	private JTextField textField;
	private JButton button1 = new JButton("��ѯ");
	private JButton button2 = new JButton("ȡ��");
	private JTable table = new JTable();
	private DefaultTableModel dm = null;
	private JScrollPane scrollPane;//���������ʹ����Ҫ����ʾ��������ʾ
	private JPopupMenu popupMenu;//����ʽ�˵�
	
	public Manage_Patient() {
		// TODO Auto-generated constructor stub
		frame = new JFrame("��ѯ������Ϣ");
		frame.setBounds(100, 100, 1050, 550);
		frame.getContentPane().setLayout(null);
		
		label = new JLabel("ѡ���ѯ����");
		label.setFont(new Font("����", Font.PLAIN, 30));
		label.setBounds(15,90,210,40);
		frame.getContentPane().add(label);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("����",Font.PLAIN, 25));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"������", "����","�Ա�","���","������","������","����ҽ������֤��","��ϵ�绰","��Ժ����","��Ժ����","ȫ��"}));
		comboBox.setBounds(15,150,210,40);
		frame.getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setFont(new Font("����",Font.PLAIN, 20));
		textField.setBounds(15,220,210,40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		button1.setBounds(15,290,85,30);
		frame.getContentPane().add(button1);
		button1.addActionListener(this);
		
		button2.setBounds(140,290,85,30);
		frame.getContentPane().add(button2);
		button2.addActionListener(this);
		
		String[] columnNames={"������", "����","�Ա�","���","������","������","��ҽ֤��","��ϵ�绰","��Ժ����","��Ժ����"};
		dm = new DefaultTableModel(columnNames, 0);
		table.setModel(dm);
		scrollPane = new JScrollPane(table);
		table.setBounds(250, 15, 765, 475);
		scrollPane.setBounds(250, 15, 765, 475);
		frame.getContentPane().add(scrollPane);
		table.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				mouseRightButtonClick(e); 
			}
		});
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
	}

	private void mouseRightButtonClick(MouseEvent e) {
		//�ж��Ƿ�Ϊ����BUTTON3��ť��BUTTON3Ϊ����Ҽ�  
		if (e.getButton() == java.awt.event.MouseEvent.BUTTON3) {
			//����point���ڵ�������;���������� [0, getRowCount()-1] ��Χ�ڣ��򷵻� -1��  
			int focusedRowIndex = table.rowAtPoint(e.getPoint());
			if (focusedRowIndex == -1) {
				return;  
				}
			//�������ѡ����Ϊ��ǰ�Ҽ��������
			table.setRowSelectionInterval(focusedRowIndex, focusedRowIndex);
			table.setComponentPopupMenu(popupMenu);//����һ�������˵�
			createPopupMenu(focusedRowIndex);
			popupMenu.show(e.getComponent(), e.getX(), e.getY());//��ʾһ�������˵�
			}  
	  }
	
	private void createPopupMenu(int index) {
		popupMenu = new JPopupMenu();  
        JMenuItem menItem_Alter = new JMenuItem();
        JMenuItem menItem_Delete = new JMenuItem();
		JMenuItem menItem_add = new JMenuItem();
		JMenuItem menuItem_look = new JMenuItem();
        menItem_Alter.setText("�޸�");
        menItem_Delete.setText("ɾ��");
        menItem_add.setText("���ҽ��");
        menuItem_look.setText("�鿴ҽ��");
        menuItem_look.addActionListener(new ActionListener() {
			@SneakyThrows
			@Override
			public void actionPerformed(ActionEvent e) {
				String pid = (String) table.getValueAt(table.getSelectedRow(), 0);
				List<prescriptions> queryprescriptions = Pro.getPatientBaseMapper().queryprescriptions(prescriptions.Build().PatientID(pid).build());
				testD.data.clear();
				for (com.fy.model.prescriptions queryprescription : queryprescriptions) {
					Vector data1 = new Vector();
					List<Doctor> doctors = DoctorMybatisBuilder.getDoctorBaseMapper().queryDoctor(Doctor.Build().Dno(queryprescription.getDoctorID()).build());

					data1.add(doctors.get(0).getDname());
					data1.add(doctors.get(0).getDtitle());
					data1.add(queryprescription.getDateIssued());
					data1.add(queryprescription.getPrescriptionID());
					testD.data.add(data1);
				}

				new YIZHU2( pid);
				testD.tableModel.fireTableDataChanged();

			}
		});
		menItem_add.addActionListener(new ActionListener() {
			@SneakyThrows
			@Override
			public void actionPerformed(ActionEvent e) {

				List<Doctor> doctors = DoctorMybatisBuilder.getDoctorBaseMapper().queryDoctor(
						new Doctor().Build().build()
				);
				testC.data.clear();
				for (Doctor doctor : doctors) {
					Vector data1 = new Vector();
					data1.add(doctor.getDname());
					data1.add(doctor.getDtitle());
					testC.data.add(data1);
				}
				if (testC.tableModel!=null)
					testC.tableModel.fireTableDataChanged();;


				String pid = (String) table.getValueAt(table.getSelectedRow(), 0);
				new YIZHU( pid);


			}
		});

        menItem_Alter.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {
            	//��ȡID��
            	String Pno = (String) table.getValueAt(index, 0);//���� row �� column λ�õĵ�Ԫ��ֵ
            	new Alter_Patient(Pno);
            	dm.getDataVector().clear();
            	scrollPane.validate();
            }
        });
        menItem_Delete.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent evt) {
            	String Pno = (String) table.getValueAt(index, 0);//���� row �� column λ�õĵ�Ԫ��ֵ
            	try {
            		int a = JOptionPane.showConfirmDialog(null, "ȷ��ɾ���ò�����Ϣ��","ϵͳ��ʾ", JOptionPane.YES_NO_OPTION);
				if(a== JOptionPane.YES_OPTION){
					SqlDelete.Delete_Patient(Pno);
					dm.removeRow(index);
					JOptionPane.showMessageDialog(null, "ɾ���ɹ���", "ϵͳ��ʾ",JOptionPane.PLAIN_MESSAGE); 
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }  
        });
        popupMenu.add(menItem_Alter);
        popupMenu.add(menItem_Delete);
        popupMenu.add(menItem_add);
        popupMenu.add(menuItem_look);
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

			if(select.equals("������")) {
				String sql = "SELECT Pno,Pname,Psex,Pdiagnose,Wno,Bno,Dno,Ptel,Pindate,Poutdate from Patient where Pno=?";
				patient.setPno(text);

			}

			if(select.equals("����")) {
				String sql = "SELECT Pno,Pname,Psex,Pdiagnose,Wno,Bno,Dno,Ptel,Pindate,Poutdate from Patient where Pname=?";
				patient.setPname(text);
			}
			if(select.equals("�Ա�")) {
				String sql = "SELECT Pno,Pname,Psex,Pdiagnose,Wno,Bno,Dno,Ptel,Pindate,Poutdate from Patient where Psex=?";
				patient.setPsex(text);
			}
			if(select.equals("��Ͻ��")) {
				String sql = "SELECT Pno,Pname,Psex,Pdiagnose,Wno,Bno,Dno,Ptel,Pindate,Poutdate from Patient where Pdiagnose=?";
				LocalDate date = LocalDate.parse(text, fmt);
				patient.setPindate(date);
			}
			if(select.equals("������")) {
				String sql = "SELECT Pno,Pname,Psex,Pdiagnose,Wno,Bno,Dno,Ptel,Pindate,Poutdate from Patient where Wno=?";
				patient.setWno(text);
			}
			if(select.equals("������")) {
				String sql = "SELECT Pno,Pname,Psex,Pdiagnose,Wno,Bno,Dno,Ptel,Pindate,Poutdate from Patient where Bno=?";
				patient.setBno(text);
			}
			if(select.equals("����ҽ������֤��")) {
				String sql = "SELECT Pno,Pname,Psex,Pdiagnose,Wno,Bno,Dno,Ptel,Pindate,Poutdate from Patient where Dno=?";
				patient.setDno(text);
			}
			if(select.equals("ȫ��")) {

			}
			patients = PatientMybatisBuilder.getPatientBaseMapper().queryPatient(patient);


			if(patients.size() <1){
				JOptionPane.showMessageDialog(null, "�����Ϣ�����ڣ�����������!","ϵͳ��ʾ", JOptionPane.ERROR_MESSAGE);
			}
			for (int i = 0;i< patients.size() ;i++){
				Patient patient1 = patients.get(i);
				String Pno = patient1.getPno();
				String Pname = patient1.getPname();
				String Psex = patient1.getPsex();
				String Pdiagnose = patient1.getPdiagnose();
				String Wno = patient1.getWno();
				String Bno = patient1.getBno();
				String Dno = patient1.getDno();
				String Ptel = patient1.getPtel();
				String Pindate = patient1.getPindate().toString();
				String Poutdate=null;
				if (patient1.getPoutdate() !=null){
					Poutdate = patient1.getPoutdate().toString();
				}

				dm.addRow(new Object[]{Pno,Pname,Psex,Pdiagnose,Wno,Bno,Dno,Ptel,Pindate,Poutdate});

			}
//			for (Patient patient1 : patients) {
//				String Pno = patient1.getPno();
//				String Pname = patient1.getPname();
//				String Psex = patient1.getPsex();
//				String Pdiagnose = patient1.getPdiagnose();
//				String Wno = patient1.getWno();
//				String Bno = patient1.getBno();
//				String Dno = patient1.getDno();
//				String Ptel = patient1.getPtel();
//				String Pindate = patient1.getPindate().toString();
//				String Poutdate = patient1.getPoutdate().toString();
//				dm.addRow(new Object[]{Pno,Pname,Psex,Pdiagnose,Wno,Bno,Dno,Ptel,Pindate,Poutdate});
//			}
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
