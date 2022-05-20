import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Worlds here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worlds extends World
{
    private int money = 10;
    private int labelX = 60;
    private int labelY = 40;
    private int level = 1;
    private boolean levelUp = false;
    public Worlds(int num, int num2, int num3)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(num, num2, num3); 
    }
    public Worlds(int num, int num2, int num3, boolean bool)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(num, num2, num3, bool); 
    }
    public void updateMoney(int value){
        money +=value;
    }
    public int getMoney(){
        return money;
    }
    public int getLabelX(){
        return labelX;
    }
    public int getLabelY(){
        return labelY;
    }
    public int getLevel(){
        return level;
    }
    public void addLevel(int num){
        level+=num;
    }
    public void setLevelUp(boolean bool){
        levelUp = bool;
    }
    public boolean getLevelUp(){
        return levelUp;
    }
}
