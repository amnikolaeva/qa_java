import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;


@RunWith(Parameterized.class)
public class FelineTest {

    private final int kittens;

    public FelineTest(int kittens) {
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

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        int expectedResult = 1;
        int actualResult = feline.getKittens();
        Assert.assertTrue(expectedResult == actualResult);
    }

    @Test
    public void getFamilyReturnFeline() {
        Feline feline = new Feline();
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void eatMeat() {
        Feline feline = new Feline();
        List<String> expectedResult = Arrays.asList("Животные", "Птицы", "Рыба");
        try {
            List<String> actualResult = feline.eatMeat();
            Assert.assertEquals(expectedResult, actualResult);
        } catch (Exception e) {
            System.out.println("Возникла непредвиденная ошибка");
        }
    }
}
