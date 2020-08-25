
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class home implements ActionListener {
JButton cap=new JButton("A-Z");
JButton lower=new JButton("a-z");
JButton num=new JButton("1-9");
public home() {


JFrame f=new JFrame();
cap.addActionListener(this);
                cap.setBounds(300,100,100,30);
                lower.addActionListener(this);
                lower.setBounds(300,200,100,30);
                num.addActionListener(this);
                num.setBounds(300,300,100,30);
                JLabel jl=new JLabel("Select Capital A-Z");
                jl.setBounds(100,100,120,30);
                JLabel jl1=new JLabel("Select Small a-z");
                jl1.setBounds(100,200,120,30);
                JLabel jl2=new JLabel("Select Numbers 1-9");
                jl2.setBounds(100,300,120,30);
                f.add(jl);
                f.add(jl1);
                f.add(jl2);
f.setLayout(null);

f.add(cap);
f.add(lower);
f.add(num);
               
               

f.setVisible(true);
                f.getContentPane().setBackground(Color.cyan);
f.setSize(500,500);


}

public void actionPerformed(ActionEvent e)
{
if(e.getSource() == cap) {

abc x=new abc();
x.addP1();
 


}
else if(e.getSource() == lower)
{
abc x=new abc();
x.addSmall();
}

else if(e.getSource() == num)
{
abc x=new abc();
x.addNum();
}

}
       
public static void main(String []args) {
home h=new home();
}

}

