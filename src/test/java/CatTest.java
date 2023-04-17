import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundReturnMeow() {
        Cat cat = new Cat(feline);
        String expectedResult = "Мяу";
        String actualResult = cat.getSound();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFood() {
        Cat cat = new Cat(feline);
        List<String> expectedResult = Arrays.asList("Животные", "Птицы", "Рыба");
        try {
            List<String> actualResult = cat.getFood();
            Assert.assertEquals(expectedResult, actualResult);
        } catch (Exception e) {
            System.out.println("Возникла непредвиденная ошибка");
        }
    }
}
