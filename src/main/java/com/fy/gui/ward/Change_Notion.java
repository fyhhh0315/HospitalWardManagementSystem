package com.fy.gui.ward;

import com.fy.bean.Bed;
import com.fy.bean.Patient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Change_Notion implements ActionListener{
    private JTextArea notionText;
    private JButton notionTextButton=new JButton("确认修改");


    public Change_Notion(){
        // TODO Auto-generated constructor stub
        JFrame frame = new JFrame("修改简介");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 500);

        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());



        notionText = new JTextArea(20, 45); // 设置输入框的列数和行数相同
        notionText.setText("请输入");


        notionTextButton.setBounds(280, 650, 70, 30);
        notionTextButton.setFont(new Font("宋体",0,15));
        notionTextButton.addActionListener(this);



        JScrollPane jScrollPane = new JScrollPane(notionText);


        panel.add(jScrollPane);
        panel.add(notionTextButton);

        frame.add(panel, BorderLayout.CENTER);


        frame.setVisible(true);
        frame.setDefaultCloseOperation(1);
    }


    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        String data;
        data=notionText.getText();
        if(source==notionTextButton){
            //修改医院简介，使用字符流写入文件（i/o）
            try(OutputStreamWriter writer=new OutputStreamWriter(new FileOutputStream("output.txt"), StandardCharsets.UTF_8)){
                writer.write(data);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
