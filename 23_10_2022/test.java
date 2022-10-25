import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        

        int number[] = {1000, 900,500, 400, 100, 90, 50, 40, 10, 9, 5,4, 1};
        String roms[]  = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        Scanner sc = new Scanner(System.in);
        System.err.println("Enter any integer that u want to convert to roman: ");
        int input = sc.nextInt();
        int num =input;
        
      String ans = "";
        for(int i=0; input>0; i++){
            while(input >= number[i]){
              ans = ans + roms[i];
              input -= number[i];
            }
        }

        System.err.println("The roman number for " + num + " is: " + ans);
    }
}