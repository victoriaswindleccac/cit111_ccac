/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author victoriaswindle
 */
public class MysteryyyDooors {
    public static void main(String[] args) {
        //scanner object 
        Scanner keyboardScanner = new Scanner(System.in);
        // selection and switch (REQUIREMENT #1)
        
        int userSelection;
        
        System.out.println("*MYSTERYYY DOOORSS?!?!?!*");
        System.out.println("* 1 *     * 2 *     | 3 |");
        System.out.println("-----  -----  -----");
        System.out.println("Choose a door to recieve some useless information!");
       
        userSelection = keyboardScanner.nextInt();
        
        switch(userSelection){
            case 1:
                printStatement(); // goes to generate a statement
                break;
            case 2:
                generateLotto(); // goes to generate a number
                break;
            case 3:
                ifElse(); // goes to if / else
                break;
        } 
    } // close main and switch
   
    public static void printStatement(){
        System.out.println("YAY you won a #3 pencil!!");
    } // printStatement
    
    //requirement #2
    // Generates a random number 
    public static void generateLotto(){
        System.out.println("Is this your lucky number??");
        Random r = new Random();
        BigInteger bigInt = new BigInteger(5, r);
        // generates the number and shows text
        System.out.println(bigInt);
        System.out.println("If it is YAY!!!");
        System.out.println("If it is not....well this is awkward!!");
    } // close method regarding Lucky number
    
    //Requirement #3
    public static void ifElse(){
        Scanner input = new Scanner(System.in);
         System.out.println("Yes or No???");
         String a = input.next();
        // if yes.
        if(a.equals("yes")){
            System.out.println("Lets count");
            int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
    System.out.println("YAY! You just wasted 5 seconds by counting to 10!"); 
            
       // ifno
        } else {
            System.out.println("I guess you do not like taking a second risk. You dont win anything");
        }
        
        
    // counter to count to 10 ends
    }
}