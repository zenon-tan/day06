package src;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.sound.sampled.SourceDataLine;

public class LambdaThreads {

    public static void main(String[] args) {
        
        ExecutorService threadpool = Executors.newFixedThreadPool(2);

        for(int i = 0; i < 3; i++) {

            threadpool.submit(
                // Runnable - public void run() ------> this is like the run method (like in the previous thread file) since the signature is the same
                // Since .submit takes a Runnable with no args (.run())
                // an anon function since it doesn't have a name, we recognise it with the signature
                // Don't have to specify run()
                // To prevent side effects, don't reference or change a global variable
                () -> {
                    Random rnd = new SecureRandom();
                    for(int j = 0; j < 10; j++) {

                        System.out.printf("Random: %d\n", rnd.nextInt(100));
                        
                    }

                    // You are basically passing a method as the body for another method .submit() but without the need to create that method
                    // 

                }
            );
            
        }

    }
    
}
