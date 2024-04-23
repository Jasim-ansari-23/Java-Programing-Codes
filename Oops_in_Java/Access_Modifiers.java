package Oops_in_Java;

public class Access_Modifiers {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.name = "Jasim";
        b.acNum = 534648698;
        b.setpassword("utdhdkgh545xrv");
    }
}

class BankAccount {
    public String name;
    public long acNum;
    private String password; //it can't be accessible

    public void setpassword(String pwd){
        password = pwd;
        System.out.println("The password of your UPI num is - " + pwd);
    }
}