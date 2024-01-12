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
	private JButton button1 = new JButton("��ѯ");
	private JButton button2 = new JButton("ȡ��");
	private JTable table = new JTable();
	private DefaultTableModel dm = null;
	private JScrollPane scrollPane;//���������ʹ����Ҫ����ʾ��������ʾ
	private JPopupMenu popupMenu;//����ʽ�˵�

	public Manage_Bed() {
		// TODO Auto-generated constructor stub
		frame = new JFrame("����λ");
		frame.setBounds(100, 100, 1050, 550);
		frame.getContentPane().setLayout(null);

		label = new JLabel("ѡ���ѯ����");
		label.setFont(new Font("����", Font.PLAIN, 30));
		label.setBounds(15,90,210,40);
		frame.getContentPane().add(label);

		comboBox = new JComboBox();
		comboBox.setFont(new Font("����",Font.PLAIN, 25));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"������","������","Ŀǰ״̬","ȫ��"}));
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

		String[] columnNames={"������","������","Ŀǰ״̬"};
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
        menItem_Alter.setText("�޸�");
        menItem_Delete.setText("ɾ��");
        menItem_Alter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String Wno = (String) table.getValueAt(index, 0);//���� row �� column λ�õĵ�Ԫ��ֵ
            	String Bno = (String) table.getValueAt(index, 1);
            	new Alter_Bed(Wno,Bno);
            	dm.getDataVector().clear();
            	scrollPane.validate();
            }
        });
        menItem_Delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	String Wno = (String) table.getValueAt(index, 0);//���� row �� column λ�õĵ�Ԫ��ֵ
            	String Bno = (String) table.getValueAt(index, 1);
            	try {
            		int a = JOptionPane.showConfirmDialog(null, "ȷ��ɾ���ò�����Ϣ��","ϵͳ��ʾ", JOptionPane.YES_NO_OPTION);
				if(a== JOptionPane.YES_OPTION){
					SqlDelete.Delete_Bed(Wno,Bno);
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


			if(select.equals("������")) {

				bed = new Bed();
				bed.setWno(text);

				beds = BedMybatisBuilder.getBedBaseMapper().queryBed(bed);

				if(beds.size() == 0){
					JOptionPane.showMessageDialog(null, "�����Ϣ�����ڣ�����������!","ϵͳ��ʾ", JOptionPane.ERROR_MESSAGE);
				}
			}
			if(select.equals("������")) {
				bed = new Bed();
				bed.setBno(text);
				beds = BedMybatisBuilder.getBedBaseMapper().queryBed(bed);


			}
			if(select.equals("Ŀǰ״̬")) {
				bed = new Bed();
				bed.setBstate(text);
				beds = BedMybatisBuilder.getBedBaseMapper().queryBed(bed);

			}
			if(select.equals("ȫ��")) {

				beds = BedMybatisBuilder.getBedBaseMapper().queryBed(new Bed());
			}
			if(beds.size() == 0){
				JOptionPane.showMessageDialog(null, "�����Ϣ�����ڣ�����������!","ϵͳ��ʾ", JOptionPane.ERROR_MESSAGE);
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

