public class Main {
    static class MyThread extends Thread {
        public void run() {
            for (int i = 1; i <= 3; i++)
                System.out.println("Thread: " + i);
        }
    }

    static class MyRunnable implements Runnable {
        public void run() {
            for (int i = 1; i <= 3; i++)
                System.out.println("Runnable: " + i);
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Thread t2 = new Thread(new MyRunnable());

        t1.start();
        t2.start();
    }
}