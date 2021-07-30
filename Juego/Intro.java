import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Intro here.
 * 
 * @author Lourdes
 * @version 1
 */
public class Intro extends World
{

    /**
     * Constructor for objects of class Intro.
     * 
     */
    public Intro()
    {    
        // Create a new world with 600X525 cells with a cell size of 1x1 pixels.
        super(600, 525, 1); 
    }
    
    /**
     * Al presionar enter se cambia de mundo
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new FondoLaberinto());
        }
    }
}
