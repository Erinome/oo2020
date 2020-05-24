public class Threads {
    public static Threads output = new Threads();

    public static void main(String[] args) {
        Runnable r = new Runnable1();
        Thread t = new Thread(r);

        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);

        Runnable r3 = new Runnable3();
        Thread t3 = new Thread(r3);

        Runnable r4 = new Runnable4();
        Thread t4 = new Thread(r4);

        t.start();
        t2.start();
        t3.start();
        t4.start();
    }

    private Object syncher = new Object();
    private int state = 0;

    public void print(char pChar) {
        synchronized (syncher) {
            while (true) {
                if (state == 0) {
                    System.out.print(pChar + ",");
                    state = 1;
                    syncher.notify();
                    return;
                } else {
                    try {
                        syncher.wait();
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }

    public void print(int pInt) {
        synchronized (syncher) {
            while (true) {
                if (state == 1) {
                    System.out.print(pInt + ",");
                    state = 0;
                    syncher.notify();
                    return;
                } else {
                    try {
                        syncher.wait();
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }
}

class Runnable2 implements Runnable {
    public void run() {
        for (char i = 'a'; i <= 'k'; i++) {
            Threads.output.print(i);
        }
    }
}

class Runnable1 implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            Threads.output.print(i);
        }
    }
}

class Runnable3 implements Runnable {
    public void run() {
        for (char i = 'k'; i >= 'a'; i--) {
            Threads.output.print(i);
        }
    }
}

class Runnable4 implements Runnable {
    public void run() {
        for (int i = 10; i >= 0; i--) {
            Threads.output.print(i);
        }
    }
}
