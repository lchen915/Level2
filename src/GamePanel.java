import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener{
	Timer timer1;
	GameObject object;
	int x;
	int y;
	int width;
	int height;
	int speedx;
	int speedy;
	
	GamePanel() {
		System.out.println("gamepanel");
		timer1 = new Timer(100, this);
		timer1.start();
		x=10;
		y=150;
		width=100;
		height=100;
		speedx=100;
		speedy=100;
		object = new GameObject(10,10,200,200);
	}
	
	public void paintComponent(Graphics g) {
		g.fillRect(x, y, width, height);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("actionperformed");
		repaint();
		if (x>=400) {
			speedx=-speedx;
		}
		if (x<=0) {
			speedx=-speedx;
		}
		x=x+speedx;
		if (y>=400) {
			speedy=-speedy;
		}
		if (y<=0) {
			speedy=-speedy;
		}
		y=y+speedy;
	}

}
