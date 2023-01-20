import java.awt.Color;
import java.awt.Graphics;

public class Hurricane {
	private double x,y;
	private int size;
	
	public Hurricane(int x, int y, int size) {
		this.x = x;
		this.y = y;
		this.size = size;
	}
	
	public void update() {
		this.x += Math.random() * 21 - 10;	// - 10 allows movement both backwards and
		this.x += Math.random() * 21 - 10;	// forwards
	}
	
	public double getX() {
		return this.x + this.size/2;	// gives center x
	}
	
	public double getY() {
		return this.y + this.size/2;	// gives center y
	}
	
	public double getSize() {
		return this.size;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillOval((int)this.x, (int)this.y, 100, 100);
	}
	
	public int score() {
		return 1;
	}
}
