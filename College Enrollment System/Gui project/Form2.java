import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form2 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4;
		JTextField t1,t2;
		JButton b1,b2,b3,b4,b5,b6,b7; 
		JPanel p1,p2,p3,p4;
		
	public Form2()
	{
		super("page 1");
		this.setSize(2000,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(2000,85));
		p1.setBackground(Color.green);
		p1.setLayout(null);
		
		l1 = new JLabel("AMERICAN  INTERNATIONAL  UNIVERSITY BANGLADESH");
		l1.setFont(new Font("Serif",Font.BOLD,32));
		l1.setForeground(Color.black);
		l1.setBounds(250,20,1500,32);
		p1.add(l1);

		p2 = new JPanel();
		p2.setSize(new Dimension(2000,150));
		p2.setBackground(Color.black);
		p2.setLayout(null);
	    
		l4 = new JLabel(" ADMIN ");
		l4.setFont(new Font("Serif",Font.BOLD,28));
		l4.setForeground(Color.white);
		l4.setBounds(650,100,500,28);
		p2.add(l4);
		
		p3 = new JPanel(); 
		p3.setSize(new Dimension(2000,550));
		p3.setBackground(Color.cyan);
		p3.setLayout(null);
		
		b1 = new JButton("FACULTY");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,26));
		b1.setForeground(Color.blue);
		b1.setBounds(400,270,620,40);
		b1.addActionListener(this); 
		p3.add(b1);
		
		b2 = new JButton("STUDENT");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,26));
		b2.setForeground(Color.blue);
		b2.setBounds(400,350,620,40);
		b2.addActionListener(this); 
		p3.add(b2);
		
		p4 = new JPanel();
		p4.setSize(new Dimension(2000,350));
		p4.setBackground(Color.black);
		p4.setLayout(null);
		
		b3 = new JButton("BACK");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		b3.setForeground(Color.red);
		b3.setBounds(635,650,150,45);b3.setBackground(Color.black);
		b3.addActionListener(this);b3.setLayout(null);
		p4.add(b3);

        this.add(p1);		
        this.add(p2);
		this.add(p3);
		this.add(p4);
	}

		public void actionPerformed(ActionEvent ae)
		{
			
			
		    if(ae.getSource()==b3)
			{
				Form1 f = new Form1();
				this.setVisible(false);
				f.setVisible(true);
			}
			
			else if (ae.getSource()==b1)
			{
			    Form4 f = new Form4();
				this.setVisible(false);
				f.setVisible(true);
			}
			 
			else if (ae.getSource()==b2)
			{
			    Form5 f = new Form5();
				this.setVisible(false);
				f.setVisible(true);
			}
			
			/*else if(ae.getSource()==b3)
			{
				System.exit(0);
			}
			*/
		}


}






