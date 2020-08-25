import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calc
{

static String s="";

static int o = 0;
   
static int a = 0;
 
String b="";
 

JFrame f = new JFrame();

JPanel p1 = new JPanel();

int n;

calc(){
JTextField jt1 = new JTextField();
jt1.setBounds(20,50,90,50);

JButton b0 = new JButton("0");
JButton b1 = new JButton("1");
JButton b2 = new JButton("2");
JButton b3 = new JButton("3");
JButton b4 = new JButton("4");
JButton b5 = new JButton("5");
JButton b6 = new JButton("6");
JButton b7 = new JButton("7");
JButton b8 = new JButton("8");
JButton b9 = new JButton("9");
JButton b10 = new JButton("+");
JButton b11 = new JButton("-");
JButton b12 = new JButton("*");
JButton b13 = new JButton("/");
JButton b14 = new JButton("=");

f.add(jt1);
p1.add(b0);
p1.add(b1);
p1.add(b2);
p1.add(b3);
p1.add(b4);
p1.add(b5);
p1.add(b6);
p1.add(b7);
p1.add(b8);
p1.add(b9);
p1.add(b10);
p1.add(b11);
p1.add(b12);
p1.add(b13);
p1.add(b14);

f.add(p1);
f.setLayout(new GridLayout(3,5));
f.setSize(500,500);
f.setVisible(true);


p1.setVisible(true);
p1.setLayout(new GridLayout(3,5));


b0.addActionListener(new ActionListener()
   {  
       public void actionPerformed(ActionEvent e)
       {
        jt1.setText(jt1.getText()+"0");
       
       
       }
   });

b1.addActionListener(new ActionListener()
   {  
       public void actionPerformed(ActionEvent e)
       {
        jt1.setText(jt1.getText()+"1");
       }
   });


b2.addActionListener(new ActionListener()
   {  
       public void actionPerformed(ActionEvent e)
       {
        jt1.setText(jt1.getText()+"2");
       }
   });

b3.addActionListener(new ActionListener()
   {  
       public void actionPerformed(ActionEvent e)
       {
        jt1.setText(jt1.getText()+"3");
       }
   });

b4.addActionListener(new ActionListener()
   {  
       public void actionPerformed(ActionEvent e)
       {
        jt1.setText(jt1.getText()+"4");
       }
   });

b5.addActionListener(new ActionListener()
   {  
       public void actionPerformed(ActionEvent e)
       {
        jt1.setText(jt1.getText()+"5");
       }
   });

b6.addActionListener(new ActionListener()
   {  
       public void actionPerformed(ActionEvent e)
       {
        jt1.setText(jt1.getText()+"6");
       }
   });

b7.addActionListener(new ActionListener()
   {  
       public void actionPerformed(ActionEvent e)
       {
        jt1.setText(jt1.getText()+"7");
       }
   });

b8.addActionListener(new ActionListener()
   {  
       public void actionPerformed(ActionEvent e)
       {
        jt1.setText(jt1.getText()+"8");
       }
   });

b9.addActionListener(new ActionListener()
   {  
       public void actionPerformed(ActionEvent e)
       {
        jt1.setText(jt1.getText()+"9");
       }
   });

b10.addActionListener(new ActionListener()
   {  
       public void actionPerformed(ActionEvent e)
       {
        a=Integer.parseInt(jt1.getText());
        o=1;
        jt1.setText(jt1.getText()+"+");
       
       }
   });

b11.addActionListener(new ActionListener()
   {  
       public void actionPerformed(ActionEvent e)
       {
         a=Integer.parseInt(jt1.getText());
         o=2;
        jt1.setText(jt1.getText()+"-");
       }
   });

b12.addActionListener(new ActionListener()
   {  
       public void actionPerformed(ActionEvent e)
       {
         a=Integer.parseInt(jt1.getText());
         o=3;
        jt1.setText(jt1.getText()+"*");
       }
   });

b13.addActionListener(new ActionListener()
   {  
       public void actionPerformed(ActionEvent e)
       {
         a=Integer.parseInt(jt1.getText());
         o=4;
        jt1.setText(jt1.getText()+"/");
       }
   });

b14.addActionListener(new ActionListener()
   {  
       public void actionPerformed(ActionEvent e)
       {
      jt1.setText(jt1.getText()+"=");
           b =jt1.getText();
       
        switch(o)
        {
            case 1:
            int i=b.indexOf("+");
            int j=b.indexOf("=");
            String s0=b.substring(i+1,j);
            int x = Integer.parseInt(s0);
            int y = a+x;
            s=Integer.toString(y);
            break;
           
            case 2:
                int i1=b.indexOf("-");
                int j1=b.indexOf("=");
               String s1=b.substring(i1+1,j1);
               int x1 = Integer.parseInt(s1);
               int y1 = a-x1;
               s=Integer.toString(y1);
           break;
               
            case 3:
            int i2=b.indexOf("*");
                int j2=b.indexOf("=");
                String s2=b.substring(i2+1,j2);
                int x2 = Integer.parseInt(s2);
                int y2 = a*x2;
                s=Integer.toString(y2);
            break;
               
            case 4:
            int i3=b.indexOf("/");
                int j3=b.indexOf("=");
                String s3=b.substring(i3+1,j3);
                int x3 = Integer.parseInt(s3);
                int y3 = a/x3;
                s=Integer.toString(y3);
            break;
          }
        jt1.setText(jt1.getText()+s);
        }
       });
}
public static void main(String[] args)
{
    new calc();
}
}