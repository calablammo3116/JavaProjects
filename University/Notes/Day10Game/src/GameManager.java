// import java.awt.*	// imports everything in the java.awt library
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JComponent;

public class GameManager extends JComponent implements MouseListener, Runnable {

	private Player play;
	private ArrayList<Hurricane> hurrList;
	private int timer = 0;
	
	public GameManager() {
		play = new Player(400,400);
		hurrList = new ArrayList<Hurricane>();
		hurrList.add(new Hurricane(100,100,20));
		hurrList.add(new Typhoon(700,100,50));
		
		this.addMouseListener(this);
		Thread t = new Thread(this);
		t.start();
	}
	
	public void paint(Graphics g) {
		play.draw(g);
		for (Hurricane h: hurrList) {
			h.draw(g);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println(e.getX()+" "+e.getY());
		play.setTarget(e.getX(), e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		while(true) {
			try {
				timer++;
				play.update();
				
				for(int i=0; i<hurrList.size(); i++) {
					hurrList.get(i).update();
					if(play.doesHit(hurrList.get(i))) {
						System.out.println("You got hit by a hurricane");
						hurrList.remove(i);
						i--;
					}
				}
				for(Hurricane h: hurrList) {
					h.update();
				}
			
				if(timer > 100) {
					hurrList.add(new Hurricane((int)(Math.random()*800), 
							(int)(Math.random()* 800), (int)(Math.random()*100)));
					timer = 0;
				}
				repaint();

				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}