package Array_Codes;

public class Pair {
    public static void pairs(int arr[]) {
        int totalPairs = 0;

        for (int i = 0; i < arr.length; i++) {
            
            int currentIndex = arr[i]; // 2,4,6,8,10
            for (int j = i + 1; j < arr.length; j++) { // 4,6,8,10
                System.out.print("(" + currentIndex + "," + arr[j] + ")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: " + totalPairs); // 10
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 10 };
        pairs(arr);
    }
}