import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A_MatMaTinhYeu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        decode(a, b);
    }

    public static void decode(int a, int b) {
        List<Integer> numList = new ArrayList<>();
        numList.add(b);

        while (a < b) {
            // If b was added "1" behind it (it will always be greater than 10)
            if ((b - 1) % 10 == 0) {
                b = (b - 1) / 10;
                numList.add(b);
                continue;
            }

            // If b was multiplied by 2
            if (b % 2 == 0) {
                b /= 2;
                numList.add(b);
            } else {
                break;
            }
        }

        if (a != b) {
            System.out.print("NO");
        } else {
            Collections.reverse(numList);
            System.out.println("YES\n" + numList.size());

            for (int i : numList) {
                System.out.print(i + " ");
            }
        }
    }
}