package SamplePrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsIOException {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int i, j = 0, k =0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	i = 8;
	System.out.println("Enter number");
	j= Integer.parseInt(br.readLine());
	k = i + j;
	System.out.println("Output is   : " +k);

	}

}
