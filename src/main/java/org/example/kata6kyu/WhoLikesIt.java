package org.example.kata6kyu;

public class WhoLikesIt {
    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * | You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items.
     * We want to create the text that should be displayed next to such an item.
     *
     * Implement the function which takes an array containing the names of people that like an item.
     * It must return the display text as shown in the examples:
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * |   []                                -->  "no one likes this"
     *  ["Peter"]                         -->  "Peter likes this"
     *  ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
     *  ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
     *  ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
     */

    public static void main(String[] args) {
        System.out.println(whoLikesIt()); // Output: "no one likes this"
        System.out.println(whoLikesIt("Peter")); // Output: "Peter likes this"
        System.out.println(whoLikesIt("Jacob", "Alex")); // Output: "Jacob and Alex like this"
        System.out.println(whoLikesIt("Max", "John", "Mark")); // Output: "Max, John and Mark like this"
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max")); // Output: "Alex, Jacob and 2 others like this"
    }

//    public static String whoLikesIt(String... names) {
//        StringBuilder solutionString = new StringBuilder();
//        int x = names.length;
//        if (x == 0) {
//            return "no one likes this";
//        }
//        if (x == 1) {
//            return solutionString.append(names[0]).append(" likes this").toString();
//        }
//        if (x == 2) {
//            return solutionString.append(names[0]).append(" and ").append(names[1]).append(" like this").toString();
//        }
//        if (x == 3) {
//            return solutionString.append(names[0]).append(", ").append(names[1]).append(" and ").append(names[2]).append(" like this").toString();
//        } else {
//            return solutionString.append(names[0]).append(", ").append(names[1]).append(" and ").append(x - 2).append(" others like this").toString();
//        }
//    }

    public static String whoLikesIt(String... names) {
        return switch (names.length) {
            case 0 -> "no one likes this";
            case 1 -> String.format("%s likes this", names[0]);
            case 2 -> String.format("%s and %s like this", names[0], names[1]);
            case 3 -> String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            default -> String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
        };
    }

}
