package com.loginswing.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import com.loginswing.entity.User;
import com.loginswing.service.UserService;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddUserFrame extends JFrame {

	private JPanel contentPane;
	private JTextField usernameField;
	private JTextField psdField;
	private JTextField psdAgainField;
	private UserService userService = new UserService();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddUserFrame frame = new AddUserFrame();
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
	public AddUserFrame() {
		setTitle("\u7BA1\u7406\u7CFB\u7EDF--\u6CE8\u518C\u9875\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u8F93\u5165\u7528\u6237\u540D");
		label.setBounds(100, 84, 80, 35);
		contentPane.add(label);
		
		usernameField = new JTextField();
		usernameField.setBounds(182, 84, 200, 35);
		contentPane.add(usernameField);
		usernameField.setColumns(10);
		
		JLabel label_1 = new JLabel("\u8F93\u5165\u5BC6\u7801");
		label_1.setBounds(101, 144, 80, 35);
		contentPane.add(label_1);
		
		psdField = new JTextField();
		psdField.setBounds(182, 144, 200, 35);
		contentPane.add(psdField);
		psdField.setColumns(10);
		
		JLabel label_2 = new JLabel("\u518D\u6B21\u8F93\u5165\u5BC6\u7801");
		label_2.setBounds(101, 217, 80, 35);
		contentPane.add(label_2);
		
		psdAgainField = new JTextField();
		psdAgainField.setColumns(10);
		psdAgainField.setBounds(182, 217, 200, 35);
		contentPane.add(psdAgainField);
		
		//确定按钮
		JButton submitButton = new JButton("\u786E\u5B9A");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//获取输入框中的文本
				String username = usernameField.getText();
				String psd = psdField.getText();
				String psdAgain = psdAgainField.getText();
				//省略其他信息获取
				//用户名重复验证,省略密码验证
				if(userService.queryUserByUsername(username)!=null){
					//提示信息
					JOptionPane.showMessageDialog(null, "用户名已被注册","消息框",JOptionPane.CANCEL_OPTION);
				}else if(!psd.equals(psdAgain)){
					JOptionPane.showMessageDialog(null, "两次密码必须一致","消息框",JOptionPane.CANCEL_OPTION);
				}else{
					//将输入的信息进行打包
					User user = new User();
					user.setUsername(username);
					user.setPsd(psd);
				    	
					//调用添加用户方法
					userService.addUser(user);
				    JOptionPane.showMessageDialog(null, "注册成功,返回登录页面","消息框",JOptionPane.CANCEL_OPTION);
				    
				    //返回登录页面
				    LoginFrame lf = new LoginFrame();
				    lf.setVisible(true);
				    dispose();
				   
				}
				
				
			}
		});
		submitButton.setBounds(100, 290, 107, 41);
		contentPane.add(submitButton);
		
		JButton button_1 = new JButton("\u91CD\u7F6E");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usernameField.setText("");
				psdField.setText("");
				psdAgainField.setText("");
			}
		});
		button_1.setBounds(289, 290, 107, 41);
		contentPane.add(button_1);
		
		
	}
}
