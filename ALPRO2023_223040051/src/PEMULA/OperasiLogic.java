package PEMULA;

import java.util.Scanner;

public class OperasiLogic {
	public static void main (String[] args) {
		boolean x=true,y=false,z=true,hasil;
		
		hasil=(x && y)|| z;
		System.out.println("(x && y)|| z = "+hasil);
		hasil=x && (y || z);
		System.out.println("(x && (y || z) = "+hasil);
		hasil=x && (y || z);
		System.out.println("x && (y || z) = "+hasil);
		hasil=! (x && z);
		System.out.println("! (x && z) = "+hasil);
		hasil=(x ^ z) && y;
		System.out.println("(x ^ z) && y = "+hasil);
		
	}
}
