1. Removing Duplicates using LinkedHashSet is used to remove duplicates while maintaining the order of elements.
2) Using split method without size of an array and then removing duplicates


----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1. Removing Duplicates using LinkedHashSet is used to remove duplicates while maintaining the order of elements.

            import java.util.*;
            import java.util.LinkedHashSet;
            import java.util.Arrays;
            
            class Main{
                public static void main(String[] args){
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter N :");
                    Integer n = sc.nextInt();
                    Integer[] arr= new Integer[n];
                    System.out.println("Enter "+  n + " Values");
                    for(int i=0;i<n;i++){
                        arr[i] = sc.nextInt();
                    }
                    System.out.println("After Removing Duplicates");
                    LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
                    Integer[] result = set.toArray(new Integer[set.size()]);
                    
                    System.out.println(Arrays.toString(result));
                }
            }

OUTPUT :
              Enter N :
              5
              Enter 5 Values
              7 3 7 3 5
              After Removing Duplicates
              [7, 3, 5]
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
2) Using split method without size of an array and then removing duplicates

            import java.util.Arrays;
            import java.util.LinkedHashSet;
            import java.util.Scanner;
            
            public class RemoveDuplicates {
                public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
            
                    System.out.println("Enter the elements of the array separated by spaces:");
                    String input = scanner.nextLine();
            
                    // Split the input string by spaces to get individual elements
                    String[] inputArray = input.split(" ");
                    Integer[] arr = new Integer[inputArray.length];
            
                    for (int i = 0; i < inputArray.length; i++) {
                        arr[i] = Integer.parseInt(inputArray[i]);
                    }
            
                    // Use LinkedHashSet to remove duplicates while maintaining insertion order
                    LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
                    Integer[] result = set.toArray(new Integer[set.size()]);
            
                    System.out.println("Array after removing duplicates:");
                    System.out.println(Arrays.toString(result));
                }
            }


OUTPUT :
            Enter the elements of the array separated by spaces:
            7 1 1 8 2 1 9 8
            Array after removing duplicates:
            [7, 1, 8, 2, 9]

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
