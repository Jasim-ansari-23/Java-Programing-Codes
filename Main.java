import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(9);
        list.add(6);
        list.add(4);
        list.add(12);
        list.add(7);

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int i = 0; i<list.size(); i++){
            max = Math.max(max, list.get(i));
            min = Math.min(max, list.get(i));
        }

        System.out.println("The maximum number is: "+max);
        System.out.println("The minimum number is: "+min);
    }
}