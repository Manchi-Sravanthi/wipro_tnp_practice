package multithreading.threadcreation;
class MyThread extends Thread {
	public void run(){
	}
	}
public class Q1{
	public static void main(String[] args) {
		Thread t=new Thread();
		Thread t1=new Thread();
		t.setName("Scooby");
		t1.setName("Shaggy");
		System.out.println(t.getName());
		System.out.println(t1.getName());
	}
}
