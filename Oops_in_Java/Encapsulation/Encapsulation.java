package Oops_in_Java.Encapsulation;

public class Encapsulation {
    public static void main(String[] args){
        Person p = new Person();
        p.setName("Jasim");
        p.setAge(21);
        System.out.println("Name: " + p.getName() + " And Age: "+ p.getAge());
    }

    static class Person{
        private String name;
        private int age;

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

        public int getAge(){
            return age;
        }

        public void setAge(int age){
            this.age = age;
        }
    }
}

// Another example

// public class Another {

//     public static void main(String[] args){
//         Area rectangle = new Area(2, 16);
//         rectangle.getArea();
//     }

//     static class Area{
//         int length, breadth;

//         Area(int length, int breadth){
//             this.length = length;
//             this.breadth = breadth;
//         }

//         void getArea(){
//             int area = length * breadth;
//             System.out.println(area);
//         }
//     }
// }

//Another example 2

// public class Main {

//     public static void main(String[] args){
//         Account ac = new Account();
//         ac.getAccount(744444478);
//         ac.setEmail("mrjasim87@gmail.com");
//         ac.getName("Mohammad Jasim");
//         ac.getAmount(80.000);

//         System.out.println("Email: "+ ac.getEmail());
//         System.out.println("Account number: "+ ac.setAccount());
//         System.out.println("Name: "+ ac.setName());
//         System.out.println("Deposit amount: "+ ac.setAmount());
//     }

//     static class Account{
//         long acc_no;
//         String name;
//         String email;
//         double amount;

//         public long setAccount(){
//             return acc_no;
//         }
//         public void getAccount(long acc_no){
//             this.acc_no = acc_no;}

//         public String setName() {
//             return name;
//         }
//         public void getName(String name){
//             this.name = name;
//         }

//         public String getEmail() {
//             return email;
//         }
//         public void setEmail(String email){
//             this.email = email;
//         }

//         public double setAmount(){
//             return amount;
//         }
//         public void getAmount(double amount){
//             this.amount = amount;
//         }
//     }
//}

// it is mainly used to bind data type and method