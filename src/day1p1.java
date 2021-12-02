

import java.io.*;
import java.util.Scanner;

public class day1p1 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("Resources/d1-1-input"));
		int ct = 0, current;
		int last = sc.nextInt();
		while(sc.hasNext()) {
			current = sc.nextInt();
			if(current>last)ct++;
			last = current;
		}
		System.out.println(ct);
	}

}
