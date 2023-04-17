import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FelineTest {

    @Test
    public void getKittensByCount() {
        Feline feline = new Feline();
        int expectedResult = 4;
        int actualResult = feline.getKittens(4);
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
        Assert.assertTrue(expectedResult == actualResult);
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
