/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ctofconverter;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class CtoFConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double temperature;
        double farhenheit;
        double celsius;
        boolean done = false;
        
        System.out.println("Is the termperature in Farenhiet(1) or Celcius(2)");
        temperature= in.nextDouble();
        
        if ((temperature) == 1)
        {
            
            do
            {
                System.out.println("What is the temperature in Farenhiet?");
                if (in.hasNextDouble())
                {
                    farhenheit = in.nextDouble();
                    if ((farhenheit) == 32)
                    {
                        System.out.println("That's the freezing point of water!");
                    }
                    else if ((farhenheit) == 212)
                    {
                        System.out.println("That's the boiling point of water!"); 
                    }
                    celsius = farhenheit - 32;
                    celsius = celsius * 5/9;
                    System.out.println("The temperature in Celsius is: " + celsius);
                }
                 else 
                {
                    System.out.println("That is not a valid input!");
                }
            }while (done);    
        }
        else if ((temperature) == 2)
        {
             do 
            {
                System.out.println("What is the temperature in Celcius?");

                if (in.hasNextDouble()) 
                {
                    celsius = in.nextDouble();
                    if ((celsius) == 0) 
                    {
                        System.out.println("That is the freezing point of water!");
                    } 
                    else if ((celsius) == 100) 
                    {
                        System.out.println("That is the boiling point of water");
                    }
                    farhenheit = celsius * 1.8;
                    farhenheit = farhenheit + 32;
                    System.out.println("The temperature in Farenhiet is: " + farhenheit);
                } 
                else 
                {
                    System.out.println("That is not a valid input!");
                }
            } while (done);
        }
        else
        {
            System.out.println("Invalid input! Please pick 1 or 2!");
        }
           
    }

}
