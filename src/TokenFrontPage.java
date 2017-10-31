import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;



public class TokenFrontPage extends JFrame implements ActionListener {
	int ca=0,cb=0,cq=0,cd=0;
	JLabel jlabel;
	JFrame jframe;
	Container c;
	static Statuswindow s;
	JPanel jpanel;
	JButton jbutton,jbutton1,jbutton2,jbutton3;
	TokenFrontPage()
	{
		  jframe=new JFrame("Token Display");
		  jlabel=new JLabel("      Token Distribution Point");
		  jlabel.setFont(new Font("Comic Sans MS",Font.BOLD,16));
		  c=jframe.getContentPane();
		  jpanel=new JPanel(new GridLayout(1,4));
		  jbutton=new JButton("A");
		  jbutton.setFont(new Font("Comic Sans MS",Font.BOLD,16));
		  jbutton1=new JButton("B");
		  jbutton1.setFont(new Font("Comic Sans MS",Font.BOLD,16));
		  jbutton2=new JButton("Q");
		  jbutton2.setFont(new Font("Comic Sans MS",Font.BOLD,16));
		  jbutton3=new JButton("D");
		  jbutton3.setFont(new Font("Comic Sans MS",Font.BOLD,16));
		  jbutton.addActionListener(this);
		  jbutton1.addActionListener(this);
		  jbutton2.addActionListener(this);
		  jbutton3.addActionListener(this);
		  jframe.add(jpanel);
		  jpanel.add(jbutton);
		  jpanel.add(jbutton1);
		  jpanel.add(jbutton2);
		  jpanel.add(jbutton3);
		  c.setBackground(Color.LIGHT_GRAY);
		  c.add(jlabel);
		  c.add(jpanel, BorderLayout.SOUTH);
		  jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  jframe.setSize(325, 150);
		  jframe.setVisible(true);
	}
  public static void main(String[] args)
  {
	  new Statuswindow();
	  new TokenFrontPage();
	 
  }
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if(e.getSource()==jbutton)
	{
		ca++;
		System.out.println("A"+ca);
		new Frame2("A"+ca);
	}
	if(e.getSource()==jbutton1)
	{
		cb++;
		System.out.println("B"+cb);
		new Frame2("B"+cb);
	}
	if(e.getSource()==jbutton2)
	{
		cq++;
		System.out.println("Q"+cq);
		new Frame2("Q"+cq);
	}
	if(e.getSource()==jbutton3)
	{
		cd++;
		System.out.println("D"+cd);
		new Frame2("D"+cd);
	}
	
}
}
