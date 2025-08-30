package lab3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountUpL3Test{
  private CountUpL3 counter

  @BeforeEach
  void setup(){
    counter = new CountUpL3();
  }

  @Test
  public void 2011incrementTest(){
    counter.increment(2011);
    assertEquals("$20.11", counter.total());
    counter.clear();
  }

  @Test
  public void 2011manualTest(){
    counter.thousands();
    counter.thousands();
    counter.hundreds();
    counter.ones();
    assertEquals("$20.11", counter.total());
    counter.clear();
  }

  @Test
  public void overflowTest(){
    counter.increment(10000);
    assertEquals("$0.00", counter.total());
    assertEquals(1, counter.getOverflows());
    counter.clear();
    counter.increment(836293);
    assertEquals("$62.93", counter.total());
    assertEquals(83, counter.getOverflows());
    counter.clear();
  }

  @Test
  public void 2011to0decrementTest(){
    counter.increment(2011);
    counter.decrementOnes();
    counter.decrementTens();
    counter.decrementHundreds();
    counter.decrementThousands();
    counter.decrementThousands()
    assertEquals("$0.00", counter.total());
    counter.clear();
  }
}