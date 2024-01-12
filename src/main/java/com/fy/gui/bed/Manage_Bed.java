package com.fy.gui.bed;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.List;

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

import com.fy.bean.Bed;
import com.fy.builder.BedMybatisBuilder;
import com.fy.tools.SqlDelete;

public class Manage_Bed extends JTable implements ActionListener{

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

	public Manage_Bed() {
		// TODO Auto-generated constructor stub
		frame = new JFrame("管理床位");
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
        menItem_Alter.setText("修改");
        menItem_Delete.setText("删除");
        menItem_Alter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String Wno = (String) table.getValueAt(index, 0);//返回 row 和 column 位置的单元格值
            	String Bno = (String) table.getValueAt(index, 1);
            	new Alter_Bed(Wno,Bno);
            	dm.getDataVector().clear();
            	scrollPane.validate();
            }
        });
        menItem_Delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	String Wno = (String) table.getValueAt(index, 0);//返回 row 和 column 位置的单元格值
            	String Bno = (String) table.getValueAt(index, 1);
            	try {
            		int a = JOptionPane.showConfirmDialog(null, "确认删除该病床信息？","系统提示", JOptionPane.YES_NO_OPTION);
				if(a== JOptionPane.YES_OPTION){
					SqlDelete.Delete_Bed(Wno,Bno);
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
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		dm.getDataVector().clear();

		Object source = e.getSource();
		List<Bed> beds = null;
		Bed bed;
		String select = (String) comboBox.getSelectedItem();
		String text = textField.getText().trim();
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


	if(source == button2) {
		frame.dispose();
	}
	}
}

