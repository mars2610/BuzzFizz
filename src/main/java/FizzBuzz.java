import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<Integer> getOneHundredElementListms() {
        List listOfValuesms = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            listOfValuesms.add(i);
        }
        return listOfValuesms;

    }

    public String getFizzBusTestResultms(Integer i) {
        if (i % 3 == 0 & i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(i);
        }
    }

    public void printResult() {
        getOneHundredElementListms().forEach(element -> System.out.println(getFizzBusTestResultms(element)));
    }
}
