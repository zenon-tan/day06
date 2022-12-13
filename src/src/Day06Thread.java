package src;

import java.security.SecureRandom;
import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Day06Thread {

    public static void main(String[] args) {

        // Create a threadpool
        // Take the class that implements a runnable interface and pass it to a threadpool


        // Create a threadpool
        ExecutorService threadpool = Executors.newFixedThreadPool(3);
        List<Integer> numList = new LinkedList<>();

        for(int i = 0; i < 3; i++) {
            // Create a thread
            RandomNumbers thr = new RandomNumbers("Mary-%d".formatted(i), 100, numList);
            // Submit to threadpool
            threadpool.submit(thr);
            // The program doesn't end since the threadpool is running, hit ctrl + c to end

        }

        System.out.println("All done");
        while(true) {

            System.out.println(">>>>> " + numList + " size: " + numList.size());

            try {
                Thread.sleep(2 * 1000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }


            }
    }



        

}