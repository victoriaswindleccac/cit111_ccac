/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;
import  java.util.Scanner;
/**
 *
 * @author victoriaswindle
 */
public class Quiz {

 public static void main(String[] args){
        
          //Program Strings
        String Title = "--- Math Quiz ---";
        String Question = "what is 2 + 2 + 6 / 3??";
        String Correct = "That's correct!";
        String TooLow = "That's too low... Remember your Order of Operations!";
        String TooHigh = "That's too high! Don't answer too fast!";
        String TryAgain = "Try Again!";
        String Failure = "The answer is ";
        String Explanation = "Divide 3 into 6 to get 2 then add all the twos' together";
        String Thanks = "Thanks for trying!";
        
        //Integers
        int Answer = 6;
        int AttemptCounter = 0;
        int UserAnswer;
        
        // Scanner for user input
        Scanner AnswerScanner = new Scanner(System.in);
        
        // First output; nothing exciting
        System.out.println(Title);
        
        //While-loop begins; it will end if the user fails three times,
        //or if the loop is broken.
        while(AttemptCounter < 3){
        
        //User is questioned, and their input is sent through.
        System.out.println(Question);
        UserAnswer = AnswerScanner.nextInt();
        
        //For a high answer; the user is told that their answer is too high and some humor is involved,
        //and the Attempt Counter is incremented by one so they can still guess the corrected answer.
        if(UserAnswer > Answer){
        System.out.println(TooHigh);
        
        //If they can still give another answer the program will let them, 
        //the user is also asked to try again if they got it wrong.
        if (AttemptCounter < 2){
        System.out.println(TryAgain);
        }
     
        AttemptCounter = AttemptCounter + 1;
        }
        
        //For a low Answer; the user is told that their answer is too low qnd yet again, some humor is involved to make it fun!,
        //aand the Attempt Counter is incremented by one, so they can guess yet again if they didnt get it right already.
        else if(UserAnswer < Answer){
        System.out.println(TooLow);
        
        //If they can still give  another answer, 
        //the user is asked to try again.
        if (AttemptCounter < 2){
        System.out.println(TryAgain);
        }
        
        AttemptCounter = AttemptCounter + 1;
        }
        
        //For a correct answer, the user is congratulated 
        //and the while-loop is broken.
        else if(UserAnswer == Answer){
        System.out.println(Correct);
        break;
        }
        
        //If the user has failed three times, 
        //the user is informed of the correct answer as the loop ends.
        if(AttemptCounter >= 3){
        System.out.println(Failure + Answer);
        }
    }
        //However the loop may end, the answer is explained,
        //and the user is thanked for playing math trivia.
        System.out.println(Explanation + Answer);
        System.out.println(Thanks);
    }
}