import java.io.*;
import java.util.Scanner;

public class day1p2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("Resources/d1-1-input"));
		int ct = 0;
		int[] lFrame, frame;
		lFrame = new int[3];
		lFrame[0] = sc.nextInt();
		lFrame[1] = sc.nextInt();
		lFrame[2] = sc.nextInt();
		frame = new int[3];
		while(sc.hasNext()) {
			frame[0] = lFrame[1];
			frame[1] = lFrame[2];
			frame[2] = sc.nextInt();
			if(sum(frame)>sum(lFrame))ct++;
			lFrame = frame.clone();
		}
		System.out.println(ct);
	}
	public static int sum(int[] in) {
		int s = 0;
		for(int i:in)s+=i;
		return s;
	}

}
