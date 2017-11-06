the=33278
of=18012
and=12845
a=12449
to=12449
in=9386
was=7788
that=6601
he=6202
his=5529

 - Try using a `TreeMap` instead of a `HashMap`. Does this make any difference?
 TreeMaps are stored as a sorted structure. You wouldn't need to sort before printing the top 10.

   - What happens if you invoke `countWords` multiple times for different String iterators?
    Add each list to the map everytime it is invoked. Overall map would be the sum of the lists.

   - What crucial role does the Iterator abstraction play in making `WordCounter` testable?
    Allows us to make mock data to test the count functionality.