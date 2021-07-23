import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Es el personaje principal del laberinto. 
 * 
 * @author Lourdes Saavedra 
 * @version 1
 */
public class Gato extends Animal
{
    /**
     * Se genera la imagen del gato y sus proporciones. 
     */
    public Gato()
    {
        //Cambia el tamaño de la imagen del gato.
        GreenfootImage miImagen = getImage();
        int miNuevaAltura = (int)miImagen.getHeight()/4;
        int miNuevoAncho = (int)miImagen.getWidth()/4;
        //Permite mantener la escala de la imagen. 
        miImagen.scale(miNuevoAncho, miNuevaAltura);
    }

    private int points = 0;
    //Se declara la variable de puntos. 

    /**
     * Cuando se seleciona el método act, el gato realiza las acciones
     * enlistadas.
     */
    
    public void act()
    {
        //Se llaman los métodos para conformar la rutina del gato. 
        revisarTeclado();
        intentarComer();
        revisarPiedra();
    }

    /**
     * Permite revisar si las flechas del teclado están presionadas.
     * El gato se mueve según las teclas presionadas. 
     */
    public void revisarTeclado()
    {
        //Si la flecha izquiera está presionada, se gira -5 grados.
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-5);
        }
        //Si la flecha derecha está presionada, se gira 5 grados.
        if(Greenfoot.isKeyDown("right"))
        {
            turn(5);
        }
        //Si la flecha arriba está presionada, el gato se mueve 4.
        if(Greenfoot.isKeyDown("up"))
        {
            move(4);
        }
        //Si la felcha abajo está presionada, el gatose mueve -4.
        if(Greenfoot.isKeyDown("down"))
        {
            move(-4);
        }
    }

    /**
     * Permite al gato "comerse" a otras clases si las ve.
     */
    public void intentarComer()
    {
        if(canSee(Pez.class))
        {
            eat(Pez.class);
            points++;
            //Suma un punto por cada pez comido.
            Greenfoot.playSound("Comer.wav");
            //Se reproduce el sonido por cada pez comido. 
        }
        if(canSee(Agua.class))
        {
            eat(Agua.class);
            points--;
            //Se resta un punto por cada agua comida.
            Greenfoot.playSound("Splash.wav");
            //Se reproduce el sonido por cada agua comida. 
        }
        if(canSee(Ratón.class))
        {
            eat(Ratón.class);
            points = points+10;
            //Se suma 10 a los puntos que se llevan.
            Greenfoot.playSound("Win.wav");
            //Se reproduce el sonido cuando se llega al ratón. 
            Greenfoot.stop();
            //El juego se detiene.
        }
    }

    /**
     * Revisa si hay una piedra y en caso de que la intresecte, regresa -4.
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
