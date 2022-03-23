import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String... args) throws InterruptedException {
        List<Integer> numList = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            numList.add(i);
        }

        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        EvenOddDetectionThread detector = new EvenOddDetectionThread(numList, evenNumbers, oddNumbers);

        Thread firstThread = new Thread(detector);
        Thread secondThread = new Thread(detector);
        Thread thirdThread = new Thread(detector);
        Thread fourthThread = new Thread(detector);

        firstThread.start();
        secondThread.start();
        thirdThread.start();
        fourthThread.start();

        firstThread.join();
        secondThread.join();
        thirdThread.join();
        fourthThread.join();

        System.out.println("Even numbers in total: " + evenNumbers.size() + " Max even number is " + Collections.max(evenNumbers));
        System.out.println("Odd numbers in total: " + oddNumbers.size() + " Max odd number is " + Collections.max(oddNumbers));
    }
}
