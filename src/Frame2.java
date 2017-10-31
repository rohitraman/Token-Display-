import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.*;
import java.io.*;

import javax.swing.*;
import java.util.*;
import java.io.*;


public class Frame2 extends JFrame implements ActionListener{
	
	Container c;
	JRadioButton r1,r2,r3,r4,r5,r6,r7,r8;
	JLabel l;
	JButton ad,wait_q,clear;
	String s1;
	int flag;
	static Statuswindow s;
	
	    Frame2(String a) 
	    {
	    	s1=a;
	    	c=this.getContentPane();
	    	l=new JLabel(s1);
	    	l.setBounds(150,10,100,100);
	    	l.setFont(getFont());
	    	l.setFont(new Font("Lucida Handwriting",Font.BOLD,24));
	    	r1 = new JRadioButton("C1");
			r1.setBounds(30,90,40,30);
			r1.addActionListener(this);
			r1.setBackground(Color.LIGHT_GRAY);
	    	r1.setFont(new Font("Comic Sans MS",Font.BOLD,12));
			r2 = new JRadioButton("C2");
			r2.setBounds(70,90,40,30);
			r2.addActionListener(this);
			r2.setBackground(Color.LIGHT_GRAY);
	    	r2.setFont(new Font("Comic Sans MS",Font.BOLD,12));
			r3 = new JRadioButton("C3");
			r3.setBounds(110,90,40,30);
			r3.addActionListener(this);
			r3.setBackground(Color.LIGHT_GRAY);
	    	r3.setFont(new Font("Comic Sans MS",Font.BOLD,12));
			
			r4 = new JRadioButton("C4");
			r4.setBounds(150,90,40,30);
			r4.addActionListener(this);
			r4.setBackground(Color.LIGHT_GRAY);
	    	r4.setFont(new Font("Comic Sans MS",Font.BOLD,12));
			r5 = new JRadioButton("C5");
			r5.setBounds(190,90,40,30);
			r5.addActionListener(this);
			r5.setBackground(Color.LIGHT_GRAY);
	    	r5.setFont(new Font("Comic Sans MS",Font.BOLD,12));
			r6 = new JRadioButton("C6");
			r6.setBounds(230,90,40,30);
			r6.addActionListener(this);
			r6.setBackground(Color.LIGHT_GRAY);
	    	r6.setFont(new Font("Comic Sans MS",Font.BOLD,12));
			r7 = new JRadioButton("C7");
			r7.setBounds(270,90,40,30);
			r7.addActionListener(this);
			r7.setBackground(Color.LIGHT_GRAY);
	    	r7.setFont(new Font("Comic Sans MS",Font.BOLD,12));
			r8 = new JRadioButton("C8");
			r8.setBounds(310,90,40,30);
			r8.addActionListener(this);
			r8.setBackground(Color.LIGHT_GRAY);
	    	r8.setFont(new Font("Comic Sans MS",Font.BOLD,12));
			c.setLayout(null);
			ButtonGroup bg = new ButtonGroup();
			bg.add(r1);
			bg.add(r2);
			bg.add(r3);
			bg.add(r4);
			bg.add(r5);
			bg.add(r6);
			bg.add(r7);
			bg.add(r8);
			ad=new JButton("ASSIGN");
			ad.setBounds(40,150,80,25);
			wait_q=new JButton("WAITLIST");
			wait_q.setBounds(130,150,120,25);
			clear=new JButton("CLEAR");
			clear.setBounds(260,150,80,25);
			c.add(r1);
			c.add(r2);
			c.add(r3);
			c.add(r4);
			c.add(r5);
			c.add(r6);
			c.add(r7);
			c.add(r8);
			c.add(l);
			c.add(ad);
			c.add(wait_q);
			c.add(clear);
			c.setBackground(Color.LIGHT_GRAY);
			ad.addActionListener(this);
			wait_q.addActionListener(this);
			clear.addActionListener(this);
			setSize(400,250);
			setTitle("COUNTER ASSIGNMENT");
			setLocationRelativeTo(null);
			setVisible(true);
	    }
	    public static void main(String[] args) throws IOException
	    {
	    	s=new Statuswindow();
	    	new Frame2("NO TOKEN");	
	    }
		@Override
		public void actionPerformed(ActionEvent e)  {
			// TODO Auto-generated method stub
			
			if(e.getSource()==ad)
			{
				flag=0;
				if(r1.isSelected()==true)
				{
					s1="C1-"+" " +s1;
					flag=1;
					s.change(s1);
				}
				if(r2.isSelected()==true)
				{
					s1="C2-"+" "+s1;
					flag=1;
					s.change(s1);
				}
				if(r3.isSelected()==true)
				{
					s1="C3-"+" "  +s1;
					flag=1;
					s.change(s1);
				}
				if(r4.isSelected()==true)
				{
					s1="C4-"+" "+s1;
					flag=1;
					s.change(s1);
				}
				if(r5.isSelected()==true)
				{
					s1="C5-"+" "+s1;
					flag=1;
					s.change(s1);
				}
				if(r6.isSelected()==true)
				{
					s1="C6-"+" "+s1;
					flag=1;
					s.change(s1);
				}
				if(r7.isSelected()==true)
				{
					s1="C7-"+" "+s1;
					flag=1;
					s.change(s1);
				}
				if(r8.isSelected()==true)
				{
					s1="C8-"+" " +s1;
					flag=1;
					s.change(s1);
				}
				try
				{
					if(flag==1)
					{
						BufferedWriter writer;
						try {
							writer = new BufferedWriter(new FileWriter("logs.txt",true));
		                    writer.write(s1);
		                    writer.newLine();
		                    writer.close();
						}catch(Exception ex)
						{
							System.out.println(e);
						}
						setVisible(false);
					}
					else
					{
						//System.out.println("AAA");
						throw new NoRbSelectedException(""); 
					}
				}
				catch(NoRbSelectedException e2)
				{
					System.out.println(e2);
					JOptionPane.showMessageDialog(this, e2.toString()+"PLEASE SELECT RADIO BUTTON");
				}
				
			}
			if(e.getSource()==wait_q)
			{
				    if(!s.check())
				    {
					BufferedWriter writer;
					try {
						writer = new BufferedWriter(new FileWriter("waitlist.txt",true));
	                    writer.write(s1);
	                    writer.newLine();
	                    writer.close();
					}catch(Exception ex)
					{
						System.out.println(ex);
						JOptionPane.showMessageDialog(this, ex.toString());
					}
					setVisible(false);
			       }
				    else
				    {
				    	JOptionPane.showMessageDialog(this,"Waitlist is not possible");
				    }
			}
			if(e.getSource()==clear)
			{
				
				flag=0;
				try
				{
					if(r1.isSelected()==true)
					{
						
						flag=1;
						s.change2("C1");
					}
					if(r2.isSelected()==true)
					{
						
						flag=1;
						s.change2("C2");
					}
					if(r3.isSelected()==true)
					{
						
						flag=1;
						s.change2("C3");
					}
					if(r4.isSelected()==true)
					{
						
						flag=1;
						s.change2("C4");
					}
					if(r5.isSelected()==true)
					{
						
						flag=1;
						s.change2("C5");
					}
					if(r6.isSelected()==true)
					{
						
						flag=1;
						s.change2("C6");
					}
					if(r7.isSelected()==true)
					{
						
						flag=1;
						s.change2("C7");
					}
					if(r8.isSelected()==true)
					{
						
						flag=1;
						s.change2("C8");
					}
					if(flag==0)
					{
						throw new NoRbSelectedException("");
					}
				}catch(NoRbSelectedException ae)
				{
					System.out.println(ae);
					JOptionPane.showMessageDialog(this, ae.toString()+"PLEASE SELECT RADIO BUTTON");
				}
				
				//setVisible(false);
			
			}
		}
}
