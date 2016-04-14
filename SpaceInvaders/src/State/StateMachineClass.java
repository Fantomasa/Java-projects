package State;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Fantomasa on 14.4.2016 г..
 */
public class StateMachineClass {
    private Canvas canvas;
    private ArrayList<StateMachine> states = new ArrayList<StateMachine>();
    private byte selectState = 0;


    public StateMachineClass(Canvas canvas){
        this.canvas = canvas;
    }

    public void draw (Graphics2D g){
        states.get(selectState).draw(g);
    }

    public void update(double delta){
        states.get(selectState).update(delta);
    }

    public void setState(byte i){
        for (int r = 0; r < canvas.getKeyListeners().length; r++)
            canvas.removeKeyListener(canvas.getKeyListeners()[r]);
        selectState = i;
        states.get(selectState).init(canvas);
    }

    public byte getStates(){
        return selectState;
    }

}
