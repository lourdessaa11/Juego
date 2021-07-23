import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Animal contiene los métodos a los que pueden acceder todas las subclases.
 * 
 * @author Lourdes Saavedra 
 * @version 1
 */
public class Animal extends Actor
{
    /**
     * Act - do whatever the Animal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public boolean atWorldEdge()
    {
        if(getX() < 10 || getX() > getWorld().getWidth() - 10)
            return true;
        if(getY() < 10 || getY() > getWorld().getHeight() - 10)
            return true;
        else
            return false;
    }
    
    public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;    
    }
    
    public void eat(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0,0, clss);
        if(actor != null) {
            getWorld().removeObject(actor);
        }
    }
}
