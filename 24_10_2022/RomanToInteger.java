import java.util.Scanner;

public class RomanToInteger {
    
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a roman number:");
    String input = sc.nextLine();
    input = input.toUpperCase();

    int N= input.length();
    int arr[] = new int[N];
    

  for(int i=0; i<N; i++){
  
  
    switch (input.charAt(i)) {
        case 'I':
          arr[i] = 1;
         break;

         case 'V' :
            arr[i] =5;
             break;
            
        
              case 'X' :
                arr[i] = 10;
                break;
                   
                case 'L':
                arr[i] = 50;
                break;

                    case 'C' :
                    arr[i] = 100;
                    break;
          
                        case 'D':
                        arr[i] =500 ;
                         break;
                           
                            case 'M':
                            arr[i] = 1000;
                            break;
                            

        default:
            break;
    }



}
int number =0;
for(int i=0; i<N-1; i++){
  if(arr[i] > arr[i+1]){
    number += arr[i];
  }
  else  if(arr[i] < arr[i+1]) number = number - arr[i];
}

number += arr[N-1];
System.err.println(number);
}

}
