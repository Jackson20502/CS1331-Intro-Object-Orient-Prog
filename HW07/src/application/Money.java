package application;

/**
 *
 * @author 14918 Jiacheng Zhang
 * @version 1.0
 */
public class Money {
    private static int numOfCoins = 0;
    private static int index = 0;
    /**
     * Count the total amount of money in dollars contained in the array.
     * @param array An array of cents.
     * @return the total amount of money.
     */
    public static double countTotal(int[] array) {
        if (array.length == 0) {
            return 0.0;
        } else {
            int totalCents = 0;
            double totalDollars = 0;
            int length = array.length;
            totalCents = countCents(length, array);
            totalDollars = totalCents / 100.0;
            return totalDollars;
        }
    }
    /**
     * Find money the customer has left to pay and return it.
     * @param requiredMoney The amount of money required for a purchase in dollars.
     * @param array An array of cents used to pay for the purchase.
     * @return the difference in dollars.
     */
    public static double findDifference(double requiredMoney, int[] array) {
        double sumOfArray = countTotal(array);
        return requiredMoney - sumOfArray;
    }
    /**
     * Find a way to make this change using as few coins as possible.
     * @param change The change you are forming.
     * @return the minimum number of coins.
     */
    public static int makeChange(int change) {
        return countCoins(change);
    }
    /**
     * Using greedy method to find a way to make this change using as few coins as possible.
     * @param change The change you are forming.
     * @param array An array of integers representing values of possible coins.
     * @return the number of coins using the greedy method.
     */
    public static int makeChange(int change, int[] array) {
        return countCoinsWithArray(change, array);
    }
    /**
     * Count total cents in an array.
     * @param n n.
     * @param array An array hold cents.
     * @return total cents.
     */
    public static int countCents(int n, int[] array) {
        if (n == 1) {
            return array[n - 1];
        } else {
            return countCents(n - 1, array) + array[n - 1];
        }
    }
    /**
     * Count the minimum coins.
     * @param change Change.
     * @return the minimum coins.
     */
    public static int countCoins(int change) {
        if (change == 0) {
            int minCoins = numOfCoins;
            numOfCoins = 0;
            return minCoins;
        } else if (change >= 25) {
            numOfCoins++;
            return countCoins(change - 25);
        } else if (change >= 10) {
            numOfCoins++;
            return countCoins(change - 10);
        } else if (change >= 5) {
            numOfCoins++;
            return countCoins(change - 5);
        } else {
            numOfCoins++;
            return countCoins(change - 1);
        }
    }
    /**
     * Count the minimum coins with greedy method.
     * @param change Change.
     * @param array An array hold cents.
     * @return the minimum coins.
     */
    public static int countCoinsWithArray(int change, int[] array) {
        int minCoins = 0;
        if (change > 0) {
            if (array[index] > change) {
                index++;
            } else {
                numOfCoins++;
                change -= array[index];
            }
            return countCoinsWithArray(change, array);
        } else {
            minCoins = numOfCoins;
            numOfCoins = 0;
            return minCoins;
        }
    }
    /**
     * The Main method.
     * @param args args.
     */
    public static void main(String[] args) {
        int[] array0 = {};
        int[] array1 = {3, 5, 14, 28, 20, 8, 50};
        int[] array2 = {3, 5, 14};
        int[] array3 = {6, 5, 1};
        System.out.println(countTotal(array0));
        System.out.println(countTotal(array1));
        System.out.println(findDifference(6.25, array0));
        System.out.println(findDifference(6.25, array2));
        System.out.println(makeChange(55));
        System.out.println(makeChange(19, array3));
    }
}
