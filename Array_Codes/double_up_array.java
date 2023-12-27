package Array_Codes;

public class double_up_array {
    public static void double_up(int arr[]){
        for(int i = 0; i< arr.length; i++){
            arr[i] = arr[i] * 2;
        }
    }
    public static void main(String args[]) {
        int arr[] = {99, 98, 100};
        double_up(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
