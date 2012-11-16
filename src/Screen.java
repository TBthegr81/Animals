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
	
	private final static int HEIGHT = 500;
	private final static int WIDTH = (int) (HEIGHT * 1.7);
	private Color skyColor = Color.CYAN;
	private Color groundColor = Color.GREEN;
	private Color textColor = Color.BLACK;
 	private ArrayList<Animal> animals;
	private Image unhappyFace;
	private Image happyFace;
	private Image fence;
	
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
	    
	}
	
	private void importImages() {
		ImageIcon ii = new ImageIcon(this.getClass().getResource("fence.png"));
		fence = ii.getImage();
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
		
		g2.drawImage(fence, 0, HEIGHT/3, this);
		
		if (animals != null) {
			int bodyOffset = 10;
			int yOffset = HEIGHT/4;
			for (int i = 0; i < animals.size(); i++) {
				Animal a = animals.get(i);
				Image body = getBody(a);
				g2.drawImage(body, bodyOffset, yOffset, this);
				
				g2.setColor(textColor);
				g2.setFont(new Font("Verdana", Font.PLAIN, 14));
				g2.drawString(a.getName(), bodyOffset + 10, yOffset - 20);
				
				int textX = 600;
				int textY = 50;
				
				g2.drawString("Mood: " + a.getHappyText(), textX, textY);
				g2.drawString("Sleepylevel: " + a.getHowSleepy(), textX, textY + 20);
				g2.drawString("Hungrylevel: " + a.getCurrentHunger(), textX, textY + 40);
				g2.drawString("Happylevel: " + a.getHowHappy(), textX, textY + 60);
				
				if (a.getHowHappy() > 50) {
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
