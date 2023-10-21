import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class basicExampleInStream {
    public static void main(String[] args) {

        List<String> str = Arrays.asList("abc", "", "abd", "", "mjk", "jk");

        //Counting Empty String
        long count = str.stream().filter(x -> x.isEmpty()).count();
        System.out.println("Number of Empty String -: " + count);

        //Count String whose length is more or Equal to three
        long count1 = str.stream().filter(x -> x.length() >= 3).count();
        System.out.println("Number String whose length is more or Equal to three -: " + count1);

        //Count number of String which starts with "a"
        long count2 = str.stream().filter(x -> x.startsWith("a")).count();
        System.out.println("Number String which starts with \"a\" -: " + count2);

        //Remove all empty Strings from List
        List<String> filterstr = str.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
        System.out.println("Empty Strings from List -: " + filterstr);

        //Create a List with String more than 2 characters
        List<String> morestr = str.stream().filter(x -> x.length() > 2).collect(Collectors.toList());
        System.out.println("List with String more than 2 characters -: " + morestr);

        //Convert String to uppercase and Join them with coma
        String letercase = str.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(","));
        System.out.println("String to uppercase and Join them with coma -: " + letercase);

        //Create a List of the square of all distinct numbers
        List<Integer> squr = Arrays.asList(2, 4, 3, 6, 7, 4);
        List<Integer> ansSqr = squr.stream().map(x -> x * x).distinct().collect(Collectors.toList());
        System.out.println("List of the square of all distinct numbers -: " + ansSqr);

        //Get count, min, max, sum, and the average for numbers
        List<Integer> num = Arrays.asList(2, 4, 6, 5, 3, 9, 7, 8);
        IntSummaryStatistics stat = num.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("Average of all numbers -: " + stat.getAverage());
        System.out.println("Highest number in the List -: " + stat.getMax());
        System.out.println("Lowest number in the List -: " + stat.getMin());
        System.out.println("Sum of all numbers -: " + stat.getSum());
    }
}
