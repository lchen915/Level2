import javax.swing.JFrame;

public class GameWindow {
	GamePanel panel;
	GameWindow() {
		JFrame window = new JFrame();
		panel=new GamePanel();
		window.setVisible(true);
		window.setSize(500,500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);
	}
	public static void main (String [] args) {
		new GameWindow();
	}
}
