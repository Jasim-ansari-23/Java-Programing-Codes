package Leet_Codes_Questions;

public class sort_color {
    public static void sideOnces(int arr[]){
        int left = 0, right = arr.length-1, index = 0;
        while(index <= right){
            if(arr[index] == 0){
                int temp = arr[index];
                arr[index] = arr[left];
                arr[left] = temp;
                index++;
                left++;
            }else if(arr[index] == 2){
                int temp = arr[index];
                arr[index] = arr[right];
                arr[right] = temp;
                right--;
            }else{
                index++;
            }
        }
    }
    
    public static void main(String args[]) {
        int arr[] = {1,0,2,1,0,1,0,2,2};
        sideOnces(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
