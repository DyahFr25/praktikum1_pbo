import greenfoot.Actor;
import greenfoot.*;
/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Character  
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class player
     */
    
    public void act()
    {
    int xPoss = this.getX();
    int yPoss = this.getY();
    World world = this.getWorld();
    this.move(1);
    
    if (Greenfoot.isKeyDown("space")){
        this.setLocation(xPoss, yPoss - 4);
    }
    
    if (xPoss == world.getWidth() - 1) {
        this.setLocation(0, yPoss);
    }
    
    if (yPoss == world.getWidth() - 1){
        this.setLocation(0, yPoss);
    }
    
    }
        
}
    
    
     
      
