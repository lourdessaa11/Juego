import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La clase pez no ejecuta ningún método. Se utiliza para sumar puntos. 
 * 
 * @author Lourdes Saavedra
 * @version 1
 */
public class Pez extends Animal
{
    /**
     * Se establece el tamaño pez.
     */
    public Pez()
    {
        //Cambia el tamaño de la imagen del gato
        GreenfootImage miImagen = getImage();
        int miNuevaAltura = (int)miImagen.getHeight()/8;
        int miNuevoAncho = (int)miImagen.getWidth()/8;
        //Mantiene la escala de la imagen
        miImagen.scale(miNuevoAncho, miNuevaAltura);
    }
    public void act()
    {
        // Add your action code here.
    }
}
