package com.loginswing.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.loginswing.entity.User;
import com.loginswing.util.DateUtil;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Date;

public class UserFrame extends JFrame {

	private JPanel contentPane;
	private User user;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserFrame frame = new UserFrame(new User());
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public UserFrame(){}
	/**
	 * Create the frame.
	 */
	public UserFrame(final User user) {
		this.user = user;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 694, 310);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 674, 220);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		this.initTable();//���ó�ʼ���������ɱ��
		
		//�޸��û�����
		JButton button = new JButton("\u4FEE\u6539\u5BC6\u7801");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateUserFrame updateUserFrame = new UpdateUserFrame(user);
				updateUserFrame.setVisible(true);
				dispose();
			}
		});
		button.setBounds(32, 258, 93, 23);
		panel.add(button);
	}
	
	//�Ա����г�ʼ���ķ���
	public void initTable(){
		//����е�ֵ����Ϊ��ά����
		String[][] tableValue = new String[1][5];
		tableValue[0][0] = user.getUsername();
		tableValue[0][1] = user.getPsd();
		tableValue[0][2] = user.getNickname();
		tableValue[0][3] =DateUtil.dateToString(user.getBirthday());
		tableValue[0][4] = user.getJob();
		
		//�������л�ͼ
		table.setModel(new DefaultTableModel(tableValue,
				new String[] { "�û���","����", "�ǳ�","��������","����" }));
	}

	
	
}
