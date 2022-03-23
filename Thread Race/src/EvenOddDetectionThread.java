import java.util.Collections;
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
    public void run() {
        if (Thread.currentThread().getName().substring(7).equals("0")) {
            for (int i = 0; i < 2500; i++) {
                if (this.list.get(i) % 2 == 0)
                    evenNumbers.add(this.list.get(i));
                else
                    oddNumbers.add(this.list.get(i));
            }
            System.out.println("Even numbers in " + Thread.currentThread().getName() + ": " + evenNumbers.size() + " Max even number is " + Collections.max(evenNumbers));
            System.out.println("Odd numbers in " + Thread.currentThread().getName() + ": " + oddNumbers.size() + " Max odd number is " + Collections.max(oddNumbers));
        } else if (Thread.currentThread().getName().substring(7).equals("1")) {
            for (int i = 2500; i < 5000; i++) {
                if (this.list.get(i) % 2 == 0)
                    evenNumbers.add(this.list.get(i));
                else
                    oddNumbers.add(this.list.get(i));
            }
            System.out.println("Even numbers in " + Thread.currentThread().getName() + ": " + evenNumbers.size() + " Max even number is " + Collections.max(evenNumbers));
            System.out.println("Odd numbers in " + Thread.currentThread().getName() + ": " + oddNumbers.size() + " Max odd number is " + Collections.max(oddNumbers));
        } else if (Thread.currentThread().getName().substring(7).equals("2")) {
            for (int i = 5000; i < 7500; i++) {
                if (this.list.get(i) % 2 == 0)
                    evenNumbers.add(this.list.get(i));
                else
                    oddNumbers.add(this.list.get(i));
            }
            System.out.println("Even numbers in " + Thread.currentThread().getName() + ": " + evenNumbers.size() + " Max even number is " + Collections.max(evenNumbers));
            System.out.println("Odd numbers in " + Thread.currentThread().getName() + ": " + oddNumbers.size() + " Max odd number is " + Collections.max(oddNumbers));
        } else if (Thread.currentThread().getName().substring(7).equals("3")) {
            for (int i = 7500; i < 10000; i++) {
                if (this.list.get(i) % 2 == 0)
                    evenNumbers.add(this.list.get(i));
                else
                    oddNumbers.add(this.list.get(i));
            }
            System.out.println("Even numbers in " + Thread.currentThread().getName() + ": " + evenNumbers.size() + " Max even number is " + Collections.max(evenNumbers));
            System.out.println("Odd numbers in " + Thread.currentThread().getName() + ": " + oddNumbers.size() + " Max odd number is " + Collections.max(oddNumbers));
        }
    }
}
