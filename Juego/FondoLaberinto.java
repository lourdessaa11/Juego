import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Lourdes Saavedra 
 * @version 1
 */
public class FondoLaberinto extends World
{

    /**
     * Crea el mundo para el laberinto.
     * 
     */
    public FondoLaberinto()
    {    
        // Crea el mundo con 600x480 cells donde el tamaño de una 
        //cell es de 1x1 pixeles.
        super(600, 480, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Gato gato = new Gato();
        addObject(gato,27,30);
        gato.setLocation(27,35);
        Ratón ratón = new Ratón();
        addObject(ratón,558,454);
        Piedra piedra1 = new Piedra();
        addObject(piedra1,90,393);
        Piedra piedra2 = new Piedra();
        addObject(piedra2,88,28);
        Piedra piedra3 = new Piedra();
        addObject(piedra3,144,26);
        Piedra piedra4 = new Piedra();
        addObject(piedra4,203,26);
        Piedra piedra5 = new Piedra();
        addObject(piedra5,263,25);
        Piedra piedra6 = new Piedra();
        addObject(piedra6,322,25);
        Piedra piedra7 = new Piedra();
        addObject(piedra7,380,25);
        Piedra piedra8 = new Piedra();
        addObject(piedra8,88,28);
        Piedra piedra9 = new Piedra();
        addObject(piedra9,492,25);
        Piedra piedra10 = new Piedra();
        addObject(piedra10,561,22);
        piedra1.setLocation(374,74);
        Piedra piedra18 = new Piedra();
        addObject(piedra18,560,80);
        Piedra piedra21 = new Piedra();
        addObject(piedra21,87,128);
        Piedra piedra23 = new Piedra();
        addObject(piedra23,207,129);
        Piedra piedra24 = new Piedra();
        addObject(piedra24,266,129);
        Piedra piedra25 = new Piedra();
        addObject(piedra25,321,133);
        Piedra piedra26 = new Piedra();
        addObject(piedra26,387,131);
        Piedra piedra28 = new Piedra();
        addObject(piedra28,503,125);
        Piedra piedra29 = new Piedra();
        addObject(piedra29,561,129);
        Piedra piedra31 = new Piedra();
        addObject(piedra31,86,181);
        Piedra piedra33 = new Piedra();
        addObject(piedra33,205,181);
        Piedra piedra34 = new Piedra();
        addObject(piedra34,266,180);
        Piedra piedra35 = new Piedra();
        addObject(piedra35,322,181);
        Piedra piedra38 = new Piedra();
        addObject(piedra38,502,180);
        Piedra piedra39 = new Piedra();
        addObject(piedra39,565,182);
        Piedra piedra41 = new Piedra();
        addObject(piedra41,87,233);
        Piedra piedra46 = new Piedra();
        addObject(piedra46,377,231);
        Piedra piedra48 = new Piedra();
        addObject(piedra48,500,231);
        Piedra piedra49 = new Piedra();
        addObject(piedra49,564,231);
        Piedra piedra51 = new Piedra();
        addObject(piedra51,85,289);
        Piedra piedra52 = new Piedra();
        addObject(piedra52,147,285);
        Piedra piedra53 = new Piedra();
        addObject(piedra53,203,287);
        Piedra piedra54 = new Piedra();
        addObject(piedra54,262,285);
        Piedra piedra56 = new Piedra();
        addObject(piedra56,377,283);
        Piedra piedra58 = new Piedra();
        addObject(piedra58,501,285);
        Piedra piedra59 = new Piedra();
        addObject(piedra59,568,284);
        Piedra piedra63 = new Piedra();
        addObject(piedra63,207,346);
        Piedra piedra64 = new Piedra();
        addObject(piedra64,264,343);
        Piedra piedra66 = new Piedra();
        addObject(piedra66,377,341);
        Piedra piedra68 = new Piedra();
        addObject(piedra68,502,342);
        Piedra piedra69 = new Piedra();
        addObject(piedra69,567,340);
        Piedra piedra70 = new Piedra();
        addObject(piedra70,32,396);
        Piedra piedra71 = new Piedra();
        addObject(piedra71,81,397);
        Piedra piedra74 = new Piedra();
        addObject(piedra74,257,395);
        Piedra piedra79 = new Piedra();
        addObject(piedra79,563,388);
        Piedra piedra80 = new Piedra();
        addObject(piedra80,32,447);
        Piedra piedra81 = new Piedra();
        addObject(piedra81,83,448);
        Piedra piedra83 = new Piedra();
        addObject(piedra83,201,448);
        Piedra piedra84 = new Piedra();
        addObject(piedra84,262,447);
        Piedra piedra85 = new Piedra();
        addObject(piedra85,314,446);
        Piedra piedra86 = new Piedra();
        addObject(piedra86,387,444);
        Piedra piedra87 = new Piedra();
        addObject(piedra87,453,446);
        ratón.setLocation(568,449);
        piedra87.setLocation(441,440);
        piedra26.setLocation(373,124);
        piedra87.setLocation(444,440);
        piedra86.setLocation(383,438);
        piedra87.setLocation(430,440);
        piedra85.setLocation(323,451);
        piedra74.setLocation(261,399);
        piedra71.setLocation(80,394);
        piedra70.setLocation(36,394);
        ratón.setLocation(560,444);
        piedra79.setLocation(570,378);
        piedra79.setLocation(571,392);
        piedra80.setLocation(37,448);
        piedra41.setLocation(84,228);
        piedra41.setLocation(84,228);
        piedra56.setLocation(308,334);
        piedra35.setLocation(181,320);
        piedra35.setLocation(280,254);
        piedra35.setLocation(139,294);
        piedra26.setLocation(371,126);
        piedra71.setLocation(90,393);
        piedra81.setLocation(91,445);
        piedra56.setLocation(326,342);
        piedra86.setLocation(389,448);
        piedra87.setLocation(428,455);
        piedra87.setLocation(456,445);
        piedra46.setLocation(367,239);
        Piedra piedra89 = new Piedra();
        addObject(piedra89,327,234);
        piedra89.setLocation(319,230);
        piedra54.setLocation(365,280);
        piedra53.setLocation(318,288);
        piedra54.setLocation(373,281);
        piedra54.setLocation(368,281);
        Piedra piedra90 = new Piedra();
        addObject(piedra90,435,23);
        piedra25.setLocation(371,183);
        piedra53.setLocation(253,284);
        piedra53.setLocation(207,227);
        piedra89.setLocation(205,286);
        piedra56.setLocation(310,344);
        piedra56.setLocation(321,341);
        piedra54.setLocation(498,75);
        piedra35.setLocation(262,229);
        Pez pez = new Pez();
        addObject(pez,203,411);
        Pez pez2 = new Pez();
        addObject(pez2,240,304);
        Pez pez3 = new Pez();
        addObject(pez3,118,244);
        Pez pez4 = new Pez();
        addObject(pez4,467,68);
        Agua agua = new Agua();
        addObject(agua,156,250);
        Agua agua2 = new Agua();
        addObject(agua2,441,62);
        Agua agua3 = new Agua();
        addObject(agua3,178,408);
        Agua agua4 = new Agua();
        addObject(agua4,249,266);
        pez3.setLocation(123,250);
        pez2.setLocation(245,300);
        agua3.setLocation(214,384);
        agua2.setLocation(428,68);
        pez4.setLocation(460,61);
    }
}
