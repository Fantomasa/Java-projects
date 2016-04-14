package State;

import java.awt.*;

/**
 * Created by Fantomasa on 14.4.2016 г..
 */
public interface StateMachine {

    public void update(double delta);
    public void draw(Graphics2D g);
    public void init(Canvas canvas);
}
