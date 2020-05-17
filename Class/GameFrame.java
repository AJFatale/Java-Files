package Class;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class GameFrame extends JFrame implements ActionListener{

	JLabel disp;
	 int i=0,j=0,k,l;
	 
	 JLabel timeLabel = new JLabel("00:00:00");
     int timeCounter = 0;
	boolean stop=true;
	NumberFormat nf = new DecimalFormat("00");
	 
	 
    CardLayout cardLayout;
    JPanel mainPanel;
    MenuPanel menu;
    GamePanel game;
    
    void updateGUI(java.awt.event.ActionEvent e) {
    	
        if(stop) {
        	if(timeCounter<61) 
        	{
        		 
            timeLabel.setText(nf.format(j)+":"+nf.format(i)+":" + nf.format(++timeCounter));
        	}
            if(i<61 && timeCounter==61) 
            {
            timeCounter=0;
            timeLabel.setText(nf.format(j)+":"+nf.format(++i)+":" + nf.format(timeCounter));
            }
        	
        	if(j<61 && i==61 && timeCounter==61) 
        	{
        	i=0;
        	timeCounter=0;
            timeLabel.setText(nf.format(++j)+":"+nf.format(i)+":" + nf.format(timeCounter));
      	    }
        }
    	
    	}

    	

    public GameFrame() {
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        menu = new MenuPanel();
        game = new GamePanel();
        mainPanel.add(menu, "menu");
        mainPanel.add(game, "game");


        JButton goGame = new JButton("next page");
        goGame.setFont(new Font("Tahoma", Font.BOLD, 12));
		goGame.setBounds(828, 710, 121, 34);
        
        goGame.addActionListener(this);

        add(mainPanel);
        add(goGame, BorderLayout.SOUTH);
        
        
        add(timeLabel,BorderLayout.NORTH);
		timeLabel.setBounds(825, 20, 111, 18);
		timeLabel.setFont(new Font("Helvetica",Font.PLAIN,20));
	    timeLabel.setBackground(Color.cyan);
		timeLabel.setForeground(Color.red);
		new Timer(1000, this::updateGUI).start();
	
        
        
        
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationByPlatform(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        gameOn();
    }

    public void gameOn() {
        cardLayout.show(mainPanel, "game");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                GameFrame gameFrame = new GameFrame();
                gameFrame.setExtendedState(gameFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
                
            }
        });
    }
}

class MenuPanel extends JPanel {

    public MenuPanel() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1032, 857);
		//page2 = new JPanel();
		setBackground(new Color(0, 153, 153));
		setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(page2);
		setLayout(null);
		
		ButtonGroup g4=new ButtonGroup();
		ButtonGroup g5=new ButtonGroup();
		ButtonGroup g6=new ButtonGroup();
		
		
		
		JLabel lblNewLabel = new JLabel("Question 1");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel.setBounds(50, 40, 91, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("What is the probability of choosing correctly an unknown integer between 0 and 9 with 3 chances ?");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 14));
	    lblNewLabel_1.setBounds(50, 75, 950, 14);
add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("963/1000 ");
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton.setBounds(35, 106, 200, 23);
		add(rdbtnNewRadioButton);
		g4.add(rdbtnNewRadioButton);
		
			JRadioButton rdbtnNewRadioButton1 = new JRadioButton("966/1000");
			rdbtnNewRadioButton1.setForeground(new Color(255, 255, 0));
			rdbtnNewRadioButton1.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton1.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton1.setBounds(395, 106, 200, 22);
		add(rdbtnNewRadioButton1);
		g4.add(rdbtnNewRadioButton1);
		
		JRadioButton rdbtnNewRadioButton2 = new JRadioButton("968/1000");
		rdbtnNewRadioButton2.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton2.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton2.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton2.setBounds(35, 136, 200, 23);
		add(rdbtnNewRadioButton2);
		g4.add(rdbtnNewRadioButton2);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("None of these ");
		rdbtnNewRadioButton_1.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton_1.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton_1.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton_1.setBounds(395, 136, 250, 23);
		add(rdbtnNewRadioButton_1);
		g4.add(rdbtnNewRadioButton_1);
		
		JLabel lblQuestion = new JLabel("Question 2");
		lblQuestion.setForeground(new Color(255, 255, 255));
		lblQuestion.setFont(new Font("Verdana", Font.BOLD, 14));
		lblQuestion.setBounds(50, 265, 91, 14);
		add(lblQuestion);
		
		JLabel lblHowManyDifferent = new JLabel("A continuous non intersecting curve in the plane whose origin and terminus coincide");
		lblHowManyDifferent.setForeground(new Color(255, 255, 255));
		lblHowManyDifferent.setFont(new Font("Verdana", Font.BOLD, 14));
		lblHowManyDifferent.setBounds(50, 290, 950, 14);
		add(lblHowManyDifferent);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Planer");
		rdbtnNewRadioButton_2.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton_2.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton_2.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton_2.setBounds(50, 350, 250, 23);
add(rdbtnNewRadioButton_2);
		g5.add(rdbtnNewRadioButton_2);
		
		
		JRadioButton radioButton = new JRadioButton("Jordan");
		radioButton.setForeground(new Color(255, 255, 0));
		radioButton.setBackground(new Color(0, 153, 153));
		radioButton.setBounds(50, 380, 350, 23);
		radioButton.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		add(radioButton);
		g5.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Hamiltonian");
		radioButton_1.setForeground(new Color(255, 255, 0));
		radioButton_1.setBackground(new Color(0, 153, 153));
		radioButton_1.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		radioButton_1.setBounds(410, 350, 200, 23);
		add(radioButton_1);
		g5.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("All of these");
		radioButton_2.setForeground(new Color(255, 255, 0));
		radioButton_2.setBackground(new Color(0, 153, 153));
		radioButton_2.setBounds(410, 380, 200, 23);
		radioButton_2.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		add(radioButton_2);
		g5.add(radioButton_2);
		
		JLabel lblQuestion_1 = new JLabel("Question 3");
		lblQuestion_1.setForeground(new Color(255, 255, 255));
		lblQuestion_1.setFont(new Font("Verdana", Font.BOLD, 14));
		lblQuestion_1.setBounds(50, 430, 91, 14);
add(lblQuestion_1);
		
		JLabel lblLetXY = new JLabel("A graph G is called a ..... if it is a connected acyclic graph ?");
		lblLetXY.setForeground(new Color(255, 255, 255));
		lblLetXY.setFont(new Font("Verdana", Font.BOLD, 14));
		lblLetXY.setBounds(50, 460, 950, 14);
		add(lblLetXY);
		
		JRadioButton rdbtnZxy = new JRadioButton("Cyclic graph ");
		rdbtnZxy.setForeground(new Color(255, 255, 0));
		rdbtnZxy.setBackground(new Color(0, 153, 153));
		rdbtnZxy.setBounds(35, 509, 200, 23);
		rdbtnZxy.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		add(rdbtnZxy);
		g6.add(rdbtnZxy);
		
		JRadioButton rdbtnZxY = new JRadioButton("Regular graph");
		rdbtnZxY.setForeground(new Color(255, 255, 0));
		rdbtnZxY.setBackground(new Color(0, 153, 153));
		rdbtnZxY.setBounds(395, 539, 200, 23);
		rdbtnZxY.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		add(rdbtnZxY);
		g6.add(rdbtnZxY);
		
		JRadioButton rdbtnxyz = new JRadioButton("Tree");
		rdbtnxyz.setForeground(new Color(255, 255, 0));
		rdbtnxyz.setBackground(new Color(0, 153, 153));
		rdbtnxyz.setBounds(395, 509, 200, 23);
		rdbtnxyz.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		add(rdbtnxyz);
		g6.add(rdbtnxyz);
		
		JRadioButton rdbtnZX = new JRadioButton("Not a graph ");
		rdbtnZX.setForeground(new Color(255, 255, 0));
		rdbtnZX.setBackground(new Color(0, 153, 153));
		rdbtnZX.setBounds(35, 539, 200, 23);
		rdbtnZX.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		add(rdbtnZX);
		g6.add(rdbtnZX);
		
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }
}

class GamePanel extends JPanel {

    public GamePanel() {
    	setBounds(100, 100, 1032, 857);
		
		setBackground(new Color(0, 153, 153));
		setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setLayout(null);
		
		ButtonGroup g4=new ButtonGroup();
		ButtonGroup g5=new ButtonGroup();
		ButtonGroup g6=new ButtonGroup();
		
		
		
		JLabel lblNewLabel = new JLabel("Question 4");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(50, 40, 91, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("An undirected graph possesses an eulerian circuit if and only if it is connected and its vertices are");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
	    lblNewLabel_1.setBounds(50, 75, 950, 14);
		add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("all of even degree ");
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton.setBounds(50, 126, 200, 23);
		add(rdbtnNewRadioButton);
		g4.add(rdbtnNewRadioButton);
		
			JRadioButton rdbtnNewRadioButton1 = new JRadioButton("all of odd degree ");
			rdbtnNewRadioButton1.setForeground(new Color(255, 255, 0));
			rdbtnNewRadioButton1.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton1.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton1.setBounds(410, 126, 200, 22);
		add(rdbtnNewRadioButton1);
		g4.add(rdbtnNewRadioButton1);
		
		JRadioButton rdbtnNewRadioButton2 = new JRadioButton("of any degree");
		rdbtnNewRadioButton2.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton2.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton2.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton2.setBounds(50, 156, 200, 23);
		add(rdbtnNewRadioButton2);
		g4.add(rdbtnNewRadioButton2);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("even in number ");
		rdbtnNewRadioButton_1.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton_1.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton_1.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton_1.setBounds(410, 156, 250, 23);
		add(rdbtnNewRadioButton_1);
		g4.add(rdbtnNewRadioButton_1);
		
		JLabel lblQuestion = new JLabel("Question 5");
		lblQuestion.setForeground(new Color(255, 255, 255));
		lblQuestion.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblQuestion.setBounds(50, 265, 91, 14);
		add(lblQuestion);
		
		JLabel lblHowManyDifferent = new JLabel("The relation { (1,2), (1,3), (3,1), (1,1), (3,3), (3,2), (1,4), (4,2), (3,4)} is");
		lblHowManyDifferent.setForeground(new Color(255, 255, 255));
		lblHowManyDifferent.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHowManyDifferent.setBounds(50, 290, 950, 14);
		add(lblHowManyDifferent);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Reflexive");
		rdbtnNewRadioButton_2.setForeground(new Color(255, 255, 0));
		rdbtnNewRadioButton_2.setBackground(new Color(0, 153, 153));
		rdbtnNewRadioButton_2.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		rdbtnNewRadioButton_2.setBounds(50, 350, 200, 23);
		add(rdbtnNewRadioButton_2);
		g5.add(rdbtnNewRadioButton_2);
		
		JRadioButton radioButton = new JRadioButton("Transitive");
		radioButton.setForeground(new Color(255, 255, 0));
		radioButton.setBackground(new Color(0, 153, 153));
		radioButton.setBounds(50, 380, 200, 23);
		radioButton.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		add(radioButton);
		g5.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Symmetric");
		radioButton_1.setForeground(new Color(255, 255, 0));
		radioButton_1.setBackground(new Color(0, 153, 153));
		radioButton_1.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		radioButton_1.setBounds(410, 350, 200, 23);
		add(radioButton_1);
		g5.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("None of these");
		radioButton_2.setForeground(new Color(255, 255, 0));
		radioButton_2.setBackground(new Color(0, 153, 153));
		radioButton_2.setBounds(410, 380, 200, 23);
		radioButton_2.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		add(radioButton_2);
		g5.add(radioButton_2);
		
		JLabel lblQuestion_1 = new JLabel("Question 6");
		lblQuestion_1.setForeground(new Color(255, 255, 255));
		lblQuestion_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblQuestion_1.setBounds(50, 430, 91, 14);
		add(lblQuestion_1);
		
		JLabel lblLetXY = new JLabel("In an undirected graph the number of nodes with odd degree must be");
		lblLetXY.setForeground(new Color(255, 255, 255));
		lblLetXY.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLetXY.setBounds(50, 460, 950, 14);
		add(lblLetXY);
		
		JRadioButton rdbtnZxy = new JRadioButton("Zero ");
		rdbtnZxy.setForeground(new Color(255, 255, 0));
		rdbtnZxy.setBackground(new Color(0, 153, 153));
		rdbtnZxy.setBounds(50, 516, 200, 23);
		rdbtnZxy.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		add(rdbtnZxy);
		g6.add(rdbtnZxy);
		
		JRadioButton rdbtnZxY = new JRadioButton("Odd");
		rdbtnZxY.setForeground(new Color(255, 255, 0));
		rdbtnZxY.setBackground(new Color(0, 153, 153));
		rdbtnZxY.setBounds(410, 546, 200, 23);
		rdbtnZxY.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		add(rdbtnZxY);
		g6.add(rdbtnZxY);
		
		JRadioButton rdbtnxyz = new JRadioButton("Prime");
		rdbtnxyz.setForeground(new Color(255, 255, 0));
		rdbtnxyz.setBackground(new Color(0, 153, 153));
		rdbtnxyz.setBounds(410, 516, 200, 23);
		rdbtnxyz.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		add(rdbtnxyz);
		g6.add(rdbtnxyz);
		
		JRadioButton rdbtnZX = new JRadioButton("Even ");
		rdbtnZX.setForeground(new Color(255, 255, 0));
		rdbtnZX.setBackground(new Color(0, 153, 153));
		rdbtnZX.setBounds(50, 546, 200, 23);
		rdbtnZX.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		add(rdbtnZX);
		g6.add(rdbtnZX);
		   }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }
}