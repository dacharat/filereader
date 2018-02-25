package filereader;

/**
 * This class will read file one character per time.
 * 
 * @author Dacharat Pankong
 *
 */
public class AppendToString implements Runnable {

	private String filename;
	private String data;

	/**
	 * Initialize file that you want to read.
	 * 
	 * @param filename
	 *            is file that you want to read.
	 */
	public AppendToString(String filename) {
		this.filename = filename;
	}

	/**
	 * Start read file.
	 */
	@Override
	public void run() {
		data = ReadFile.readFileToString(filename);
	}

	/**
	 * Return number of character was read.
	 */
	@Override
	public String toString() {
		return String.format("Read %d chars in", data.length());
	}

}
