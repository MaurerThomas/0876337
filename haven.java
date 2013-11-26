import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class haven here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class haven extends World
{
        public haven()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(8, 8, 60); 
        
        GreenfootImage img = new GreenfootImage(8,8);
        img.setColor(Color.BLUE);
        img.fill();
        setBackground(img);
        
        // Platform
        addRow (2,1,4, Color.GRAY);
        addRow (2,2,4, Color.GRAY);
        // Brug
        addRow (3,3,2, Color.RED);
        addRow (3,4,2, Color.RED);
        addRow (3,5,2, Color.RED);
        // Dijk
        addRow (0,3,3, Color.LIGHT_GRAY);
        addRow (0,4,3, Color.LIGHT_GRAY);
        addRow (0,5,3, Color.LIGHT_GRAY);
        addRow (5,3,3, Color.LIGHT_GRAY);
        addRow (5,4,3, Color.LIGHT_GRAY);
        addRow (5,5,3, Color.LIGHT_GRAY);
        // Trein
        addRow (0,6,8, Color.DARK_GRAY);
        // Land
        addRow (0,7,8, Color.GREEN);
        // Krat
        addObject(new Krat(),2,1);
        addObject(new Krat(),3,1);
        addObject(new Krat(),4,1);
        addObject(new Krat(),5,1);
        addObject(new Krat(),2,2);
        addObject(new Krat(),3,2);
        addObject(new Krat(),4,2);
        addObject(new Krat(),5,2);
    }
    
    public void addRow(int x, int y,int n, Color c){
        for (int i = 0; i < n; i++)
        {
         addObject(new Dijk(c), x, y);
         x++;
        }   
        }
     
        
   
}

