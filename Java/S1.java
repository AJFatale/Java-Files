package Java;

import java.awt.*;
import java.awt.event.*;
public class S1 implements ActionListener {
int c,n;
String s1,s2,s3,s4,s5;
TextField t1 = new TextField () ;

String str[] = { "1","2","3","+","4","5","6","-","7","8", "9", "*","C", "0","=","/", };

Button b[] = new Button [16];
Frame fr ;
S1 ()
{

fr = new Frame ("Calculator") ;
fr.setLayout(null);


for (int i=0;i<16;i++)
{
b[i] = new Button(str[i]);
b[i].addActionListener(this);
}
int h = 120; int l = 60; int n = 0;
for ( int k = 0 ;k<4;k++ )
{ int m= 30;
for (int j = 0; j<4;j++)
{
b[j+n].setBounds(m,h,100,l);
m = m+145;
}
h= h +100;n = n+4;
}

t1.setBounds(30,50,540,50);
fr.add(t1);
for (int i = 0 ; i<16 ; i++)
{
fr.add(b[i]);
}

fr.setSize(600,600);
fr.setVisible(true);



}
 public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b[13])
        {
            s3 = t1.getText();
            s4 = "0";
            s5 = s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b[0])
        {
            s3 = t1.getText();
            s4 = "1";
            s5 = s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b[1])
        {
            s3 = t1.getText();
            s4 = "2";
            s5 = s3+s4;
            t1.setText(s5);
        }if(e.getSource()==b[2])
        {
            s3 = t1.getText();
            s4 = "3";
            s5 = s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b[4])
        {
            s3 = t1.getText();
            s4 = "4";
            s5 = s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b[5])
        {
            s3 = t1.getText();
            s4 = "5";
            s5 = s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b[6])
        {
            s3 = t1.getText();
            s4 = "6";
            s5 = s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b[8])
        {
            s3 = t1.getText();
            s4 = "7";
            s5 = s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b[9])
        {
            s3 = t1.getText();
            s4 = "8";
            s5 = s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b[10])
        {
            s3 = t1.getText();
            s4 = "9";
            s5 = s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b[3])
        {
            s1 = t1.getText();
            t1.setText("");
            c=1;
 
        }
        if(e.getSource()==b[7])
        {
            s1 = t1.getText();
            t1.setText("");
            c=2;
 
        }
        if(e.getSource()==b[11])
        {
            s1 = t1.getText();
            t1.setText("");
            c=3;
 
        }
        if(e.getSource()==b[15])
        {
            s1 = t1.getText();
            t1.setText("");
            c=4;
 
        }
        if(e.getSource()==b[12])
        {
        	 t1.setText("");
        }
        if(e.getSource()==b[14])
        {
            s2 = t1.getText();
            if(c==1)
            {
                n = Integer.parseInt(s1)+Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            }
            else
            if(c==2)
            {
                n = Integer.parseInt(s1)-Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            }
            else
            if(c==3)
            {
                n = Integer.parseInt(s1)*Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            }
            if(c==4)
            {
                try
                {
                    int p=Integer.parseInt(s2);
                    if(p!=0)
                    {
                                        n = Integer.parseInt(s1)/Integer.parseInt(s2);
                    t1.setText(String.valueOf(n));
                     }
                     else
                        t1.setText("infinite");
 
                }
                catch(Exception i){}
            }
            if(c==5)
            {
                n = Integer.parseInt(s1)%Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            }
        }
       
    }
 
public static void main (String s[])
{
S1 v=new S1();

}
}


