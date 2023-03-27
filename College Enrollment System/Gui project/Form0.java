import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form0 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5,l6,l7;
		JTextField t1,t2;
		JButton b1,b2,b3,b4,b5,b6,b7; 
		JPanel p1,p2,p3,p4;
		
	public Form0()
	{
		super("page 0");
		this.setSize(2000,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(2000,85));
		p1.setBackground(Color.white);
		p1.setLayout(null);
		
		l1 = new JLabel("COLLEGE  ENROLLMENT  SYSTEM ");
		l1.setFont(new Font("Serif",Font.BOLD,32));
		l1.setForeground(Color.blue);
		l1.setBounds(450,150,1500,32);
		p1.add(l1);
		
		l2 = new JLabel(" BY ");
		l2.setFont(new Font("Serif",Font.BOLD,32));
		l2.setForeground(Color.blue);
		l2.setBounds(690,200,1500,32);
		p1.add(l2);
		
		l3 = new JLabel(" PSEUDO PROGRAMMERS ");
		l3.setFont(new Font("Serif",Font.BOLD,32));
		l3.setForeground(Color.blue);
		l3.setBounds(530,250,1500,32);
		p1.add(l3);
		
		l3 = new JLabel(" PRESS ");
		l3.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l3.setForeground(Color.red);
		l3.setBounds(530,340,100,20);
		p1.add(l3);
		
		b1 = new JButton("HERE");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		b1.setForeground(Color.blue);
		b1.setBackground(Color.GREEN);
		b1.setBounds(625,340,90,30);
		b1.addActionListener(this); 
		p1.add(b1);
		
		l4 = new JLabel(" TO CONTINUE ");
		l4.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l4.setForeground(Color.red);
		l4.setBounds(735,340,500,20);
		p1.add(l4);
		
		
		l5 = new JLabel("FARIHA TAHSEEN KARIM");
		l5.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l5.setForeground(Color.BLACK);
		l5.setBounds(600,500,500,20);
		p1.add(l5);
		
		l7 = new JLabel("&");
		l7.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l7.setForeground(Color.BLACK);
		l7.setBounds(700,530,500,20);
		p1.add(l7);
		
		l6 = new JLabel("SADIR  AHMED  ZIDAN");
		l6.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l6.setForeground(Color.BLACK);
		l6.setBounds(600,560,500,20);
		p1.add(l6);
		
        this.add(p1);		
        
	}

		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
			 Form1 f = new Form1();
		     this.setVisible(false);
			 f.setVisible(true);
			}
			
		}
}






