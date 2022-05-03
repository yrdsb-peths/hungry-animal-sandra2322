import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Food extends Actor
{
    private static int numFood;
    public Food(){
        numFood++;
    }
    public void act()
    {
        spawn();
    }
    public void moveAround(){
        move(1);
        if(Greenfoot.getRandomNumber(100)<10){
            turn(Greenfoot.getRandomNumber(90)-45);
        }
        if(getX()<=5 ||getX() >=getWorld().getWidth()-5){
            turn(180);
        }
        if(getY()<=5||getY()>=getWorld().getHeight()-5){
            turn(180);
        }
    }
    public void spawn(){
        if(numFood <10 && Greenfoot.getRandomNumber(100)<10){
            int x = Greenfoot.getRandomNumber(400);
            int y = Greenfoot.getRandomNumber(300);
            if(Greenfoot.getRandomNumber(2)<1   ){
                getWorld().addObject(new Fish(), x, y);
            }else{
                getWorld().addObject(new Turtle(), x, y);
            }
        }
    }
    
    public void eaten(){
        if(isTouching(Seal.class)){
            getWorld().removeObject(this);
            numFood--;
            if(Seal.size<80){
                Seal.size+=2;
            }
        }
    }
}
