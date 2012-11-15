import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;


public class Screen extends JFrame {
	
	private final int WIDTH = 400;
	private final int HEIGHT = 300;
	
	public Screen() {
		init();
	}
	
	private void init() {
		setTitle("Tamagotchi 2000");
		setSize(WIDTH, HEIGHT);
		
		setLocationRelativeTo(null);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setVisible(true);
	}
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Dimension size = getSize();
		g2.setColor(Color.BLACK);
		g2.fillRect(WIDTH, HEIGHT, 0, 0);
	}
	
	private void drawDay() {
		
	}
	
}
