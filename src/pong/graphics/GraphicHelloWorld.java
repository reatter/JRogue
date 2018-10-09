package pong.graphics;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GraphicHelloWorld extends Frame {

    public static void main(String[] args) {

	new GraphicHelloWorld();

    }

    /**
     * Ctor
     */
    public GraphicHelloWorld() {
	super.setTitle("Frame title");
	setSize(640, 480);
	setVisible(true);

	// Now, we want to be sure we properly dispose of resources
	// this frame is using when the window is closed. We use
	// an anonymous inner class adapter for this.
	addWindowListener(new WindowAdapter() {
	    public void windowClosing(WindowEvent e) {
		dispose();
		System.exit(0);
	    }
	});

    }

    /**
     * The paint method provides the real magic. Here we cast the Graphics object to
     * Graphics2D to illustrate that we may use the same old graphics capabilities
     * with Graphics2D that we are used to using with Graphics.
     **/
    public void paint(Graphics g) {
	// Here is how we used to draw a square with width
	// of 200, height of 200, and starting at x=50, y=50.
	g.setColor(Color.red);
	g.drawRect(50, 50, 200, 200);

	// Let's set the Color to blue and then use the Graphics2D
	// object to draw a rectangle, offset from the square.
	// So far, we've not done anything using Graphics2D that
	// we could not also do using Graphics. (We are actually
	// using Graphics2D methods inherited from Graphics.)
	Graphics2D g2d = (Graphics2D) g;
	g2d.setColor(Color.blue);
	g2d.fill(new Rectangle(100, 100, 200, 200));
    }

}
