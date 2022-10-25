package shiyan3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class StrConcatDemo implements ActionListener
{
	 //定义对象
 JFrame  AFrame;         
 JTextField  tf1,tf2,tfResult;
 JLabel    lbl1,lbl2,lblResult;
 JButton  btn;
public StrConcatDemo()  //初始化
{
 AFrame=new JFrame("字任串链接Demo");
 tf1=new JTextField(5);
 tf2=new JTextField(5);
 tfResult=new JTextField(10);
 lbl1=new JLabel("字符串1");
 lbl2=new JLabel("字符串");
 lblResult=new JLabel("结果");
 btn=new JButton("连接");
 AFrame.setLayout(new FlowLayout( ));
 AFrame.add(lbl1);   //添加组件
 AFrame.add(tf1);
 AFrame.add(lbl2);
 AFrame.add(tf2);
 AFrame.add(btn);
 AFrame.add(lblResult);
 AFrame.add(tfResult);
 AFrame.pack();
 AFrame.setVisible(true);
 btn.addActionListener(this); //����¼�������
 }
 public void actionPerformed(ActionEvent event)  //�¼�����
  {
     String str1 = tf1.getText();
     String str2 = tf2.getText();
     tfResult.setText(str1+str2);  
  }
  public static void main(String[] args)
  {
	  StrConcatDemo  strConcatDemo=new StrConcatDemo( );
  }
} 
