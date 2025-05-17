package org.example;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.println("(1) Further Substring Fun");
        System.out.println("(2) Run of Integers");
        System.out.println("(3) Sum of a Range of Sequential Integers");
        System.out.println("(4) Repeatedly Echo a Word");
        System.out.println("(5) Words Separated by Dots");
        System.out.println("(6) Adding up Integers");
        System.out.println("(7) Shipping Cost Calculator");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(input.nextLine());

        switch(choice){
            case 1:
                System.out.print("Enter a string:\n");
                String originalString = input.nextLine();
                System.out.print("Enter beginning index: ");
                int startIndex = Integer.parseInt(input.nextLine());
                System.out.print("Enter ending index: ");
                int endIndex = Integer.parseInt(input.nextLine());
                String newString = originalString.substring(startIndex,endIndex);
                System.out.println("\nOriginal string:");
                System.out.println(originalString);
                System.out.println("\nSubstring:");
                System.out.println(newString);
                break;

            case 2:
                System.out.print("Enter Start:\n");
                int start = Integer.parseInt(input.nextLine());
                System.out.print("Enter End:\n");
                int end = Integer.parseInt(input.nextLine());
                for(int i=start;i<=end;i++){
                    System.out.println(i);
                }
                break;

            case 3:
                System.out.print("Enter low:\n");
                int low = Integer.parseInt(input.nextLine());
                System.out.print("Enter high:\n");
                int high = Integer.parseInt(input.nextLine());
                int sumHigh = (high*(high+1))/2;
                int sumLow = ((low-1)*low)/2;
                int rangeSum = sumHigh-sumLow;
                System.out.println("Sum = "+rangeSum);
                break;

            case 4:
                System.out.print("Enter a word:\n");
                String word = input.nextLine();
                int times = word.length();
                for(int i=0;i<times;i++){
                    System.out.println(word);
                }
                break;

            case 5:
                System.out.print("Enter first word:\n");
                String firstWord = input.nextLine();
                System.out.print("Enter second word:\n");
                String secondWord = input.nextLine();
                int dotCount = 30-firstWord.length()-secondWord.length();
                System.out.print(firstWord);
                for(int i=0;i<dotCount;i++){
                    System.out.print(".");
                }
                System.out.println(secondWord);
                break;

            case 6:
                System.out.print("How many integers will be added:\n");
                int count = Integer.parseInt(input.nextLine());
                int total = 0;
                for(int i=0;i<count;i++){
                    System.out.print("Enter an integer:\n");
                    int number = Integer.parseInt(input.nextLine());
                    total+=number;
                }
                System.out.println("The sum is "+total);
                break;

            case 7:
                while(true){
                    System.out.print("Weight of Order:\n");
                    double weight = Double.parseDouble(input.nextLine());
                    if(weight<=0){
                        System.out.println("\nbye");
                        break;
                    }
                    double cost = 3.00;
                    if(weight>10){
                        cost+=(weight-10)*0.25;
                    }
                    System.out.printf("Shipping Cost: $%.2f\n\n",cost);
                }
                break;

            default:
                System.out.println("Invalid choice");
        }

        input.close();
    }
}