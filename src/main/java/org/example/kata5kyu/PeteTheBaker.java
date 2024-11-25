package org.example.kata5kyu;

import java.util.Map;

public class PeteTheBaker {

    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * Pete likes to bake some cakes. He has some recipes and ingredients.
     * Unfortunately he is not good in maths.
     * Can you help him to find out, how many cakes he could bake considering his recipes?
     * <p>
     * Write a function cakes(), which takes the recipe (object) and the available ingredients (also an object) and returns the maximum number of cakes Pete can bake (integer).
     * For simplicity there are no units for the amounts (e.g. 1 lb of flour or 200 g of sugar are simply 1 or 200).
     * Ingredients that are not present in the objects, can be considered as 0.
     * /**
     * <p>
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * | // must return 2
     * cakes({flour: 500, sugar: 200, eggs: 1}, {flour: 1200, sugar: 1200, eggs: 5, milk: 200});
     * // must return 0
     * cakes({apples: 3, flour: 300, sugar: 150, milk: 100, oil: 100}, {sugar: 500, flour: 2000, milk: 2000});
     */

    public static void main(String[] args) {
        System.out.println(cakes(Map.of("flour", 500, "sugar", 200, "eggs", 1),
                Map.of("flour", 1200, "sugar", 1200, "eggs", 5, "milk", 200))); // 2
        System.out.println(cakes(Map.of("apples", 3, "floar", 300, "sugar", 150, "milk", 100, "oil", 100),
                Map.of("sugar", 500, "flour", 2000, "milk", 2000))); // 0
    }

//    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
//        List<Integer> maxAmountOfCakes = new ArrayList<>();
//        for (String recipeIngredient : recipe.keySet()) {
//            if (available.containsKey(recipeIngredient)) {
//                maxAmountOfCakes.add(Math.floorDiv(available.get(recipeIngredient), recipe.get(recipeIngredient)));
//            } else {
//                return 0;
//            }
//        }
//        return Collections.min(maxAmountOfCakes);
//    }

//    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
//        return recipe.keySet().stream().mapToInt(k -> available.getOrDefault(k, 0) / recipe.getOrDefault(k, 0)).min().orElse(0);
//    }

//    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
//        return recipe.entrySet().stream()
//                .mapToInt(entry -> available.getOrDefault(entry.getKey(), 0) / recipe.getOrDefault(entry.getKey(), 0))
//                .min()
//                .orElse(0);
//    }

    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        return recipe.entrySet().stream()
                .mapToInt(entry -> available.getOrDefault(entry.getKey(), 0) / entry.getValue())
                .min()
                .orElse(0);
    }
}
