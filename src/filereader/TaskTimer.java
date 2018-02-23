package filereader;

public class TaskTimer {

	public void measureAndPrint(Runnable r) {
		r.run();
		System.out.println(r);
	}

}
