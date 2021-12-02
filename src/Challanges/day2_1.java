package Challanges;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day2_1 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("Resources/impD2"));
		String inp, dir;
		int len;
		int depth = 0, fwd = 0;
		while(sc.hasNextLine()) {
			inp = sc.nextLine();
			dir = inp.substring(0,1);
			len = Integer.valueOf(inp.substring(inp.length()-2).trim());
			switch(dir) {
			case "f":
				fwd += len;
				break;
			case "d":
				depth += len;
				break;
			case "u":
				depth -= len;
				break;
			default:
				throw new RuntimeException("invalid input");
			}
		}
		System.out.format("Depth: %d Fwd: %d%n", depth, fwd);
		System.out.println(depth*fwd);
	}

}
