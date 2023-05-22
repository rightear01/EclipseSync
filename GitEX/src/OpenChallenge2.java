import javax.swing.*;
import java.awt.*;
class NorthPaner extends JPanel {
	public NorthPaner() {
		setLayout(new FlowLayout());
		setBackground(Color.LIGHT_GRAY);
		add(new JButton("Open"));
		add(new JButton("Read"));
		add(new JButton("Close"));
	}
}
class CenterPaner extends JPanel {
	public CenterPaner() {
		setLayout(null);
		JLabel label = new JLabel("Hello JAVA");
		label.setBounds(165, 0, 200, 100);
		add(label);
	}
}

public class OpenChallenge2 extends JFrame {
	OpenChallenge2(){
		super("OpenChallenge2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new NorthPaner(), BorderLayout.NORTH);
		add(new CenterPaner(), BorderLayout.CENTER);
		
		setSize(400, 300);
		setVisible(true);
	}
	public static void main(String[] args) { new OpenChallenge2(); }
}