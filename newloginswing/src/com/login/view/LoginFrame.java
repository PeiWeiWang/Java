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

		// ��¼
		JButton btnNewButton = new JButton("\u767B\u5F55");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = usernameField.getText();
				String psd = psdField.getText();
				// ����Ա��¼
				if ("admin".equals(username) && "admin".equals(psd)) {
					AdminictorFrame af = new AdminictorFrame();
					af.setVisible(true);
					dispose();
					return;
				}

				UserService us = new UserService();
				User user = us.queryUserByUsername(username);// ��ǰ�û�����
				// ��ͨ�û���¼--���ж��û��Ƿ����
				if (user == null) {
					JOptionPane.showMessageDialog(null, "�û���������", "��Ϣ��",
							JOptionPane.CANCEL_OPTION);
					return;
				}
				
				//�û�����
				// �統ǰʱ�������һ�γ���ʱ�����24Сʱ,���������0
				if (user.getLastFalseTime() != null
						&& new Date().getTime()
								- user.getLastFalseTime().getTime() >= 24 * 60 * 60 * 1000L) {
					user.setFalseCount(0);
					us.updateUser(user);
				}
				//�ж��û��Ƿ�����
				if (user.getFalseCount() >= 3) {// �˺ű�����
					JOptionPane.showMessageDialog(null, "�û�������", "��Ϣ��",
							JOptionPane.CANCEL_OPTION);
				} else if (!psd.equals(user.getPsd())) {

					// �˺�δ����,�������������,���������+1,��¼��ǰʱ��,��д���ļ�
					user.setFalseCount(user.getFalseCount() + 1);
					user.setLastFalseTime(new Date());// �������һ�γ���ʱ��
					String msg = user.getFalseCount() == 3 ? "�����Ѳ��ɳ���"
							: "��������,����" + (3 - user.getFalseCount()) + "�λ���";
					JOptionPane.showMessageDialog(null, msg, "��Ϣ��",
							JOptionPane.CANCEL_OPTION);
					//�����ȥ
					us.updateUser(user);

				} else {
					// ������ȷ,��ת��չʾҳ��;������ǰ��¼�û��Ķ��󴫵�����һҳ��
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
				// ��ת��ע��ҳ��---������AddUserFrame���󼴿�
				AddUserFrame addUserFrame = new AddUserFrame();
				// ��ʾע��ҳ��
				addUserFrame.setVisible(true);
				// ���ص�ǰҳ��
				dispose();

			}
		});
		button.setBounds(313, 295, 103, 40);
		contentPane.add(button);
	}
}
