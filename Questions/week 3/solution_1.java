import java.util.Arrays;

public class solution_1 {
         int arr[] = new int[]{1,2,3,4};
         public static void rotate(int arr[], int n){
            int temp = arr[n-1];
            for (int i = n-1; i > 0; i--){
                 arr[i] = arr[i-1];
            }
            arr[0] = temp;
        }
        public static void main(String[] args){
            int arr[] = new int[]{5,15,25,35,45,55};
            int n=arr.length;
            rotate(arr,n);
            System.out.println(Arrays.toString(arr));
        }
}