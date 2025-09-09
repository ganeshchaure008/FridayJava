
import java.util.Scanner;

public class Pubg{
int playerId;
String playerName;
int kills;
int health=100;
static String gameName="PUBG";
public void attackPlayer(String enemyName,int damage){
health=health-damage;
System.out.println("Health: "+health);


}
public void addKill(){
kills++;

System.out.println("Total Kills: "+kills);


}
public void displayStats(){

System.out.println("Player ID: "+playerId);
System.out.println("Player Name: "+playerName);
System.out.println("Kills: "+kills);

System.out.println("Health: "+health);
System.out.println("Game Name: "+gameName);
System.out.println("Enemy Name: "+enemyName);

System.out.println("Damage: "+damage);



}

public static void main(String[]args){
Scanner sc=new Scanner(System.in);
Pubg p1= new Pubg();
System.out.println("Enter Player ID: ");
p1.playerId=sc.nextInt();

System.out.println("Enter PLayer Name: ");
p1.playerName=sc.nextLine();

System.out.println("Kills: ");
p1.kills=sc.nextInt();
p1.addKill();

System.out.println("Health: ");
p1.health=sc.nextInt();
p1.attackPlayer();

System.out.println("Enemy Name: ");
p1.enemyName=sc.nextLine();

System.out.println("Damage Given By Enemy: ");
p1.damage=sc.nextInt();
p1.displayStats();
sc.close();




}

}