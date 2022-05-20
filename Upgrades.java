import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Upgrades here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Upgrades extends Button
{
    private int upgradeLevel;
    public Upgrades(String name, int cost){
        super(name, cost, 400, 70);
    }
    public void buy(){
        super.buy();
        upgradeLevel++;
        updateCost(getCost()+10);
    }
    public int getUpgradeLevel(){
        return upgradeLevel;
    }
}
