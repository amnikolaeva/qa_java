import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineTestWithParameters {

    private final int kittens;

    public FelineTestWithParameters(int kittens) {
        this.kittens = kittens;
    }

    @Parameterized.Parameters
    public static Object[] getData() {
        return new Object[][] {
                { 0},
                { 1},
                { 5}
        };
    }

    @Test
    public void getKittensByCount() {
        Feline feline = new Feline();
        int expectedResult = kittens;
        int actualResult = feline.getKittens(kittens);
        Assert.assertTrue(expectedResult == actualResult);
    }
}
