package hw1004;

import java.util.Random;

public class MainContainerList {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        ListContainer container = new ListContainer();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    container.getArrayList().add(random.nextInt());
                }
            });
            thread.start();
//            thread.join();
        }
        Thread.sleep(100);
        System.out.println(container.getArrayList().size());
    }
}
