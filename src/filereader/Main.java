package filereader;

/**
 * Main class for output result for reading file.
 * 
 * @author Dacharat Pankong
 *
 */
public class Main {

	public static void main(String[] args) {
		String file = "Alice-in-Wonderland.txt";
		TaskTimer tt = new TaskTimer();

		System.out.println("Reading Alice-in-Wonderland.txt using FileReader, append to String.");
		tt.measureAndPrint(new AppendToString(file));

		System.out.println("Reading Alice-in-Wonderland.txt using FileReader, append to StringBuilder.");
		tt.measureAndPrint(new AppendToStringBuilder(file));

		System.out.println("Reading Alice-in-Wonderland.txt using BufferedReader, append to String.");
		tt.measureAndPrint(new AppendToBufferedReader(file));
	}
}
