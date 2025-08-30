package Lab2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class atwsL2Test {
  private atwsL2Converter converter;
  
  @BeforeEach
  void setup() {
    converter = new atwsL2Converter();
  }

  @Test
    public void testZeroOzToLbs() {
      assertEquals("0.0000 lbs", converter.Oz_To_Lbs(0));
    }

   @Test
    public void testOneOzToLbs() {
      assertEquals("0.0625 lbs", converter.Oz_To_Lbs(1));
    }

   @Test
    public void testTwoOzToLbs() {
      assertEquals("0.125 lbs", converter.Oz_To_Lbs(2));
    }

   @Test
    public void test16OzToLbs() {
      assertEquals("1.0000 lbs", converter.Oz_To_Lbs(16));
    }
}