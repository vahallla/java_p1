import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 사용자에게 알고리즘 선택을 요청합니다.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Quick Sort");
        System.out.println("5. Merge Sort");

        int choice = scanner.nextInt();
        scanner.close();

        // 첫 번째 스레드를 시작합니다. 이 스레드는 선택된 알고리즘을 실행합니다.
        Thread algorithmThread = new Thread(new AlgorithmRunnable(choice));
        algorithmThread.start();

        // 두 번째 스레드를 시작합니다. 이 스레드는 비워두었습니다.
        Thread emptyThread = new Thread(new EmptyRunnable());
        emptyThread.start();
    }
}
 
