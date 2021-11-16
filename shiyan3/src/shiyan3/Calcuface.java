package shiyan3;

import java.awt.* ;
import javax.swing.* ;
public class Calcuface extends JFrame
{
	public Calcuface()
	{
		Container c = getContentPane() ;
		JTextField txtinput=new JTextField(10);	// 创建输入数
		c.add(txtinput, BorderLayout.NORTH) ;
		JPanel	panel1 = new JPanel() ;		// 创建面板
		panel1.setLayout(new GridLayout(4,4)) ;		
		String str[]={"7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};
		
		int length=16;
		JButton	b[]=new JButton[length] ;//定义按钮数组
		for (int i=0 ; i<length ; i++)
		{
			b[i] = new JButton(str[i]) ;
			panel1.add(b[i]) ;
		}	
		c.add(panel1,BorderLayout.CENTER) ;//填入窗口
	}
	public static void main(String args[])
	{
		JFrame	frame = new Calcuface() ;
		frame.setTitle("计算器");
		frame.pack() ;//�����˴��ڵĴ�С�����ʶȺ������������ѡ��С�Ͳ��֡�
		frame.setVisible(true) ;//���ÿɼ���
	}
}
