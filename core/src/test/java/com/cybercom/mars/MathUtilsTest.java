package com.cybercom.mars;

public class MathUtilsTest {
  @org.junit.Test
  public void testSum() throws Exception {
    MathUtils utils = new MathUtils();
    assert 43 == utils.sum(24, 18);
  }
}
