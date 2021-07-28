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

    public int points = 0;
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
        //Se declara la variable speed
        int speed = 4;
        //Si la flecha izquiera está presionada, rota 180 grados y se mueve
        //la cantidad de speed.
        if(Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
            move(speed);
        }
        //Si la flecha derecha está presionada, rota 0 grados y se mueve 
        //la cantidad de speed.
        if(Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
            move(speed);        
        }
        //Si la flecha arriba está presionada, rota -90 grados y se mueve.
        if(Greenfoot.isKeyDown("up"))
        {
            setRotation(-90);
            move(speed);
        }
        //Si la felcha abajo está presionada,revisa si el gato se encuentra antes de los 450 en y, si sí rota 90 grados y se mueve.
        if(Greenfoot.isKeyDown("down"))
        {
            if (getY() < 450)
            {
                setRotation(90);
                move(speed);
            }  
        }
    }

    /**
     * Permite al gato "comerse" a otras clases si las ve.
     */
    public void intentarComer()
    {
        //Llama al FondoLaberinto y lo llama como un mundo
        FondoLaberinto miMundo = (FondoLaberinto)getWorld();
        if(canSee(Pez.class))
        {
            eat(Pez.class);
            points =+ 1;
            miMundo.contarPuntos(points);
            //Suma un punto por cada pez comido.
            Greenfoot.playSound("Comer.wav");
            //Se reproduce el sonido por cada pez comido. 
        }
        if(canSee(Agua.class))
        {
            eat(Agua.class);
            points =- 1;
            miMundo.contarPuntos(points);
            //Se resta un punto por cada agua comida.
            Greenfoot.playSound("Splash.wav");
            //Se reproduce el sonido por cada agua comida. 
        }
        if(canSee(Ratón.class))
        {
            eat(Ratón.class);
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
