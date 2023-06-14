package emaildemo;

class emailcreation {
    String name, gmail;
    int pass;

    emailcreation() {
        System.out.println("Please create your account");
    }

    emailcreation(String x) {
        System.out.println("Account not create");
    }

    emailcreation(String y, String z) {
        System.out.println("Your account create");
    }

    emailcreation(String x, String y, String z) {
        System.out.println("Account create Successfully");
    }
}
public class EmailDemo {

    public static void main(String[] args) {
        emailcreation obj1 = new emailcreation();
        emailcreation obj2 = new emailcreation("Munni");
        emailcreation obj3 = new emailcreation("tanzilaaktermunni13@gmail.com", "pass");
        emailcreation obj4 = new emailcreation("name", "tanzilaaktermunni13@gmail.com", "pass");
        }
         }