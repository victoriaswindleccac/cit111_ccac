/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadtrip;

import java.util.Scanner; 
/**
 *
 * @author victoriaswindle
 */
public class RoadTrip {
    public static void main(String args[]){
        
        //variables list
        double gasLeft; 
        double milesLeft;
        int mpg;
        double calculation;
        double left;
        double gleft;
        double Milespergallon;
        
        //create scanner
        Scanner userInputScanner = new Scanner(System.in);
        
        //prompt user
        System.out.println("What is the miles per gallon ratio for your vehicle?");
        
        //read user input
        mpg = userInputScanner.nextInt();
                
        //prompt user on remaining gallons
        System.out.println();
        System.out.println("How many gallons of gas remain in your car?");
       
        //read user input
        gasLeft = userInputScanner.nextDouble();
        
        //prompt user on remaining miles
        System.out.println();
        System.out.println("How many miles to the next service station?");
        
        //read user input
        milesLeft = userInputScanner.nextDouble();
        
        //calculate remaining miles car can travel
        calculation = gasLeft * mpg; 
        
        //check if calculation is less than remaining distance to travel
        if(calculation >= milesLeft){
            System.out.println("You will successfully make it to the next gas station!");
            left = calculation - milesLeft;
            System.out.println();
            System.out.println("There will be " + left + " miles remaining after reaching destination.");
        } else {
            System.out.println();
            System.out.println("Oh no! You will not make it to the next gas station.");
            System.out.println();
            System.out.println("You can travel a total of: " + calculation + " miles before running out of fuel.");
            System.out.println();
            
            //calc necessary gas 
            gleft = milesLeft / mpg;
            System.out.println(gleft + " gallons of gas is necessary to make it to the next service station.");
            System.out.println();
            
            Milespergallon = milesLeft / gasLeft;
            System.out.println("A Miles per gallon rating of: " + Milespergallon + " is needed to reach destination.");
            
        }
        
        
    } //close main method
    
} //close class 