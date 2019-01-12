/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicerollingsimulator;
import  java.util.Scanner;
/**
 *
 * @author Balqees
 */
public class DiceRollingSimulator {

    /**
     * @param args the command line arguments
     */
    static int get_random(int min, int max){
        return (int)((Math.random()*((max-min)+1))+min);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        int min = 1;
        int max = 6;
        int rand = get_random(min, max);
        System.out.println("A randomly generated  number is "+rand + " for average dice [1-6]");
        int try_again = 0;
        System.out.println(" would you like to try again ? \"1 for yes, 0 for No\" ");
        try_again = reader.nextInt();
        
        while(try_again == 1){
            System.out.println("Enter the min an the max values you need the dice to produce: ");
            System.out.println("min: ");
            min = reader.nextInt();
            System.out.println("max: ");
            max = reader.nextInt();
            rand = get_random(min, max);
            System.out.println("A randomly generated  number is : "+rand);
            System.out.println(" would you like to try again ? \"1 for yes, 0 for No\" ");
            try_again = reader.nextInt();
        }
            
        System.out.println("program  ends");
    }
    
}
