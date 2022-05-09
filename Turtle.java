import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Food
{
    private double nutrients = 1.6;
    public Turtle(){
        
    }
    public void act()
    {
        super.moveAround();
        if(super.canEat()){
            getWorld().removeObject(this);
            super.addFood(-1);
            MyWorld.weight +=nutrients;
            if(Seal.getSize()<80){
                Seal.sizeIncrease(5);
            }
        }
    }
}
