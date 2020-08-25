import java.awt.*;
public class frameform
{
	public static void main(String args[])
	{
		Label l = new Label("Username");
		Label l1 = new Label("Password");
TextField tf = new TextField(15);

TextField tf1 = new TextField(15);
tf1.setEchoChar('*');
CheckboxGroup cg = new CheckboxGroup();
Checkbox c1 = new Checkbox("advance java",cg,true);
Checkbox c2 = new Checkbox("WP",cg,false);
Checkbox c3 = new Checkbox("Economics",cg,false);
Checkbox c4 = new Checkbox("Mobile Computing",cg,false);

Checkbox c5 = new Checkbox("abc");
Checkbox c6 = new Checkbox("pqr");
Checkbox c7 = new Checkbox("xyz");

Choice ch = new Choice();
ch.add("Subject 1");
ch.add("Subject 2");
ch.add("Subject 3");
ch.add("Subject 4");
ch.add("Subject 5");

List list = new List();
list.add("Parth");
list.add("Aashish");
list.add("Aditya");
list.add("Amulya");
Button b1 = new Button("submit");
b1.setSize(5,5);
	Frame f1 = new Frame();
	Panel p = new Panel();

	p.setLayout(new GridLayout(10,10,5,5));

	p.add(l);
p.add(tf);
	p.add(l1);
	p.add(tf1);
	p.add(c1);
	p.add(c2);
	p.add(c3);
	p.add(c4);
	p.add(c5);
	p.add(c6);
	p.add(c7);
	p.add(list);
p.add(ch);
p.add(b1);
	f1.setLayout(new FlowLayout());
f1.add(p);
f1.setVisible(true);
f1.setSize(1000,1000);

}
}
