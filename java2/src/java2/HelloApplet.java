package java2;

import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="HelloApplet.class" width="300" height="100">
</applet>
*/

@SuppressWarnings({ "removal", "serial" })
public class HelloApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello, Applet!", 50, 50);
    }
}