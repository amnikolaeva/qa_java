import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittens() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion(feline);
        int expectedResult = 1;
        int actualResult = lion.getKittens();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void lionDoesHaveMane() {
        boolean expectedResult = true;
        try {
            Lion lion = new Lion("Самец");
            boolean actualResult = lion.doesHaveMane();
            Assert.assertEquals(expectedResult, actualResult);
        } catch (Exception e) {
            System.out.println("Возникла непредвиденная ошибка");
        }
    }

    @Test
    public void femaleLionDoesHaveNoMane() {
        boolean expectedResult = false;
        try {
            Lion lion = new Lion("Самка");
            boolean actualResult = lion.doesHaveMane();
            Assert.assertEquals(expectedResult, actualResult);
        } catch (Exception e) {
            System.out.println("Возникла непредвиденная ошибка");
        }
    }

    @Test
    public void doesHaveManeByIncorrectSex() {
        boolean hasException = false;
        try {
            new Lion("Оно");
        } catch (Exception e) {
            hasException = true;
        }
        Assert.assertTrue(hasException);
    }

    @Test
    public void getFood() {
        Lion lion = new Lion(feline);
        List<String> expectedResult = Arrays.asList("Животные", "Птицы", "Рыба");
        try {
            Mockito.when(lion.getFood()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
            List<String> actualResult = lion.getFood();
            Assert.assertEquals(expectedResult, actualResult);
        } catch (Exception e) {
            System.out.println("Возникла непредвиденная ошибка");
        }
    }
}
