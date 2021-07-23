import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase ratón no ejecuta ningún método. Se utiliza para ganar el juego. 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ratón extends Animal
{
    /**
     * Se establece la imagen del ratón. 
     */
    public Ratón()
    {
        //Cambia el tamaño de la imagen del gato
        GreenfootImage miImagen2 = getImage();
        int miNuevaAltura2 = (int)miImagen2.getHeight()/2;
        int miNuevoAncho2 = (int)miImagen2.getWidth()/2;
        //Permite mantener la escala de la imagen
        miImagen2.scale(miNuevoAncho2, miNuevaAltura2);
    }

    public void act()
    {
        // Add your action code here.
    }
}
