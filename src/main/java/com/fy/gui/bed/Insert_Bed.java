package com.fy.gui.bed;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.fy.bean.Bed;
import com.fy.builder.BedMybatisBuilder;

public class Insert_Bed implements ActionListener {

	private JFrame frame;
	private JTextField text_Wno;
	private JTextField text_Bno;
	private JTextField text_Bstate;
	private JButton button1 = new JButton("����");
	private JButton button2 = new JButton("ȡ��");
	private String sql;
	
	public Insert_Bed() {
		// TODO Auto-generated constructor stub
		frame = new JFrame("���봲λ��Ϣ");
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
		
		JLabel label_Bno = new JLabel("�� �� ��");
		label_Bno.setFont(new Font("����", Font.PLAIN, 25));
		label_Bno.setBounds(120,220,120,30);
		frame.getContentPane().add(label_Bno);
		text_Bno = new JTextField();
		text_Bno.setFont(new Font("����", Font.PLAIN, 20));
		text_Bno.setBounds(240,220,130,30);
		text_Bno.setColumns(10);
		frame.getContentPane().add(text_Bno);
		
		JLabel label_Bstate = new JLabel("Ŀǰ״̬");
		label_Bstate.setFont(new Font("����", Font.PLAIN, 25));
		label_Bstate.setBounds(120,320,120,30);
		frame.getContentPane().add(label_Bstate);
		text_Bstate = new JTextField();
		text_Bstate.setFont(new Font("����", Font.PLAIN, 20));
		text_Bstate.setBounds(240,320,130,30);
		text_Bstate.setColumns(10);
		frame.getContentPane().add(text_Bstate);
		
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
		Bed bed;
		List<Bed> beds = null;
		// TODO Auto-generated method stub
		Object source = e.getSource();
		if(source == button1) {
			String Wno = text_Wno.getText().trim();
			String Bno = text_Bno.getText().trim();
			String Bstate =text_Bstate.getText().trim();
		

		if("".equals(Wno) || "".equals(Bno) || "".equals(Bstate)) {
			JOptionPane.showMessageDialog(null, "������������Ϣ��","ϵͳ��ʾ",JOptionPane.ERROR_MESSAGE);
		}else {
			bed = new Bed();
			bed.setWno(Wno);
			bed.setBno(Bno);
			beds = BedMybatisBuilder.getBedBaseMapper().queryBed(bed);
			if (beds.size() == 0) {
				int a = JOptionPane.showConfirmDialog(null, "ȷ�ϲ��봲λ��Ϣ��", "ϵͳ��ʾ", JOptionPane.YES_NO_OPTION);
				if (a == JOptionPane.YES_OPTION) {
					bed.setBstate(Bstate);
					BedMybatisBuilder.getBedBaseMapper().insertBed(bed);
					JOptionPane.showMessageDialog(null, "����ɹ���", "ϵͳ��ʾ", JOptionPane.PLAIN_MESSAGE);
					frame.dispose();
				}
			} else {
				JOptionPane.showMessageDialog(null, "�ô�λ�Ѿ����ڣ��޷�����!", "ϵͳ��ʾ", JOptionPane.ERROR_MESSAGE);
			}

			}
		}
		if(source == button2) {
			frame.dispose();
		}
	}

}
