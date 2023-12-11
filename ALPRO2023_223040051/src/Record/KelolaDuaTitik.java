package Record;

import java.util.Scanner;

public class KelolaDuaTitik {

	public static void main(String[] args) {
		Titik T= new Titik();
		Titik T2= new Titik();
		
		Scanner sc= new Scanner (System.in);
		
		// TODO Auto-generated method stub
		System.out.println("X =");T.x=sc.nextInt();
		System.out.println("Y =");T.y=sc.nextInt();
		System.out.println("Titik");
		System.out.println("X= "+T.x+","+T.y);
		
		System.out.println("X= ");T2.x=sc.nextInt();
		System.out.println("Y= ");T2.y=sc.nextInt();
		System.out.println("Titik");
		System.out.println("(x,y) = ("+T2.x+","+T2.y+")");

	}

}