package filereader;

public class Stopwatch {

	private long startTime;
	private long stopTime;
	private boolean run = true;

	public void start() {
		startTime = System.nanoTime();
		run = true;
	}

	public void stop() {
		if (!run)
			return;
		stopTime = System.nanoTime();
		run = false;
	}

	public boolean isRunning() {
		return run;
	}

	public double getElapsed() {
		if (run)
			return (System.nanoTime() - startTime) * 1.0E-9;
		return (stopTime - startTime) * 1.0E-9;
	}
}
