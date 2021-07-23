import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase Animal contiene los métodos a los que pueden acceder 
 * todas las subclases.
 * 
 * @author Lourdes Saavedra 
 * @version 1
 */
public class Animal extends Actor
{
    /**
     * Comprueba si el animal se encuentra en el borde del mundo.
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
    
    
    /**
     * Se utiliza para comprobar si el animal "observa" a otra clase dentro
     * del mundo. 
     */
    public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;    
    }
    
    /**
     * Se utiliza para que el animal se "coma" a otras clases.
     */
    public void eat(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0,0, clss);
        if(actor != null) {
            getWorld().removeObject(actor);
        }
    }
}
