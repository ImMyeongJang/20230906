package day06;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyDiary {
	
	String memberInfo[]= {"root","tiger123"};
	private JTextField tfId;
	private JPasswordField tfPw;
						//아이디		//비밀번호
	
	public void createGUI() {
		JFrame f=new JFrame("::나의 일기장::");
		f.setBounds(1200,200, 700,800);//x,y,w,h
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 51, 255));
		f.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(MyDiary.class.getResource("/day06/diary.png")));
		lblNewLabel.setBounds(90, 20, 500, 296);
		panel.add(lblNewLabel);
		
		tfId = new JTextField();
		tfId.setFont(new Font("굴림", Font.BOLD, 26));
		tfId.setBounds(100, 360, 475, 82);
		panel.add(tfId);
		tfId.setColumns(10);
		tfId.setBorder(new TitledBorder("ID"));
		
		
		tfPw = new JPasswordField();
		tfPw.setFont(new Font("굴림", Font.BOLD, 26));
		tfPw.setBounds(100, 479, 475, 82);
		panel.add(tfPw);
		tfPw.setBorder(new TitledBorder("Password"));
		
		JButton bt1 = new JButton("");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setTitle("bt1");
				//아이디, 비밀번호값 얻어와서, memberInfo배열에 저장된 값과 비교
				//일치하면 "환영합니다 root님~~" 메시지 다이얼로그 띄우기
				//일치하지 않으면 "아이디가 틀리거나 비밀번호가 틀려요"  메시지 다이얼로그 띄우기
				
				
			}
		});
		bt1.setMnemonic('L');
		bt1.setIcon(new ImageIcon(MyDiary.class.getResource("/day06/login.png")));
		bt1.setBounds(111, 586, 218, 153);
		panel.add(bt1);
		
		JButton bt2 = new JButton("");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setTitle("bt2");
				//tfId, tfPw 값 비워주기
				//tfId에 입력 포커스 주기
			}
		});
		bt2.setMnemonic('R');
		bt2.setIcon(new ImageIcon(MyDiary.class.getResource("/day06/reset.png")));
		bt2.setBounds(352, 586, 218, 153);
		panel.add(bt2);
		f.setVisible(true);
	}//createGUI()----------------

	public static void main(String[] args) {
		// createGUI()호출하기
		MyDiary my=new MyDiary();
		my.createGUI();

	}
}
