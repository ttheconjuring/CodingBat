public class Warmup_1 {
    /*
     * The parameter weekday is true if it is a weekday, and the parameter vacation
     * is true if we are on vacation. We sleep in if it is not a weekday or we're on
     * vacation. Return true if we sleep in.
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false || vacation == true) {
            return true;
        } else
            return false;
    }

    /*
     * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate
     * if each is smiling. We are in trouble if they are both smiling or if neither
     * of them is smiling. Return true if we are in trouble.
     * 
     */
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile == true && bSmile == true) || (aSmile == false && bSmile == false)) {
            return true;
        } else
            return false;
    }

    /*
     * Given two int values, return their sum. Unless the two values are the same,
     * then return double their sum.
     * 
     */
    public static int sumDouble(int a, int b) {
        int sum = 0;
        if (a == b) {
            sum = a + b;
            sum *= 2;
        } else
            sum = a + b;
        return sum;
    }

    /*
     * Given an int n, return the absolute difference between n and 21, except
     * return double the absolute difference if n is over 21.
     */
    public static int diff21(int n) {
        int difference = 0;
        if (n > 21) {
            difference = n - 21;
            difference *= 2;
        } else {
            difference = n - 21;
            difference *= -1;
        }
        return difference;
    }

    /*
     * We have a loud talking parrot. The "hour" parameter is the current hour time
     * in the range 0..23. We are in trouble if the parrot is talking and the hour
     * is before 7 or after 20. Return true if we are in trouble.
     * 
     */
    public static boolean parrotTrouble(boolean talking, int hour) {
        if (talking == true && (hour < 7 || hour > 20)) {
            return true;
        } else
            return false;
    }

    /*
     * Given 2 ints, a and b, return true if one of them is 10 or if their sum is
     * 10.
     */
    public static boolean makes10(int a, int b) {
        int sum = a + b;
        if ((a == 10 || b == 10) || (sum == 10)) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * Given an int n, return true if it is within 10 of 100 or 200. Note:
     * Math.abs(num) computes the absolute value of a number.
     */
    public static boolean nearHundred(int n) {
        return false;
    }

    /*
     * Given 2 int values, return true if one is negative and one is positive.
     * Except if the parameter "negative" is true, then return true only if both are
     * negative.
     */
    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative == false) {
            if ((a > 0 && b < 0) || (a < 0 && b > 0)) {
                return true;
            }
        } else {
            if (a < 0 && b < 0) {
                return true;
            } else
                return false;
        }
        return false;
    }

    /*
     * Given a string, return a new string where "not " has been added to the front.
     * However, if the string already begins with "not", return the string
     * unchanged. Note: use .equals() to compare 2 strings.
     * 
     */
    public static String notString(String str) {
        String newStr;
        if (str.startsWith("not")) {
            return str;
        } else {
            newStr = "not " + str;
        }
        return newStr;
    }

    /*
     * Given a non-empty string and an int n, return a new string where the char at
     * index n has been removed. The value of n will be a valid index of a char in
     * the original string (i.e. n will be in the range 0..str.length()-1
     * inclusive).
     */
    public static String missingChar(String str, int n) {
        String begining = str.substring(0, n);
        String end = str.substring(n + 1, str.length());
        return begining + end;
    }

    /*
     * Given a string, return a new string where the first and last chars have been
     * exchanged.
     */
    public static String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        }
        String mid = str.substring(1, str.length() - 1);
        return str.charAt(str.length() - 1) + mid + str.charAt(0);
    }

    /*
     * Given a string, we'll say that the front is the first 3 chars of the string.
     * If the string length is less than 3, the front is whatever is there. Return a
     * new string which is 3 copies of the front.
     */
    public static String front3(String str) {
        int n = str.length();
        if (n <= 3) {
            return str + str + str;
        } else {
            String front = str.substring(0, 3);
            return front + front + front;
        }
    }

    /*
     * Given a string, take the last char and return a new string with the last char
     * added at the front and back, so "cat" yields "tcatt". The original string
     * will be length 1 or more.
     */
    public static String backAround(String str) {
        int n = str.length();
        if (n <= 0) {
            return str;
        }
        if (n == 1) {
            return str + str + str;
        }
        return str.charAt(n - 1) + str + str.charAt(n - 1);
    }

    /*
     * Return true if the given non-negative number is a multiple of 3 or a multiple
     * of 5. Use the % "mod" operator -- see Introduction to Mod
     */
    public static boolean or35(int n) {
        return (n % 3 == 0 || n % 5 == 0);
    }

    /*
     * Given a string, take the first 2 chars and return the string with the 2 chars
     * added at both the front and back, so "kitten" yields"kikittenki". If the
     * string length is less than 2, use whatever chars are there.
     */
    public static String front22(String str) {
        int n = str.length();
        if (n <= 2) {
            return str + str + str;
        }
        String firstTwo = str.substring(0, 2);
        return firstTwo + str + firstTwo;
    }

    /**
     * Given a string, return true if the string starts with "hi" and false
     * otherwise.
     */
    public static boolean startHi(String str) {
        return str.startsWith("hi");
    }

    /*
     * Given two temperatures, return true if one is less than 0 and the other is
     * greater than 100.
     */
    public static boolean icyHot(int temp1, int temp2) {
        return ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0));
    }

    /**
     * Given 2 int values, return true if either of them is in the range 10..20
     * inclusive.
     */
    public static boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }

    /*
     * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
     * Given 3 int values, return true if 1 or more of them are teen.
     * 
     */
    public static boolean hasTeen(int a, int b, int c) {
        int counter = 0;
        int[] array = { a, b, c };
        for (int i = 0; i < 3; i++) {
            if (array[i] >= 13 && array[i] <= 19) {
                counter++;
            }
        }
        if (counter >= 1) {
            return true;
        }
        return false;
    }

    /*
     * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
     * Given 2 int values, return true if one or the other is teen, but not both.
     */
    public static boolean loneTeen(int a, int b) {
        if ((a >= 13 && a <= 19) && (b >= 13 && b <= 19)) {
            return false;
        }
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return true;
        }
        return false;
    }

    /*
     * Given a string, if the string "del" appears starting at index 1, return a
     * string where that "del" has been deleted. Otherwise, return the string
     * unchanged.
     */
    public static String delDel(String str) {
        if (str.isEmpty()) {
            return str;
        }
        if (str.startsWith(str.charAt(0) + "del")) {
            return str.charAt(0) + str.substring(4, str.length());
        }
        return str;
    }

    /*
     * Return true if the given string begins with "mix", except the 'm' can be
     * anything, so "pix", "9ix" .. all count.
     * 
     */
    public static boolean mixStart(String str) {
        if (str.length() < 3) {
            return false;
        }
        if (str.startsWith("mix")) {
            return true;
        }
        if (str.charAt(1) == 'i' && str.charAt(2) == 'x') {
            return true;
        }
        return false;
    }

    /*
     * Given a string, return a string made of the first 2 chars (if present),
     * however include first char only if it is 'o' and include the second only if
     * it is 'z', so "ozymandias" yields "oz".
     * 
     */
    public static String startOz(String str) {
        if (str.isEmpty()) {
            return "";
        } else if (str.length() == 1) {
            if (str.charAt(0) == 'o') {
                return "o";
            }
        } else if (str.length() == 2) {
            if (str.equals("oz")) {
                return str;
            } else if (str.charAt(0) == 'o') {
                return "o";
            } else if (str.charAt(1) == 'z') {
                return "z";
            }
        } else if (str.length() >= 3) {
            String newStr = str.substring(0, 2);
            if (newStr.equals("oz")) {
                return newStr;
            } else if (newStr.charAt(0) == 'o') {
                return "o";
            } else if (newStr.charAt(1) == 'z') {
                return "z";
            }
        }
        return "";
    }

    /*
     * Given three int values, a b c, return the largest.
     */
    public int intMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    /*
     * Given 2 int values, return whichever value is nearest to the value 10, or
     * return 0 in the event of a tie. Note that Math.abs(n) returns the absolute
     * value of a number.
     */
    public static int close10(int a, int b) {
        int differenceA = 10 - a;
        int differenceB = 10 - b;
        if (Math.abs(differenceA) == Math.abs(differenceB)) {
            return 0;
        } else if (differenceA > differenceB) {
            return a;
        } else {
            return b;
        }
    }

    /*
     * Given 2 int values, return true if they are both in the range 30..40
     * inclusive, or they are both in the range 40..50 inclusive.
     * 
     */
    public static boolean in3050(int a, int b) {
        return (((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) || ((a >= 40 && a <= 50) && (b >= 40 && b <= 50)));
    }

    /*
     * Given 2 positive int values, return the larger value that is in the range
     * 10..20 inclusive, or return 0 if neither is in that range.
     * 
     */
    public static int max1020(int a, int b) {
        if ((a >= 10 && a <= 20) && (b >= 10 && b <= 20)) {
            return Math.max(a, b);
        } else if (a > 20 && b > 20) {
            return 0;
        } else if (a < 10 && b < 10) {
            return 0;
        } else if (a < 10 && (b >= 10 && b <= 20)) {
            return b;
        } else if (b < 10 && (a >= 10 && a <= 20)) {
            return a;
        } else if ((a >= 10 && a <= 20) && b > 20) {
            return a;
        } else if ((b >= 10 && b <= 20) && a > 20) {
            return b;
        }
        return 0;
    }

    /*
     * Return true if the given string contains between 1 and 3 'e' chars
     */
    public static boolean stringE(String str) {
        int counter = 0;
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'e') {
                counter++;
            }
        }
        if (counter >= 1 && counter <= 3) {
            return true;
        }
        return false;
    }

    /*
     * Given two non-negative int values, return true if they have the same last
     * digit, such as with 27 and 57. Note that the % "mod" operator computes
     * remainders, so 17 % 10 is 7.
     */
    public static boolean lastDigit(int a, int b) {
        if (a < 10 && b < 10) {
            if (a == b) {
                return true;
            }
        } else if ((a > 9 && a < 100) && (b > 9 && b < 100)) {
            if (a % 10 == b % 10) {
                return true;
            }
        } else if (a < 10 && (b > 9 && b < 100)) {
            if (a == b % 10) {
                return true;
            }
        } else if ((a > 9 && a < 100) && b < 10) {
            if (a % 10 == b) {
                return true;
            }
        } else if ((a > 9 && a < 100) && b > 9) {
            if (a % 10 == b % 10) {
                return true;
            }
        } else if (a > 99 && (b > 9 && b < 100)) {
            if (a % 10 == b % 10) {
                return true;
            }
        } else if (a > 99 && b < 10) {
            if (a % 10 == b) {
                return true;
            }
        } else if (a < 10 && b > 99) {
            if (a == b % 10) {
                return true;
            }
        }
        return false;
        // return(a % 10 == b % 10); ez omg ...
    }

    /*
     * Given a string, return a new string where the last 3 chars are now in upper
     * case. If the string has less than 3 chars, uppercase whatever is there. Note
     * that str.toUpperCase() returns the uppercase version of a string.
     */
    public static String endUp(String str) {
        if (str.length() <= 3) {
            return str.toUpperCase();
        }
        String newStr = "";
        String lastThreeChars = str.substring(str.length() - 3);
        String withoutLasThreeChars = str.substring(0, str.length() - 3);
        newStr = withoutLasThreeChars + lastThreeChars.toUpperCase();
        return newStr;
    }

    /*
     * Given a non-empty string and an int N, return the string made starting with
     * char 0, and then every Nth char of the string. So if N is 3, use char 0, 3,
     * 6, ... and so on. N is 1 or more.
     */
    public static String everyNth(String str, int n) {
        String newStr = "";
        for(int i = 0; i < str.length(); i+= n){
            newStr += str.charAt(i);
        }
        return newStr;
    }

}
