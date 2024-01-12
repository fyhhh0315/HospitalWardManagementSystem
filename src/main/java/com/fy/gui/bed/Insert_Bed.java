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
	private JButton button1 = new JButton("插入");
	private JButton button2 = new JButton("取消");
	private String sql;
	
	public Insert_Bed() {
		// TODO Auto-generated constructor stub
		frame = new JFrame("插入床位信息");
		frame.setBounds(380,100,600,600);
		frame.getContentPane().setLayout(null);
		
		JLabel label_Wno = new JLabel("病 房 号");
		label_Wno.setFont(new Font("宋体", Font.PLAIN, 25));
		label_Wno.setBounds(120,120,120,30);
		frame.getContentPane().add(label_Wno);
		text_Wno = new JTextField();
		text_Wno.setFont(new Font("宋体", Font.PLAIN, 20));
		text_Wno.setBounds(240,120,130,30);
		text_Wno.setColumns(10);
		frame.getContentPane().add(text_Wno);
		
		JLabel label_Bno = new JLabel("病 床 号");
		label_Bno.setFont(new Font("宋体", Font.PLAIN, 25));
		label_Bno.setBounds(120,220,120,30);
		frame.getContentPane().add(label_Bno);
		text_Bno = new JTextField();
		text_Bno.setFont(new Font("宋体", Font.PLAIN, 20));
		text_Bno.setBounds(240,220,130,30);
		text_Bno.setColumns(10);
		frame.getContentPane().add(text_Bno);
		
		JLabel label_Bstate = new JLabel("目前状态");
		label_Bstate.setFont(new Font("宋体", Font.PLAIN, 25));
		label_Bstate.setBounds(120,320,120,30);
		frame.getContentPane().add(label_Bstate);
		text_Bstate = new JTextField();
		text_Bstate.setFont(new Font("宋体", Font.PLAIN, 20));
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
			JOptionPane.showMessageDialog(null, "请输入完整信息！","系统提示",JOptionPane.ERROR_MESSAGE);
		}else {
			bed = new Bed();
			bed.setWno(Wno);
			bed.setBno(Bno);
			beds = BedMybatisBuilder.getBedBaseMapper().queryBed(bed);
			if (beds.size() == 0) {
				int a = JOptionPane.showConfirmDialog(null, "确认插入床位信息？", "系统提示", JOptionPane.YES_NO_OPTION);
				if (a == JOptionPane.YES_OPTION) {
					bed.setBstate(Bstate);
					BedMybatisBuilder.getBedBaseMapper().insertBed(bed);
					JOptionPane.showMessageDialog(null, "插入成功！", "系统提示", JOptionPane.PLAIN_MESSAGE);
					frame.dispose();
				}
			} else {
				JOptionPane.showMessageDialog(null, "该床位已经存在，无法插入!", "系统提示", JOptionPane.ERROR_MESSAGE);
			}

			}
		}
		if(source == button2) {
			frame.dispose();
		}
	}

}
