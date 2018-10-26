package com.login.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.loginswing.entity.User;
import com.loginswing.service.UserService;
import com.loginswing.util.DateUtil;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class AdminictorFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField pageField;
	private UserService userService = new UserService();
	private Integer curretPage=1;//��ǰҳ��ʼΪ��һҳ
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminictorFrame frame = new AdminictorFrame();
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
	public AdminictorFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 755, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 719, 274);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 709, 264);
		panel.add(scrollPane);
		
		table = new JTable();
		
		scrollPane.setViewportView(table);
		
		//��һҳ:curretPage-1
		JButton preButton = new JButton("\u4E0A\u4E00\u9875");
		preButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				curretPage--;
				AdminictorFrame.this.initTableData();
				
			}
		});
		preButton.setBounds(116, 304, 93, 23);
		contentPane.add(preButton);
		//��һҳ:curretPage+1
		JButton nextButton = new JButton("\u4E0B\u4E00\u9875");
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				curretPage++;
				AdminictorFrame.this.initTableData();
			}
		});
		nextButton.setBounds(438, 304, 93, 23);
		contentPane.add(nextButton);
		
		JButton unlockButton = new JButton("\u89E3\u9501\u7528\u6237");
		unlockButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//��ѯ����Ҫ�޸ĵı�������
				int rownum = table.getSelectedRowCount();
				if(rownum!=1){
					JOptionPane.showMessageDialog(null, "һ��ֻ��ѡ��һ��","��Ϣ��",JOptionPane.CANCEL_OPTION);
				}else{
					int row = table.getSelectedRow();
					String username =  table.getValueAt(row, 1).toString();
					User user = userService.queryUserByUsername(username);
					user.setFalseCount(0);
					userService.updateUser(user);
					AdminictorFrame.this.initTableData();
				}
				
			}
		});
		unlockButton.setBounds(116, 337, 93, 23);
		contentPane.add(unlockButton);
		
		JButton lockButton = new JButton("\u9501\u5B9A\u7528\u6237");
		lockButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rownum = table.getSelectedRowCount();
				if(rownum!=1){
					JOptionPane.showMessageDialog(null, "һ��ֻ��ѡ��һ��","��Ϣ��",JOptionPane.CANCEL_OPTION);
				}else{
					int row = table.getSelectedRow();
					String username =  table.getValueAt(row, 1).toString();
					User user = userService.queryUserByUsername(username);
					user.setFalseCount(3);
					userService.updateUser(user);
					AdminictorFrame.this.initTableData();
				}
			}
		});
		lockButton.setBounds(438, 337, 93, 23);
		contentPane.add(lockButton);
		
		pageField = new JTextField();
		pageField.setHorizontalAlignment(SwingConstants.CENTER);
		pageField.setFont(new Font("����", Font.PLAIN, 14));
		pageField.setEditable(false);
		pageField.setBounds(270, 304, 102, 32);
		contentPane.add(pageField);
		pageField.setColumns(10);
		initTableData();
	}
	
	

	//������ҳ��չʾ��ѯ���ı��--��ҳչʾ��ǰ��Ҫ������
	public void initTableData(){
		UserService userService = new UserService();
		List<User> userList = userService.getUsers();
		int pageNum = 2;//ÿҳ������
		//��ҳ��
		int pages = userList.size()%pageNum==0
						?userList.size()/pageNum:userList.size()/pageNum+1;
		//�Ե�ǰҳ����֤
		if(curretPage<1){curretPage=1;}
		if(curretPage>pages){curretPage=pages;}
		pageField.setText("��ǰΪ��"+curretPage+"ҳ");
		//��ҳչʾ��¼����ʼ�±�
		//���ϼ�����0��ʼ,
		//��ҳ��ʼ����:(��ǰҳ-1)*ÿҳ������
		int fromIndex  = (curretPage-1)*pageNum;
		//��ҳ��������: �������һҳ,��Ϊ�����е�Ԫ����
		int toIndex  = curretPage!=pages?curretPage*pageNum:userList.size();
		
		//DefaultTableModel(���Ķ�ά����չʾ������)
		//subList��ʾ��ȡ�����е�һ���� �γ��µ�����--����ҿ�
		table.setModel(new DefaultTableModel(listChangeaDoubleArray(userList.subList(fromIndex, toIndex)),
				new String[] { "�û����","�û���", "�ǳ�","��������","����","�������" }));
	}
	// ��һ������ת�ɶ�ά����
	public String[][] listChangeaDoubleArray(List<User> userList) {
		
		if (userList.size() != 0) {//�ж��Ƿ�������
			int rows = userList.size();//��������==���ϵ�Ԫ�ص�����
			String[][] tableVales = new String[rows][6];
			User user = null;
			for (int i = 0; i < rows; i++) {
				user = userList.get(i);
				tableVales[i][0] = user.getUserid().toString();
				tableVales[i][1] = user.getUsername();
				tableVales[i][2] = user.getNickname();
				tableVales[i][3] = DateUtil.dateToString(user.getBirthday());
				tableVales[i][4] = user.getJob();
				tableVales[i][5] = user.getFalseCount().toString();//�������
				
			}
			return tableVales;
		} else {
			return null;
		}
	}
}
