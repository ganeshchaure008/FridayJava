import java.util.Scanner;
class BankingApplication {
    public static void withdrawMoney(long cardNo) {
        if(String.valueOf(cardNo).length() >= 12 && String.valueOf(cardNo).length() <= 16) {
            System.out.println("Money Withdrawn using Card: " + cardNo);
        } else{
            System.out.println("Error: Invalid Card Number! Must be 12-16 digits.");
        }
    }

    public static void withdrawMoney(String username) {
        if(username != null && !username.trim().isEmpty()) {
            System.out.println("Money Withdrawn using Username: " + username);
        } else{
            System.out.println("Error: Username cannot be null or empty.");
        }
    }

    public static void withdrawMoney(String username, long aadhaarCardNo) {
        if(username != null && !username.trim().isEmpty() && String.valueOf(aadhaarCardNo).length() == 12) {
            System.out.println("Money Withdrawn using Username: " + username + "\n and Aadhaar Card: " + aadhaarCardNo);
        } else{
            System.out.println("Error: Invalid Username or Aadhaar Number! Aadhaar must be 12 digits.");
        }
    }
}

class Bank{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose withdrawal method:");
        System.out.println("1. Card Number");
        System.out.println("2. Username");
        System.out.println("3. Username + Aadhaar");
        int choice = sc.nextInt();
        sc.nextLine();

        switch(choice){
            case 1:
                System.out.print("Enter Card Number: ");
                long cardNo =sc.nextLong();
                BankingApplication.withdrawMoney(cardNo);
                break;
            case 2:
                System.out.print("Enter Username: ");
                String username= sc.nextLine();
                BankingApplication.withdrawMoney(username);
                break;
            case 3:
                System.out.print("Enter Username: ");
                String uname = sc.nextLine();
                System.out.print("Enter Aadhaar Number: ");
                long aadhaar = sc.nextLong();
                BankingApplication.withdrawMoney(uname, aadhaar);
                break;
            default:
                System.out.println("Invalid choice.");
        }
        sc.close();
    }
}
