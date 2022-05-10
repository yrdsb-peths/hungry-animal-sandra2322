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
    private Seal seal;
    public Food(Seal seal){
        numFood++;
        this.seal = seal;
    }
    public void act()
    {
        spawn();
    }
    public int getNumFood(){
        return numFood;
    }
    public void addFood(int a){
        numFood+=a;
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
                getWorld().addObject(new Fish(seal), x, y);
            }else{
                getWorld().addObject(new Turtle(seal), x, y);
            }
        }
    }
    public boolean canEat(){
        if(isTouching(Seal.class)){
            return true;
        }
        return false;
    }
    public Seal getSeal(){
        return seal;
    }
}
