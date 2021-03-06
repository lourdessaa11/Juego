import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase agua no ejecuta ningún método. Se utiliza para restar puntos. 
 * 
 * @author Lourdes Saavedra
 * @version 1
 */
public class Agua extends Actor
{
    public Agua()
    {
        //Cambia el tamaño de la imagen de la gota de agua. 
        GreenfootImage miImagen = getImage();
        int miNuevaAltura = (int)miImagen.getHeight()/14;
        int miNuevoAncho = (int)miImagen.getWidth()/14;
        miImagen.scale(miNuevoAncho, miNuevaAltura);
    }
    /**
     * Act - do whatever the Agua wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
