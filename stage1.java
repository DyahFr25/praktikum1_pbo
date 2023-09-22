import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class stage1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class stage1 extends MyWorld
{
    int gravity = 1;
    
    public void setGravity(int gravity){
        this.gravity =gravity;
    }
    
    public int getGravity(){
        return this.gravity;
    }
    
    public stage1()
    {
        player snake = new player();
        this.addObject(snake, 300, 200);
        this.gravity = 3;
        player snake2 = new player();
        this.addObject(snake2, 500, 0);
    
        Buildings gedung = new Buildings();
        this.addObject(gedung, 10, 30);
    }
    
    public void act(){
        
        List<Character> allChars = this.getObjects(Character.class);
        for(Character chara : allChars){
            int xPoss = chara.getX();
            int yPoss = chara.getY();
            chara.setLocation(xPoss, yPoss+this.gravity);
        }
    }
}
