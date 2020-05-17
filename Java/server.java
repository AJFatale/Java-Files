package Java;



	import java.awt.BorderLayout;
	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;

	import javax.swing.JTextArea;
	import javax.swing.JTextField;
	import javax.swing.JButton;
	import java.awt.SystemColor;
	import java.awt.Color;
	import java.awt.Font;
	import java.awt.event.ActionListener;
	import java.io.DataInputStream;
	import java.io.DataOutputStream;
	import java.net.ServerSocket;
	import java.net.Socket;
	import java.awt.event.ActionEvent;

	public class server extends JFrame {
		/**
		 * @wbp.nonvisual location=357,279
		 */
		private static JButton send;
		private static JTextArea messages;
		private static JLabel l1;
		private static JTextField input;
		
		private static ServerSocket ss;
		private static Socket s;
		private static DataInputStream dis;
		private static DataOutputStream dos;
		

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {	
			
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						server frame = new server();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
			});
			try {
			
				String inmsg = "";
				ss = new ServerSocket(4444);
				s = ss.accept();
				dis = new DataInputStream(s.getInputStream());
				dos = new DataOutputStream(s.getOutputStream());
				
				while(!inmsg.equals("Exit")) {
					inmsg =(String)dis.readUTF();
					messages.setText(messages.getText() + "\nClient: " + inmsg);
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

		/**
		 * Create the frame.
		 */
		public server() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			getContentPane().setLayout(null);
			
			messages = new JTextArea();
			messages.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 14));
			messages.setBackground(new Color(255, 255, 255));
			messages.setBounds(10, 34, 414, 172);
			getContentPane().add(messages);
			
			input = new JTextField();
			input.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 12));
			input.setBounds(10, 217, 337, 25);
			getContentPane().add(input);
			input.setColumns(10);
			
			JButton send = new JButton("Send");
			send.setForeground(new Color(255, 255, 255));
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
			send.setBackground(new Color(0, 0, 255));
			send.setBounds(357, 217, 67, 24);
			getContentPane().add(send);
			
			JLabel l1 = new JLabel("Server");
			l1.setFont(new Font("Tahoma", Font.BOLD, 15));
			l1.setBounds(10, 11, 74, 14);
			getContentPane().add(l1);
		}
	}
