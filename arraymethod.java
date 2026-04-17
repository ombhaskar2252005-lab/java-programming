import java.util.Arrays;
public class arraymethod {
    public static void printArray(double arr[]){
        for(double ele: arr){
            System.out.println(ele);
        }
    }
    public static void main (String[] args){
        //methods in array
        //1.Sort - changes in original array
        int arr[] = {5,4,3,2,1};
        Arrays.sort(arr);
        for(int ele: arr){
            System.out.println(ele);
        }
        //2.fill - changes in original array
        int arr1[] = new int[5];
        Arrays.fill(arr1, 10);
        for(int ele: arr1){
            System.out.println(ele);
        }
        //3. tostring - returns a string
        int arr2[] = {1,2,3,4,5};
        //"{1,2,3,4,5}"
        String str = Arrays.toString(arr2);
        System.out.println(str);
        //4.copyOf - returns to new array
        int arr3[] = Arrays.copyOf(arr2, arr2.length);
        for(int ele: arr3){
            System.out.println(ele);
        }

        //5.Equals - checks each value of both arrays
        if(Arrays.equals(arr2, arr3)){
            System.out.println("same");
        }
        //6.passing array to method 
        int arr4[] = {1,2,3,4,5};
        double arr5[]= {1.0,2.0,3.0,4.0,5.0};
        printArray(arr5);
    }
}