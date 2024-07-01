1. Removing Duplicates using LinkedHashSet is used to remove duplicates while maintaining the order of elements.
2) Using split method without size of an array and then removing duplicates using LinkedHashSet<>() method
3)Removing Duplicates and sorting in Ascending Order Using treeSet<>() method
4) Removing Duplicates and sorting in Descending Order Using treeSet<>(Comparator.reverseOrder()) method

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
3)Removing Duplicates and sorting in Ascending Order Using treeSet<>() method

                        import java.util.Arrays;
                        import java.util.Scanner;
                        import java.util.TreeSet;
                        
                        public class RemoveDuplicates {
                            public static void main(String[] args) {
                                Scanner scanner = new Scanner(System.in);
                        
                                System.out.println("Enter the number of elements in the array:");
                                int n = scanner.nextInt();
                        
                                Integer[] arr = new Integer[n];
                                System.out.println("Enter the elements of the array:");
                        
                                for (int i = 0; i < n; i++) {
                                    arr[i] = scanner.nextInt();
                                }
                        
                                // Create a TreeSet and add each element from the array
                                TreeSet<Integer> set = new TreeSet<>();
                                for (int element : arr) {
                                    set.add(element);
                                }
                        
                                // Convert the TreeSet back to an array
                                Integer[] result = set.toArray(new Integer[set.size()]);
                        
                                System.out.println("Array after removing duplicates and sorting in ascending order:");
                                System.out.println(Arrays.toString(result));
                            }
                        }

OUTPUT :
                        Enter the number of elements in the array:
                        5
                        Enter the elements of the array:
                        8 8 5 3 2
                        Array after removing duplicates and sorting in ascending order:
                        [2, 3, 5, 8]
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
4) Removing Duplicates and sorting in Descending Order Using treeSet<>(Comparator.reverseOrder()) method

                        import java.util.Arrays;
                        import java.util.Comparator;
                        import java.util.Scanner;
                        import java.util.TreeSet;
                        
                        public class RemoveDuplicates {
                            public static void main(String[] args) {
                                Scanner scanner = new Scanner(System.in);
                        
                                System.out.println("Enter the number of elements in the array:");
                                int n = scanner.nextInt();
                        
                                Integer[] arr = new Integer[n];
                                System.out.println("Enter the elements of the array:");
                        
                                for (int i = 0; i < n; i++) {
                                    arr[i] = scanner.nextInt();
                                }
                        
                                // Create a TreeSet with a custom comparator for descending order
                                TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());
                                set.addAll(Arrays.asList(arr));
                        
                                // Convert the TreeSet back to an array
                                Integer[] result = set.toArray(new Integer[set.size()]);
                        
                                System.out.println("Array after removing duplicates and sorting in descending order:");
                                // Print the result manually
                                for (int element : result) {
                                    System.out.print(element + " ");
                                }
                                System.out.println(); // For a new line at the end
                            }
                        }

OUTPUT :
            
            Enter the number of elements in the array:
            7
            Enter the elements of the array:
            1 1 8 2 1 9 8
            Array after removing duplicates and sorting in descending order:
            9 8 2 1 
