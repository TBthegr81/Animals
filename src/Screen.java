import javax.swing.JFrame;


public class Screen extends JFrame {
	
	public Screen() {
		init();
	}
	
	private void init() {
		setTitle("Tamagotchi 2000");
		setSize(300, 200);
		setLocationRelativeTo(null);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setVisible(true);
	}
	
}
