package org.example.kata5kyu;

import java.util.HashMap;
import java.util.Map;

public class MoleculeToAtoms {
    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * For a given chemical formula represented by a string,
     * count the number of atoms of each element contained in the molecule and return an object (
     * Map<String,Integer> in Java).
     * <p>
     * As you can see, some formulas have brackets in them.
     * The index outside the brackets tells you that you have to multiply count of each atom inside the bracket on this index.
     * <p>
     * For example, in Fe(NO3)2 you have one iron atom, two nitrogen atoms and six oxygen atoms.
     * <p>
     * Note that brackets may be round, square or curly and can also be nested.
     * Index after the braces is optional.
     * <p>
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * String water = "H2O";
     * parseMolecule.getAtoms(water); // return [H: 2, O: 1]
     * <p>
     * String magnesiumHydroxide = "Mg(OH)2";
     * parseMolecule.getAtoms(magnesiumHydroxide); // return ["Mg": 1, "O": 2, "H": 2]
     * <p>
     * String fremySalt = "K4[ON(SO3)2]2";
     * parseMolecule.getAtoms(fremySalt); // return ["K": 4, "O": 14, "N": 2, "S": 4]
     * <p>
     * parseMolecule.getAtoms("pie"); // throw an IllegalArgumentException
     */


    public static void main(String[] args) {
        System.out.println(getAtoms("Hg2O")); // [Hg: 2, O: 1] //fictive
        System.out.println(getAtoms("H2O")); // [H: 2, O: 1]
//        System.out.println(getAtoms("Mg(OH)2")); // [Mg: 1, O: 2, H: 2]
//        System.out.println(getAtoms("K4[ON(SO3)2]2")); // [K: 4, O: 14, N: 2, S: 4]
//        System.out.println(getAtoms("pie")); // throw an IllegalArgumentException
    }

    public static Map<String, Integer> getAtoms(String formula) {
        HashMap<String, Integer> atomMap = new HashMap<>();
        for (int i = 0; i < formula.length(); i++) {
            Character c = formula.charAt(i);

            if (Character.isUpperCase(c)) { //this also rules out numbers and brackets
                StringBuilder element = new StringBuilder();
                element.append(c);

                if (i + 1 < formula.length() && Character.isLowerCase(formula.charAt(i + 1))) { //cant be out of bound because of &&
                        element.append(formula.charAt(i + 1));
                        i++;
                    }
                atomMap.put(element.toString(), atomMap.getOrDefault(element.toString(), 0) + 1);
            }

            //TODO continue
            //tbc

        }
        return atomMap;
    }

}
