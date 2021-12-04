package Challanges;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class day3_1 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("./Resources/inpd3"));
		int[] tot = new int[12];
		char[] line;
		int lines = 0;
		while(sc.hasNextLine()) {
			line = sc.nextLine().toCharArray();
			lines++;
			for(int i = 0; i<line.length;i++) {
				if(line[i] == '1') tot[i]++;
			}
		}
		System.out.printf("Lines: %d%nTotals: %s%n", lines, Arrays.toString(tot));
		lines /=2;
		int g=0, a=0;
		for(int i = 0; i<tot.length;i++) {
			if(tot[i]>lines)
				g+=(1<<(tot.length-i-1));
		}
		
		a = ~g;
		int mask = (int)(Math.pow(2,12)-1);
		a = a&mask;
		
		System.out.printf("|%12s|%n",Integer.toBinaryString(g));
		System.out.printf("|%12s|%n",Integer.toBinaryString(a));
		System.out.println(g*a);
	}

}
