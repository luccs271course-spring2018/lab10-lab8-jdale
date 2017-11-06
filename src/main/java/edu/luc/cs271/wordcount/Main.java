package edu.luc.cs271.wordcount;

import java.util.*;

public class Main {

  public static void main(final String[] args) throws InterruptedException {

    // set up the scanner so that it separates words based on space and punctuation
    final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");
    HashMap<String, Integer> map = new HashMap<>();
    while (input.hasNext()) {
      String next = input.next();
      int count = map.getOrDefault(next, 0);
      count++;
      map.put(next, count);
    }
    // TODO complete this main program
    // 1. create a WordCounter instance
    WordCounter wordCounter = new WordCounter(map);

    // 2. use this to count the words in the input

    // 3. determine the size of the resulting map
    int size = map.size();

    // 4. create an ArrayList of that size and
    ArrayList<Map.Entry<String, Integer>> entrylist = new ArrayList<>(size);

    // 5. store the map's entries in it (these are of type Map.Entry<String, Integer>
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      entrylist.add(entry);
    }

    // 6. sort the ArrayList in descending order by count
    //    using Collections.sort and an instance of the provided comparator (after fixing the
    // latter)
    Collections.sort(entrylist, new DescendingByCount());

    // 7. print the (up to) ten most frequent words in the text
    for (int i = 0; i < 10; i++) {
      System.out.println(entrylist.get(i).getKey() + "=" + entrylist.get(i).getValue());
    }
  }
}
