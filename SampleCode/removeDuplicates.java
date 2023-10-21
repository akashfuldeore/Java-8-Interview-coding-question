package SampleCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class removeDuplicates {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Akash", "Akash", "Prasad" , "Satish", "Fuldeore", "Sumit");

        List<String> uniqueName = name.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueName);

        //Different Method to remove Duplicates
        name.stream().distinct().forEach(System.out::println);
    }
}
