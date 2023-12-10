public class Array_1 {
    /*
     * Given an array of ints, return true if 6 appears as either the first or last
     * element in the array. The array will be length 1 or more.
     * 
     */
    public static boolean firstLast6(int[] nums) {
        int length = nums.length;
        int first = nums[0];
        int last = nums[length - 1];
        if (first == 6 || last == 6)
            return true;
        else
            return false;
    }

    /*
     * Given an array of ints, return true if the array is length 1 or more, and the
     * first element and the last element are equal.
     */
    public static boolean sameFirstLast(int[] nums) {
        int length = nums.length;
        if (length == 0)
            return false;
        int first = nums[0];
        int last = nums[length - 1];
        if (length > 0 && first == last)
            return true;
        else
            return false;
    }

    /*
     * Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
     */
    public static int[] makePi() {
        int[] array = new int[3];
        array[0] = 3;
        array[1] = 1;
        array[2] = 4;
        return array;
    }

    /*
     * Given 2 arrays of ints, a and b, return true if they have the same first
     * element or they have the same last element. Both arrays will be length 1 or
     * more.
     */
    public static boolean commonEnd(int[] a, int[] b) {
        int lengthA = a.length;
        int lengthB = b.length;
        if (lengthA < 1 || lengthB < 1)
            return false;
        int firstA = a[0];
        int firstB = b[0];
        int lastA = a[lengthA - 1];
        int lastB = b[lengthB - 1];
        if (firstA == firstB || lastA == lastB)
            return true;
        else
            return false;
    }

    /*
     * Given an array of ints length 3, return the sum of all the elements.
     */
    public static int sum3(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++)
            sum += nums[i];
        return sum;
    }

    /*
     * Given an array of ints length 3, return an array with the elements
     * "rotated left" so {1, 2, 3} yields {2, 3, 1}.
     * 
     */
    public static int[] rotateLeft3(int[] nums) {
        int first = nums[0];
        int second = nums[1];
        int third = nums[2];
        int[] array = new int[3];
        array[0] = second;
        array[1] = third;
        array[2] = first;
        return array;
    }

    /*
     * Given an array of ints length 3, return a new array with the elements in
     * reverse order, so {1, 2, 3} becomes {3, 2, 1}.
     */
    public static int[] reverse3(int[] nums) {
        int first = nums[0];
        int second = nums[1];
        int third = nums[2];
        int[] array = new int[3];
        array[0] = third;
        array[1] = second;
        array[2] = first;
        return array;
    }

    /*
     * Given an array of ints length 3, figure out which is larger, the first or
     * last element in the array, and set all the other elements to be that value.
     * Return the changed array.
     */
    public static int[] maxEnd3(int[] nums) {
        int n = nums.length;
        int first = nums[0];
        int last = nums[n - 1];
        int[] array = new int[n];
        if (first > last) {
            for (int i = 0; i < n; i++)
                array[i] = first;
        } else if (first < last) {
            for (int i = 0; i < n; i++)
                array[i] = last;
        } else
            for (int i = 0; i < n; i++)
                array[i] = first;
        return array;
    }

    /*
     * public int[] maxEnd3(int[] nums) {
     * int max = Math.max(nums[0], nums[2]);
     * nums[0] = max;
     * nums[1] = max;
     * nums[2] = max;
     * return nums;
     * 
     * // Solution notes: you could write if-logic to figure out
     * // which element is the biggest, but here we use Math.max()
     * // to solve that part nicely.
     * }
     */

    /*
     * Given an array of ints, return the sum of the first 2 elements in the array.
     * If the array length is less than 2, just sum up the elements that exist,
     * returning 0 if the array is length 0.
     */
    public static int sum2(int[] nums) {
        int n = nums.length;
        int sum = 0;
        if (n == 0)
            return 0;
        if (n < 2) {
            sum = nums[0];
            return sum;
        } else
            sum = nums[0] + nums[1];
        return sum;
    }

    /*
     * Given 2 int arrays, a and b, each length 3, return a new array length 2
     * containing their middle elements.
     * 
     */
    public static int[] middleWay(int[] a, int[] b) {
        int middleA = a[1];
        int middleB = b[1];
        int[] array = new int[2];
        array[0] = middleA;
        array[1] = middleB;
        return array;
    }

    /*
     * Given an array of ints, return a new array length 2 containing the first and
     * last elements from the original array. The original array will be length 1 or
     * more.
     */
    public static int[] makeEnds(int[] nums) {
        int n = nums.length;
        int[] array = new int[2];
        if (n >= 2) {
            int first = nums[0];
            int last = nums[n - 1];
            array[0] = first;
            array[1] = last;
        } else if (n == 1) {
            array[0] = nums[0];
            array[1] = nums[0];
        }
        return array;
    }

    /*
     * Given an int array length 2, return true if it contains a 2 or a 3.
     */
    public static boolean has23(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 2 || nums[i] == 3)
                return true;
        return false;
    }

    /*
     * Given an int array length 2, return true if it does not contain a 2 or 3.
     */
    public static boolean no23(int[] nums) {
        boolean flag = true;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 2 || nums[i] == 3)
                flag = false;
        return flag;
    }

    /*
     * Given an int array, return a new array with double the length where its last
     * element is the same as the original array, and all the other elements are 0.
     * The original array will be length 1 or more. Note: by default, a new int
     * array contains all 0's.
     * 
     * makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
     * makeLast([1, 2]) → [0, 0, 0, 2]
     * makeLast([3]) → [0, 3]
     * 
     */
    public static int[] makeLast(int[] nums) {
        int last = nums[nums.length - 1];
        int n = 2 * nums.length;
        int[] array = new int[n];
        for (int i = 0; i < n - 1; i++) {
            array[i] = 0;
        }
        array[n - 1] = last;
        return array;
    }

    /*
     * Given an int array, return true if the array contains 2 twice, or 3 twice.
     * The array will be length 0, 1, or 2.
     */
    public static boolean double23(int[] nums) {
        boolean flag = true;
        int br2 = 0;
        int br3 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2)
                br2++;
            if (nums[i] == 3)
                br3++;
        }
        if (br2 == 2 || br3 == 2)
            return flag;
        else
            flag = false;
        return flag;
    }

    /*
     * Given an int array length 3, if there is a 2 in the array immediately
     * followed by a 3, set the 3 element to 0. Return the changed array.
     * 
     */
    public static int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 2 && nums[i + 1] == 3)
                nums[i + 1] = 0;
        return nums;
    }

    /*
     * Start with 2 int arrays, a and b, of any length. Return how many of the
     * arrays have 1 as their first element.
     * 
     */
    public static int start1(int[] a, int[] b) {
        int counter = 0;
        if (a.length > 0 && b.length > 0) {
            if (a[0] == 1 && b[0] == 1) {
                counter = 2;
            } else if (a[0] == 1 || b[0] == 1) {
                counter = 1;
            } else
                counter = 0;
        } else if (a.length == 0 && b.length > 0) {
            if (b[0] == 1)
                counter = 1;
        } else if (a.length > 0 && b.length == 0) {
            if (a[0] == 1)
                counter = 1;
        } else
            counter = 0;
        return counter;
    }

    /*
     * Start with 2 int arrays, a and b, each length 2. Consider the sum of the
     * values in each array. Return the array which has the largest sum. In event of
     * a tie, return a.
     */
    public static int[] biggerTwo(int[] a, int[] b) {
        int sumOfA = a[0] + a[1];
        int sumOfB = b[0] + b[1];
        if (sumOfA > sumOfB) {
            return a;
        } else if (sumOfA < sumOfB) {
            return b;
        } else
            return a;
    }

    /*
     * Given an array of ints of even length, return a new array length 2 containing
     * the middle two elements from the original array. The original array will be
     * length 2 or more.
     */
    public static int[] makeMiddle(int[] nums) {
        int n = nums.length;
        int[] array = new int[2];
        array[1] = nums[n / 2];
        array[0] = nums[n / 2 - 1];
        return array;
    }

    /*
     * Given 2 int arrays, each length 2, return a new array length 4 containing all
     * their elements.
     * 
     */
    public static int[] plusTwo(int[] a, int[] b) {
        int[] array = new int[4];
        array[0] = a[0];
        array[1] = a[1];
        array[2] = b[0];
        array[3] = b[1];
        return array;
    }

    /*
     * Given an array of ints, swap the first and last elements in the array. Return
     * the modified array. The array length will be at least 1.
     */
    public static int[] swapEnds(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums;
        int first = nums[0];
        int last = nums[n - 1];
        nums[0] = last;
        nums[n - 1] = first;
        return nums;
    }

    /*
     * Given an array of ints of odd length, return a new array length 3 containing
     * the elements from the middle of the array. The array length will be at least
     * 3.
     * 
     */
    public static int[] midThree(int[] nums) {
        int n = nums.length;
        int middle = n / 2;
        int[] array = new int[3];
        array[0] = nums[middle - 1];
        array[1] = nums[middle];
        array[2] = nums[middle + 1];
        return array;
    }

    /*
     * Given an array of ints of odd length, look at the first, last, and middle
     * values in the array and return the largest. The array length will be a least
     * 1.
     */
    public static int maxTriple(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        int first = nums[0];
        int middle = nums[n / 2];
        int last = nums[n - 1];
        int largest = 0;
        if (first > middle && first > last) {
            largest = first;
        } else if (middle > first && middle > last) {
            largest = middle;
        } else if (last > first && last > middle) {
            largest = last;
        }
        return largest;
    }

    /*
     * Given an int array of any length, return a new array of its first 2 elements.
     * If the array is smaller than length 2, use whatever elements are present.
     * 
     */
    public static int[] frontPiece(int[] nums) {
        int n = nums.length;
        int[] array = new int[2];
        if (n <= 2) {
            return nums;
        } else {
            array[0] = nums[0];
            array[1] = nums[1];
        }
        return array;
    }

    /*
     * We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
     * Return true if the given array contains an unlucky 1 in the first 2 or last 2
     * positions in the array.
     */
    public static boolean unlucky1(int[] nums) {
        int n = nums.length;
        if (n <= 1)
            return false;
        boolean flag = false;
        int first = nums[0];
        int second = nums[1];
        int lastbutone = nums[n - 2];
        int last = nums[n - 1];
        if (n == 2) {
            if (first == 1 && second == 3 || lastbutone == 1 && last == 3) {
                flag = true;
            }
        } else if (n >= 3) {
            if (first == 1 && second == 3 || lastbutone == 1 && last == 3 || second == 1 && nums[2] == 3) {
                flag = true;
            }
        }
        return flag;
    }

    /*
     * Given 2 int arrays, a and b, return a new array length 2 containing, as much
     * as will fit, the elements from a followed by the elements from b. The arrays
     * may be any length, including 0, but there will be 2 or more elements
     * available between the 2 arrays.
     */
    public static int[] make2(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        int[] array = new int[2];
        if (n1 >= 2) {
            array[0] = a[0];
            array[1] = a[1];
        } else if (n1 == 1 && n2 == 0) {
            array[0] = a[0];
            array[1] = a[0];
        } else if (n1 == 1 && n2 >= 1) {
            array[0] = a[0];
            array[1] = b[0];
        } else if (n1 == 0 && n2 == 0) {
            return array;
        } else if (n1 == 0 && n2 == 1) {
            array[0] = b[0];
            array[1] = b[0];
        } else if (n1 == 0 && n2 >= 2) {
            array[0] = b[0];
            array[1] = b[1];
        }
        return array;
    }

    /*
     * Given 2 int arrays, a and b, of any length, return a new array with the first
     * element of each array. If either array is length 0, ignore that array.
     * 
     */
    public static int[] front11(int[] a, int[] b) {
        int[] array = new int[2];
        int n1 = a.length;
        int n2 = b.length;
        if (n1 == 0 && n2 == 0) {
            return a;
        } else if (n1 == 1 && n2 == 0) {
            array[0] = a[0];
            array[1] = a[0];
        } else if (n1 == 0 && n2 == 1) {
            array[0] = b[0];
            array[1] = b[0];
        } else if (n1 >= 1 && n2 >= 1) {
            array[0] = a[0];
            array[1] = b[0];
        } else if (n1 == 0 && n2 >= 2) {
            int[] array2 = new int[1];
            array2[0] = b[0];
            return array2;
        } else if (n1 >= 2 && n2 == 0) {
            int[] array2 = new int[1];
            array2[0] = a[0];
            return array2;
        }
        return array;
    }

}
