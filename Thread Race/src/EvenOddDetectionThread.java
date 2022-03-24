import java.util.List;

public class EvenOddDetectionThread implements Runnable {
    private List<Integer> list;
    private List<Integer> evenNumbers;
    private List<Integer> oddNumbers;

    public EvenOddDetectionThread(List<Integer> list, List<Integer> evenNumbers, List<Integer> oddNumbers) {
        this.list = list;
        this.evenNumbers = evenNumbers;
        this.oddNumbers = oddNumbers;
    }

    @Override
    public synchronized void run() {
            for (Integer num : list) {
                if (num % 2 == 0)
                    evenNumbers.add(num);
                else
                    oddNumbers.add(num);
            }
            System.out.println("Even numbers in " + Thread.currentThread().getName() + " Even numbers:  " + evenNumbers.toString());
            System.out.println("Odd numbers in " + Thread.currentThread().getName() + " Odd numbers " + oddNumbers.toString());
    }
}
