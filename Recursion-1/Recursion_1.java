public class Recursion_1 {
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        return 2 + bunnyEars(bunnies - 1);
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        if (bunnies % 2 == 0) {
            return 3 + bunnyEars2(bunnies - 1);
        } else {
            return 2 + bunnyEars2(bunnies - 1);
        }
    }

    public static int triangle(int rows) {
        if (rows == 0) {
            return 0;
        } else if (rows == 1) {
            return 1;
        }
        return rows + triangle(rows - 1);
    }

    public static int sumDigits(int n) {
        if (n / 10 < 1) {
            return n;
        }
        return n % 10 + sumDigits(n / 10);
    }

    public static int count7(int n) {
        if (n < 10) {
            if (n == 7) {
                return 1;
            } else {
                return 0;
            }
        }
        if (n % 10 == 7) {
            return 1 + count7(n / 10);
        } else {
            return count7(n / 10);
        }
    }

    public static int count8(int n) {
        if (n < 10) {
            if (n == 8) {
                return 1;
            } else {
                return 0;
            }
        }
        if (n % 10 == 8) {
            if ((n / 10) % 10 == 8) {
                return 2 + count8(n / 10);
            } else {
                return 1 + count8(n / 10);
            }
        } else {
            return count8(n / 10);
        }
    }

    public static int powerN(int base, int n) {
        if (n == 1) {
            return base;
        }
        return base * powerN(base, n - 1);
    }

    public static int countX(String str) {
        int n = str.length();
        if (n < 2) {
            if (n == 1) {
                if (str.equals("x")) {
                    return 1;
                } else {
                    return 0;
                }
            } else if (n == 0) {
                return 0;
            }
        }
        if (str.charAt(n - 1) == 'x') {
            return 1 + countX(str.substring(0, n - 1));
        } else {
            return countX(str.substring(0, n - 1));
        }
    }

    public static int countHi(String str) {
        int n = str.length();
        if (n < 3) {
            if (n == 2) {
                if (str.equals("hi")) {
                    return 1;
                } else {
                    return 0;
                }
            } else if (n < 2) {
                return 0;
            }
        }
        if (str.substring(n - 2).equals("hi")) {
            return 1 + countHi(str.substring(0, n - 1));
        } else {
            return countHi(str.substring(0, n - 1));
        }
    }

    public static String changeXY(String str) {
        int n = str.length();
        if (str.isEmpty()) {
            return str;
        }
        if (str.substring(n - 1).equals("x")) {
            return changeXY(str.substring(0, n - 1)) + "y";
        }
        return changeXY(str.substring(0, n - 1)) + str.substring(n - 1);
    }

    public static String changePi(String str) {
        int n = str.length();
        if (n < 2) {
            return str;
        }
        if (str.endsWith("pi")) {
            return changePi(str.substring(0, n - 2)) + "3.14";
        }
        return changePi(str.substring(0, n - 1)) + str.substring(n - 1);
    }

    public static String noX(String str) {
        int n = str.length();
        if (str.isEmpty()) {
            return str;
        }
        if (str.substring(n - 1).equals("x")) {
            return noX(str.substring(0, n - 1));
        }
        return noX(str.substring(0, n - 1)) + str.substring(n - 1);
    }

    public static boolean array6(int[] nums, int index) {
        int n = nums.length;
        if (n == index) {
            return false;
        }
        if (nums[index] == 6) {
            return true;
        }
        return array6(nums, index + 1);
    }

    public static int array11(int[] nums, int index) {
        int n = nums.length;
        if (n == index) {
            return 0;
        }
        if (nums[index] == 11) {
            return 1 + array11(nums, index + 1);
        }
        return array11(nums, index + 1);
    }

    public static boolean array220(int[] nums, int index) {
        int n = nums.length;
        if (n < 2 || n - 1 == index) {
            return false;
        }
        if (nums[index] * 10 == nums[index + 1]) {
            return true;
        }
        return array220(nums, index + 1);
    }

    public static String allStar(String str) {
        int n = str.length();
        if (str.isEmpty() || n < 2) {
            return str;
        }
        return allStar(str.substring(0, n - 1)) + "*" + str.substring(n - 1);
    }

    public static String pairStar(String str) {
        int n = str.length();
        if (str.isEmpty() || n < 2) {
            return str;
        }
        if (str.substring(n - 1).equals(str.substring(n - 2, n - 1))) {
            return pairStar(str.substring(0, n - 1)) + "*" + str.substring(n - 1);
        }
        return pairStar(str.substring(0, n - 1)) + str.substring(n - 1);
    }

    public static String endX(String str) {
        int n = str.length();
        if (str.isEmpty() || n < 2) {
            return str;
        }
        if (str.charAt(0) == 'x') {
            return endX(str.substring(1)) + "x";
        }
        return str.charAt(0) + endX(str.substring(1));
    }

    public static int countPairs(String str) {
        int n = str.length();
        if (str.isEmpty() || n < 3) {
            return 0;
        }
        if (str.substring(n - 1).equals(str.substring(n - 3, n - 2))) {
            return 1 + countPairs(str.substring(0, n - 1));
        }
        return countPairs(str.substring(0, n - 1));
    }

    public static int countAbc(String str) {
        int n = str.length();
        if (str.isEmpty() || n < 3) {
            return 0;
        }
        if (str.substring(n - 3).equals("abc") || str.substring(n - 3).equals("aba")) {
            return 1 + countAbc(str.substring(0, n - 1));
        }
        return countAbc(str.substring(0, n - 1));
    }

    public static int count11(String str) {
        int n = str.length();
        if (str.isEmpty() || n < 2) {
            return 0;
        }
        if (str.substring(n - 2).equals("11")) {
            return 1 + count11(str.substring(0, n - 2));
        }
        return count11(str.substring(0, n - 1));
    }

    public static String stringClean(String str) {
        int n = str.length();
        if (str.isEmpty() || n < 2) {
            return str;
        }
        if (str.substring(n - 1).equals(str.substring(n - 2, n - 1))) {
            return stringClean(str.substring(0, n - 1));
        }
        return stringClean(str.substring(0, n - 1)) + str.substring(n - 1);
    }

    public static int countHi2(String str) {
        int n = str.length();
        if (str.isEmpty() || n < 2) {
            return 0;
        }
        if (n == 2) {
            if (str.equals("hi")) {
                return 1;
            } else {
                return 0;
            }
        }
        if (str.substring(n - 2).equals("hi")) {
            if (str.charAt(n - 3) == 'x') {
                return 0 + countHi2(str.substring(0, n - 1));
            } else {
                return 1 + countHi2(str.substring(0, n - 1));
            }
        }
        return countHi2(str.substring(0, n - 1));
    }

    public static String parenBit(String str) {
        int n = str.length();
        if (str.isEmpty() || n < 2) {
            return str;
        }
        if (str.charAt(0) != '(') {
            return parenBit(str.substring(1));
        } else if (str.charAt(n - 1) != ')') {
            return parenBit(str.substring(0, n - 1));
        } else {
            return str;
        }
    }

    public static boolean nestParen(String str) {
        int n = str.length();
        if (str.isEmpty()) {
            return true;
        }
        if (n == 1) {
            return false;
        }
        if (str.charAt(0) == '(' && str.charAt(n - 1) == ')') {
            return nestParen(str.substring(1, n - 1));
        }
        return false;
    }

    public static int strCount(String str, String sub) {
        int n = str.length();
        if (str.isEmpty()) {
            return 0;
        }
        if (str.endsWith(sub)) {
            return 1 + strCount(str.substring(0, n - sub.length()), sub);
        }
        return strCount(str.substring(0, n - 1), sub);
    }

    public static boolean strCopies(String str, String sub, int n) {
        if (n == 0) {
            return true;
        }
        if (str.length() < sub.length()) {
            return false;
        }
        if (str.isEmpty()) {
            return false;
        }
        if (str.endsWith(sub)) {
            return strCopies(str.substring(0, str.length() - 1), sub, n - 1);
        }
        return strCopies(str.substring(0, str.length() - 1), sub, n);
    }

    public static int strDist(String str, String sub) {
        if (str.isEmpty()) {
            return 0;
        }
        if (str.startsWith(sub) && str.endsWith(sub)) {
            return str.length();
        }
        if (!str.startsWith(sub)) {
            return strDist(str.substring(1), sub);
        }
        if (!str.endsWith(sub)) {
            return strDist(str.substring(0, str.length() - 1), sub);
        }
        return 0;
    }

}