/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodland;

/**
 *
 * @author victoriaswindle
 */
public class Foodland {
    //list of numaric value for bites
final static int nibble = 5;
final static int hungry = 35;
final static int almostgone = 75;

    public static void main(String[] args){
     IceCream Vanilla = new IceCream();
     
  
     Chocolate Cake = new Chocolate();
     
     Oreo Pie = new Oreo();
     
     
     printData(Vanilla, Cake, Pie);
     //relating witch food is related to what bite
        Vanilla.simulatenibble(nibble);
        Cake.simulatehungry(hungry);
        Pie.simulatealmostgone(almostgone);
        
    printData(Vanilla, Cake, Pie);  
        int numberofBites = 2;
        for(int i = 0; i < numberofBites; i++){
            System.out.println("munch munch");
            Cake.simulatehungry(hungry);
            Pie.simulatealmostgone(almostgone);
        }
        
        System.out.println("I Better start hitting the gym");
        System.out.println("I need to stop eating");
        
        printData(Vanilla, Cake, Pie);

    }
    //the end result
    private static void printData(IceCream inputVanilla, Chocolate inputChocolate, Oreo inputOreo){
        System.out.println("|-------STATS--------|");
        System.out.println("|----IceCream STATS----|");
        System.out.println("| Percent Vanilla Remaining: " + inputVanilla.getPercRemaining());
        System.out.println("|----Cake STATS-----|");
        System.out.println("| Percent Cake Remaining: " + inputChocolate.getPercRemaining());
        System.out.println("|----Pie STATS----|");
        System.out.println("| Percent Pie Remaining: " + inputOreo.getPercRemaining());
        System.out.println("|--------------------|");
    }
}