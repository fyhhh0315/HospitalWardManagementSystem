package com.fy.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.swing.*;

import com.fy.bean.Doctor;
import com.fy.builder.DoctorMybatisBuilder;
import com.fy.tools.Main;
import Hospitalresponse.Alter;
import Hospitalresponse.Register;
import com.fy.builder.SqlSessionBuilder;
import com.fy.config.MyBatisConfig;

import com.fy.bean.Login;
import com.fy.config.linkdatabase;
import oracle.jrockit.jfr.JFRImpl;

public class LoginFrame extends JFrame implements ActionListener{

	String sql;
	Login login = new Login();

	JLabel l1 = new JLabel("��ӭ��½ҽԺ��������ϵͳ");
	JLabel l2 = new JLabel("�˺�:");
	JLabel l3 = new JLabel("����:");
	JLabel l4 = new JLabel("�˺Ų����ڣ�");
	JLabel l5 = new JLabel("<HTML><U>"+"ע���˺�"+"</U></HTML>");  
	JLabel l6 = new JLabel("<HTML><U>"+"�޸�����"+"</U></HTML>");
	
	JTextField t1 = new JTextField();
	JTextField t2 = new JTextField();
	
	Button b1 = new Button("��½");
	Button b2 = new Button("ȡ��");

	Button b3=new Button("ҽԺ���");

	
	public LoginFrame() {
		// TODO Auto-generated constructor stub
		//���ñ���
		super("��ӭ��½ҽԺ��������ϵͳ");//��������Ϊ��ӭ��½ҽԺ��������ϵͳ�Ĵ���
		setBounds(300,100,910,500);//���ô�������Ļ�ϵ�λ�ü���С
		String path = "lib/login.jpeg";
		ImageIcon backgroundimage=new ImageIcon(path);//ʹ��ǩ��ͼƬ���ô˴�������ͼƬ
		JLabel jLabel = new JLabel(backgroundimage);//��ǩΪ�û���ʾ��Ϣ
		jLabel.setBounds(0, 0, this.getWidth(), this.getHeight());//��ǩ�ڴ����ϵ�λ�ü���С
		JPanel jPanel1 = (JPanel) this.getContentPane();//��ʼ��һ��������壬�����ſ��԰�����������ó�͸����    jPanel1����������Ҫ���ӵ�ͼƬ�����������ǵ����
		jPanel1.setOpaque(false);//ʹ���������ʾ���е�ĳЩ���أ��������������������ֳ�����������͸��
		jPanel1.setLayout(null);
		this.getLayeredPane().add(jLabel,new Integer(Integer.MIN_VALUE));
		setVisible(true);

		// ��½��������
		l1.setBounds(450, 70, 450, 35);
		l1.setFont(new Font("����", Font.BOLD, 30));
		l2.setBounds(470, 140, 70, 25);
		l2.setFont(new Font("����",Font.BOLD,23));
		l3.setBounds(470, 200, 70, 25);
		l3.setFont(new Font("����",Font.BOLD,23));
		l4.setBounds(120, 200, 150, 20);
		l4.setFont(new Font("����",Font.BOLD,23));

		l5.setBounds(730,140,70,25);
		l5.setFont(new Font("΢���ź�",Font.BOLD,15));
		l5.setForeground(Color.blue);
		l5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		l5.addMouseListener(new Register());

		l6.setBounds(730,200,70,25);
		l6.setFont(new Font("΢���ź�",Font.BOLD,15));
		l6.setForeground(Color.blue);
		l6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		l6.addMouseListener(new Alter());

		t1.setBounds(540, 140, 160, 25);
		t1.setFont(new Font("����",0,18));
		t2.setBounds(540, 200, 160, 25);
		t2.setFont(new Font("����",0,18));

		b1.setBounds(540, 260, 70, 30);
		b1.setFont(new Font("����",0,15));
		b1.addActionListener(this);

		b2.setBounds(660, 260, 70, 30);
		b2.setFont(new Font("����",0,15));
		b2.addActionListener(this);

		b3.setBounds(780, 260, 70, 30);
		b3.setFont(new Font("����",0,15));
		b3.addActionListener(this);


		super.add(l1);
		super.add(l2);
		super.add(l3);
		super.add(l5);
		super.add(l6);
		super.add(t1);
		super.add(t2);
		super.add(b1);
		super.add(b2);
		super.add(b3);

		super.setLayout(null);
		super.setVisible(true);
		
		//�������������Ϸ��Ĺر�ͼ��ʱ,����������windowClosing����,����ڸ÷�����ʹ��System.exit(0)�˳����������
		super.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub

				System.exit(0);
			}

		});
		super.setResizable(false);
	}

	public static void main(String[] args) {
		new MyBatisConfig();
		SqlSessionBuilder.Init(MyBatisConfig.getSqlSessionFactory());

		// TODO Auto-generated method stub
		LoginFrame loginFrame = new LoginFrame();
		loginFrame.setDefaultCloseOperation(3);
	}

	@Override
	//�¼�Դ����ActionEvent�¼��󣬼��������ýӿ��еĴ˷����Է������¼���������
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();//���������¼������Ķ���
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		String notion="";

		if(source==b3){

			//�鿴ҽԺ��飬ʹ���ַ�����ȡ�ļ���i/o��
			try(BufferedReader reader=new BufferedReader(new InputStreamReader(new FileInputStream("output.txt"), StandardCharsets.UTF_8));){

				int data;
				while ((data=reader.read())!=-1){
					notion+=(char)data;
				}

			} catch (FileNotFoundException ex) {
				throw new RuntimeException(ex);
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}

			JFrame frame =new JFrame("ҽԺ���");
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

			JTextArea textArea=new JTextArea(10,30);
			textArea.setText(notion);
			JScrollPane scrollPane=new JScrollPane(textArea);
			scrollPane.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
			frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
			frame.setSize(500,400);
			frame.setVisible(true);
		}



		if(source == b1) {
			String name = t1.getText();
			String pass = t2.getText();

			List<Doctor> doctors = DoctorMybatisBuilder.getDoctorBaseMapper().queryDoctor(Doctor.Build().Dpassword(pass).Dno(name).build());
			if (doctors.size() > 0){
				new admin_frame();
				super.dispose();

			} else {
				System.out.println("��¼ʧ���ˣ�");
				JOptionPane.showMessageDialog(null, "��¼ʧ�ܣ������µ�¼","ϵͳ��ʾ",JOptionPane.WARNING_MESSAGE);

			}




		}
		if(source == b2) {
			System.exit(0);
		}
	}
}