import java.awt.Color;
import java.awt.Graphics;

public class Player {

	private double tx, ty, x, y;	// tx, ty = target x, target y
	private int health, size, speed;
	
	// Constructor for the class
	public Player(int x, int y) {
		this.x = x;
		this.y = y;
		this.tx = 0;
		this.ty = 0;
		this.health = 5;
		this.size = 30;
		this.speed = 10;
	}
	
	public void setTarget(int x, int y) {
		this.tx = x;
		this.ty = y;
	}
	
	public void update() {
		double deltaX = this.tx - this.x;
		double deltaY = this.ty - this.y;
		double angle = Math.atan2(deltaY, deltaX);	// arctangent of change in y over change in x, returns the angle given by arctan(opposite [vertical]/ adjacent [horizontal, relative to the x-axis])
		double dx = this.speed * Math.cos(angle);
		double dy = this.speed * Math.sin(angle);
		if (Math.abs(dx) > Math.abs(deltaX)) {
			dx = deltaX;
		}
		if (Math.abs(dy) > Math.abs(deltaY)) {
			dy = deltaY;
		}
//		dx = Math.min(dx, deltaX);	// gets whichever of the 2 arguments is smaller
//		dy = Math.min(dy, deltaY);
		this.x += dx;
		this.y += dy;
	}
	
	public boolean doesHit(Hurricane ian) {
		double centerX = this.x + this.size/2;
		double centerY = this.y + this.size/2;
		double deltaX = centerX - ian.getX();
		double deltaY = centerY - ian.getY();
		double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
		double sumRadii = ian.getSize() + this.size;
		if(sumRadii >= distance) {
			return true;
		} else {
			return false;
		}
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillOval((int)this.x, (int)this.y, this.size, this.size);	// h = w; circle
	}
}
