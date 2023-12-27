// What will be the output

package Oops_in_Java.Oops_Questions;

public class Oops_Solved_Questions {
    public static void main(String args[]) {
        Test t = new Test();
        t.static_marks(98);
        System.out.println(Test.marks);
    }

    static class Test{
        static int marks;
        void static_marks(int marks){       
            Test.marks = marks;
        }
    }
}
