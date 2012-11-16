import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Screen extends JFrame {
	
	private final int HEIGHT = 500;
	private final int WIDTH = (int) (500 * 1.7);
	private Color skyColor = Color.CYAN;
	private Color groundColor = Color.GREEN;
	private Color textColor = Color.BLACK;
 	private ArrayList<Animal> animals;
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
	    
	    //testAnimals();
	    
	}
	
	private void testAnimals() {
		animals.add(new Animal("Bosse"));
		animals.add(new Animal("Pelle"));
		drawWorld(animals);
	}
	
	private void importImages() {
	    ImageIcon ii2 = new ImageIcon(this.getClass().getResource("happyFace.png"));
	    happyFace = ii2.getImage();
	    ImageIcon ii3 = new ImageIcon(this.getClass().getResource("notHappyFace.png"));
	    unhappyFace = ii3.getImage();
	}
	
	private Image getBody(Animal a) {
		ImageIcon ii = new ImageIcon(this.getClass().getResource(a.getType() + ".png"));
		return ii.getImage();
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
			for (int i = 0; i < animals.size(); i++) {
				Image body = getBody(animals.get(i));
				g2.drawImage(body, bodyOffset, yOffset, this);
				
				g2.setColor(textColor);
				g2.setFont(new Font("Verdana", Font.PLAIN, 14));
				g2.drawString(animals.get(i).getName(), bodyOffset + 10, yOffset - 20);
				
				if (animals.get(i).getHowHappy() > 50) {
					g2.drawImage(happyFace, bodyOffset, yOffset, this);
				} else {
					g2.drawImage(unhappyFace, bodyOffset, yOffset, this);
				}
				
				bodyOffset += body.getWidth(null);
				yOffset += 80;
			}
		}
	}
	
	public void drawWorld(ArrayList<Animal> animals) {
		this.animals = animals;
		
		drawBackground();
		repaint();
	}
	
	private void drawBackground() {
		boolean isDay = false;
		
		Calendar calendar = new GregorianCalendar();
		
		int minutes = calendar.get(Calendar.MINUTE);
		int hours = calendar.get(Calendar.HOUR_OF_DAY);
		
		if (hours > 6 && hours < 18) {
			isDay = true;
		}
		
		if (isDay) {
			textColor = Color.BLACK;
			skyColor = Color.CYAN;
			groundColor = Color.GREEN;
		} else {
			textColor = Color.WHITE;
			skyColor = Color.BLACK;
			groundColor = Color.DARK_GRAY;
		}
	}
	
}
