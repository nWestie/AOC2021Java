package Challanges;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day2_2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("Resources/impD2"));
		String inp, dir;
		int len;
		int depth = 0, fwd = 0, aim = 0;
		while(sc.hasNextLine()) {
			inp = sc.nextLine();
			dir = inp.substring(0,1);
			len = Integer.valueOf(inp.substring(inp.length()-2).trim());
			switch(dir) {
			case "f":
				fwd += len;
				depth += aim*len;
				break;
			case "d":
				aim += len;
				break;
			case "u":
				aim -= len;
				break;
			default:
				throw new RuntimeException("invalid input");
			}
		}
		System.out.format("Depth: %d Fwd: %d%n", depth, fwd);
		System.out.println(depth*fwd);
	}

}
