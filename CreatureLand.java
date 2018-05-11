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
public class CreatureLand {
       public static void main(String[] args) {
        // make a pointer variable
        Creature penguin;
        penguin = new Creature();
        penguin.name = "Pablo";
        penguin.species = "Emperor Penguin";
        penguin.setBiteSizeInPercent(10);
        penguin.setMinDonutSizeInmm(80);
        
        displayCreatureStats(penguin);
        
        Creature penguinn;
        penguinn = new Creature();
        penguinn.name = "Chloe";
        penguinn.setBiteSizeInPercent(10);
        penguinn.setMinDonutSizeInmm(80);
        
        displayCreatureStatss(penguinn);
        
        Creature penguinnn;
        penguinnn = new Creature();
        penguinnn.name = "Rolando";
        penguinnn.setBiteSizeInPercent(10);
        penguinnn.setMinDonutSizeInmm(80);
        
        displayCreatureStatss(penguinnn);
        
        
        SizedDonut donutChloe = new SizedDonut();
        donutChloe.name = "Chloe";
        donutChloe.sizeInmm = 66;
        
        
        SizedDonut donutRolando = new SizedDonut();
        donutRolando.name = "Rolando";
        donutRolando.sizeInmm = 123;
        
        penguin.eatDonut(donutChloe, donutRolando);
        
        displaySizedDonutStats(donutChloe);
        displayDonutRolandoStats(donutRolando);
  
    
       }
       public static void displayCreatureStatsss(Creature penguinnn){
        System.out.println("***Creature Stats***");
        System.out.println("Name: " + penguinnn.name);
        System.out.println("Size: 123mm");
        System.out.println("Percent Remaining: 100% ");
        System.out.println("********************");
        
        
       }
       {
           
       }
       
       public static void displayCreatureStatss(Creature penguinn){
        System.out.println("***Creature Stats***");
        System.out.println("Name: " + penguinn.name);
        System.out.println("Size: 66mm");
        System.out.println("Percent Remaining: 100% ");
        System.out.println("********************");
        
        
       }
       {
           
       }
    public static void displayCreatureStats(Creature penguin){
        System.out.println("***Creature Stats***");
        System.out.println("Name: " + penguin.name);
        System.out.println("Species: " + penguin.species);
        System.out.println("Bite Size: " + penguin.getBiteSizeInPercent()
                + "% of a SizedDonut");
        System.out.println("Min SizedDonut size: " + penguin.donutSize + "mm");
        System.out.println("********************");
        
    }// close 
    {
        
    }
    public static void displaySizedDonutStats(SizedDonut donutChloe) {
        System.out.println("***SizedDonut Stats***");
        System.out.println("Name: " + donutChloe.name);
        System.out.println("Size: " + donutChloe.sizeInmm + "mm");
        System.out.println("Percent Remaining: " + donutChloe.getPercRemaining() + "%");
        System.out.println("********************");
    } //close method
    
    public static void displayDonutRolandoStats(SizedDonut donutRolando) {
        System.out.println("***SizedDonut Stats***");
        System.out.println("Name: " + donutRolando.name);
        System.out.println("Size: " + donutRolando.sizeInmm + "mm");
        System.out.println("Percent Remaining: " + donutRolando.getPercRemaining() + "%");
        System.out.println("********************");
   
}
    } // close method
    