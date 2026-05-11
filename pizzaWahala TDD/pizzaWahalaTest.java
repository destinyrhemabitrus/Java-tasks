import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class pizzaWahalaTest{

    @Test
    public void testThatPizzaWahalaMethodExists(){

        pizzaWahala pizza = new pizzaWahala();
        int result = pizza.commision(1,10);  
        int expected = 45;
        assertEquals(expected,result);

    }

}
