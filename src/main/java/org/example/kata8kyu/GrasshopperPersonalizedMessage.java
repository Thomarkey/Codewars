package org.example.kata8kyu;

public class GrasshopperPersonalizedMessage {

    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * | Create a function that gives a personalized greeting. This function takes two parameters: name and owner.
     * | Use conditionals to return the proper message:
     * |
     * | case	            return
     * | name equals owner	'Hello boss'
     * | otherwise	        'Hello guest'
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * | Daniel, Daniel -> Hello boss
     * | Greg, Daniel -> Hello guest
     */

    public static void main(String[] args) {
        // Test your methods here
        System.out.println(greet("Daniel", "Daniel"));   // Output: Hello boss
        System.out.println(greet("Greg", "Daniel"));   // Output: hello guest

    }

    static String greet(String name, String owner) {
        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }

}
