package org.example.kata5kyu;

public class HumanReadableTime {

    /**
     * ------------------------------------------------------------
     * |                      DESCRIPTION                         |
     * ------------------------------------------------------------
     * Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)*
     * <p>
     * HH = hours, padded to 2 digits, range: 00 - 99
     * MM = minutes, padded to 2 digits, range: 00 - 59
     * SS = seconds, padded to 2 digits, range: 00 - 59
     * The maximum time never exceeds 359999 (99:59:59)
     * <p>
     * /**
     * ------------------------------------------------------------
     * |                       EXAMPLES                            |
     * ------------------------------------------------------------
     * | HumanReadableTime.makeReadable(0); // "00:00:00"
     * HumanReadableTime.makeReadable(5); // "00:00:05"
     * HumanReadableTime.makeReadable(60); // "00:01:00"
     * HumanReadableTime.makeReadable(86399); // "23:59:59"
     * HumanReadableTime.makeReadable(359999); // "99:59:59"
     */

    public static void main(String[] args) {
        System.out.println(makeReadable(0)); // "00:00:00"
        System.out.println(makeReadable(5)); // "00:00:05"
        System.out.println(makeReadable(60)); // "00:01:00"
        System.out.println(makeReadable(86399)); // "23:59:59"
        System.out.println(makeReadable(359999)); // "99:59:59"
    }

    public static String makeReadable(int seconds) {
        int h = seconds / 3600;
        int m = (seconds % 3600) / 60;
        int s = (seconds % 3600) % 60;

        return String.format("%02d:%02d:%02d", h, m, s);
    }


//    public static String makeReadable(int seconds) {
//        return String.format("%02d:%02d:%02d", seconds / 3600, (seconds % 3600) / 60, (seconds % 3600) % 60);
//    }
}
