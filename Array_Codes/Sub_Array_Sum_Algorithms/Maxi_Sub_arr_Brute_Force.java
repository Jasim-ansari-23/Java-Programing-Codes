package Array_Codes.Sub_Array_Sum_Algorithms;

public class Maxi_Sub_arr_Brute_Force {
    public static void Max_Sub_Arr(int arr[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int start = i;

            for (int j = i; j < arr.length; j++) {
                int end = j;
                currentSum = 0;

                for (int k = start; k <= end; k++) {
                    currentSum += arr[k];
                }

                System.out.print(currentSum+",");
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
            }
            System.out.println();
        }
        System.out.println("Maximum sum: "+maxSum);
    }

    public static void main(String args[]) {
        int arr[] = { 1,-2,6,-1,3 };
        Max_Sub_Arr(arr);
    }
}
