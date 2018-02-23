package filereader;

public class TaskTimer implements Runnable {

	private String file = "Alice-in-Wonderland.txt";
	private AppendToString ats = new AppendToString(file);
	private AppendToStringBuilder builder = new AppendToStringBuilder(file);
	private AppendToBufferedReader buffer = new AppendToBufferedReader(file);

	@Override
	public void run() {
		ats.run();
		System.out.println(ats);

		builder.run();
		System.out.println(builder);

		buffer.run();
		System.out.println(buffer);
	}

}
