package me.kevensouza.maratonajava.threads;

class ThreadExample extends Thread {
    private char c;

    public ThreadExample(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
        }
        System.out.println('\n');
    }
}

class ThreadExampleRunnable implements Runnable {
    private char c;

    public ThreadExampleRunnable(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println('\n');
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadExampleRunnable('A'), "//-Amazing Thread--;/");
        Thread t2 = new Thread(new ThreadExampleRunnable('B'), "//-Bullshit Thread--;/");
        Thread t3 = new Thread(new ThreadExampleRunnable('C'), "//-Calm thread--;/");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
