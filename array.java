import java.util.Scanner;
public class array{
    public static void main(String[] args) {
       
        int arr[] = {1, 2, 3, 4, 5, 7} ; //size not fixed
        System.out.println(arr.length); //size of array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
     //datatype array_name[] = new datatype[size];
        int arr1[] = new int[5]; //size fixed;
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;

        // index start - 0
        for (int i = 0; i<=4; i++) {
            System.out.println(arr1[i]);
        }


        double arr2[] = new double[5];

        arr2[0] = 1.5;
        arr2[1] = 2.5;
        arr2[2] = 3.5;
        arr2[3] = 4.5;
        arr2[4] = 5.5;

        for(int i = 0; i<=4; i++){
            System.out.println(arr2[i]);
        }



        //user input array
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[8];
        // taking input from user
        for(int i =0; i< nums.length; i++){
            nums[i] = sc.nextInt();

        }
        // printing user input array
        System.out.println("User input array is :");
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        // we can use for each loop here too
    
    }
}