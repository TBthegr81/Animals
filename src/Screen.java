import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.Timer;


public class Screen extends JFrame {
	
	private final int WIDTH = 400;
	private final int HEIGHT = 300;
	private Color skyColor = Color.CYAN;
	private Color groundColor = Color.GREEN;
	private boolean firstAnimal = false;
	private boolean secondAnimal = false;
	
	public Screen() {
		init();
	}
	
	private void init() {
		setTitle("Tamagotchi 2000");
		setSize(WIDTH, HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setVisible(true);
	    
	}
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(skyColor);
		g2.fillRect(0, 0, WIDTH, HEIGHT/2);
		
		g2.setColor(groundColor);
		g2.fillRect(0, HEIGHT/2, WIDTH, HEIGHT/2);
		
	    if (firstAnimal) {
	    	// draw ze animal
	    	if (secondAnimal) {
	    		// draw ze other animal
	    	}
	    }
	}
	
	public void drawWorld(Animal animal1, Animal animal2) {
		drawBackground();
		
		drawAnimal(animal1);
		firstAnimal = true;
		if (animal2 != null) {
			secondAnimal = true;
			drawAnimal(animal2);
		} else {
			secondAnimal = false;
		}
		repaint();
	}
	
	private void drawBackground() {
		boolean isDay = false;
		
		Calendar calendar = new GregorianCalendar();
		
		int minutes = calendar.get(Calendar.MINUTE);
		int hours = calendar.get(Calendar.HOUR_OF_DAY);
		
		if (hours > 6 && hours < 14) {
			isDay = true;
		}
		
		if (isDay) {
			skyColor = Color.CYAN;
			groundColor = Color.GREEN;
		} else {
			skyColor = Color.BLACK;
			groundColor = Color.MAGENTA;
		}
	}
	
	private void drawAnimal(Animal Animal) {
		
	}
	
	
	
}
