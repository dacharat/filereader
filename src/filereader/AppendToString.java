package filereader;

public class AppendToString implements Runnable{

	private Stopwatch sw = new Stopwatch();
	private String filename;
	private String data;
	private double time;
	
	public AppendToString(String filename) {
		this.filename = filename;
	}
	
	@Override
	public void run() {
		sw.start();
		data = ReadFile.readFileToString(filename);
		sw.stop();
		time = sw.getElapsed();
	}
	
	@Override
	public String toString() {
		return String.format("Read %d chars in %f sec.\n", data.length(), time);
	}

}
