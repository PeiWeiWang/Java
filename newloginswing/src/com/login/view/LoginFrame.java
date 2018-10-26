package com.login.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import com.loginswing.entity.User;
import com.loginswing.service.UserService;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Date;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField usernameField;
	private JTextField psdField;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setTitle("\u6211\u884C\u6211\u7D20\u8D2D\u7269\u7BA1\u7406\u7CFB\u7EDF\u767B\u5F55\u9875\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		usernameField = new JTextField();
		usernameField.setBounds(201, 93, 200, 40);
		contentPane.add(usernameField);
		usernameField.setColumns(10);

		psdField = new JTextField();
		psdField.setBounds(201, 196, 200, 40);
		contentPane.add(psdField);
		psdField.setColumns(10);

		JLabel label = new JLabel("\u7528\u6237\u540D");
		label.setBounds(113, 92, 200, 40);
		contentPane.add(label);

		lblNewLabel = new JLabel("\u5BC6  \u7801");
		lblNewLabel.setBounds(113, 195, 200, 40);
		contentPane.add(lblNewLabel);

		// 登录
		JButton btnNewButton = new JButton("\u767B\u5F55");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = usernameField.getText();
				String psd = psdField.getText();
				// 管理员登录
				if ("admin".equals(username) && "admin".equals(psd)) {
					AdminictorFrame af = new AdminictorFrame();
					af.setVisible(true);
					dispose();
					return;
				}

				UserService us = new UserService();
				User user = us.queryUserByUsername(username);// 当前用户对象
				// 普通用户登录--先判断用户是否存在
				if (user == null) {
					JOptionPane.showMessageDialog(null, "用户名不存在", "消息框",
							JOptionPane.CANCEL_OPTION);
					return;
				}
				
				//用户存在
				// 如当前时间与最后一次出错时间相隔24小时,出错次数清0
				if (user.getLastFalseTime() != null
						&& new Date().getTime()
								- user.getLastFalseTime().getTime() >= 24 * 60 * 60 * 1000L) {
					user.setFalseCount(0);
					us.updateUser(user);
				}
				//判断用户是否锁定
				if (user.getFalseCount() >= 3) {// 账号被锁定
					JOptionPane.showMessageDialog(null, "用户被锁定", "消息框",
							JOptionPane.CANCEL_OPTION);
				} else if (!psd.equals(user.getPsd())) {

					// 账号未锁定,但本次密码输错,将出错次数+1,记录当前时间,并写回文件
					user.setFalseCount(user.getFalseCount() + 1);
					user.setLastFalseTime(new Date());// 设置最后一次出错时间
					String msg = user.getFalseCount() == 3 ? "本日已不可尝试"
							: "密码有误,还有" + (3 - user.getFalseCount()) + "次机会";
					JOptionPane.showMessageDialog(null, msg, "消息框",
							JOptionPane.CANCEL_OPTION);
					//保存回去
					us.updateUser(user);

				} else {
					// 密码正确,跳转到展示页面;并将当前登录用户的对象传递至下一页面
					UserFrame uf = new UserFrame(user);
					uf.setVisible(true);
					dispose();
				}

			}
		});
		btnNewButton.setBounds(93, 295, 103, 40);
		contentPane.add(btnNewButton);

		JButton button = new JButton("\u6CE8\u518C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 跳转到注册页面---即创建AddUserFrame对象即可
				AddUserFrame addUserFrame = new AddUserFrame();
				// 显示注册页面
				addUserFrame.setVisible(true);
				// 隐藏当前页面
				dispose();

			}
		});
		button.setBounds(313, 295, 103, 40);
		contentPane.add(button);
	}
}
