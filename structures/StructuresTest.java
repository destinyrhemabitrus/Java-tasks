import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StructuresTest{

    @Test
    public void test_that_sumDigits_method_exists(){
        Structures struc = new Structures();
        struc.sumDigits(621);

    }
    
//    Q2 Test
    @Test
    public void test_that_sumDigits_method_return_sum_of_entered_integer(){
        Structures struc = new Structures();
        int actual = struc.sumDigits(102);
        int expected = 3;
        assertEquals(expected,actual);

    }

//    Q3 Test
    @Test
    public void test_that_reverse_method_exists(){
        Structures struc = new Structures();
        int actual = struc.reverse(102);
    }

    @Test
    public void test_that_reverse_method_returns_reverse_numbers(){
        Structures struc = new Structures();
        int actual = struc.reverse(232);
        int expected = 232;
        assertEquals(actual,expected);
    }

    @Test
    public void test_that_isPalindrome_method_exists(){
        Structures struc = new Structures();
        struc.isPalindrome();
    }



}
