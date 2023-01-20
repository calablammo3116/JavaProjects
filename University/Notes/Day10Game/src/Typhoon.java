import java.awt.Color;
import java.awt.Graphics;

public class Typhoon extends Hurricane {

	public Typhoon(int x, int y, int size) {
		super(x,y,size);
	}
	
	public void update() {
		double startX = this.getX();
		double startY = this.getY();
		while (Math.sqrt(Math.pow(startX - this.getX(), 2) + Math.pow(startY - this.getY(), 2)) < 15) {	// this is distance formula, then less than 15 pixels
			super.update();
		}
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillOval((int)this.getX(), (int)this.getY(), (int)this.getSize(), (int)this.getSize());
	}
	
	public int score() {
		return super.score()*2;
	}
}
