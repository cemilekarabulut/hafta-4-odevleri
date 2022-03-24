import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String... args) throws InterruptedException {
        List<Integer> numList = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            numList.add(i);
        }

        List<Integer> evenNumbers = new CopyOnWriteArrayList<>();
        List<Integer> oddNumbers = new CopyOnWriteArrayList<>();

        EvenOddDetectionThread detector1 = new EvenOddDetectionThread(new ArrayList<>(numList.subList(0,2500)), evenNumbers, oddNumbers);
        EvenOddDetectionThread detector2 = new EvenOddDetectionThread(new ArrayList<>(numList.subList(2500,5000)), evenNumbers, oddNumbers);
        EvenOddDetectionThread detector3 = new EvenOddDetectionThread(new ArrayList<>(numList.subList(5000,7500)), evenNumbers, oddNumbers);
        EvenOddDetectionThread detector4 = new EvenOddDetectionThread(new ArrayList<>(numList.subList(7500,10000)), evenNumbers, oddNumbers);

        Thread firstThread = new Thread(detector1);
        Thread secondThread = new Thread(detector2);
        Thread thirdThread = new Thread(detector3);
        Thread fourthThread = new Thread(detector4);

        firstThread.start();
        secondThread.start();
        thirdThread.start();
        fourthThread.start();

        firstThread.join();
        secondThread.join();
        thirdThread.join();
        fourthThread.join();

        System.out.println("Even numbers in total: " + evenNumbers.toString());
        System.out.println("Odd numbers in total: " + oddNumbers.toString());
    }
}
