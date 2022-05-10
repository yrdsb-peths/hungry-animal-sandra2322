    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class seal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Seal extends Actor
{
    /**
     * Act - do whatever the seal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 5;
    private static int size = 60;
    private int limit = 200;
    
    public Seal(){
        GreenfootImage image = getImage();
        image.scale(size, size);
        setImage(image);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("w")){
            moveUp();
        }
        if(Greenfoot.isKeyDown("s")){
            moveDown();
        }
        if(Greenfoot.isKeyDown("a")){
            moveLeft();
        }
        if(Greenfoot.isKeyDown("d")){
            moveRight();
        }
    }
    public void moveUp(){
        setLocation(getX(), getY()-speed);
    }
    public void moveDown(){
        setLocation(getX(), getY()+speed);
    }
    public void moveRight(){
        setLocation(getX()+speed, getY());
    }
    public void moveLeft(){
        setLocation(getX()-speed, getY());
    }
    public void grow(int number){
        if(canGrow()){
            size+=number;
            GreenfootImage image = new GreenfootImage("seal.png");
            image.scale(size, size);
            setImage(image);
        }
    }
    public static void sizeIncrease(int num){
        size +=num;
    }
    public static int getSize(){
        return size;
    }
    public boolean canGrow(){
        return size<limit;
    }
}
