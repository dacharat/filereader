package filereader;

/**
 * This class will read file one character per time by using StringBuilder and
 * count the time that use for read file.
 * 
 * @author Dacharat Pankong
 *
 */
public class AppendToStringBuilder implements Runnable {

	private String filename;
	private String data;

	/**
	 * Initialize file that you want to read.
	 * 
	 * @param filename
	 *            is file that you want to read.
	 */
	public AppendToStringBuilder(String filename) {
		this.filename = filename;
	}

	/**
	 * Start read file and count the time.
	 */
	@Override
	public void run() {
		data = ReadFile.readFileToStringBuilder(filename);
	}

	/**
	 * Return number of character was read and time use.
	 */
	@Override
	public String toString() {
		return String.format("Read %d chars in", data.length());
	}

}
