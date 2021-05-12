/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.*;
/**
 *
 * @author k_zeb
 */
public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int option;
        do{System.out.println("Option 1 = Perimeter of rectangle");
        System.out.println("Option 2 = Area of rectangle");
        System.out.println("Option 3 = Perimeter of circle");
        System.out.println("Option 4 = Area of circle");
        System.out.println("Option 5 = Close");
        option=in.nextInt();
        if(option == 1){System.out.println("What's the length of the rectangle?");
        double length = in.nextDouble();
        System.out.println("What's the width of the rectangle?");
        double width = in.nextDouble();
        System.out.println("The preimeter of the rectangle is " + width * 2 + length * 2);
        } else if (option == 2){System.out.println("What's the length of the rectangle?");
        double length = in.nextDouble();
        System.out.println("What's the width of the rectangle?");
        double width = in.nextDouble();
        System.out.println("The area of the rectangle is " + width * length);
          } else if (option == 3){System.out.println("What's the radius of the circle?");
        double radius = in.nextDouble();
        System.out.println("The perimeter of the circle is " + radius * Math.PI * 2);
          } else if (option == 4){System.out.println("What's the radius of the circle?");
        double radius = in.nextDouble();
        System.out.println("The area of the circle is " + radius * Math.PI * radius);
        }
        }while(option!= 5);
        in.close();
        }
        

    }
    

