import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.Timer;


public class Screen extends JFrame {
	
	private final int HEIGHT = 500;
	private final int WIDTH = (int) (500 * 1.7);
	private Color skyColor = Color.CYAN;
	private Color groundColor = Color.GREEN;
	private Animal[] animals;
	private Image body;
	private Image unhappyFace;
	private Image happyFace;
	
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
	    setAlwaysOnTop(true);
	    
	    // importera bild
	    importImages();
	    
	    testAnimals();
	    
	}
	
	private void testAnimals() {
		this.animals = new Animal[]{new Animal("pelle"), new Animal("bosse")};
		drawWorld(animals);
	}
	
	private void importImages() {
		ImageIcon ii = new ImageIcon(this.getClass().getResource("defaultBody.png"));
	    body = ii.getImage();
	    ImageIcon ii2 = new ImageIcon(this.getClass().getResource("happyFace.png"));
	    happyFace = ii2.getImage();
	    ImageIcon ii3 = new ImageIcon(this.getClass().getResource("notHappyFace.png"));
	    unhappyFace = ii3.getImage();
	}
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(skyColor);
		g2.fillRect(0, 0, WIDTH, HEIGHT/2);
		
		g2.setColor(groundColor);
		g2.fillRect(0, HEIGHT/2, WIDTH, HEIGHT/2);
		
		if (animals != null) {
			int bodyOffset = 10;
			int yOffset = HEIGHT/4;
			for (int i = 0; i < animals.length; i++) {
				g2.drawImage(body, bodyOffset, yOffset, this);
				if (animals[i].getHowHappy() > 50) {
					g2.drawImage(happyFace, bodyOffset, yOffset, this);
				} else {
					g2.drawImage(unhappyFace, bodyOffset, yOffset, this);
				}
				
				bodyOffset += body.getWidth(null);
				yOffset += 80;
			}
		}
	}
	
	public void drawWorld(Animal[] animals) {
		this.animals = animals;
		
		drawBackground();
		repaint();
	}
	
	private void drawBackground() {
		boolean isDay = false;
		
		Calendar calendar = new GregorianCalendar();
		
		int minutes = calendar.get(Calendar.MINUTE);
		int hours = calendar.get(Calendar.HOUR_OF_DAY);
		
		if (hours > 6 && hours < 8) {
			isDay = true;
		}
		
		if (isDay) {
			skyColor = Color.CYAN;
			groundColor = Color.GREEN;
		} else {
			skyColor = Color.BLACK;
			groundColor = Color.DARK_GRAY;
		}
	}
	
	private void drawAnimal(Animal Animal) {
		
	}
	
	
	
}
