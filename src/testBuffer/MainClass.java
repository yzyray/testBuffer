package testBuffer;
import javax.swing.JFrame;

public class MainClass {
	  public static void main(String[] args) {
		  JFrame frame= new JFrame();
		  frame.setSize(200,200);		 
		  frame.setVisible(true);
		  frame.createBufferStrategy(2);
		  frame.setVisible(false);
	  }
}
