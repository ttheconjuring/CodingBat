public class String_1 {
    /*
     * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
     */
    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    /*
     * Given two strings, a and b, return the result of putting them together in the
     * order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
     */
    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    /*
     * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as
     * italic text. In this example, the "i" tag makes <i> and </i> which surround
     * the word "Yay". Given tag and word strings, create the HTML string with tags
     * around the word, e.g. "<i>Yay</i>".
     */
    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    /*
     * Given an "out" string length 4, such as "<<>>", and a word, return a new
     * string where the word is in the middle of the out string, e.g. "<<word>>".
     * Note: use str.substring(i, j) to extract the String starting at index i and
     * going up to but not including index j.
     * 
     */
    public static String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }

    /*
     * Given a string, return a new string made of 3 copies of the last 2 chars of
     * the original string. The string length will be at least 2.
     * 
     */
    public static String extraEnd(String str) {
        int n = str.length();
        if (n == 2) {
            return str + str + str;
        }
        return str.substring(n - 2) + str.substring(n - 2) + str.substring(n - 2);
    }

    /*
     * Given a string, return the string made of its first two chars, so the String
     * "Hello" yields "He". If the string is shorter than length 2, return whatever
     * there is, so "X" yields "X", and the empty string "" yields the empty string
     * "". Note that str.length() returns the length of a string.
     */
    public static String firstTwo(String str) {
        int n = str.length();
        if (n < 2) {
            return str;
        }
        return str.substring(0, 2);
    }

    /*
     * Given a string of even length, return the first half. So the string "WooHoo"
     * yields "Woo".
     */
    public static String firstHalf(String str) {
        return str.substring(0, (str.length() / 2));
    }

    /*
     * Given a string, return a version without the first and last char, so "Hello"
     * yields "ell". The string length will be at least 2.
     */
    public static String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    /*
     * Given 2 strings, a and b, return a string of the form short+long+short, with
     * the shorter string on the outside and the longer string on the inside. The
     * strings will not be the same length, but they may be empty (length 0).
     */
    public static String comboString(String a, String b) {
        int n = a.length();
        int m = b.length();
        if (n > m) {
            return b + a + b;
        } else {
            return a + b + a;
        }
    }

    /*
     * Given 2 strings, return their concatenation, except omit the first char of
     * each. The strings will be at least length 1.
     */
    public static String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    /*
     * Given a string, return a "rotated left 2" version where the first 2 chars are
     * moved to the end. The string length will be at least 2.
     * 
     */
    public static String left2(String str) {
        int n = str.length();
        if (n == 2) {
            return str;
        }
        return str.substring(2) + str.substring(0, 2);
    }

    /*
     * Given a string, return a "rotated right 2" version where the last 2 chars are
     * moved to the start. The string length will be at least 2.
     */
    public static String right2(String str) {
        int n = str.length();
        if (n == 2) {
            return str;
        }
        return str.substring(n - 2) + str.substring(0, n - 2);
    }

    /*
     * Given a string, return a string length 1 from its front, unless front is
     * false, in which case return a string length 1 from its back. The string will
     * be non-empty.
     */
    public static String theEnd(String str, boolean front) {
        if (front == true) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }

    /*
     * Given a string, return a version without both the first and last char of the
     * string. The string may be any length, including 0.
     */
    public static String withouEnd2(String str) {
        int n = str.length();
        if (n < 2) {
            return "";
        }
        return str.substring(1, n - 1);
    }

    /*
     * Given a string of even length, return a string made of the middle two chars,
     * so the string "string" yields "ri". The string length will be at least 2.
     */
    public static String middleTwo(String str) {
        int n = str.length();
        if (n == 2) {
            return str;
        }
        return str.substring((n / 2) - 1, (n / 2) + 1);
    }

    /*
     * Given a string, return true if it ends in "ly".
     */
    public static boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    /*
     * Given a string and an int n, return a string made of the first and last n
     * chars from the string. The string length will be at least n.
     */
    public static String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    /*
     * Given a string and an index, return a string length 2 starting at the given
     * index. If the index is too big or too small to define a string length 2, use
     * the first 2 chars. The string length will be at least 2.
     */
    public static String twoChar(String str, int index) {
        int n = str.length();
        if ((n - 1 == index) || (n == index) || (n < index) || (index < 0)) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }

    /*
     * Given a string of odd length, return the string length 3 from its middle, so
     * "Candy" yields "and". The string length will be at least 3.
     */
    public static String middleThree(String str) {
        int n = str.length();
        if (n == 3) {
            return str;
        }
        return str.substring((n / 2) - 1, (n / 2) + 2);
    }

    /*
     * Given a string, return true if "bad" appears starting at index 0 or 1 in the
     * string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may
     * be any length, including 0. Note: use .equals() to compare 2 strings.
     */
    public static boolean hasBad(String str) {
        if (str.length() > 3) {
            if (str.startsWith("bad") || (str.substring(1, 4).equals("bad"))) {
                return true;
            }
        } else if (str.equals("bad")) {
            return true;
        }
        return false;
    }

    /*
     * Given a string, return a string length 2 made of its first 2 chars. If the
     * string length is less than 2, use '@' for the missing chars
     */
    public static String atFirst(String str) {
        int n = str.length();
        if (n == 0) {
            return "@@";
        } else if (n == 1) {
            return str + "@";
        } else if (n == 2) {
            return str;
        } else {
            return str.substring(0, 2);
        }
    }

    /*
     * Given 2 strings, a and b, return a new string made of the first char of a and
     * the last char of b, so "yo" and "java" yields "ya". If either string is
     * length 0, use '@' for its missing char.
     */
    public static String lastChars(String a, String b) {
        int n = a.length();
        int m = b.length();
        if (n == 0 && m == 0) {
            return "@@";
        } else if (n == 0) {
            return "@" + b.charAt(m - 1);
        } else if (m == 0) {
            return a.charAt(0) + "@";
        }
        return a.substring(0, 1) + b.substring(m - 1);
    }

    /*
     * Given two strings, append them together (known as "concatenation") and return
     * the result. However, if the concatenation creates a double-char, then omit
     * one of the chars, so "abc" and "cat" yields "abcat".
     * 
     */
    public static String conCat(String a, String b) {
        int n = a.length();
        int m = b.length();
        if (n == 0) {
            return b;
        } else if (m == 0) {
            return a;
        }
        if (a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        }
        return a + b;
    }

    /*
     * Given a string of any length, return a new string where the last 2 chars, if
     * present, are swapped, so "coding" yields "codign".
     */
    public static String lastTwo(String str) {
        int n = str.length();
        if (n < 2) {
            return str;
        }
        return str.substring(0, n - 2) + str.charAt(n - 1) + str.charAt(n - 2);
    }

    /*
     * Given a string, if the string begins with "red" or "blue" return that color
     * string, otherwise return the empty string.
     */
    public static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        }
        return "";
    }

    /*
     * Given a string, return true if the first 2 chars in the string also appear at
     * the end of the string, such as with "edited".
     */
    public static boolean frontAgain(String str) {
        int n = str.length();
        if (n == 1 || n == 0) {
            return false;
        }
        return str.substring(0, 2).equals(str.substring(n - 2));
    }

    /*
     * Given two strings, append them together (known as "concatenation") and return
     * the result. However, if the strings are different lengths, omit chars from
     * the longer string so it is the same length as the shorter string. So "Hello"
     * and "Hi" yield "loHi". The strings may be any length.
     */
    public static String minCat(String a, String b) {
        int n = a.length();
        int m = b.length();
        if (n == 0 && m == 0) {
            return "";
        } else if (n == 0) {
            return "";
        } else if (m == 0) {
            return "";
        } else if (n == m) {
            return a + b;
        }
        if (n > m) {
            int diff = n - m;
            return a.substring(diff) + b;
        } else if (n < m) {
            int diff = m - n;
            return a + b.substring(diff);
        }
        return a + b;
    }

    /*
     * Given a string, return a new string made of 3 copies of the first 2 chars of
     * the original string. The string may be any length. If there are fewer than 2
     * chars, use whatever is there.
     */
    public static String extraFront(String str) {
        int n = str.length();
        if (n < 2) {
            return str + str + str;
        }
        return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
    }

    /*
     * Given a string, if a length 2 substring appears at both its beginning and
     * end, return a string without the substring at the beginning, so "HelloHe"
     * yields "lloHe". The substring may overlap with itself, so "Hi" yields "".
     * Otherwise, return the original string unchanged.
     * 
     */
    public static String without2(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return str.substring(2);
        }
        return str;
    }

    /*
     * Given a string, return a version without the first 2 chars. Except keep the
     * first char if it is 'a' and keep the second char if it is 'b'. The string may
     * be any length. Harder than it looks.
     */
    public static String deFront(String str) {
        if (str.startsWith("ab")) {
            return "ab" + str.substring(2);
        } else if (str.charAt(0) == 'a') {
            return 'a' + str.substring(2);
        } else if (str.charAt(1) == 'b') {
            return 'b' + str.substring(2);
        }
        return str.substring(2);
    }

    /*
     * Given a string and a second "word" string, we'll say that the word matches
     * the string if it appears at the front of the string, except its first char
     * does not need to match exactly. On a match, return the front of the string,
     * or otherwise return the empty string. So, so with the string "hippo" the word
     * "hi" returns "hi" and "xip" returns "hip". The word will be at least length
     * 1.
     * 
     */
    public static String startWord(String str, String word) {
        int n = str.length();
        int m = word.length();
        if (str.startsWith(word)) {
            return word;
        }
        if (n == 0) {
            return "";
        }
        if (n == 1 && m == 1) {
            return str;
        }
        if (m == 1) {
            if (str.substring(0).equals(word)) {
                return word;
            } else if (str.substring(1, 2).equals(word)) {
                return str.substring(0, 1);
            }
        }
        if (str.substring(1).startsWith(word.substring(1))) {
            return str.substring(0, m);
        }
        return "";
    }

    /*
     * Given a string, if the first or last chars are 'x', return the string without
     * those 'x' chars, and otherwise return the string unchanged.
     */
    public static String withoutX(String str) {
        int n = str.length();
        if (n <= 1) {
            return "";
        }
        if (str.charAt(0) == 'x' && str.charAt(n - 1) == 'x') {
            return str.substring(1, n - 1);
        } else if (str.charAt(0) == 'x') {
            return str.substring(1);
        } else if (str.charAt(n - 1) == 'x') {
            return str.substring(0, n - 1);
        }
        return str;
    }

    /*
     * Given a string, if one or both of the first 2 chars is 'x', return the string
     * without those 'x' chars, and otherwise return the string unchanged. This is a
     * little harder than it looks.
     */
    public static String withoutX2(String str) {
        if(str.isEmpty()){
            return str;
        }
        if(str.startsWith("xx")){
            return str.substring(2);
        }
        if(str.charAt(0) == 'x'){
            return str.substring(1);
        } else if(str.charAt(1) == 'x'){
            return str.substring(0, 1) + str.substring(2);
        }
        return str;
    }
    

}
