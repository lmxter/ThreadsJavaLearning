
public class MyThread implements Runnable{
	
	private Thread thread;
	private String processID;
	
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println("ID-" + this.getProcessID() + "-"+i);
		}
	}
	
	public MyThread () {
		this.processID = this.generateId();
		this.thread = new Thread(this, "ID-"+this.processID);
	}
	
	public void start() {
		this.thread.start();
	}

	public Thread getThread() {
		return thread;
	}

	public void setThread(Thread thread) {
		this.thread = thread;
	}

	public String getProcessID() {
		return processID;
	}

	public void setProcessID(String processID) {
		this.processID = processID;
	}
	
	private String generateId() {
		StringBuilder id = new StringBuilder(10);
		String alphaNumString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+
								"1234567890"+
								"abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < 10; i++) {
			int index = (int)(alphaNumString.length()*Math.random());
			id.append(alphaNumString.charAt(index));
		}
		return id.toString();
	}

}
