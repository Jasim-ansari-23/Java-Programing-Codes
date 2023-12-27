
import java.util.*;

public class Check_Bits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int inputValue = scanner.nextInt();

        String binaryRepresentation = Integer.toBinaryString(inputValue);
        System.out.println("Binary representation of " + inputValue + " is: " + binaryRepresentation);
        scanner.close();
    }
}
