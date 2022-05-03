import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Food
{
    public Turtle(){
        super();
    }
    public void act()
    {
        super.moveAround();
        super.eaten();
    }
}
