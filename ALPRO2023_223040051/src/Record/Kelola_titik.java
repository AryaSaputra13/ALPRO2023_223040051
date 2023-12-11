package Record;

import java.util.Scanner;

public class Kelola_titik {

	public static void main(String[] args) {
		Titik T= new Titik();
		
		Scanner sc= new Scanner (System.in);
		
		// TODO Auto-generated method stub
		System.out.println("X =");T.x=sc.nextInt();
		System.out.println("Y =");T.y=sc.nextInt();
		
		System.out.println("(x,y) = ("+T.x+","+T.y+")");

	}

}