import java.awt.Graphics;
import java.awt.Panel;

public class MyPanel extends Panel {

	private int x, y;
	private int zoom;

	public MyPanel() {
		x = 580;
		y = 520;
		zoom = 30;
		this.setSize(580, 520);
	}
	
	public void paint(Graphics g) {
		//draw edge line
		g.drawLine(0, 0, 0, y);
		g.drawLine(0, 0, x, 0);
		g.drawLine(0, y, x, y);
		g.drawLine(x, 0, x, y);
		
		//x line, y line
		g.drawLine(0, y/2, x, y/2);
		g.drawLine(x/2, 0, x/2, y);
		
		//x, y arrow
		g.drawLine(x - 5, y/2 - 5, x, y/2);
		g.drawLine(x - 5, y/2 + 5, x, y/2);
		g.drawLine(x/2 - 5, 5, x/2, 0);
		g.drawLine(x/2 + 5, 5, x/2, 0);
		
		//0, x, y
		g.drawString("0", x/2 + 2, y/2 + 12);
		g.drawString("x", x - 14, y/2 + 12);
		g.drawString("y", x/2 + 10, 13);
		
		//marking
		for (int i = 1; i < 10; i++) {
			g.drawLine(x/2 + zoom * i, y/2 - 3, x/2 + zoom * i, y/2 + 3);
			g.drawLine(x/2 - zoom * i, y/2 - 3, x/2 - zoom * i, y/2 + 3);
		}
		for (int i = 1; i < 9; i++) {
			g.drawLine(x/2 - 3, y/2 + zoom * i, x/2 + 3, y/2 + zoom * i);
			g.drawLine(x/2 - 3, y/2 - zoom * i, x/2 + 3, y/2 - zoom * i);
		}
	}
	
}
