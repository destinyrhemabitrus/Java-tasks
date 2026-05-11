import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class BackToSenderTest{

    @Test    
    public void testThatCommisionMethodIsActive(){

    BackToSender dispatch = new BackToSender();

    int result = dispatch.commission();
    int expected = 20000;

    assertEquals(expected, result);

    }

}
