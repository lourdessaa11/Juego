import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gato here.
 * 
 * @author Lourdes Saavedra 
 * @version 1
 */
public class Gato extends Animal
{
    /**
     * Act - do whatever the Gato wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Gato()
    {
        //Cambia el tamaño de la imagen del gato
        GreenfootImage miImagen = getImage();
        int miNuevaAltura = (int)miImagen.getHeight()/4;
        int miNuevoAncho = (int)miImagen.getWidth()/4;
        miImagen.scale(miNuevoAncho, miNuevaAltura);
    }

    private int points = 0;

    public void act()
    {
        // Add your action code here.
        revisarTeclado();
        intentarComer();
        revisarPiedra();
    }

    /**
     * COMENTARIO
     */
    public void revisarTeclado()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-5);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            turn(5);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            move(4);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            move(-4);
        }
    }

    /**
     * COMENTARIO
     */
    public void intentarComer()
    {
        if(canSee(Pez.class))
        {
            eat(Pez.class);
            points++;
            Greenfoot.playSound("Comer.wav");
        }
        if(canSee(Agua.class))
        {
            eat(Agua.class);
            points--;
            Greenfoot.playSound("Splash.wav");
        }
        if(canSee(Ratón.class))
        {
            eat(Ratón.class);
            points = points+10;
            Greenfoot.playSound("Win.wav");
            Greenfoot.stop();
        }
    }

    /**
     * COMENTARIO
     */
    public void revisarPiedra()
    {
        Actor Piedra = getOneIntersectingObject(Piedra.class);
        if(Piedra!=null)
        {
            move(-4);
        }
    }

}
