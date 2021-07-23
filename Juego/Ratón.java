import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ratón here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ratón extends Animal
{
    /**
     * Act - do whatever the Gato wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Ratón()
    {
        //Cambia el tamaño de la imagen del gato
        GreenfootImage miImagen2 = getImage();
        int miNuevaAltura2 = (int)miImagen2.getHeight()/2;
        int miNuevoAncho2 = (int)miImagen2.getWidth()/2;
        miImagen2.scale(miNuevoAncho2, miNuevaAltura2);
    }

    /**
     * Act - do whatever the Ratón wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
