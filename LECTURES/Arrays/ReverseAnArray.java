package LECTURES.Arrays;

public class ReverseAnArray {
    public static void reverseAnArray(int arr[]){
        int start = 0, end = arr.length-1;
        while(start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,7,2,9,11,1};
        reverseAnArray(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
}
