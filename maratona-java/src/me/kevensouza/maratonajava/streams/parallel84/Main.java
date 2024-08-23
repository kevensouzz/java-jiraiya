package me.kevensouza.maratonajava.streams.parallel84;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        long num = 500_000;

        sumFor(num);
        sumStreamIterate(num);
        sumParallelStream(num);
        sumLongStream(num);
        sumLongParallelStream(num);
    }

    private static void sumFor(long num) {
        long res = 0;

        long init = System.currentTimeMillis();
        for (long i = 0; i <= num; i++) {
            res += i;
        }
        long end = System.currentTimeMillis();

        System.out.println((end - init) + "ms");
    }

    private static void sumStreamIterate(long num) {
        long res = 0;

        long init = System.currentTimeMillis();
        Stream.iterate(1l, i -> i += 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println((end - init) + "ms");
    }

    private static void sumParallelStream(long num) {
        long res = 0;

        long init = System.currentTimeMillis();
        Stream.iterate(1l, i -> i += 1).parallel().limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println((end - init) + "ms");
    }

    private static void sumLongStream(long num) {
        long res = 0;

        long init = System.currentTimeMillis();
        LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println((end - init) + "ms");
    }

    private static void sumLongParallelStream(long num) {
        long res = 0;

        long init = System.currentTimeMillis();
        LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println((end - init) + "ms");
    }
}
