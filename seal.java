import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class seal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class seal extends Actor
{
    /**
     * Act - do whatever the seal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 5;
    public void act()
    {
        if(Greenfoot.isKeyDown("w")){
            moveUp();
        }
        if(Greenfoot.isKeyDown("s")){
            moveDown();
        }
    }
    public void moveUp(){
        setLocation(getX(), getY()-speed);
    }
    public void moveDown(){
        setLocation(getX(), getY()+speed);
    }
}
