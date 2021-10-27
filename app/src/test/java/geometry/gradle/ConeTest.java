package geometry.gradle;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ConeTest {
    @Test
    public void volumeTest() { 
        //instantiate new circle object
    Cone c = new Cone(); 

    
    //Set up result variable for the circumference calculation
    double result = c.volume(5, 5);
        //Check that the result is within .01 of the expected
    assertEquals(130.89969, result, 0.01);
}
}
