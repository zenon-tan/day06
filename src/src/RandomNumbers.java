package src;

import java.security.SecureRandom;
import java.util.List;
import java.util.Random;

public class RandomNumbers implements Runnable {

    private String name;
    private int range;
    private List<Integer> numList;

    public RandomNumbers(String name, int range, List<Integer> numList) {

        this.name = name;
        this.range = range;
        this.numList = numList;
    }


    @Override
    public void run() {
        // The body of the thread


        Random rnd = new SecureRandom();

        for(int i = 0; i < 10; i++) {
            int num = rnd.nextInt(range);
            numList.add(num);
            System.out.printf(">>> %d [%s] %d\n", i, name, rnd.nextInt(range));

            try {
                Thread.sleep(2 * 1000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

        }
        
        
    }


    
}
