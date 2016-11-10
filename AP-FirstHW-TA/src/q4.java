import java.util.Scanner;
public class q4 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("On what day of the month were you born?");
		String d = sc.next();
		System.out.print("What is the name of the month in which you were born?");
		String m = sc.next();
		System.out.print("During what year were you born?");
		String y = sc.next();
		System.out.println("You were born on "+ d +" "+m+","+y+". You’re mighty old!");
		sc.close();
	}

}
