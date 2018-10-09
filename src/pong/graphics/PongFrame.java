package pong.graphics;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PongFrame extends Frame {

    /**
     * long serialVersionUID
     */
    private static final long serialVersionUID = -6354484083037255828L;

    public int player1Position = 200;

    public int player2Pos = 600;

    private static PongFrame pongFrame;

    public static void main(String[] args) {

	pongFrame = new PongFrame();

    }

    @Override
    public void paint(Graphics g) {
	paintPlayer(g);
	paintComputer(g);
    }

    private void paintPlayer(Graphics g) {
	Graphics2D g2d = (Graphics2D) g;
	g2d.setColor(Color.RED);
	g2d.fill(new Rectangle(50, player1Position + 150, 20, 150));
    }

    private void paintComputer(Graphics g) {
	Graphics2D g2d = (Graphics2D) g;
	g2d.setColor(Color.BLUE);
	g2d.fill(new Rectangle(1880, player2Pos + 150, 20, 150));
    }

    public PongFrame() {
	super.setTitle("Pong");
	setSize(800, 600);
	// setAutoRequestFocus(false);
	setVisible(true);
	setResizable(false);

	addWindowListener(new WindowAdapter() {
	    public void windowClosing(WindowEvent e) {
		dispose();
		System.exit(0);
	    }
	});

	setBackground(Color.DARK_GRAY);

	addKeyListener(new KeyListener() {

	    @Override
	    public void keyTyped(KeyEvent e) {
		// nothing

	    }

	    @Override
	    public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	    }

	    @Override
	    public void keyPressed(KeyEvent e) {
		char keyChar = e.getKeyChar();

		if (keyChar == 'Q') {
		    player1Position++;
		    System.out.println();
		}
		if (keyChar == 'Y') {
		    player1Position--;
		}
		System.out.println(keyChar + " " + player1Position);

	    }
	});
    }

}
