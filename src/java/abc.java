import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.plaf.basic.BasicComboBoxRenderer;
import jaco.mp3.player.MP3Player;

 class abc implements MouseMotionListener, ActionListener{
    JFrame f1 = new JFrame("Choose an Alphabet");
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3=new JPanel();
    JPanel p4=new JPanel();
    JPanel small=new JPanel();
    JPanel num=new JPanel();
    JButton clear=new JButton("Clear");
    JButton audio=new JButton("Audio");
    public static String A="C:\\Users\\Ankit PC\\Desktop\\java\\final\\javaproject\\A to z\\A.mp3"; 
    public static String B="C:\\Users\\Ankit PC\\Desktop\\java\\final\\javaproject\\A to z\\B.mp3"; 
    public static String C="C:\\Users\\Ankit PC\\Desktop\\java\\final\\javaproject\\A to z\\C.mp3"; 
    public static String D="C:\\Users\\Ankit PC\\Desktop\\java\\final\\javaproject\\A to z\\D.mp3"; 
    public static String E="C:\\Users\\Ankit PC\\Desktop\\java\\final\\javaproject\\A to z\\E.mp3"; 
    public static String F="C:\\Users\\Ankit PC\\Desktop\\java\\final\\javaproject\\A to z\\F.mp3"; 
    public static String G="C:\\Users\\Ankit PC\\Desktop\\java\\final\\javaproject\\A to z\\G.mp3"; 
    public static String H="C:\\Users\\Ankit PC\\Desktop\\java\\final\\javaproject\\A to z\\H.mp3"; 
    public static String I="C:\\Users\\Ankit PC\\Desktop\\java\\final\\javaproject\\A to z\\I.mp3"; 
    public static String J="C:\\Users\\Ankit PC\\Desktop\\java\\final\\javaproject\\A to z\\J.mp3"; 
    public static String K="C:\\Users\\Ankit PC\\Desktop\\java\\final\\javaproject\\A to z\\K.mp3"; 
    public static String L="C:\\Users\\Ankit PC\\Desktop\\java\\final\\javaproject\\A to z\\L.mp3"; 
    public static String M="C:\\Users\\Ankit PC\\Desktop\\java\\final\\javaproject\\A to z\\M.mp3"; 
    public static String N="C:\\Users\\Ankit PC\\Desktop\\java\\final\\javaproject\\A to z\\N.mp3"; 
    public static String O="C:\\Users\\Ankit PC\\Desktop\\java\\final\\javaproject\\A to z\\O.mp3"; 
    public static String P="C:\\Users\\Ankit PC\\Desktop\\java\\final\\javaproject\\A to z\\P.mp3"; 
    public static String Q="C:\\Users\\Ankit PC\\Desktop\\java\\final\\javaproject\\A to z\\Q.mp3"; 
    public static String R="C:\\Users\\Ankit PC\\Desktop\\java\\final\\javaproject\\A to z\\R.mp3"; 
    public static String S="C:\\Users\\Ankit PC\\Desktop\\java\\final\\javaproject\\A to z\\S.mp3"; 
    public static String T="C:\\Users\\Ankit PC\\Desktop\\java\\final\\javaproject\\A to z\\T.mp3"; 
    public static String U="C:\\Users\\Ankit PC\\Desktop\\java\\final\\javaproject\\A to z\\U.mp3"; 
    public static String V="C:\\Users\\Ankit PC\\Desktop\\java\\final\\javaproject\\A to z\\V.mp3"; 
    public static String W="C:\\Users\\Ankit PC\\Desktop\\java\\final\\javaproject\\A to z\\W.mp3"; 
    public static String X="C:\\Users\\Ankit PC\\Desktop\\java\\final\\javaproject\\A to z\\X.mp3"; 
    public static String Y="C:\\Users\\Ankit PC\\Desktop\\java\\final\\javaproject\\A to z\\Y.mp3"; 
    public static String Z="C:\\Users\\Ankit PC\\Desktop\\java\\final\\javaproject\\A to z\\Z.mp3"; 
   
    
    MP3Player mp3playerA=new MP3Player(new File(A));
    MP3Player mp3playerB=new MP3Player(new File(B));
    MP3Player mp3playerC=new MP3Player(new File(C));
    MP3Player mp3playerD=new MP3Player(new File(D));
    MP3Player mp3playerE=new MP3Player(new File(E));
    MP3Player mp3playerF=new MP3Player(new File(F));
    MP3Player mp3playerG=new MP3Player(new File(G));
    MP3Player mp3playerH=new MP3Player(new File(H));    
    MP3Player mp3playerI=new MP3Player(new File(I));
    MP3Player mp3playerJ=new MP3Player(new File(J));
    MP3Player mp3playerK=new MP3Player(new File(K));
    MP3Player mp3playerL=new MP3Player(new File(L));
    MP3Player mp3playerM=new MP3Player(new File(M));
    MP3Player mp3playerN=new MP3Player(new File(N));
    MP3Player mp3playerO=new MP3Player(new File(O));
    MP3Player mp3playerP=new MP3Player(new File(P));
    MP3Player mp3playerQ=new MP3Player(new File(Q));    
    MP3Player mp3playerR=new MP3Player(new File(R));
    MP3Player mp3playerS=new MP3Player(new File(S));
    MP3Player mp3playerT=new MP3Player(new File(T));
    MP3Player mp3playerU=new MP3Player(new File(U));
    MP3Player mp3playerV=new MP3Player(new File(V));
    MP3Player mp3playerW=new MP3Player(new File(W));
    MP3Player mp3playerX=new MP3Player(new File(X));
    MP3Player mp3playerY=new MP3Player(new File(Y));
    MP3Player mp3playerZ=new MP3Player(new File(Z));
    abc(){
        
       
        p1.setLayout(new FlowLayout());

        //JLabel jl=new JLabel();
       // jl.setText("Choose an Alphabet:");
        //p1.add(jl);
       

        JButton a = new JButton("A");
        p1.add(a);
        
                a.addActionListener(this);
                    JButton b=new JButton("B");
                    p1.add(b);
                
                b.addActionListener(this);

            audio.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e4) 
            {
             //    mp3playerA.play();  
               
                  
                
                System.out.println(e4.getActionCommand());
                if(e4.getActionCommand()=="b")
                {
                   mp3playerA.pause();
                    mp3playerB.play();    
                }
                else if(e4.getActionCommand()=="B")      
                {
                    mp3playerA.pause();
                    mp3playerB.play();         
                }
                                                                        //audio code
            }
        }); 

		JButton c=new JButton("C");
		p1.add(c);
                  c.addActionListener(this);
		JButton d=new JButton("D");
		p1.add(d);
                d.addActionListener(this);
		JButton e=new JButton("E");
		p1.add(e);
                e.addActionListener(this);
		JButton f=new JButton("F");
		p1.add(f);
                f.addActionListener(this);
		JButton g=new JButton("G");
		p1.add(g);
                g.addActionListener(this);
		JButton h=new JButton("H");
		p1.add(h);
                h.addActionListener(this);
		JButton i=new JButton("I");
		p1.add(i);
                i.addActionListener(this);
		JButton j=new JButton("J");
                 p1.add(j);
                 j.addActionListener(this);
                 JButton k=new JButton("K");
		p1.add(k);
                k.addActionListener(this);
		JButton l=new JButton("L");
		p1.add(l);
                l.addActionListener(this);
		JButton m=new JButton("M");
		p1.add(m);
                m.addActionListener(this);
		JButton n=new JButton("N");
		p1.add(n);
                n.addActionListener(this);
		JButton o=new JButton("O");
		p1.add(o);
                o.addActionListener(this);
		
		JButton p=new JButton("P");
		p1.add(p);
                p.addActionListener(this);
		JButton q=new JButton("Q");
		p1.add(q);
                q.addActionListener(this);
		JButton r=new JButton("R");
                p1.add(r);
                        r.addActionListener(this);
                JButton s=new JButton("S");
		p1.add(s);
                s.addActionListener(this);
		JButton t=new JButton("T");
		p1.add(t);
                t.addActionListener(this);
		JButton u=new JButton("U");
		p1.add(u);
                u.addActionListener(this);
		JButton v=new JButton("V");
		p1.add(v);
                v.addActionListener(this);
		JButton w=new JButton("W");
		p1.add(w);
                w.addActionListener(this);
		JButton x=new JButton("X");
		p1.add(x);
                x.addActionListener(this);
		JButton y=new JButton("Y");
		p1.add(y);
                y.addActionListener(this);
        JButton z=new JButton("Z");
        p1.add(z);
        z.addActionListener(this);
        p1.setBackground(Color.yellow);
        
        
        small.setLayout(new FlowLayout());
        small.setBackground(Color.yellow);
        JButton a1 = new JButton("a");
        small.add(a1);
        a1.addActionListener(this);

        JButton b1=new JButton("b");
        small.add(b1);
        b1.addActionListener(this);
		JButton c1=new JButton("c");
        small.add(c1);
        c1.addActionListener(this);
		JButton d1=new JButton("d");
        small.add(d1);
                d1.addActionListener(this);

		JButton e1=new JButton("e");
        small.add(e1);
        e1.addActionListener(this);
		JButton f11=new JButton("f");
        small.add(f11);
        f11.addActionListener(this);
		JButton g11=new JButton("g");
        small.add(g11);
        g11.addActionListener(this);
		JButton h1=new JButton("h");
        small.add(h1);
        h1.addActionListener(this);
		JButton i1=new JButton("i");
        small.add(i1);
        i1.addActionListener(this);
		JButton j1=new JButton("j");
        small.add(j1);
               j1.addActionListener(this);
 
       
        JButton k1=new JButton("k");
        small.add(k1);
        k1.addActionListener(this);
		JButton l1=new JButton("l");
        small.add(l1);
         l1.addActionListener(this);
		JButton m1=new JButton("m");
        small.add(m1);
        m1.addActionListener(this);
		JButton n1=new JButton("n");
        small.add(n1);
        n1.addActionListener(this);
		JButton o1=new JButton("o");
        small.add(o1);
        o1.addActionListener(this);
		JButton p1=new JButton("p");
        small.add(p1);
        p1.addActionListener(this);
		JButton q1=new JButton("q");
        small.add(q1);
        q1.addActionListener(this);
		JButton r1=new JButton("r");
        small.add(r1);
        r1.addActionListener(this);
        JButton s1=new JButton("s");
        small.add(s1);
        s1.addActionListener(this);
		JButton t1=new JButton("t");
        small.add(t1);
        t1.addActionListener(this);
		JButton u1=new JButton("u");
        small.add(u1);
        u1.addActionListener(this);
		JButton v1=new JButton("v");
        small.add(v1);
        v1.addActionListener(this);
		JButton w1=new JButton("w");
        small.add(w1);
        w1.addActionListener(this);
		JButton x1=new JButton("x");
        small.add(x1);
        x1.addActionListener(this);
		JButton y1=new JButton("y");
        small.add(y1);
        y1.addActionListener(this);
        JButton z1=new JButton("z");
        small.add(z1);
        z1.addActionListener(this);
        
        
       
        p3.add(clear);

        num.setLayout(new FlowLayout());
        JButton one = new JButton("1");
        num.add(one);
        one.addActionListener(this);
        JButton two=new JButton("2");
        num.add(two);
        two.addActionListener(this);
		JButton three=new JButton("3");
		num.add(three);
                three.addActionListener(this);
		JButton four=new JButton("4");
		num.add(four);
                four.addActionListener(this);
		JButton five=new JButton("5");
		num.add(five);
                five.addActionListener(this);
		JButton six=new JButton("6");
		num.add(six);
                six.addActionListener(this);
		JButton seven=new JButton("7");
		num.add(seven);
                seven.addActionListener(this);
		JButton eight=new JButton("8");
		num.add(eight);
                eight.addActionListener(this);
		JButton nine=new JButton("9");
		num.add(nine);
                nine.addActionListener(this);
		
       
        num.setBackground(Color.yellow);
        
        clear.addActionListener(this);
        //p1.setPreferredSize(new Dimension(1000, 200));

      //  p3.setSize(200,200);
      
        p3.addMouseMotionListener(this);
        p3.setBackground(Color.red);
        p4.setBackground(Color.red);
        p2.add(p3);
        p2.add(p4);
      // f.add(p3);
       //f.add(p4);

        p3.setPreferredSize(new Dimension(700, 500));
        //p3.setLayout(new FlowLayout(FlowLayout.LEFT));
        //p4.setLayout(new FlowLayout(FlowLayout.RIGHT));
        p4.setPreferredSize(new Dimension(700, 500));
        
       p3.addMouseMotionListener(this);
          
       // Container cp=p3.getContentPane();
       // cp.addMouseMotionListener();

        //p1.setBackground(Color.yellow);
        p2.setBackground(Color.cyan);
        //f1.add(p1);
       // f1.add(p2);
        p3.add(audio);
        f1.setVisible(true);
        f1.setSize(1300, 1000);
        f1.setLayout(new GridLayout(0,1));

        clear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e1) {
                p3.removeAll();
                p3.updateUI();
                p3.add(clear);
                p3.add(audio);
        p4.removeAll();
        p4.updateUI();
        //p4.add(clear);
            }
        });
    }
    public void addP1() {
    	//f1.removeAll();
    	f1.getContentPane().removeAll();
    	//f1.revalidate();
    	//f1.repaint();
    	f1.add(p1);
    	f1.add(p2);
    	
    }
    public void addSmall() {
    	f1.add(small);
    	f1.add(p2);
    	
    }
    
    public void addNum() {
    	f1.add(num);
    	f1.add(p2);
    	
    }
    
    
    public void actionPerformed(ActionEvent e) {
        try{  
            p4.removeAll();
        p4.updateUI();
                    Class.forName("org.apache.derby.jdbc.ClientDriver");  
                    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/java","parth","1234");  
                    String url="select * from images";
                    Statement ps;
                    ps=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);  
                    ResultSet rs=ps.executeQuery(url);  
                    String a = e.getActionCommand();
                    System.out.println(a);
                    System.out.println(e.getSource());
                    if (a == "A") {
                           rs.absolute(1);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                    audio.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) 
            {
                mp3playerA.play();   

            }
        }); 
                       }   
                    if (a == "B") {
                           rs.absolute(2);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                    audio.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) 
            {
                mp3playerB.play();   

            }
        }); 
                       } 
                    if (a == "C") {
                           rs.absolute(3);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }    
                        
                     if (a == "D") {
                           rs.absolute(4);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                      if (a == "E") {
                           rs.absolute(5);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                      
                      if (a == "F") {
                           rs.absolute(6);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                       if (a == "G") {
                           rs.absolute(7);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                          if (a == "H") {
                           rs.absolute(8);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                              if (a == "I") {
                           rs.absolute(9);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                            if (a == "J") {
                           rs.absolute(10);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                        if (a == "K") {
                           rs.absolute(11);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                           if (a == "L") {
                           rs.absolute(12);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                           
                     if (a == "M") {
                      rs.absolute(13);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                     if (a == "N") {
                      rs.absolute(15);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                     if (a == "O") {
                      rs.absolute(16);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                     if (a == "P") {
                      rs.absolute(17);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                     if (a == "Q") {
                      rs.absolute(18);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                     if (a == "R") {
                      rs.absolute(19);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                     if (a == "S") {
                      rs.absolute(20);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                      if (a == "T") {
                      rs.absolute(21);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                         if (a == "U") {
                      rs.absolute(22);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                                if (a == "V") {
                      rs.absolute(23);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                       if (a == "W") {
                      rs.absolute(24);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                           if (a == "X") {
                      rs.absolute(25);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                                  if (a == "Y") {
                      rs.absolute(26);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                         if (a == "Z") {
                      rs.absolute(28);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                        
                              if (a == "a") {
                      rs.absolute(30);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                      if (a == "b") {
                      rs.absolute(31);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                      
                      if (a == "c") {
                      rs.absolute(32);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                      
                       if (a == "d") {
                      rs.absolute(33);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                       
                        if (a == "e") {
                      rs.absolute(34);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                        
                        if (a == "f") {
                      rs.absolute(35);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                        
                         if (a == "g") {
                      rs.absolute(36);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                         
                         if (a == "h") {
                      rs.absolute(37);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                         
                         if (a == "i") {
                      rs.absolute(38);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                         
                         if (a == "j") {
                      rs.absolute(39);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                         
                         if (a == "k") {
                      rs.absolute(40);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                         
                          if (a == "l") {
                      rs.absolute(42);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                       if (a == "m") {
                      rs.absolute(43);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                          if (a == "n") {
                      rs.absolute(44);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                          
                           if (a == "o") {
                      rs.absolute(45);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                           
                           if (a == "p") {
                      rs.absolute(46);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                       
                            if (a == "q") {
                      rs.absolute(47);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                            if (a == "r") {
                      rs.absolute(48);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                                 if (a == "s") {
                      rs.absolute(49);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                    if (a == "t") {
                      rs.absolute(50);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                      if (a == "u") {
                      rs.absolute(51);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                              if (a == "v") {
                      rs.absolute(52);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                       if (a == "w") {
                      rs.absolute(53);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }     
                         if (a == "x") {
                      rs.absolute(54);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                           if (a == "y") {
                      rs.absolute(55);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                             if (a == "z") {
                      rs.absolute(56);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                       if (a == "1") {
                      rs.absolute(57);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                       
                          if (a == "2") {
                      rs.absolute(59);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                          
                             if (a == "3") {
                      rs.absolute(60);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                                if (a == "4") {
                      rs.absolute(61);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                          if (a == "5") {
                      rs.absolute(62);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                             if (a == "6") {
                      rs.absolute(63);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                                if (a == "7") {
                      rs.absolute(64);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                                   if (a == "8") {
                      rs.absolute(65);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                                      if (a == "9") {
                      rs.absolute(66);
                       Blob b1=rs.getBlob(2);
                    ImageIcon io=new ImageIcon(b1.getBytes(1,(int)b1.length()));
                    JLabel im=new JLabel(io);
                    p4.add(im);
                    p4.updateUI();
                       }
                    con.close(); 
                  
                    }
               catch (Exception e1) 
                        {System.out.println(e); }  
                        }
    
  
 
   
    public void mouseDragged(MouseEvent e) {  
        Graphics g=p3.getGraphics();  
        g.setColor(Color.BLUE);  
        
        g.fillOval(e.getX(),e.getY(),20,20); 
    }  
    public void mouseMoved(MouseEvent e) {
         
    }  
    
    public static void main(String args[]) {
     abc parth=new abc();
       
    }

}