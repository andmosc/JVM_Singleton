import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        LoggerSingl loggerSingl = LoggerSingl.getInstance();
        loggerSingl.log("Asking the user to enter input for the list");

        Scanner scanner = new Scanner(System.in);
        System.out.print("List size: ");
        int listSize = Integer.parseInt(scanner.nextLine());

        System.out.print("Upper bound: ");
        int upperBoundList = Integer.parseInt(scanner.nextLine());

        loggerSingl.log("Create and populate a list");
        List<Integer> listRandomNum = createListRandomNum(listSize,upperBoundList);
        System.out.print("Random list: ");
        listRandomNum.forEach(p-> System.out.print(" "+p));
        System.out.println();

        loggerSingl.log("Asking the user to enter input for filtering");
        System.out.print("Number to filter: ");
        int numFilter = Integer.parseInt(scanner.nextLine());

        loggerSingl.log("start filtering");
        Filter filter = new Filter(numFilter);
        List<Integer> result = filter.filterOut(listRandomNum);
        loggerSingl.log("passed the filter " + result.size() + " element form "+listRandomNum.size());
        loggerSingl.log("Output result on screen");
        System.out.print("filtered list: ");
        result.forEach(p-> System.out.print(" "+p));
        System.out.println();
        loggerSingl.log("complete the program");
    }

    private static List<Integer> createListRandomNum(int listSize, int upperBoundList) {
        return new Random().ints(listSize,0,upperBoundList+1).boxed().collect(Collectors.toList());
    }
}
