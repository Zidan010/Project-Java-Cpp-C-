import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form8 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5,l6,l7,l8;
		JTextField t1,t2,t3;
		JButton b1,b2,b3; 
		JPanel p1,p2,p3;
		
	public Form8()
	{
		super("page 8");
		this.setSize(2000,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(2000,100));
		p1.setBackground(Color.blue);
		p1.setLayout(null);
		
		l1 = new JLabel(" ALL  FACULTY ");
		l1.setFont(new Font("Serif",Font.BOLD,32));
		l1.setForeground(Color.white);
		l1.setBounds(650,20,1500,32);
		p1.add(l1);
	
		p2 = new JPanel();
		p2.setSize(new Dimension(2000,550));
		p2.setBackground(Color.black);
		p2.setLayout(null);
		
	    l5 = new JLabel("FACULTY-1");
		l5.setFont(new Font("Comic Sans MS",Font.BOLD,26));
		l5.setForeground(Color.white);
		l5.setBounds(10,190,800,26);
		p2.add(l5);
		
		l4 = new JLabel("FACULTY NAME    : ");
		l4.setFont(new Font("Serif",Font.BOLD,28));
		l4.setForeground(Color.white);
		l4.setBounds(10,230,500,28);
		p2.add(l4);
		
		l3 = new JLabel("FACULTY ID        : ");
		l3.setFont(new Font("Serif",Font.BOLD,28));
		l3.setForeground(Color.white);
		l3.setBounds(10,330,500,28);
		p2.add(l3);
		
		l2 = new JLabel("FACULTY SALARY : ");
		l2.setFont(new Font("Serif",Font.BOLD,28));
		l2.setForeground(Color.white);
		l2.setBounds(10,430,500,28);
		p2.add(l2);
		
		l6 = new JLabel(" MD HASAN , ADULLAH");
		l6.setFont(new Font("Serif",Font.BOLD,28));
		l6.setForeground(Color.white);
		l6.setBounds(370,230,500,28);
		p2.add(l6);
		
		l7 = new JLabel("  1001-2001-18");
		l7.setFont(new Font("Serif",Font.BOLD,28));
		l7.setForeground(Color.white);
		l7.setBounds(370,330,500,28);
		p2.add(l7);
		
		l8 = new JLabel("  35000");
		l8.setFont(new Font("Serif",Font.BOLD,28));
		l8.setForeground(Color.white);
		l8.setBounds(370,430,500,28);
		p2.add(l8);
		
		p3 = new JPanel(); 
		p3.setSize(new Dimension(2000,300));
		p3.setBackground(Color.green);
		p3.setLayout(null);
		
		b2 = new JButton("NEXT");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		b2.setForeground(Color.green);
		b2.setBounds(960,600,100,35);
		b2.addActionListener(this); 
		p3.add(b2);
		
		b3 = new JButton("BACK");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		b3.setForeground(Color.red);
		b3.setBounds(10,600,100,35);
		b3.addActionListener(this); 
		p3.add(b3);
		
	
	
        this.add(p1);		
        this.add(p2);
		this.add(p3);
		
	}

		public void actionPerformed(ActionEvent ae)
		{
			
			if (ae.getSource()==b2)
			{
			Form4 f = new Form4();
				this.setVisible(false);
				f.setVisible(true);
			}
			
			else if(ae.getSource()==b3)
			{
				Form2 f = new Form2();
				this.setVisible(false);
				f.setVisible(true);
			}
			
			
		}
}






