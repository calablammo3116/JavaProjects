import javax.swing.JFrame;

public class HurricaneDodge {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Test");	// a frame is a window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(800, 800);
		// GUI-based programming: everything works in a coordinate system; (0,0) is
		// in the TOP-LEFT of the frame
		// + x -> to the right, +y -> to the down
		frame.add(new GameManager());
	}

}
