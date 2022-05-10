import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class myWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class myWorld.
     * 
     */
    public static double weight = 10.0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Seal seal = new Seal();
        addObject(seal,197,202);
        seal.setLocation(191,213);
        seal.setLocation(69,290);
        Food food = new Food();
        addObject(food, 0, 0);
    }
    public void act(){
        weight = ((int)(weight*10))/10.0;
        showText("Weight: " + weight, 50, 25);
    }
}
