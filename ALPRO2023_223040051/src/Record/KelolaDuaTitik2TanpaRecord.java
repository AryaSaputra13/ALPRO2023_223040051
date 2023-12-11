package Record;

import java.util.Scanner;

public class KelolaDuaTitik2TanpaRecord {

	public static void main(String[] args) {
		int x,y; //Titik1
		int x2,y2; //titik2
		
		Scanner sc= new Scanner (System.in);
		
		// TODO Auto-generated method stub
		System.out.println("X =");x=sc.nextInt();
		System.out.println("Y =");y=sc.nextInt();
		System.out.println("Titik");
		System.out.println("X= "+x+","+y);
		
		System.out.println("X= ");x2=sc.nextInt();
		System.out.println("Y= ");y2=sc.nextInt();
		System.out.println("Titik");
		System.out.println("(x,y) = ("+x2+","+y2+")");

	}

}