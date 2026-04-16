import java.util.Scanner;
public class twoDarray {
  public static void main(String[] args){
    int arr[][] = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12}
    };
    for(int i = 0; i<4; i++){
        System.out.println(arr[1][i]);
    }
    System.out.println(arr.length); // no of rows
    System.out.println(arr[0].length); // no of columns
    int fixed [][] = new int[2][2];
    Scanner sc = new Scanner (System.in);
    for (int r = 0; r<fixed.length; r++){
        for(int c = 0; c<fixed[0].length; c++){
            fixed[r][c] = sc.nextInt();
        } 
    }
    for (int r = 0; r<fixed.length; r++){
        for(int c = 0; c<fixed[0].length; c++){
            System.out.print(fixed[r][c] + " ");
        }
        System.out.println(" ");
    }
    // jagged array
    int jagged[][] = {
        {1,2,3},
        {4,5,6,7},
        {8,9}
    };
    for (int r = 0; r<jagged.length; r++){
        for(int c = 0; c<jagged[r].length; c++){
            System.out.print(jagged[r][c] + " ");
        }
        System.out.println(" ");
    }
    int marks[][] = {
        {10, 20, 30},
        {40, 50 },
        {60, 70, 80, 90 }
    };
    int sum = 0;
    int max = marks[0][0];
    for(int r = 0; r<marks.length; r++){
        for(int c = 0; c<marks[r].length; c++){
            sum = sum + marks[r][c];
            if(marks[r][c] > max){
                max = marks[r][c];
            }
        }
    }
    System.out.println("Sum: " + sum);
    System.out.println("Max: " + max);
  }
    
}
