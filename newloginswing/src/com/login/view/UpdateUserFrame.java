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
import java.util.List;

public class UpdateUserFrame extends JFrame {

	private JPanel contentPane;
	private JTextField newPsdField;
	private User user;
	private UserService us = new UserService();
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateUserFrame frame = new UpdateUserFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public UpdateUserFrame(final User user) {
		this.user = user;
		setTitle("\u6211\u884C\u6211\u7D20\u8D2D\u7269\u7BA1\u7406\u7CFB\u7EDF\u767B\u5F55\u9875\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		newPsdField = new JTextField();
		newPsdField.setBounds(201, 93, 200, 40);
		contentPane.add(newPsdField);
		newPsdField.setColumns(10);
		
		JLabel label = new JLabel("\u8F93\u5165\u65B0\u5BC6\u7801");
		label.setBounds(113, 92, 200, 40);
		contentPane.add(label);
		
		//信息回填
		newPsdField.setText("原密码:"+user.getPsd());
		
		//密码修改
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				//修改密码
				String newPsd = newPsdField.getText();
				user.setPsd(newPsd);
				us.updateUser(user);
				
				/*//跳转回登录页面
				LoginFrame lf = new LoginFrame();
				lf.setVisible(true);
				dispose();*/
				
				//跳转到展示用户页面
				UserFrame uf = new UserFrame(user);
				uf.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBounds(93, 295, 103, 40);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\u8FD4\u56DE\u4E0A\u4E00\u5C42");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//跳转到注册页面---即创建AddUserFrame对象即可
				AddUserFrame  addUserFrame = new AddUserFrame();
				//显示注册页面
				addUserFrame.setVisible(true);
				//隐藏当前页面
				dispose();
				
			}
		});
		button.setBounds(313, 295, 103, 40);
		contentPane.add(button);
	}
}
