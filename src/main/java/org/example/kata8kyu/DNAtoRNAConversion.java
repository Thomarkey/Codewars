package org.example.kata8kyu;

public class DNAtoRNAConversion {

    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * | Deoxyribonucleic acid, DNA is the primary information storage molecule in biological systems.
     * | It is composed of four nucleic acid bases Guanine ('G'), Cytosine ('C'), Adenine ('A'), and Thymine ('T').
     * |
     * | Ribonucleic acid, RNA, is the primary messenger molecule in cells.
     * | RNA differs slightly from DNA its chemical structure and contains no Thymine.
     * | In RNA Thymine is replaced by another nucleic acid Uracil ('U').
     * |
     * | The input string can be of arbitrary length - in particular, it may be empty.
     * | All input is guaranteed to be valid, i.e. each input string will only ever consist of 'G', 'C', 'A' and/or 'T'.
     */

    /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * |    "GCAT"  =>  "GCAU"
     */

    public static void main(String[] args) {
        // Test your methods here
        System.out.println(dnaToRna("GCAT"));   // Output: "GCAU"
        System.out.println(dnaToRna("TTTT"));   // Output: "UUU"
    }


    public static String dnaToRna(String dna) {
        return dna.replace("T","U");
    }
}
