package SwingDrow;
/*
因为很多数据都是输出到控制台，现在希望通过
 */
import javax.swing.*;

public class SwingLog {
    public static void main(String[] args) {
        //GUI   AWT  Swing
        //需要一个窗体 JFrame，就是一个最大的框
        //需要面板Jpanel，在这里可以理解为各种各样的div
        //组件，各种标签，比如submit，input
        //事件，使用匿名内部类，类似于写一个js，绑定函数
        //JLabel：表示的就是标签；JTextField：文本框；JPasswordField：输入密码的；Jbutton：按钮
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();

        JLabel userLabel = new JLabel("账号：");
        JLabel passwordLabel = new JLabel("密码：");

        JTextField usernameFiled = new JTextField(20);
        JTextField passwordFiled = new JTextField(20);

        JButton LogInButton = new JButton("登录");
        JButton registButton = new JButton("注册");

        //在这些组件都写完之后，就可以直接往面板里面加就就可以了
        jPanel.add(userLabel);
        jPanel.add(usernameFiled);
        jPanel.add(passwordLabel);
        jPanel.add(passwordFiled);
        jPanel.add(LogInButton);
        jPanel.add(registButton);

        //现在就是把面板套到窗体之中
        jFrame.add(jPanel);

        //设置是否可以调整大小
        jFrame.setResizable(false);

        //点击关闭的时候其实程序没有关闭，需要手动设置,通过这个设置之后在点击关闭之后程序就会结束运行
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //设置显示边界
        jFrame.setBounds(600, 400, 300, 150);
        jFrame.setVisible(true);

        //编写程序在控制台输出用户在swing图形界面输入文本框的值
        String index = LogInButton.getText();
        if (index != null) {
            System.out.println("用户登录成功！！！！！");
        }
        String username = usernameFiled.getText().trim();
        String pwd = passwordFiled.getText().trim();

        System.out.println(username);
        System.out.println(pwd);


    }
}
