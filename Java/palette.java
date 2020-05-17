package Java;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public abstract class palette extends Applet implements ActionListener,ItemListener
{
	Button[] colors;
	Checkbox foreground,background;
	TextArea workarea;
	CheckboxGroup cbg;
	Panel buttonpanel,checkpanel,palettepanel;
	String colour;
	public void init()
	{
		buttonpanel=new Panel();
		buttonpanel.setLayout(new GridLayout(4,2));
		colors=new Button[8];
		colors[0]=new Button("RED");
		colors[1]=new Button("GREEN");
		colors[2]=new Button("BLUE");
		colors[3]=new Button("YELLOW");
		colors[4]=new Button("WHITE");
		colors[5]=new Button("BLACK");
		colors[6]=new Button("PINK");
		colors[7]=new Button("ORANGE");
		for(int i=0;i<8;i++)
		{
			colors[i].addActionListener(this);
			buttonpanel.add(colors[i]);
		}
		checkpanel=new Panel();
		checkpanel.setLayout(new FlowLayout());
		cbg=new CheckboxGroup();
		foreground=new Checkbox("ForeGround",cbg,true);
		background=new Checkbox("Background",cbg,false);
		foreground.addItemListener(this);
		background.addItemListener(this);
		checkpanel.add(foreground);
		checkpanel.add(background);
		workarea=new TextArea(8,50);
		workarea.setFont(new Font("Garamond",Font.BOLD,20));
		palettepanel=new Panel();
		palettepanel.setLayout(new BorderLayout());
		palettepanel.add(workarea,BorderLayout.CENTER);
		palettepanel.add(checkpanel,BorderLayout.SOUTH);
        palettepanel.add(buttonpanel,BorderLayout.EAST);
        add(palettepanel);
	}
	public void itemStatechanged(ItemEvent ie)
	{
				
	}
	public void actionPerformed(ActionEvent ae) 
	{
	colour=ae.getActionCommand();
	if(foreground.getState()==true)
		workarea.setForeground(getColour());
	if(background.getState()==true)
		workarea.setBackground(getColour());
	}
	public Color getColour()
	{
		Color mycolor=null;
		if(colour.contentEquals("RED"))
			mycolor=Color.red;
		if(colour.contentEquals("GREEN"))
			mycolor=Color.green;
		if(colour.contentEquals("BLUE"))
			mycolor=Color.blue;
		if(colour.contentEquals("ORANGE"))
			mycolor=Color.orange;
		if(colour.contentEquals("WHITE"))
			mycolor=Color.white;
		if(colour.contentEquals("BLACK"))
		    mycolor=Color.black;
		if(colour.contentEquals("YELLOW"))
			mycolor=Color.yellow;
		if(colour.contentEquals("PINK"))
			mycolor=Color.pink;
		return mycolor;
	}
	
}

























