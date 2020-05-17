package Java;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class client extends JFrame {

	private static JPanel contentPane;
	private static JTextField input;
	private static JTextArea messages;
	private static JLabel l2;
	private static JButton send;
	
	private static Socket s;
	private static DataInputStream dis;
	private static DataOutputStream dos;

	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					client frame = new client();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		try {
			String inmsg = "";
			s = new Socket("127.0.0.1",4444);
			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
			
			while(!inmsg.equals("Exit")) {
				inmsg =(String)dis.readUTF();
				messages.setText(messages.getText()+ "\nServer: " + inmsg);
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		
		}
	}

	
	public client() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		messages = new JTextArea();
		messages.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 14));
		messages.setBounds(10, 27, 414, 189);
		contentPane.add(messages);
		
		
		input = new JTextField();
		input.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 12));
		input.setBounds(10, 227, 335, 23);
		contentPane.add(input);
		input.setColumns(10);
		
		JButton send = new JButton("Send");
		send.setForeground(new Color(255, 255, 255));
		send.setBackground(new Color(0, 0, 255));
		send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String msg = "";
					msg = input.getText();
					dos.writeUTF(msg);
					input.setText("");
				} catch(Exception ex) {
					ex.printStackTrace();
				}
			}

		});
		send.setBounds(355, 227, 69, 23);
		contentPane.add(send);
		
		JLabel l2 = new JLabel("Client");
		l2.setFont(new Font("Tahoma", Font.BOLD, 15));
		l2.setBounds(10, 11, 46, 14);
		contentPane.add(l2);
	}

}
