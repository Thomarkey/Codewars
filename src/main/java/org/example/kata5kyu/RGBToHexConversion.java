package org.example.kata5kyu;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RGBToHexConversion {

    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * The rgb function is incomplete.
     * Complete it so that passing in RGB decimal values will result in a hexadecimal representation being returned.
     * Valid decimal values for RGB are 0 - 255.
     * Any values that fall out of that range must be rounded to the closest valid value.
     * <p>
     * Note: Your answer should always be 6 characters long, the shorthand with 3 will not work here.
     * /**
     * <p>
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * | 255, 255, 255 --> "FFFFFF"
     * 255, 255, 300 --> "FFFFFF"
     * 0, 0, 0       --> "000000"
     * 148, 0, 211   --> "9400D3"
     */

    public static void main(String[] args) {
        System.out.println(rgb(255, 255, 255)); // "FFFFFF";
        System.out.println(rgb(255, 255, 300)); // "FFFFFF";
        System.out.println(rgb(0, 0, 0)); // "000000";
        System.out.println(rgb(148, 0, 211)); // "9400D3";
    }


//    public static String rgb(int r, int g, int b) {
//        return  String.format("%02X%02X%02X", Math.max(0, Math.min(255, r)), Math.max(0, Math.min(255, g)), Math.max(0, Math.min(255, b)));
//    }

    public static String rgb(int r, int g, int b){
        return Stream.of(r,g,b)
                .map(i -> Math.max(0, i))
                .map(i -> Math.min(255, i))
                .map(i -> String.format("%02X", i))
                .collect(Collectors.joining());
    }

}
