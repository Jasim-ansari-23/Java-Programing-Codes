package Array_Codes;

public class Pair {
    public static void getPair(int num[]) {
        for (int i = 0; i < num.length; i++) {
            int currentIndex = num[i];
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + currentIndex + "," + num[j] + ") ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int num[] = {2, 4, 6, 8, 10};
        getPair(num);
    }
}