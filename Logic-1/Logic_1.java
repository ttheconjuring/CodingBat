public class Logic_1 {

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend == false) {
            if (cigars >= 40 && cigars <= 60)
                return true;
        } else {
            if (cigars >= 40)
                return true;
        }
        return false;
    }

    public static int dateFashion(int you, int date) {
        if ((you >= 8 && date <= 2) || (you <= 2 && date >= 8)) {
            return 0;
        }
        if (you >= 8 || date >= 8) {
            return 2;
        } else if (you <= 2 || date <= 2) {
            return 0;
        }
        return 1;
    }

    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer == true) {
            if (temp >= 60 && temp <= 100) {
                return true;
            }
        } else if (isSummer == false) {
            if (temp >= 60 && temp <= 90) {
                return true;
            }
        }
        return false;
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday == false) {
            if (speed <= 60) {
                return 0;
            } else if (speed > 60 && speed <= 80) {
                return 1;
            } else if (speed > 80) {
                return 2;
            }
        } else if (isBirthday == true) {
            if (speed <= 65) {
                return 0;
            } else if (speed > 65 && speed <= 85) {
                return 1;
            } else if (speed > 85) {
                return 2;
            }
        }
        return 0;
    }

    public static int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum > 9 && sum < 20) {
            return 20;
        }
        return sum;
    }

    public static String alarmClock(int day, boolean vacation) {
        if (vacation == false) {
            if (day >= 1 && day <= 5) {
                return "7:00";
            } else {
                return "10:00";
            }
        } else if (vacation == true) {
            if (day >= 1 && day <= 5) {
                return "10:00";
            } else {
                return "off";
            }
        }
        return "";
    }

    public static boolean love6(int a, int b) {
        if (a == 6 || b == 6) {
            return true;
        }
        int sum = a + b;
        int diff = a - b;
        int diff2 = b - a;
        return (sum == 6 || diff == 6 || diff2 == 6);
    }

    public static boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode == true) {
            return (n <= 1 || n >= 10);
        }
        return (n >= 1 && n <= 10);
    }

    public static boolean specialEleven(int n) {
        return (n % 11 == 0 || n % 11 == 1);
    }

    public static boolean more20(int n) {
        return (n % 20 == 1 || n % 20 == 2);
    }

    public static boolean old35(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return false;
        }
        return (n % 3 == 0 || n % 5 == 0);
    }

    public static boolean less20(int n) {
        return (n % 20 == 18 || n % 20 == 19);
    }

    public static boolean nearTen(int num) {
        return false;
    }

    public static int teenSum(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        }
        return a + b;
    }

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep == true) {
            return false;
        }
        if (isMorning == true) {
            if (isMom == true) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public static int teaParty(int tea, int candy) {
        if (tea >= 5 && candy >= 5) {
            return 1;
        }
        if (tea >= (2 * candy) || candy >= (2 * tea)) {
            return 2;
        }
        if (tea < 5 || candy < 5) {
            return 0;
        }
        return 0;
    }

    public static String fizzString(String str) {
        int n = str.length();
        if (str.charAt(0) == 'f' && str.charAt(n - 1) == 'b') {
            return "FizzBuzz";
        }
        if (str.charAt(0) == 'f') {
            return "Fizz";
        } else if (str.charAt(n - 1) == 'b') {
            return "Buzz";
        }
        return str;
    }

    public static String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz" + "!";
        }
        if (n % 3 == 0) {
            return "Fizz" + "!";
        }
        if (n % 5 == 0) {
            return "Buzz" + "!";
        }
        return n + "!";
    }

    public boolean twoAsOne(int a, int b, int c) {
        return ((a + b == c) || (b + c == a) || (c + a == b));
    }

    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk == true) {
            if (c > b) {
                return true;
            }
        }
        return (a < b && b < c);
    }

    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk == true) {
            return ((a == b && b < c) || (a < b && b == c) || (a == b && b == c));
        }
        return (a < b && b < c);
    }

    public static boolean lastDigit(int a, int b, int c) {
        int rightmostA = a % 10;
        int rightmostB = b % 10;
        int rightmostC = c % 10;
        return ((rightmostA == rightmostB) || (rightmostB == rightmostC) || (rightmostC == rightmostA)
                || (rightmostA == rightmostB && rightmostB == rightmostC));
    }

    public static boolean lessBy10(int a, int b, int c) {
        int Am10 = a - 10;
        int Bm10 = b - 10;
        int Cm10 = c - 10;
        return ((a <= Bm10 || a <= Cm10) || (b <= Am10 || b <= Cm10) || (c <= Am10 || c <= Bm10));
    }

    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles == true) {
            if (die1 == 6 && die2 == 6) {
                return 7;
            }
            if (die1 == die2) {
                return die1 + die2 + 1;
            }
        }
        return die1 + die2;
    }

    public static int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        }
        if (a % 5 == b % 5) {
            return Math.min(a, b);
        }
        return Math.max(a, b);
    }

    public static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        }
        if (a == b && b == c) {
            return 5;
        }
        if (a != b && a != c) {
            return 1;
        }
        return 0;
    }

    public static int greenTicket(int a, int b, int c) {
        if (a != b && b != c && c != a) {
            return 0;
        }
        if (a == b && b == c) {
            return 20;
        }
        if ((a == b) || (b == c) || (c == a)) {
            return 10;
        }
        return 0;
    }

    public static int blueTicket(int a, int b, int c) {
        int aPb = a + b;
        int bPc = b + c;
        int aPc = a + c;
        if (aPb == 10 || bPc == 10 || aPc == 10) {
            return 10;
        }
        if ((aPb - 10 == bPc) || (aPb - 10 == aPc)) {
            return 5;
        }
        return 0;
    }

    public static boolean shareDigit(int a, int b) {
        if (a / 10 == b / 10) {
            return true;
        } else if (a % 10 == b % 10) {
            return true;
        } else if ((a / 10 == b % 10) || (a % 10 == b / 10)) {
            return true;
        }
        return false;
    }

    public static int sumLimit(int a, int b) {
        int sum = a + b;
        String lengthOfA = String.valueOf(a);
        String lengthOfSum = String.valueOf(sum);
        if(lengthOfA.length() < lengthOfSum.length()){
            return a;
        }
        return sum;
    }

}
