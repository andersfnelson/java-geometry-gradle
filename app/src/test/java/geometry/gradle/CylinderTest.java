package geometry.gradle;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import geometry.gradle.Cylinder;

public class CylinderTest {
    @Test
    public void volumeTest() { 
        //instantiate new circle object
    Cylinder c = new Cylinder(); 

    
    //Set up result variable for the circumference calculation
    double result = c.volume(5, 5);
        //Check that the result is within .01 of the expected
    assertEquals(392.6991, result, 0.01);
}
}
