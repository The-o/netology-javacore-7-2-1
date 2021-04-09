import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(
            1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4
        );

        List<Integer> tmpList = new ArrayList<>();
        for (int n : intList) {
            if (n <= 0) {
                continue;
            }
            tmpList.add(n);
        }

        List<Integer> resultList = new ArrayList<>();
        for (int n: tmpList) {
            if (n % 2 != 0) {
                continue;
            }
            resultList.add(n);
        }

        resultList.sort(Comparator.naturalOrder());

        for (int n: resultList) {
            System.out.println(n);
        }
    }

}