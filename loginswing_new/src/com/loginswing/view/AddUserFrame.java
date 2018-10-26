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
		
		//ȷ����ť
		JButton submitButton = new JButton("\u786E\u5B9A");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//��ȡ������е��ı�
				String username = usernameField.getText();
				String psd = psdField.getText();
				String psdAgain = psdAgainField.getText();
				//ʡ��������Ϣ��ȡ
				//�û����ظ���֤,ʡ��������֤
				if(userService.queryUserByUsername(username)!=null){
					//��ʾ��Ϣ
					JOptionPane.showMessageDialog(null, "�û����ѱ�ע��","��Ϣ��",JOptionPane.CANCEL_OPTION);
				}else if(!psd.equals(psdAgain)){
					JOptionPane.showMessageDialog(null, "�����������һ��","��Ϣ��",JOptionPane.CANCEL_OPTION);
				}else{
					//���������Ϣ���д��
					User user = new User();
					user.setUsername(username);
					user.setPsd(psd);
				    	
					//��������û�����
					userService.addUser(user);
				    JOptionPane.showMessageDialog(null, "ע��ɹ�,���ص�¼ҳ��","��Ϣ��",JOptionPane.CANCEL_OPTION);
				    
				    //���ص�¼ҳ��
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
