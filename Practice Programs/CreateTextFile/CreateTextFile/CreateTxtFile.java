// Create file and Write in it Using PrintWriter and File Class

package CreateTextFile;

import java.io.*;

public class CreateTxtFile {

	public static void main(String[] args) throws IOException {
		try {
			File file = new File("D:\\SeleniumWorkspace\\Practice Programs\\CreateTextFile\\ganesh.txt");
			{

				if (!file.exists()) {
					file.createNewFile();
				}

				PrintWriter pw = new PrintWriter(file);
				System.out.println("PASS");
				pw.print("Ganesh Salunkhe");
				System.out.println("File Has created and we are writing in the File");
				pw.close();
			}
		} catch (Exception e) {
			System.out.println(e);
		}		
		try {
			String filename = "D:\\SeleniumWorkspace\\Practice Programs\\CreateTextFile\\ganesh.txt";
			FileWriter fw = new FileWriter(filename, true); // the true will append the new data
			fw.write("\n add a line\n");// appends the string to the file
			fw.close();
		} catch (IOException ioe) {
			System.err.println("IOException: " + ioe.getMessage());
		}
	}
}
