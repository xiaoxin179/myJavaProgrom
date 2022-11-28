package SwingDrow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingInput {
    public static void main(String[] args) {

        createWindow();

    }

    private static void createWindow() {    //这个方法就是适用swing的基本步骤

        JFrame frame = new JFrame("Swing文本输入对话框");  //就是窗体，最大的那个框

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //让窗体再关闭的时候程序结束

        createUI(frame);

        frame.setSize(300, 200);

        frame.setLocationRelativeTo(null);  //设置窗体中组件的位置

        frame.setVisible(true);
        System.out.println("第二次提交代码");

    }

    private static void createUI(final JFrame frame){

        JPanel panel = new JPanel();    //Panel：面板，创建一个面板对象

        LayoutManager layout = new FlowLayout();

        panel.setLayout(layout);

        JButton button = new JButton("点击开始~");

        final JLabel label = new JLabel();  //设置标签

        button.addActionListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                String result = (String)JOptionPane.showInputDialog(

                        frame,

                        "选择一种语言：",

                        "Swing文本输入框(示例)",

                        JOptionPane.PLAIN_MESSAGE,

                        null,

                        null,

                        "Java? Python?"

                );

                if(result != null && result.length() > 0){

                    label.setText("选择了:" + result);

                }else {

                    label.setText("未选择！");

                }

            }

        });
        //把按钮和标签都加入到面板中
        panel.add(button);

        panel.add(label);

        frame.getContentPane().add(panel, BorderLayout.CENTER);

    }


}


