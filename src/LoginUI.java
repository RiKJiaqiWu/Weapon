package com.zking.swing3.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * 设计任何窗体的基本流程： 1.实例化需求中的所有中间组件及基础组件 2.将实例化好的基础组件添加到指定的中间组件中。
 * 3.将所有的中间组件添加到窗体容器中指定的位置。
 *
 *
 * ----------------------------------------------- 基础组件的动作监听
 * 跟现实生活中的监听器类似，报警器。只要触发，立刻报警。
 *
 * 可以再按钮上设置动作监听后，以后只要触碰这个按钮就可以触发进行相关操作。
 *
 *
 */
public class LoginUI extends JFrame {
    /*
     * 分析：用户登录 结构 上中下 流式布局，边框布局，网袋布局
     *
     * 记住一点：所有实例化对象的代码 最好是最大作用域 （在类的里面，方法的外面） 目的只有一个：任何地方都能调用，在别的类中也可以调用到。
     */

    /**
     * 在按钮设置动作监听时，调用的方法addActionListener(ActionListener) ActionListener: 接口 不能实例化
     */
    // 1自定义类实现接口 内部类
    // class sb implements ActionListener{
    //
    // @Override
    // public void actionPerformed(ActionEvent e) {
    // System.out.println("MD，你点击了我");
    // }
    //
    // }

    // 上
    private JPanel jpa = new JPanel();
    // 用户标签
    private JLabel jla = new JLabel("用户登录");
    // 中
    // 1.实例化网袋布局对象
    private GridBagLayout gbl = new GridBagLayout();
    // 2.实例化网袋布局约束对象
    private GridBagConstraints gbc = new GridBagConstraints();

    private JPanel jpb = new JPanel();
    // 账户标签
    private JLabel jlb = new JLabel("账户");
    // 账户文本输入框
    private JTextField jtfa = new JTextField(15);
    // 密码标签
    private JLabel jlc = new JLabel("密码");
    // 密码框
    private JPasswordField jpfa = new JPasswordField(15);
    // 下
    private JPanel jpc = new JPanel();
    // 登录按钮
    private JButton jba = new JButton("登录");
    // 注册按钮
    private JButton jbb = new JButton("注册");
    // 退出按钮
    private JButton jbc = new JButton("退出");

    public LoginUI() {
        this.setTitle("yonghjudenlu");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);

        // ----------------------------------------------
        // 将实例化好的基础组件添加到指定的中间组件
        // 上
        jpa.setBackground(Color.YELLOW);
        jla.setFont(new Font("宋体", Font.BOLD, 30));
        jla.setForeground(Color.red);
        jpa.add(jla);
        // 中(假设已做好)
        jpb.setBackground(Color.pink);
        // 1.设置jpb组件的布局为网袋布局
        jpb.setLayout(gbl);

        // 开始布局
        // 账户
        // ①抓取坐标
        gbc.gridx = 0;
        gbc.gridy = 0;
        // ②设置坐标
        gbl.setConstraints(jlb, gbc);
        // ③添加组件到JPanel面板中
        jpb.add(jlb);

        // 根据isets属性进行设置
        // Insets(top, left, bottom, right) top 上 left左 bottom下 right右
        gbc.insets = new Insets(0, 10, 0, 0);

        // 账户输入框
        // ①抓取坐标
        gbc.gridx = 1;
        gbc.gridy = 0;
        // ②设置坐标
        gbl.setConstraints(jtfa, gbc);
        // ③添加组件到JPanel面板中
        jpb.add(jtfa);

        gbc.insets = new Insets(10, 0, 0, 0);

        // 密码
        // ①抓取坐标
        gbc.gridx = 0;
        gbc.gridy = 1;
        // ②设置坐标
        gbl.setConstraints(jlc, gbc);
        // ③添加组件到JPanel面板中
        jpb.add(jlc);

        gbc.insets = new Insets(10, 10, 0, 0);
        // 密码框
        // ①抓取坐标
        gbc.gridx = 1;
        gbc.gridy = 1;
        // ②设置坐标
        gbl.setConstraints(jpfa, gbc);
        // ③添加组件到JPanel面板中
        jpb.add(jpfa);

        // 下
        jpc.setBackground(Color.GREEN);
        jpc.add(jba);
        jpc.add(jbb);
        jpc.add(jbc);

        // 3.将所有的中间组件添加到窗体容器中指定的位置
        this.getContentPane().add(jpa, "North");
        this.getContentPane().add(jpb, "Center");
        this.getContentPane().add(jpc, "South");

        /**
         * 基础组件添加到窗体中后，无任何动态效果，所以需要利用Swing中的动作监听达到动态的效果
         */

        /**
         * 需求：给登录的按钮设置动作监听器 以后当点击这个登录按钮时，可以将输入框中的数据获取到传输到数据库中判断，看数据表中是否存在这个用户名和密码 如果存在
         * 则直接登录成功 跳转到指定的页面去
         */
        // sb s = new sb();
        // jba.addActionListener(s);

        /**
         * 通过接口匿名实例化后自己实现自己，重写其中所有的抽象方法 推荐;10颗星
         */

        jba.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // System.out.println("我是匿名实例化接口自己实现自己出来的");
                // 当点击登录按钮时，立刻抓取到输入框中的数据
                // 关于输入框中的如何获取数据 getText();
                // 获取文本输入框中的输入的数据
                String username = jtfa.getText();
                // System.out.println("username = "+username);
                // 获取密码
                String pwd = jpfa.getText();
                // System.out.println("pwd = "+pwd);

                // 连接数据库、
                // StudentDao sd = new StudentDao();
                // sd.login(username,pwd);

                // 假设数据库中存在admin和123

                if ("admin".equals(username) && "123".equals(pwd)) {
                    // 登录成功
                    JOptionPane.showMessageDialog(null, "登录成功");
                    // 关闭当前登录窗口
                    // dispose方法

                    // 注意事项：匿名接口实现类中不能直接调用外部类的this对象
                    // 必须通过外部类的类名先调用this后才能通过this调用其他的方法
                    LoginUI.this.dispose();

                } else {
                    // 账户或密码错误
                    JOptionPane.showMessageDialog(null, "账户或密码错误");

                    // 清空无效的数据
                    jtfa.setText("");
                    jpfa.setText("");

                }

            }
        });

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new LoginUI();
    }

}