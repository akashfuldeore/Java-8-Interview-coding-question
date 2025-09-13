package SampleCode;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class frequencyOfEleArr {
public  static  void main(String[] args) {
    ArrayList<String> fruitList = new ArrayList<>();

    fruitList.add("Apple");
    fruitList.add("Mango");
    fruitList.add("Apple");
    fruitList.add("Mango");
    fruitList.add("Apple");
    fruitList.add("Cheri");
    fruitList.add("Banana");
    fruitList.add("Apple");

  Map<String, Long> FrequencyOfElementinArryList = fruitList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
  System.out.println(FrequencyOfElementinArryList);


}

}
