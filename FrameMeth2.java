package AWT;
import java.awt.*;
import java.awt.event.*;
public class FrameMeth2 implements WindowListener,ActionListener{
	TextField t;
	FrameMeth2()
	{
		Frame f= new Frame("My new Frame");
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		f.setBackground(Color.pink);
		
		Button b=new Button("Test");
		b.setBounds(100,100,100,30);
		f.add(b);
		
		b.addActionListener(this);
		
		t=new TextField();
		t.setBounds(150,50,50,30);
		f.add(t);
		
		f.addWindowListener(this);//registering the event
		
		Label l=new Label("Enter your name");
		l.setBounds(50,50,80,30);
		f.add(l);
		
		Image i=Toolkit.getDefaultToolkit().getImage("C:\\Users\\cclab10\\Downloads\\pixel.jpg");
		f.setIconImage(i);
	}
public void windowClosing(WindowEvent we)
{System.exit(0);}

//public void actionperformed(ActionEvent ae)
//{
//	System.out.println("Clicked");
//	t.setText("Clicked");
//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FrameMeth2();
	}
	
	
	@Override
	public void windowOpened(WindowEvent e) {                
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Clicked");
		t.setText("Clicked");
	}
	

}
