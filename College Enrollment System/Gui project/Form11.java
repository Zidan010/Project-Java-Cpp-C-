import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form11 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l0;
		JTextField t1,t2,t3,t4;
		JButton b1,b2,b3; 
		JPanel p1,p2,p3;
		
	public Form11()
	{
		super("page 11");
		this.setSize(2000,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(2000,100));
		p1.setBackground(Color.blue);
		p1.setLayout(null);
		
		l1 = new JLabel("STUDENT  INFO");
		l1.setFont(new Font("Serif",Font.BOLD,32));
		l1.setForeground(Color.white);
		l1.setBounds(650,20,1500,32);
		p1.add(l1);
		
		p2 = new JPanel();
		p2.setSize(new Dimension(2000,550));
		p2.setBackground(Color.black);
		p2.setLayout(null);
		
		
		l5 = new JLabel("STUDENT-1");
		l5.setFont(new Font("Serif",Font.BOLD,26));
		l5.setForeground(Color.WHITE);
		l5.setBounds(10,180,800,26);
		p2.add(l5);
		
	    
		l4 = new JLabel("STUDENT NAME    : ");
		l4.setFont(new Font("Serif",Font.BOLD,28));
		l4.setForeground(Color.white);
		l4.setBounds(10,220,500,28);
		p2.add(l4);
		
		l7 = new JLabel(" FEENRIM,V");
		l7.setFont(new Font("Serif",Font.BOLD,28));
		l7.setForeground(Color.white);
		l7.setBounds(370,220,500,28);
		p2.add(l7);
		
		l3 = new JLabel("STUDENT ID         : ");
		l3.setFont(new Font("Serif",Font.BOLD,28));
		l3.setForeground(Color.white);
		l3.setBounds(10,300,500,28);
		p2.add(l3);
		
		l8 = new JLabel(" 20-XXXXX-1");
		l8.setFont(new Font("Serif",Font.BOLD,28));
		l8.setForeground(Color.white);
		l8.setBounds(370,300,500,28);
		p2.add(l8);
		
		l2 = new JLabel("TOTAL CREDIT : ");
		l2.setFont(new Font("Serif",Font.BOLD,28));
		l2.setForeground(Color.white);
		l2.setBounds(10,380,500,28);
		p2.add(l2);
		
		l9 = new JLabel(" 15");
		l9.setFont(new Font("Serif",Font.BOLD,28));
		l9.setForeground(Color.white);
		l9.setBounds(370,380,500,28);
		p2.add(l9);
		
		l6 = new JLabel("TOTAL COURSE : ");
		l6.setFont(new Font("Serif",Font.BOLD,28));
		l6.setForeground(Color.white);
		l6.setBounds(10,460,500,28);
		p2.add(l6);
		
		l0 = new JLabel(" 05");
		l0.setFont(new Font("Serif",Font.BOLD,28));
		l0.setForeground(Color.white);
		l0.setBounds(370,460,500,28);
		p2.add(l0);
		
		p3 = new JPanel(); 
		p3.setSize(new Dimension(2000,300));
		p3.setBackground(Color.green);
		p3.setLayout(null);
		
		b2 = new JButton("NEXT");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		b2.setForeground(Color.green);
		b2.setBounds(905,600,100,35);
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
			if(ae.getSource()==b1)
			{
			b3.setText("BACK");
			b2.setText("NEXT");
			}
			
			else if (ae.getSource()==b2)
			{
			Form5 f = new Form5();
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






