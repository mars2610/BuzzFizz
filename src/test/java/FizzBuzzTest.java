import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    public static final int LAST_ELEMENT_OF_ARRAYMS = 99;
    public static final int FIRST_ELEMENT_OF_ARRAYMS = 0;
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";
    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void createNewFizzBuzzObjectForTheTestms() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldReturnOneForTheFirstElementOfFizzBuzzArray() {
        Assert.assertEquals(Integer.valueOf(1), fizzBuzz.getOneHundredElementListms().get(FIRST_ELEMENT_OF_ARRAYMS));
    }

    @Test
    public void shouldReturnOneHundredForTheLastElementOfFizzBuzzArray() {
        Assert.assertEquals(Integer.valueOf(100), fizzBuzz.getOneHundredElementListms().get(LAST_ELEMENT_OF_ARRAYMS));
    }

    @Test
    public void shouldReturnFizzForInputDivisibleByThree() {
        String actualResult = fizzBuzz.getFizzBusTestResultms(39);
        Assert.assertEquals(FIZZ, actualResult);
    }

    @Test
    public void shouldReturnBuzzForInputDivisibleByFive() {
        String actualResult = fizzBuzz.getFizzBusTestResultms(55);
        Assert.assertEquals(BUZZ, actualResult);
    }

    @Test
    public void shouldReturnFizzBuzzForInputDivisibleByFiveAndThree() {
        String actualResult = fizzBuzz.getFizzBusTestResultms(60);
        Assert.assertEquals(FIZZ_BUZZ, actualResult);
    }

}
