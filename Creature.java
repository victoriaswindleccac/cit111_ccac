/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creature;

/**
 *
 * @author victoriaswindle
 */
public class Creature {
     // public variables
    public String name;
    public String species;

    // private variable
    private int biteSizeInPercent;
    public int donutSize;
    
   
    public void eatDonut(SizedDonut donutChloe, SizedDonut donutRolando) {
        if(donutChloe.sizeInmm > donutSize) {
        System.out.println("Creature.eatDonut | SizedDOnut is too small");
    } else {
            System.out.println("Creature.eatDonut | Eating " 
                + biteSizeInPercent + "% of " + donutChloe.name);
        donutChloe.simulateEating(biteSizeInPercent);
        } // close if/else
    
    if(donutRolando.sizeInmm < donutSize) {
        System.out.println("Creature.eatDonut | Eating " 
                + biteSizeInPercent + "% of " + donutRolando.name);
    } else {
        System.out.println("Creature.eatDonut | Rolando is too small");
    } // close if/else
    System.out.println("SizedDonut.SimulateEating | Perc Rem:" 
            + biteSizeInPercent);
} 
   
    public int getBiteSizeInPercent() {
        return biteSizeInPercent;
    }
    public void setBiteSizeInPercent(int sizeToSet) 
    {
        if(sizeToSet > 0){
            this.biteSizeInPercent = sizeToSet;
        } else 
        {
            System.out.println("No negatives V!");
        } // close if/else
    } 
    
    public void setMinDonutSizeInmm(int donutSizeToSet){
        if(donutSizeToSet > 45){
            this.donutSize = donutSizeToSet;
            System.out.println("Right size!");
        } else {
            System.out.println("Too small!");
        } // close if/else
    } 
    
    public void getMinDonutSizeInmm(){
        System.out.println("The food must be at least " + donutSize + "mm");
    } 
    
} 