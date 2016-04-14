package Display;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Fantomasa on 14.4.2016 г..
 */
public class Display_Applet extends JApplet {
    private Display display = new Display();

    public void init(){
        setLayout(new BorderLayout());
        add(display);
    }

    public void start(){
        display.start();
    }
    public void stop(){
        try {
            display.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
