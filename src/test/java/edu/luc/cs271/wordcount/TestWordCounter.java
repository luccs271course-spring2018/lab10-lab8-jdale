package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestWordCounter {

  // declare a reference to the SUT (system under test), i.e., WordCounter
  private WordCounter wcounter;

  @Before
  public void setUp() {
    // finish create the SUT instance
    wcounter = new WordCounter(new HashMap<>());
  }

  @After
  public void tearDown() {
    // finish set the SUT instance to null
    wcounter = null;
  }

  @Test
  public void testGetCountEmpty() {

    // finish verify that the SUT initially returns an empty map
    assertTrue(wcounter.getCounts().isEmpty());
  }

  @Test
  public void testGetCountNonEmpty() {

    // finish run the SUT on a specific String iterator with some repeated words,
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator
    wcounter.countWords(
        Arrays.asList("Hello", "Bye", "goodmorrnig", "Bye", "Hello", "Jamison").iterator());
    assertEquals(wcounter.getCount("Bye"), 2);
    assertEquals(wcounter.getCount("Dale"), 0);
  }
}
