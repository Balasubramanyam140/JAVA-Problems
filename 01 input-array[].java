1 : COnvertint String to String[]


  ----------------------------------------------------------------------------------------------
2 : COnvertint String to String[] 
import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] inputArr = a.split(" ");
        System.out.println(Arrays.toString(inputArr));
        for(String  i:inputArr){
            System.out.print(i+" ");
        }
    }
}

INPUT :
        7 82 3 492  s s d d
OUTPUT :
        
        [7, 82, 3, 492, s, s, d, d]
         7 82 3 492 s s d d 
  ----------------------------------------------------------------------------------------------
