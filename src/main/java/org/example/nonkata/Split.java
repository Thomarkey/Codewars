package org.example.nonkata;

public class Split {

    public static void main(String[] args) {
        System.out.println(getVariantFromPml("5-4", "1616AA4800"));
    }


    //pml = 1616AA4800 --> AA48 (dat is de variant)
    public static String getVariantFromPml(String parameters, String pml) {
        String[] paramParts = parameters.split("-");
        int startIndex = Integer.parseInt(paramParts[0]) - 1;
        int length = Integer.parseInt(paramParts[1]);

        if (pml.length() >= startIndex + length) {
            return pml.substring(startIndex, startIndex + length).trim();
        }

        return "";
    }

}

