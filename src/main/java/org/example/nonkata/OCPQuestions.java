package org.example.nonkata;

import org.example.kata8kyu.OppositeNumber;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OCPQuestions {

    public static void main(String[] args) {
//        computingWithOperators();
//        computingWithIncrements2();
//        computingWithIncrements3();
//        stream();
//        arrayAsListComputation();
//        listComputation();

//        peek();
//        listIterator();
//        priorityQueue();
//        andThenFunction();
//        treeMap();
//        stringIsImmutable2();
//        modifyList();
    }

    public static void stringIsImmutable() {
        String str = "Hello";
        str.concat(" World");
        System.out.println(str);
    }

    //+= creates a new String object
    public static void stringIsImmutable2() {
        String str = "Java";
        str += " OCP";
        System.out.println(str);
    }

    public static void computingWithIncrements() {
        int x = 5;
        int y = ++x * 5 / x-- + --x;
        System.out.println(y);
    }

    public static void computingWithIncrements2() {
        int x = 1;
        x = x++ + ++x;
        System.out.println(x);
    }

    public static void computingWithIncrements3(){
        int x = 5;
        System.out.println(x++ * --x);
    }


    //✔ Streams process elements one-by-one, top to bottom.
    //✔ peek() prints everything before filtering.
    //✔ filter() immediately removes non-matching elements.
    //✔ forEach() runs immediately after filtering, not at the end of the stream.

    //Step-by-Step Execution for Each Element in the Stream
    //💡 Streams are processed element by element, from top to bottom in the pipeline.
    //
    //1️⃣ Processing 1
    //
    //peek(System.out::print) → Prints 1
    //filter(n -> n % 2 == 0) → Fails filter (1 is odd) → discarded
    //forEach() is NOT executed for 1
    //2️⃣ Processing 2
    //
    //peek(System.out::print) → Prints 2
    //filter(n -> n % 2 == 0) → Passes filter (2 is even)
    //forEach(System.out::print) → Prints 2
    //3️⃣ Processing 3
    //
    //peek(System.out::print) → Prints 3
    //filter(n -> n % 2 == 0) → Fails filter (3 is odd) → discarded
    //forEach() is NOT executed for 3
    //4️⃣ Processing 4
    //
    //peek(System.out::print) → Prints 4
    //filter(n -> n % 2 == 0) → Passes filter (4 is even)
    //forEach(System.out::print) → Prints 4
    public static void stream() {
        Stream.of(1, 2, 3, 4)
                .peek(System.out::print)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::print);
    }


    public static void arrayAsListComputation() {
        List<Integer> list = Arrays.asList(1, 2, 3);
        list.replaceAll(n -> n * 2);
        System.out.println(list);
    }

    //list.Of() creates immutable list.
    // so modifying it causes an exception UnsupportedOperationException
    public static void listComputation() {
        List<Integer> list = List.of(1, 2, 3);
        list.replaceAll(n -> n * 2);
        System.out.println(list);
    }

    //hasNext() checks if there is another element in the list iterator.
    // It returns true if there are more elements to iterate over, and false if the iterator has reached the end of the list.
    // it.next() returns the current element and then moves the iterator to the next element in the list
    //ListIterator.add() modifies a list during iteration.
    public static void listIterator() {
        List<String> list = new LinkedList<>(Arrays.asList("Java", "OCP", "Exam"));
        ListIterator<String> it = list.listIterator();

        //The while (it.hasNext()) loop will run for each element in the list, including "Exam".
        while (it.hasNext()) {
            if (it.next().equals("OCP")) {
                it.add("Certification");
            }
        }

        System.out.println(list);
    }

    //sort() is an in-place modification (it rearranges elements).
    //Since it does not change the list size, it should work.
    //Conclusion: The code does NOT throw UnsupportedOperationException.
    public static void modifyList() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }


    //map.merge(key, value, BiFunction) updates a key if it already exists.
    //If key 2 exists, it updates using (oldVal, newVal) -> oldVal + newVal.
    //"Two" + "New" results in "TwoNew".
    //Final map: {1=One, 2=TwoNew, 3=Three}.
    public static void mergeMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        map.merge(2, "New", (oldVal, newVal) -> oldVal + newVal);
        System.out.println(map);
    }

    //HashMap allows null keys and values.
    public static void nullHashMap(){
        Map<String, Integer> map = new HashMap<>();
        map.put(null, 100);
        map.put("OCP", null);
        System.out.println(map);
    }

    //TreeMap keeps keys sorted in natural order (A → Z).
    //Keys "A", "B", "C" are inserted in random order, but TreeMap automatically sorts them.
    public static void treeMap() {
        Map<String, Integer> map = new TreeMap<>();
        map.put("B", 2);
        map.put("C", 3);
        map.put("A", 1);

        for (String key : map.keySet()) {
            System.out.print(key + " ");
        }
    }

    // LinkedHashSet maintains insertion order (not sorted order).
    public static void linkedHashSet() {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(50);
        set.add(20);
        set.add(10);
        set.add(30);

        System.out.println(set);
    }

    //IntStream.range(1, 5) generates numbers from 1 to 4 (5 is exclusive).
    //IntStream.rangeClosed includes the end value.
    public static void rangeIntStream() {
        var result = IntStream.range(1, 5).sum();
        System.out.println(result);
    }


    //a set does not allow duplicates
    //order of output may vary due to HashSet
    public static void set() {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("OCP");
        set.add("Java");
        System.out.println(set);
    }

    //filter(n -> n % 2 == 0) keeps only even numbers: [2, 4].
    //peek(System.out::print) prints filtered numbers (2 4), but doesn’t modify them.
    //.count() counts remaining elements (2 elements: 2 and 4).

    //💡 What is peek()?
    //
    //Used for debugging in a stream pipeline.
    //Does not modify the elements.
    public static void peek() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        var result = stream.filter(n -> n % 2 == 0)
                .peek(System.out::print)
                .count();
        System.out.println(result);
    }

    //PriorityQueue always keeps elements in sorted order (natural order by default).
    //Even though we added elements in random order, the queue internally sorts them.
    //.poll() removes the smallest element first.
    public static void priorityQueue() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        System.out.println(pq.poll() + " " + pq.poll());
    }


    //andThen() applies f1 first, then f2.
    public static void andThenFunction() {
        Function<Integer, Integer> f1 = x -> x + 2;
        Function<Integer, Integer> f2 = x -> x * 2;

        Function<Integer, Integer> f3 = f1.andThen(f2);

        System.out.println(f3.apply(3));
    }
}
