package StringHandling;

import java.awt.*;
public class Calculator {


Frame fr ;
Calculator ()
{

String str[] = { "1","2","3","+","4","5","6","-","7","8", "9", "*",".", "0","=","/" };
fr = new Frame ("Calculator") ;
fr.setLayout(null);
TextField t1 = new TextField () ;

Button b[] = new Button [16];
for (int i=0;i<16;i++)
{
b[i] = new Button(str[i]);

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
public static void main (String s[])
{
new Calculator ();

}
}