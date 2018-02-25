package filereader;

/**
 * TaskTimer class that will compute and print the elapsed time for any task,
 * 
 * @author dacharat Pankong
 *
 */
public class TaskTimer {

	private Stopwatch sw = new Stopwatch();

	/**
	 * Count the time and print the result.
	 * 
	 * @param r
	 */
	public void measureAndPrint(Runnable r) {
		sw.start();
		r.run();
		sw.stop();
		System.out.printf("%s %f sec.\n", r, sw.getElapsed());
	}

}
