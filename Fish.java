import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Food
{
    private double nutrients = 2.7;
    public Fish(){
        
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
