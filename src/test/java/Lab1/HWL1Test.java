package Lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HWL1Test {
  @Test
  void greetingCheck() {
    HelloWorldL1 helloWorld = new HelloWorldL1();
    assertNotNull(helloWorld.getGreeting());
  }
}