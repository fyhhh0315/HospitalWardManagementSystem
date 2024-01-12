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
	private JButton button1 = new JButton("查询");
	private JButton button2 = new JButton("取消");
	private JTable table = new JTable();
	private DefaultTableModel dm = null;
	private JScrollPane scrollPane;//滚动面板来使得需要被显示的区域显示
	private JPopupMenu popupMenu;//弹出式菜单
	
	public Manage_Patient() {
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
		//判断是否为鼠标的BUTTON3按钮，BUTTON3为鼠标右键  
		if (e.getButton() == java.awt.event.MouseEvent.BUTTON3) {
			//返回point所在的行索引;如果结果不在 [0, getRowCount()-1] 范围内，则返回 -1。  
			int focusedRowIndex = table.rowAtPoint(e.getPoint());
			if (focusedRowIndex == -1) {
				return;  
				}
			//将表格所选项设为当前右键点击的行
			table.setRowSelectionInterval(focusedRowIndex, focusedRowIndex);
			table.setComponentPopupMenu(popupMenu);//设置一个弹出菜单
			createPopupMenu(focusedRowIndex);
			popupMenu.show(e.getComponent(), e.getX(), e.getY());//显示一个弹出菜单
			}  
	  }
	
	private void createPopupMenu(int index) {
		popupMenu = new JPopupMenu();  
        JMenuItem menItem_Alter = new JMenuItem();
        JMenuItem menItem_Delete = new JMenuItem();
		JMenuItem menItem_add = new JMenuItem();
		JMenuItem menuItem_look = new JMenuItem();
        menItem_Alter.setText("修改");
        menItem_Delete.setText("删除");
        menItem_add.setText("添加医嘱");
        menuItem_look.setText("查看医嘱");
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
            	//获取ID号
            	String Pno = (String) table.getValueAt(index, 0);//返回 row 和 column 位置的单元格值
            	new Alter_Patient(Pno);
            	dm.getDataVector().clear();
            	scrollPane.validate();
            }
        });
        menItem_Delete.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent evt) {
            	String Pno = (String) table.getValueAt(index, 0);//返回 row 和 column 位置的单元格值
            	try {
            		int a = JOptionPane.showConfirmDialog(null, "确认删除该病人信息？","系统提示", JOptionPane.YES_NO_OPTION);
				if(a== JOptionPane.YES_OPTION){
					SqlDelete.Delete_Patient(Pno);
					dm.removeRow(index);
					JOptionPane.showMessageDialog(null, "删除成功！", "系统提示",JOptionPane.PLAIN_MESSAGE); 
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
