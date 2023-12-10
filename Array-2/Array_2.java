public class Array_2 {

    public static int countEvens(int[] nums) {
        int counter = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int bigDiff(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        return max - min;
    }

    public static int centeredAverage(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
            sum += nums[i];
        }
        sum -= max;
        sum -= min;
        return sum / n;
    }

    public static int sum13(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 13) {
                i += 1;
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }

    public static int sum67(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 6) {
                sum += 0;
                while (nums[i] != 7) {
                    sum += 0;
                    i++;
                }
                sum += 0;
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }

    public static boolean has22(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return false;
        }
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == 2) {
                if (nums[i + 1] == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean lucky13(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    }

    public static boolean sum28(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 2) {
                sum += 2;
            }
        }
        if (sum == 8) {
            return true;
        }
        return false;
    }

    public static boolean more14(int[] nums) {
        int n = nums.length;
        int counterOne = 0;
        int counterFour = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                counterOne++;
            }
            if (nums[i] == 4) {
                counterFour++;
            }
        }
        if (counterOne > counterFour) {
            return true;
        }
        return false;
    }

    public static int[] fizzArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    public static boolean only14(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 1) {
                if (nums[i] != 4) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String[] fizzArray2(int n) {
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = String.valueOf(i);
        }
        return array;
    }

    public static boolean no14(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                for (int j = i; j < n; j++) {
                    if (nums[j] == 4) {
                        return false;
                    }
                }
            } else if (nums[i] == 4) {
                for (int j = 0; j < n; j++) {
                    if (nums[j] == 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean isEverywhere(int[] nums, int val) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val) {
                return false;
            }
        }
        return true;
    }

    public static boolean either24(int[] nums) {
        int n = nums.length;
        boolean hasTwo2s = false;
        boolean hasTow4s = false;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                hasTwo2s = true;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                hasTow4s = true;
            }
        }
        if (hasTwo2s == true && hasTow4s == true) {
            return false;
        } else if (hasTwo2s == true || hasTow4s == true) {
            return true;
        }
        return false;
    }

    public static int matchUp(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            if (diff <= 2) {
                if (diff != 0) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static boolean has77(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == 7) {
                if (nums[i + 1] == 7) {
                    return true;
                }
                if (i < n - 2) {
                    if (nums[i + 2] == 7) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean has12(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                for (int j = i; j < n; j++) {
                    if (nums[j] == 2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean modThree(int[] nums) {
        int n = nums.length;
        int counter = 0;
        boolean isEven = false;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                if (isEven == false) {
                    counter = 0;
                    isEven = true;
                }
                counter++;
                if (counter == 3) {
                    return true;
                }
            } else {
                if (isEven == true) {
                    counter = 0;
                    isEven = false;
                }
                counter++;
                if (counter == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean haveThree(int[] nums) {
        int n = nums.length;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 3) {
                if (i < n - 1) {
                    if (nums[i + 1] == 3) {
                        break;
                    }
                }
                counter++;
            }
        }
        if (counter == 3) {
            return true;
        }
        return false;
    }

    public boolean twoTwo(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            if (n == 1) {
                if (nums[0] != 2) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        boolean isAlright = false;
        boolean hasTwo = false;
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                if (nums[i] == 2) {
                    if (nums[i - 1] != 2) {
                        return false;
                    } else {
                        break;
                    }
                }
            }
            if (nums[i] == 2) {
                hasTwo = true;
                if (nums[i + 1] == 2) {
                    isAlright = true;
                    i++;
                } else {
                    isAlright = false;
                    break;
                }
            }
        }
        if (!hasTwo) {
            return true;
        }
        return isAlright;
    }

    public static boolean sameEnds(int[] nums, int len) {
        int n = nums.length;
        int[] firstLen = new int[len];
        int[] lastLen = new int[len];
        for (int i = 0; i < len; i++) {
            firstLen[i] = nums[i];
        }
        for (int i = 0; i < len; i++) {
            for (int j = n - len; j < n; j++) {
                lastLen[i] = nums[j];
                i++;
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++, i++) {
                if (firstLen[i] != lastLen[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean tripleUp(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return false;
        }
        int diff = 0;
        boolean isAlright = true;
        for (int i = 0; i < n - 2; i++) {
            diff = nums[i + 1] - nums[i];
            if (diff != 1) {
                isAlright = false;
            } else {
                diff = nums[i + 2] - nums[i + 1];
                if (diff != 1) {
                    isAlright = false;
                } else {
                    isAlright = true;
                    break;
                }
            }
        }
        return isAlright;
    }

    public static int[] fizzArray3(int start, int end) {
        int n = end - start;
        int[] array = new int[n];
        if (n == 0) {
            return array;
        }
        for (int i = 0; i < n; i++) {
            for (int j = start; j < end; j++) {
                array[i] = j;
                i++;
            }
        }
        return array;
    }

    public static int[] shiftLeft(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return nums;
        }
        int holder = nums[0];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                nums[i] = nums[j];
                i++;
            }
        }
        nums[n - 1] = holder;
        return nums;
    }

    public static int[] tenRun(int[] nums) {
        int n = nums.length;
        int multipleOfTen;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] % 10 == 0) {
                multipleOfTen = nums[i];
                while (nums[i + 1] % 10 != 0) {
                    nums[i + 1] = multipleOfTen;
                }
            }
        }
        return nums;
    }

    public static int[] pre4(int[] nums) {
        int n = nums.length;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 4) {
                counter++;
            } else {
                break;
            }
        }
        int[] array = new int[counter];
        for (int i = 0; i < counter; i++) {
            array[i] = nums[i];
        }
        return array;
    }

    public static int[] post4(int[] nums) {
        int n = nums.length;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 4) {
                index = i + 1;
            }
        }
        int m = n - index;
        int[] array = new int[m];
        for (int i = 0; i < m; i++) {
            for (int j = index; j < n; j++) {
                array[i] = nums[j];
                i++;
            }
        }
        return array;
    }

    public static int[] notAlone(int[] nums, int val) {
        int n = nums.length;
        for (int i = 1; i < n - 1; i++) {
            if (nums[i] == val) {
                if (nums[i - 1] != val && nums[i + 1] != val) {
                    nums[i] = Math.max(nums[i - 1], nums[i + 1]);
                }
            }
        }
        return nums;
    }

    public static int[] zeroFront(int[] nums) {
        int n = nums.length;
        int[] array = new int[n];
        int zeroCounter = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i] == 0) {
                zeroCounter++;
            }
        }
        for (int i = 0; i < zeroCounter; i++) {
            array[i] = 0;
        }
        return array;
    }


}
