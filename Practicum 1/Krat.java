import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Krat extends Actor
{

    public void bewegingAuto() 
    {
     
} 
private int counter = 0;
private int timer = 10;



public void act()
{
 if(counter == 0){
        beweging();
    }
 counter++;
 if (counter == 5){
        counter = 0;
     }
 // bewegings snelheid en beweging
 if(timer<0)  
    {  
    timer=10;
    setLocation(getX(), getY()+1);
          }  
    else 
    {  
    timer--;
    }  
  
}
    
// beweging met pijltjes toetsen
public void beweging()
{
   int tl = 0, tr = 0;  
        if(Greenfoot.isKeyDown("left")){
            tl = -1;
        }
        if(Greenfoot.isKeyDown("right")){
            tl = 1;
        }
        if(Greenfoot.isKeyDown("up")){
            tr = -1;
        }
        if(Greenfoot.isKeyDown("down")){
            tr = 1;
        }
        Actor w = getOneObjectAtOffset(tl,tr,haven.class); 
        if(w == null){
       setLocation (getX()+tl, getY()+tr);   
    }
}    
}

