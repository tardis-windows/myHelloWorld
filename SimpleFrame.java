import java.awt.FlowLayout; 
import javax.swing.JFrame; 
import javax.swing.JButton; 

@SuppressWarnings("serial")

public class SimpleFrame extends JFrame{
	
	public SimpleFrame() {
	setTitle("Dont click the button"); 
	setLayout(new FlowLayout()); 
	setDefaultCloseOperation(EXIT_ON_CLOSE); 
	add(new JButton("Panic")); 
	setSize(600,200); 
	setVisible(true); 
	
	
	}
}
