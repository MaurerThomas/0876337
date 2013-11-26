import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Dijk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dijk extends Actor
{
    /**
     * Act - do whatever the Dijk wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Dijk(Color c)
    {
        GreenfootImage img = new GreenfootImage(50,50);
        img.setColor(c);
        img.fill();
        setImage(img);
        
    }   
    
    public void act() 
    {
        // Add your action code here.
    }    
}
