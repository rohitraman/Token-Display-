import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Statuswindow extends JFrame implements ActionListener {

	Container c;
	static JTextArea t1,t2,t3,t4,t5,t6,t7,t8;
	JButton b;
	static String status;
	int skpcnt;
	Statuswindow()
	{
		c=this.getContentPane();
    	t1=new JTextArea();
    	t1.setEditable(false);
    	t1.setBounds(0,0,300,25);
    	c.add(t1);
    	t1.setText("C1-");
    	t1.setBackground(Color.LIGHT_GRAY);
    	t1.setFont(new Font("Comic Sans MS",Font.BOLD,16));
    	t2=new JTextArea();
    	t2.setEditable(false);
    	t2.setBounds(0,30,300,25);
    	c.add(t2);
    	t2.setText("C2-");
    	t2.setBackground(Color.LIGHT_GRAY);
    	t2.setFont(new Font("Comic Sans MS",Font.BOLD,16));
    	t3=new JTextArea();
    	t3.setEditable(false);
    	t3.setBounds(0,60,300,25);
    	c.add(t3);
    	t3.setText("C3-");
    	t3.setBackground(Color.LIGHT_GRAY);
    	t3.setFont(new Font("Comic Sans MS",Font.BOLD,16));
    	t4=new JTextArea();
    	t4.setEditable(false);
    	t4.setBounds(0,90,300,25);
    	c.add(t4);
    	t4.setText("C4-");
    	t4.setBackground(Color.LIGHT_GRAY);
    	t4.setFont(new Font("Comic Sans MS",Font.BOLD,16));   	
    	t5=new JTextArea();
    	t5.setEditable(false);
    	t5.setBounds(0,120,300,25);
    	c.add(t5);
    	t5.setText("C5-");
    	t5.setBackground(Color.LIGHT_GRAY);
    	t5.setFont(new Font("Comic Sans MS",Font.BOLD,16));
    	t6=new JTextArea();
    	t6.setEditable(false);
    	t6.setBounds(0,150,300,25);
    	c.add(t6);
    	t6.setText("C6-");
    	t6.setBackground(Color.LIGHT_GRAY);
    	t6.setFont(new Font("Comic Sans MS",Font.BOLD,16));
    	t7=new JTextArea();
    	t7.setEditable(false);
    	t7.setBounds(0,180,300,25);
    	c.add(t7);
    	t7.setText("C7-");
    	t7.setBackground(Color.LIGHT_GRAY);
    	t7.setFont(new Font("Comic Sans MS",Font.BOLD,16));
    	t8=new JTextArea();
    	t8.setEditable(false);
    	t8.setBounds(0,210,300,25);
    	c.add(t8);
    	t8.setText("C8-");
    	t8.setBackground(Color.LIGHT_GRAY);
    	t8.setFont(new Font("Comic Sans MS",Font.BOLD,16));
    	b=new JButton("NEXT QUEUE");
    	b.setBounds(90,250,110,30);
    	b.addActionListener(this);
    	c.add(b);
    	c.setLayout(null);
    	c.setBackground(Color.LIGHT_GRAY);
		setSize(300,330);
		setTitle("STATUS WINDOW");
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void change(String l1)
	{
	try
	{
		if(l1.contains("C1"))
	 {
			if(t1.getText().length()<=3)
	    	{
	    		status=l1;
	    		t1.setText(status);
	    	}
	       	else
	   			{
	       		throw new CounterAssignException(" C1 Incorrectly entered");
	   			}
	 }
		else if(l1.contains("C2"))
		 {
				if(t2.getText().length()<=3)
		    	{
		    		status=l1;
		    		t2.setText(status);
		    	}
		       	else
		   			{
		       		throw new CounterAssignException(" C2 Incorrectly entered");
		   			}
		 }
        	
    	
		else if(l1.contains("C3"))
		 {
				if(t3.getText().length()<=3)
		    	{
		    		status=l1;
		    		t3.setText(status);
		    	}
		       	else
		   			{
		       		throw new CounterAssignException(" C3 Incorrectly entered");
		   			}
		 }
    	
        	
		else if(l1.contains("C4"))
		 {
				if(t4.getText().length()<=3)
		    	{
		    		status=l1;
		    		t4.setText(status);
		    	}
		       	else
		   			{
		       		throw new CounterAssignException(" C4 Incorrectly entered");
		   			}
		 }
    	
		else if(l1.contains("C5"))
		 {
				if(t5.getText().length()<=3)
		    	{
		    		status=l1;
		    		t5.setText(status);
		    	}
		       	else
		   			{
		       		throw new CounterAssignException(" C5 Incorrectly entered");
		   			}
		 }
    	
   		
		else if(l1.contains("C6"))
		 {
				if(t6.getText().length()<=3)
		    	{
		    		status=l1;
		    		t6.setText(status);
		    	}
		       	else
		   			{
		       		throw new CounterAssignException(" C6 Incorrectly entered");
		   			}
		 }
		
		
		else if(l1.contains("C7"))
		 {
				if(t7.getText().length()<=3)
		    	{
		    		status=l1;
		    		t7.setText(status);
		    	}
		       	else
		   			{
		       		throw new CounterAssignException(" C7 Incorrectly entered");
		   			}
		 }
    	
		else if(l1.contains("C8"))
		 {
				if(t8.getText().length()<=3)
		    	{
		    		status=l1;
		    		t8.setText(status);
		    	}
		       	else
		   			{
		       		throw new CounterAssignException(" C8 Incorrectly entered");
		   			}
		 }
    	}catch(CounterAssignException e)
    	{
    		System.out.println(e);
    		JOptionPane.showMessageDialog(null,e.toString()+"\n PLEASE RE-ASSIGN A NEW TOKEN");
    	}	
	}
	public static boolean check()
	{
		int a=t1.getText().length()+t2.getText().length()+t3.getText().length()+t4.getText().length()
			+t5.getText().length()+t6.getText().length()+t7.getText().length()+t8.getText().length();
	  
		if(a!=48)
			return true;
		return false;			
	 
	}
	
	public static void change2(String l1)
	{
	try
	{
		if(l1.contains("C1"))
	 {
			if(!(t1.getText().length()<=3))
	    	{
	    		status=l1;
	    		t1.setText(status);
	    	}
	       	else
	   			{
	       		throw new CounterClearException(" C1 Incorrectly entered");
	   			}
	 }
		
		else if(l1.contains("C2"))
		 {
				if(!(t2.getText().length()<=3))
		    	{
		    		status=l1;
		    		t2.setText(status);
		    	}
		       	else
		   			{
		       		throw new CounterClearException(" C2 Incorrectly entered");
		   			}
		 }
        	
    	
		else if(l1.contains("C3"))
		 {
				if(!(t3.getText().length()<=3))
		    	{
		    		status=l1;
		    		t3.setText(status);
		    	}
		       	else
		   			{
		       		throw new CounterClearException(" C3 Incorrectly entered");
		   			}
		 }
    	
        	
		else if(l1.contains("C4"))
		 {
				if(!(t4.getText().length()<=3))
		    	{
		    		status=l1;
		    		t4.setText(status);
		    	}
		       	else
		   			{
		       		throw new CounterClearException(" C4 Incorrectly entered");
		   			}
		 }
    	
		else if(l1.contains("C5"))
		 {
				if(!(t5.getText().length()<=3))
		    	{
		    		status=l1;
		    		t5.setText(status);
		    	}
		       	else
		   			{
		       		throw new CounterClearException(" C5 Incorrectly entered");
		   			}
		 }
    	
   		
		else if(l1.contains("C6"))
		 {
				if(!(t6.getText().length()<=3))
		    	{
		    		status=l1;
		    		t6.setText(status);
		    	}
		       	else
		   			{
		       		throw new CounterClearException(" C6 Incorrectly entered");
		   			}
		 }
		
		
		else if(l1.contains("C7"))
		 {
				if(!(t7.getText().length()<=3))
		    	{
		    		status=l1;
		    		t7.setText(status);
		    	}
		       	else
		   			{
		       		throw new CounterClearException(" C7 Incorrectly entered");
		   			}
		 }
    	
		else if(l1.contains("C8"))
		 {
				if(!(t8.getText().length()<=3))
		    	{
		    		status=l1;
		    		t8.setText(status);
		    	}
		       	else
		   			{
		       		throw new CounterClearException(" C8 Incorrectly entered");
		   			}
		 }
    	}catch(CounterClearException e)
    	{
    		System.out.println(e);
    		JOptionPane.showMessageDialog(null,e.toString()+"\n COUNTER ALREADY FREE");
    	}
        	
    	
    	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Statuswindow();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b)
		{
			int a=skpcnt;
			String s;
			BufferedReader reader;
			try {
				reader = new BufferedReader(new FileReader("waitlist.txt"));
				while(a>0)
				{
					reader.readLine();
					a--;
				}
				s=reader.readLine();
				
				if(s.length()>0)
					skpcnt++;
				else
					throw new Exception();
                new Frame2(s);
                reader.close();
			}catch(Exception ex)
			{
				System.out.println("Queue Empty");
				JOptionPane.showMessageDialog(this, "Queue empty");
			}
		}
	}

}
