import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Food
{
    public Fish(){
        super();
    }
    public void act()
    {
        super.moveAround();
        super.eaten();
    }
}
