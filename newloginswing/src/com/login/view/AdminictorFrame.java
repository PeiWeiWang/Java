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
	private Integer curretPage=1;//当前页初始为第一页
	
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
		
		//下一页:curretPage-1
		JButton preButton = new JButton("\u4E0A\u4E00\u9875");
		preButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				curretPage--;
				AdminictorFrame.this.initTableData();
				
			}
		});
		preButton.setBounds(116, 304, 93, 23);
		contentPane.add(preButton);
		//上一页:curretPage+1
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
				//查询到需要修改的表格的行数
				int rownum = table.getSelectedRowCount();
				if(rownum!=1){
					JOptionPane.showMessageDialog(null, "一次只能选择一行","消息框",JOptionPane.CANCEL_OPTION);
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
					JOptionPane.showMessageDialog(null, "一次只能选择一行","消息框",JOptionPane.CANCEL_OPTION);
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
		pageField.setFont(new Font("宋体", Font.PLAIN, 14));
		pageField.setEditable(false);
		pageField.setBounds(270, 304, 102, 32);
		contentPane.add(pageField);
		pageField.setColumns(10);
		initTableData();
	}
	
	

	//用于在页面展示查询出的表格--分页展示当前需要的数据
	public void initTableData(){
		UserService userService = new UserService();
		List<User> userList = userService.getUsers();
		int pageNum = 2;//每页的条数
		//总页数
		int pages = userList.size()%pageNum==0
						?userList.size()/pageNum:userList.size()/pageNum+1;
		//对当前页的验证
		if(curretPage<1){curretPage=1;}
		if(curretPage>pages){curretPage=pages;}
		pageField.setText("当前为第"+curretPage+"页");
		//本页展示记录的起始下标
		//集合计数从0开始,
		//本页起始条数:(当前页-1)*每页的条数
		int fromIndex  = (curretPage-1)*pageNum;
		//本页结束条数: 如是最后一页,则为集合中的元素数
		int toIndex  = curretPage!=pages?curretPage*pageNum:userList.size();
		
		//DefaultTableModel(表格的二维数组展示，列名)
		//subList表示截取出其中的一部分 形成新的数组--左闭右开
		table.setModel(new DefaultTableModel(listChangeaDoubleArray(userList.subList(fromIndex, toIndex)),
				new String[] { "用户编号","用户名", "昵称","出生日期","工作","出错次数" }));
	}
	// 把一个集合转成二维数组
	public String[][] listChangeaDoubleArray(List<User> userList) {
		
		if (userList.size() != 0) {//判断是否有数据
			int rows = userList.size();//表格的行数==集合的元素的数量
			String[][] tableVales = new String[rows][6];
			User user = null;
			for (int i = 0; i < rows; i++) {
				user = userList.get(i);
				tableVales[i][0] = user.getUserid().toString();
				tableVales[i][1] = user.getUsername();
				tableVales[i][2] = user.getNickname();
				tableVales[i][3] = DateUtil.dateToString(user.getBirthday());
				tableVales[i][4] = user.getJob();
				tableVales[i][5] = user.getFalseCount().toString();//出错次数
				
			}
			return tableVales;
		} else {
			return null;
		}
	}
}
