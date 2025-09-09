class BankingApplication{
public static void withdrawMoney(long cardNo)
{

System.out.println("Money Withdrawn using card: "+cardNo);
}
public static void withdrawMoney(String username){

System.out.println("Money Withdrawn using Username: "+username);
}
public static void withdrawMoney(String username,long aadhaarCardNo){
System.out.println("Money Withdrawn using Username: "+username+"\n and Aadhaar Card: "+aadhaarCardNo);
}

}
class Bank{
public static void main(String []args){
BankingApplication.withdrawMoney(85445555545L);

}
}