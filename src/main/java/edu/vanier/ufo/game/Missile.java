package edu.vanier.ufo.game;

import javafx.scene.paint.Color;

/**
 * A missile projectile without the radial gradient.
 */
public class Missile extends Atom {

 
    public Missile(String imagePath) {        
        super(imagePath);
    }
    
    @Override
    public String toString() {
        return "this is a Missile";
    }
}
