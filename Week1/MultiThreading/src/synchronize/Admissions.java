package synchronize;

public class Admissions implements Runnable {

	int seats = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable admisssion = new Admissions();

		Thread t1 = new Thread(admisssion, "Satish");

		Thread t2 = new Thread(admisssion, "Manoj");

		t1.start();
		t2.start();

	}

	@Override
	public synchronized void run() {
		System.out.println("No of seats before: " + seats);

		if (seats > 0) {
			System.out.println("Seat allocated to: " + Thread.currentThread().getName());
			seats -= 1;
		} else
			System.out.println("Sorry, " + Thread.currentThread().getName() + " try next year");

		System.out.println("No of seats after: " + seats);

	}

}
