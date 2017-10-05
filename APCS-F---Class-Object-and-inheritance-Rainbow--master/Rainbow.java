// Chapter 5 Question 27

// Stephen Lee

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rainbow extends JPanel
{
    // Declare skyColor:

    Color skyColor = Color.CYAN;
    private int xCenter;
    private int yCenter;
    private int xCenter1;
    private int yCenter1;
    private int xCenter2;
    private int yCenter2;
    private int xCenter3;
    private int yCenter3;
    private int largeRadius;
    private int mediumRadius;
    private int smallRadius;
    private int tinyRadius;
    private double x;
    private double a;
    private double b;
    private double c;

    public Rainbow()
    {
        setBackground(skyColor);
    }

    // Draws the rainbow.
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int width = getWidth();    
        int height = getHeight();

        // Declare and initialize the radius of the large semicircle:
        xCenter = width/2;
        yCenter = height*3/4;
        largeRadius = width*1/4;

        g.setColor(Color.RED);

        // Draw the large semicircle:
        g.fillArc(xCenter/2, yCenter/2, largeRadius*2, largeRadius*2, 0, 180);

        // Declare and initialize the radii of the small and medium
        // semicircles and draw them:

        x = largeRadius * height * 1/4;
        mediumRadius = (int)Math.sqrt(x);

        a = largeRadius - mediumRadius;
        xCenter1 = (int)(width/4 + a);
        yCenter1 = (int)(height*3/8 + a);

        g.setColor(Color.GREEN);
        g.fillArc(xCenter1 , yCenter1, mediumRadius*2 , mediumRadius*2, 0, 180);

        smallRadius = height*1/4;
        b = mediumRadius - smallRadius;
        xCenter2 = (int)(xCenter1 + b);
        yCenter2 = (int)(yCenter1 + b);

        g.setColor(Color.MAGENTA);
        g.fillArc(xCenter2 , yCenter2, smallRadius*2 , smallRadius*2, 0, 180);

        // Calculate the radius of the innermost (sky-color) semicircle
        // so that the width of the middle (green) ring is the
        // arithmetic mean of the widths of the red and magenta rings:

        // WORK:
        // mediumRadius = largeRadius+smallRadius / 2
        // mediumRadius * 2 = largeRadius + smallRadius
        // smallRadius = mediumRadius * 2 - largeRadius

        tinyRadius = smallRadius * 2 -mediumRadius;
        c = smallRadius - tinyRadius;
        xCenter3 = (int)(xCenter2 + c);
        yCenter3 = (int)(yCenter2 + c);

        // Draw the sky-color semicircle:

        g.setColor(skyColor);
        g.fillArc(xCenter3 , yCenter3, tinyRadius*2 , tinyRadius*2, 0, 180);
    }

    public static void main(String[] args)
    {
        JFrame w = new JFrame("Rainbow");
        w.setBounds(300, 300, 300, 200);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = w.getContentPane();
        c.add(new Rainbow());
        w.setVisible(true);
    }
}
