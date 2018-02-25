package filereader;

/**
 * Stopwatch is a class for count time and return elapse time in second unit.
 * 
 * @author Dacharat Pankong
 *
 */
public class Stopwatch {

	private long startTime;
	private long stopTime;
	private boolean run = true;

	/**
	 * Start the Stopwatch
	 */
	public void start() {
		startTime = System.nanoTime();
		run = true;
	}

	/**
	 * Stop the Stopwatch
	 */
	public void stop() {
		if (!run)
			return;
		stopTime = System.nanoTime();
		run = false;
	}

	/**
	 * Check stop watch that it is running or not.
	 * 
	 * @return true if stopwatch is running, otherwise false.
	 */
	public boolean isRunning() {
		return run;
	}

	/**
	 * Get the elapsed time. If stopwatch is running, it returns the elapsed time
	 * from when start invoked until present. If stopwatch is stopped, it returns
	 * the elapsed time between calls to start() and stop().
	 * 
	 * @return elspse time.
	 */
	public double getElapsed() {
		if (run)
			return (System.nanoTime() - startTime) * 1.0E-9;
		return (stopTime - startTime) * 1.0E-9;
	}
}
