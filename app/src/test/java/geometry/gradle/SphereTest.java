package geometry.gradle;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import geometry.gradle.Sphere;

public class SphereTest {
    @Test
    public void volumeTest() { 
        //instantiate new circle object
    Sphere s = new Sphere(); 

    
    //Set up result variable for the circumference calculation
    double result = s.volume(5);
        //Check that the result is within .01 of the expected
    assertEquals(523.5988, result, 0.01);
}
}
