import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form9 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5,l6;
		JTextField t1,t2,t3,t4;
		JButton b1,b2,b3; 
		JPanel p1,p2,p3;
		
	public Form9()
	{
		super("page 9");
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
	    
		l4 = new JLabel("ENTER STUDENT NAME    : ");
		l4.setFont(new Font("Serif",Font.BOLD,28));
		l4.setForeground(Color.white);
		l4.setBounds(10,220,600,28);
		p2.add(l4);
		
		l3 = new JLabel("ENTER STUDENT ID         : ");
		l3.setFont(new Font("Serif",Font.BOLD,28));
		l3.setForeground(Color.white);
		l3.setBounds(10,300,600,28);
		p2.add(l3);
		
		l2 = new JLabel("ENTER TOTAL CREDIT : ");
		l2.setFont(new Font("Serif",Font.BOLD,28));
		l2.setForeground(Color.white);
		l2.setBounds(10,380,600,28);
		p2.add(l2);
		
		l6 = new JLabel("ENTER TOTAL COURSE : ");
		l6.setFont(new Font("Serif",Font.BOLD,28));
		l6.setForeground(Color.white);
		l6.setBounds(10,460,600,28);
		p2.add(l6);
		
		t1 = new JTextField();
		t1.setBounds(400,220,600,25);
		t1.setFont(new Font("Serif",Font.BOLD,25));
		p2.add(t1);
		
		t2 = new JTextField();
		t2.setBounds(400,300,600,25);
		t2.setFont(new Font("Serif",Font.BOLD,25));
		p2.add(t2);
		
		t3 = new JTextField();
		t3.setBounds(400,380,600,25);
		t3.setFont(new Font("Serif",Font.BOLD,25));
		p2.add(t3);
		
		t4 = new JTextField();
		t4.setBounds(400,460,600,25);
		t4.setFont(new Font("Serif",Font.BOLD,25));
		p2.add(t4);
		
		b1 = new JButton("ADD");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		b1.setForeground(Color.green);
		b1.setBounds(10,495,100,35);
		b1.addActionListener(this); 
		p2.add(b1);
		 
		
		p3 = new JPanel(); 
		p3.setSize(new Dimension(2000,300));
		p3.setBackground(Color.green);
		p3.setLayout(null);
		
				
		l5 = new JLabel();
		l5.setFont(new Font("Serif",Font.BOLD,28));
		l5.setForeground(Color.black);
		l5.setBounds(10,600,800,28);
		p3.add(l5);
		
		
		b2 = new JButton();
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		b2.setForeground(Color.green);
		b2.setBounds(905,700,100,30);
		b2.addActionListener(this); 
		p3.add(b2);
		
		b3 = new JButton();
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		b3.setForeground(Color.red);
		b3.setBounds(10,700,100,30);
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
			l5.setText("STUDENT DATA ADDED SUCCESSFULLY");
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






