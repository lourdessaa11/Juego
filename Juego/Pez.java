import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pez here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pez extends Animal
{
    /**
     * Act - do whatever the Pez wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Pez()
    {
        //Cambia el tamaño de la imagen del gato
        GreenfootImage miImagen = getImage();
        int miNuevaAltura = (int)miImagen.getHeight()/8;
        int miNuevoAncho = (int)miImagen.getWidth()/8;
        miImagen.scale(miNuevoAncho, miNuevaAltura);
    }
    public void act()
    {
        // Add your action code here.
    }
}
