package com.fy.gui.bed;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

import com.fy.bean.Bed;
import com.fy.builder.BedMybatisBuilder;

public class Select_Bed extends JTable implements ActionListener{

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
	
	public Select_Bed() {
		// TODO Auto-generated constructor stub
		frame = new JFrame("查询床位信息");
		frame.setBounds(100, 100, 1050, 550);
		frame.getContentPane().setLayout(null);
		
		label = new JLabel("选择查询条件");
		label.setFont(new Font("宋体", Font.PLAIN, 30));
		label.setBounds(15,90,210,40);
		frame.getContentPane().add(label);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("宋体",Font.PLAIN, 25));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"病房号","病床号","目前状态","全部"}));
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
		
		String[] columnNames={"病房号","病床号","目前状态"};
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

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		List<Bed> beds = null;
		Bed bed;
		String select = (String) comboBox.getSelectedItem();
		String text = textField.getText().trim();

		dm.getDataVector().clear();
			if(source == button1) {

				if(select.equals("病房号")) {
					bed = new Bed();
					bed.setWno(text);
					beds = BedMybatisBuilder.getBedBaseMapper().queryBed(bed);

					if(beds.size() == 0){
						JOptionPane.showMessageDialog(null, "相关信息不存在，请重新输入!","系统提示", JOptionPane.ERROR_MESSAGE);
					}

				}
			if(select.equals("病床号")) {
				bed = new Bed();
				bed.setBno(text);
				beds = BedMybatisBuilder.getBedBaseMapper().queryBed(bed);


			}
			if(select.equals("目前状态")) {
				bed = new Bed();
				bed.setBstate(text);
				beds = BedMybatisBuilder.getBedBaseMapper().queryBed(bed);

			}
			if(select.equals("全部")) {
				beds = BedMybatisBuilder.getBedBaseMapper().queryBed(new Bed());
			}
			/*
			JTable table=new JTable(dm);
			table.setBounds(250, 15, 765, 475);
			JScrollPane scrollPane = new JScrollPane(table);
			scrollPane.setBounds(250, 15, 765, 475);
			frame.getContentPane().add(scrollPane);
			*/
				if(beds.size() == 0){
					JOptionPane.showMessageDialog(null, "相关信息不存在，请重新输入!","系统提示", JOptionPane.ERROR_MESSAGE);
				}
				for (Bed bed1 : beds) {
					String Wno = bed1.getWno();
					String Bno = bed1.getBno();
					String Bstate = bed1.getBstate();
					dm.addRow(new Object[]{Wno,Bno,Bstate});
				}
				dm.fireTableDataChanged();
				System.out.println("sfdasd");
				table = new JTable(dm);
			table.setBounds(250, 15, 765, 475);
			frame.getContentPane().add(scrollPane);
			}
		if(source == button2) {
			frame.dispose();
		}
	}

}
