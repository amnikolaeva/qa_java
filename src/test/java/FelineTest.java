import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensByCount() {
        Feline feline = new Feline();
        int expectedResult = 4;
        int actualResult = feline.getKittens(4);
        Assert.assertTrue(expectedResult == actualResult);
    }

    @Test
    public void getKittensWithoutCount() {
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
    public void eatMeatReturnPredator() {
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
