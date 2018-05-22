package com.jsystems.testautomation;

import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class JunitTest {

@Test
public void firstTest() {

 String testowyString = "firstTest";

    assertTrue(true == true);
    assertTrue(testowyString.equals("firstTest"));
    assertTrue("messege from assertTrue", 5 == 2 +3);
    assertFalse("messege from assertTrue", 5 == 3 +3);
    assertFalse("messege from assertTrue", testowyString.equals("Adam"));
    assertThat(testowyString, is("firstTest"));
    assertEquals(testowyString, "firstTest");
    assertSame(testowyString, "firstTest");
    assertThat(testowyString, containsString("first"));
    assertThat(testowyString, equalTo("firstTest"));
    assertThat(testowyString, endsWith("Test"));

    System.out.println(0.2 * 0.2);

    assertFalse(0.2 * 0.2 == 0.04);
    assertTrue(new BigDecimal("0.2").multiply(new BigDecimal("0.2")).doubleValue() == 0.04);





}



}
