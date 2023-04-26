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
    public void getKittens() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion(feline, "Самец");
        int expectedResult = 1;
        int actualResult = lion.getKittens();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void lionDoesHaveMane() throws Exception {
        boolean expectedResult = true;
        Lion lion = new Lion(feline, "Самец");
        boolean actualResult = lion.doesHaveMane();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void femaleLionDoesHaveNoMane() throws Exception {
        boolean expectedResult = false;
        Lion lion = new Lion(feline,"Самка");
        boolean actualResult = lion.doesHaveMane();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void doesHaveManeByIncorrectSex() {
        boolean hasException = false;
        try {
            new Lion(feline, "Оно");
        } catch (Exception e) {
            hasException = true;
        }
        Assert.assertTrue(hasException);
    }

    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        List<String> expectedResult = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(lion.getFood()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> actualResult = lion.getFood();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
