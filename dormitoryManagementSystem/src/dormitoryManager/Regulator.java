package dormitoryManager;

import javax.swing.*;
import java.awt.*;

public class Regulator {
    public void regulator() {
        JFrame jf = new JFrame("监管者系统");
//        jf.setSize(400,500);
//        jf.setLocation(400,300);
        jf.setBounds(400,400,400,400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton jb1 = new JButton("按钮1");
        JButton jb2 = new JButton("按钮2");
        JLabel jl = new JLabel("登录",SwingConstants.LEFT);
        jf.add(jl);
        JPanel jp = new JPanel(new FlowLayout());
        jp.add(jb1);
        jp.add(jb2);
        jf.add(jp);
    }
}
