import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form14 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l0,la,lb,lc,ld,le,lf,lg,lh,li,lj,lk,ll,lm,ln,lo,lp,lq,lr,ls,lt,lu,lv,lw,lx,ly; 
		JTextField t1,t2;
		JButton b1,b2,b3,b4,b5,b6,b7; 
		JPanel p1,p2,p3,p4;
		
	public Form14()
	{
		super("page 14");
		this.setSize(2000,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(2000,65));
		p1.setBackground(Color.black);
		p1.setLayout(null);
		
		l1 = new JLabel("SEMESTER INFO 1");
		l1.setFont(new Font("Serif",Font.BOLD,32));
		l1.setForeground(Color.magenta);
		l1.setBounds(650,20,1500,32);
		p1.add(l1); 
		
		p2 = new JPanel();
		p2.setSize(new Dimension(2000,200));
		p2.setBackground(Color.white);
		p2.setLayout(null); 
	    
		l4 = new JLabel(" CURRICULUM COURSES");
		l4.setFont(new Font("Serif",Font.BOLD,28));
		l4.setForeground(Color.black);
		l4.setBounds(606,80,500,28);
		p2.add(l4);
		
		l5 = new JLabel("CURRICULUM NO-309  \n     TITLE-BSC IN CSE");
		l5.setFont(new Font("Serif",Font.BOLD,28));
		l5.setForeground(Color.black);
		l5.setBounds(455,125,1000,28);
		p2.add(l5);
		
		p3 = new JPanel(); 
		p3.setSize(new Dimension(2000,670));
		p3.setBackground(Color.magenta);
		p3.setLayout(null);
		
		l2 = new JLabel("CODE");
		l2.setFont(new Font("Serif",Font.BOLD,24));
		l2.setForeground(Color.black);
		l2.setBounds(15,215,90,32);
		p3.add(l2);
		
		l3 = new JLabel("MAT1102");
		l3.setFont(new Font("Serif",Font.BOLD,19));
		l3.setForeground(Color.white);
		l3.setBounds(10,265,110,25);
		p3.add(l3);
		
		l6 = new JLabel("PHY1101");
		l6.setFont(new Font("Serif",Font.BOLD,19));
		l6.setForeground(Color.white);
		l6.setBounds(10,325,110,25);
		p3.add(l6);
		
		l7 = new JLabel("PHY1102");
		l7.setFont(new Font("Serif",Font.BOLD,19));
		l7.setForeground(Color.white);
		l7.setBounds(10,385,110,25);
		p3.add(l7);
		
		l8 = new JLabel("ENG1101");
		l8.setFont(new Font("Serif",Font.BOLD,19));
		l8.setForeground(Color.white);
		l8.setBounds(10,445,110,25);
		p3.add(l8);
		
		l9 = new JLabel("CSC1102");
		l9.setFont(new Font("Serif",Font.BOLD,19));
		l9.setForeground(Color.white);
		l9.setBounds(10,505,110,25);
		p3.add(l9);
		
		l0 = new JLabel("CSC1103");
		l0.setFont(new Font("Serif",Font.BOLD,19));
		l0.setForeground(Color.white);
		l0.setBounds(10,565,110,25);
		p3.add(l0);
		
		la = new JLabel("CSC1101");
		la.setFont(new Font("Serif",Font.BOLD,19));
		la.setForeground(Color.white);
		la.setBounds(10,625,110,25);
		p3.add(la);
		
		
		
		
		lb = new JLabel("NAME");
		lb.setFont(new Font("Serif",Font.BOLD,24));
		lb.setForeground(Color.black);
		lb.setBounds(360,215,90,32);
		p3.add(lb);
		
		lc = new JLabel("DIFFERENTIAL CALCULUS AND CO-ORDINATE GEOMETRY");
		lc.setFont(new Font("Serif",Font.BOLD,19));
		lc.setForeground(Color.white);
		lc.setBounds(160,265,600,25);
		p3.add(lc);
		
		ld = new JLabel("PHYSICS-1");
		ld.setFont(new Font("Serif",Font.BOLD,19));
		ld.setForeground(Color.white);
		ld.setBounds(345,325,115,25);
		p3.add(ld);
		
		le = new JLabel("PHYSICS-1 LAB");
		le.setFont(new Font("Serif",Font.BOLD,19));
		le.setForeground(Color.white);
		le.setBounds(325,385,180,25);
		p3.add(le);
		
		lf= new JLabel("ENGLISH READING SKILLS AND PUBLIC SPEAKING");
		lf.setFont(new Font("Serif",Font.BOLD,19));
		lf.setForeground(Color.white);
		lf.setBounds(190,445,550,25);
		p3.add(lf);
		
		lg = new JLabel("INTRODUCTION TO PROGRAMMING");
		lg.setFont(new Font("Serif",Font.BOLD,19));
		lg.setForeground(Color.white);
		lg.setBounds(235,505,450,25);
		p3.add(lg);
		
		lh = new JLabel("INTRODUCTION TO PROGRAMMING LAB");
		lh.setFont(new Font("Serif",Font.BOLD,19));
		lh.setForeground(Color.white);
		lh.setBounds(215,565,470,25);
		p3.add(lh);
		
		li = new JLabel("INTRODUCTION TO COMPUTER STUDIES");
		li.setFont(new Font("Serif",Font.BOLD,19));
		li.setForeground(Color.white);
		li.setBounds(215,625,475,25);
		p3.add(li);
		
		
		
		
		lj = new JLabel("CREDIT");
		lj.setFont(new Font("Serif",Font.BOLD,24));
		lj.setForeground(Color.black);
		lj.setBounds(855,215,110,32);
		p3.add(lj);
		
		lk = new JLabel("3-0-0-0-0");
		lk.setFont(new Font("Serif",Font.BOLD,19));
		lk.setForeground(Color.white);
		lk.setBounds(862,265,210,25);
		p3.add(lk);
		
		ll = new JLabel("3-0-0-0-0");
		ll.setFont(new Font("Serif",Font.BOLD,19));
		ll.setForeground(Color.white);
		ll.setBounds(862,325,210,25);
		p3.add(ll);
		
		lm = new JLabel("1-1-0-0-0");
		lm.setFont(new Font("Serif",Font.BOLD,19));
		lm.setForeground(Color.white);
		lm.setBounds(862,385,210,25);
		p3.add(lm);
		
		ln= new JLabel("3-0-0-1-0");
		ln.setFont(new Font("Serif",Font.BOLD,19));
		ln.setForeground(Color.white);
		ln.setBounds(862,445,210,25);
		p3.add(ln);
		
		lo = new JLabel("3-0-0-0-0");
		lo.setFont(new Font("Serif",Font.BOLD,19));
		lo.setForeground(Color.white);
		lo.setBounds(862,505,210,25);
		p3.add(lo);
		
		lp = new JLabel("1-0-1-0-0");
		lp.setFont(new Font("Serif",Font.BOLD,19));
		lp.setForeground(Color.white);
		lp.setBounds(862,565,210,25);
		p3.add(lp);
		
		lq = new JLabel("1-0-1-0-0");
		lq.setFont(new Font("Serif",Font.BOLD,19));
		lq.setForeground(Color.white);
		lq.setBounds(862,625,210,25);
		p3.add(lq);
		
		
		
		
		lr = new JLabel("PRE-REQUISITE");
		lr.setFont(new Font("Serif",Font.BOLD,24));
		lr.setForeground(Color.black);
		lr.setBounds(1180,215,350,32);
		p3.add(lr);
		
		ls = new JLabel("NULL");
		ls.setFont(new Font("Serif",Font.BOLD,19));
		ls.setForeground(Color.BLUE);
		ls.setBounds(1240,265,100,25);
		p3.add(ls);
		
		lt = new JLabel("NULL");
		lt.setFont(new Font("Serif",Font.BOLD,19));
		lt.setForeground(Color.BLUE);
		lt.setBounds(1240,325,100,25);
		p3.add(lt);
		
		lu = new JLabel("NULL");
		lu.setFont(new Font("Serif",Font.BOLD,19));
		lu.setForeground(Color.BLUE);
		lu.setBounds(1240,385,100,25);
		p3.add(lu);
		
		lv= new JLabel("NULL");
		lv.setFont(new Font("Serif",Font.BOLD,19));
		lv.setForeground(Color.BLUE);
		lv.setBounds(1240,445,100,25);
		p3.add(lv);
		
		lw = new JLabel("NULL");
		lw.setFont(new Font("Serif",Font.BOLD,19));
		lw.setForeground(Color.BLUE);
		lw.setBounds(1240,505,100,25);
		p3.add(lw);
		
		lx = new JLabel("NULL");
		lx.setFont(new Font("Serif",Font.BOLD,19));
		lx.setForeground(Color.BLUE);
		lx.setBounds(1240,565,100,25);
		p3.add(lx);
		
		ly = new JLabel("NULL");
		ly.setFont(new Font("Serif",Font.BOLD,19));
		ly.setForeground(Color.BLUE);
		ly.setBounds(1240,625,100,25);
		p3.add(ly);
		
		
		
		
		
		
		
		
		
		p4 = new JPanel();
		p4.setSize(new Dimension(2000,80));
		p4.setBackground(Color.black);
		p4.setLayout(null);
		
		b3 = new JButton("NEXT");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		b3.setForeground(Color.GREEN);
		b3.setBounds(1320,700,150,45);
		b3.setBackground(Color.black);
		b3.addActionListener(this);b3.setLayout(null);
		p4.add(b3);

		b4 = new JButton("BACK");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		b4.setForeground(Color.RED);
		b4.setBounds(10,700,150,45);
		b4.setBackground(Color.black);
		b4.addActionListener(this);b4.setLayout(null);
		p4.add(b4);
		
        this.add(p1);		
        this.add(p2);
		this.add(p3);
		this.add(p4);
	}

		public void actionPerformed(ActionEvent ae)
		{
		    if(ae.getSource()==b4)
			{
				Form1 f = new Form1();
				this.setVisible(false);
				f.setVisible(true);
			}
			
			else if(ae.getSource()==b3)
			{
				Form3 f = new Form3();
				this.setVisible(false);
				f.setVisible(true);
			}
				
		}
}






