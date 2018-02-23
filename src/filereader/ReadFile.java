package filereader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFile {

	private static FileInputStream in;
	private static FileReader fr;
	private static BufferedReader br;

	public static String readFileToString(String filename) {
		String data = "";
		// open file
		try {
			in = new FileInputStream(filename);

			// read as characters
			InputStreamReader reader = new InputStreamReader(in);
			int c;

			while (true) { // while((c = reader.read()) >= 0)
				c = reader.read();
				if (c < 0)
					break;
				data = data + (char) c;
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		return data + " ";
	}

	public static String readFileToStringBuilder(String filename) {
		StringBuilder sb = null;
		try {
			in = new FileInputStream(filename);
			sb = new StringBuilder();
			InputStreamReader reader = new InputStreamReader(in);

			int c;
			while (true) { // while((c = reader.read()) >= 0)
				c = reader.read();
				if (c < 0)
					break;
				sb = sb.append((char) c);
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		return sb.toString() + '\n';
	}

	public static String readFileToBufferedReader(String filename) {
		String data = "";
		try {
			String line = "";
			fr = new FileReader(filename);
			br = new BufferedReader(fr);
			while ((line = br.readLine()) != null) {
				data = data + line + '\n';
			}
			fr.close();
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		return data;
	}

	public static void main(String[] args) {

		Stopwatch sw = new Stopwatch();

		System.out.println("Reading Alice-in-Wonderland.txt using FileReader, append to String.");
		sw.start();
		String readfile1 = readFileToString("Alice-in-Wonderland.txt");
		sw.stop();
		System.out.printf("Read %d chars in %f sec.\n", readfile1.length(), sw.getElapsed());

		System.out.println("----------------------------------------------------------------");

		System.out.println("Reading Alice-in-Wonderland.txt using FileReader, append to StringBuilder.");
		sw.start();
		String readfile2 = readFileToStringBuilder("Alice-in-Wonderland.txt");
		sw.stop();
		System.out.printf("Read %d chars in %f sec.\n", readfile2.length(), sw.getElapsed());

		System.out.println("-----------------------------------------------------------------");

		System.out.println("Reading Alice-in-Wonderland.txt using BufferedReader, append to String.");
		sw.start();
		String readfile3 = readFileToBufferedReader("Alice-in-Wonderland.txt");
		sw.stop();
		System.out.printf("Read %d chars in %f sec.\n", readfile3.length(), sw.getElapsed());

	}
}
