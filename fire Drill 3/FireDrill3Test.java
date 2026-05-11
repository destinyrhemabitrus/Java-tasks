import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class FireDrill3Test{

    @Test
    public void testThatEvenMethodExist() {

    TaskFour array = new TaskFour();
    //int[] result = {2,3,5,6};
    actual = TaskFour.evenIndex(int[] result);
    int[] expected = 8;
    assertEquals(expected, actual);
    }

    @Test
    public void testThatArrayReturnsEvenNumbers() {

    TaskFour array = new TaskFour();
    int[] result = {2,3,5,6};
    actual = TaskFour.evenIndex(int[] result);
    int[] expected = 2;
    assertEquals(expected, actual);
    }



}


