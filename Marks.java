
package marks;

import java.util.Scanner;
public class Marks {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter Mark:");
       int mark=
       scanner.nextInt();
       if(mark>=80){
           System.out.println("Level 7- Outstanding Achievement");
       }
       else if(mark>=50){
           System.out.println("level4-6 -maritorious Achievemt");
       }
       else if(mark>=30){
           System.out.println("level 2-3 - Needs improvement");
       }
       else {
           System.out.println("Level 1 - Not Achieved");
       }
    }
    
}
