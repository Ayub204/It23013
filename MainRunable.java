class MyTask implements Runnable {
    public void run() {
        System.out.println("Runnable");
    }
}

public class MainRunable {
    public static void main(String[] args) {
        Thread t = new Thread(new MyTask()); // Runnable অবজেক্ট Thread-এ পাস করা হলো
        t.start(); // থ্রেড শুরু
    }
}
