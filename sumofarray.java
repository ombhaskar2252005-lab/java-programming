public class sumofarray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int sum = 0;
       // for (int i = 0; i< arr.length; i++){
            //sum = sum + arr[i];
       // }
        for(int num : arr){
            sum = sum + num;
        }
        System.out.println("Sum of array elements is: " + sum);
    }
}
