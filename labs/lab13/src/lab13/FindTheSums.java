package lab13;

import java.util.ArrayList;

public class FindTheSums {
  /**
   * FindTheSums.java Author: Harrison Bannister Submission Date: 12/6/14
   *
   * Purpose: This program finds numbers that add up to a given sum occurring horizontally or vertically
   * in a 2 dimensional array.
   *
   * Statement of Academic Honesty:
   *
   * The following code represents my own work. I have neither received nor given inappropriate
   * assistance. I have not copied or modified code from any source other than the course webpage or
   * the course textbook. I recognize that any unauthorized assistance or plagiarism will be handled
   * in accordance with the University of Georgia's Academic Honesty Policy and the policies of this
   * course. I recognize that my work is based on an assignment created by the Department of
   * Computer Science at the University of Georgia. Any publishing or posting of source code for
   * this project is strictly prohibited unless you have written consent from the Department of
   * Computer Science at the University of Georgia.
   */

  // inputs 2 dimensional array and outputs into a readable string
  public static String arrayToString(int[][] a) {
    String array = "";

    // iterates down rows
    for (int i = 0; i < a.length; i++) {

      // iterates through each row
      for (int j = 0; j < a[i].length; j++) {
        int arrayElement = a[i][j]; // value of current element
        String arrayElementString = Integer.toString(arrayElement);

        // adds a space b/t numbers if not last element
        if (j < a[i].length - 1) {
          array = array + arrayElementString + " ";
        } else {
          array = array + arrayElementString;
        }
      }

      // adds a new line if not last line
      if (i < a.length - 1) {
        array = array + "\n";
      }
    }

    // returns array string
    return array;
  }

  // inputs a 2 dimensional array and a sum to find in the array and outputs array containing only
  // numbers adding up to said sum horizontally
  public static int[][] horizontalSums(int[][] a, int sumToFind) {
    // initialize output array as empty copy of input array
    int[][] b = new int[a.length][a[0].length];
    
    // for loops to initially populate output array with 0
    for (int i = 0; i < b.length; i++) {
      for (int j = 0; j < b[i].length; j++) {
        b[i][j] = 0;
      }
    }

    // for loop iterates down through the rows of the input array
    for (int i = 0; i < a.length; i++) {

      // for loop iterates through row horizontally
      for (int j = 0; j < a[i].length; j++) {
        int relativePosition = 0;
        int sum = 0;
        // initialize arraylist to hold temporary possible values adding up to sum
        ArrayList<Integer> tempArrayList = new ArrayList<Integer>();

        // for loop iterates from starting point j horizontally and stops if it overshoots sum to
        // find or equals the sum
        for (int k = j; (k < a[i].length && sum < sumToFind); k++) {
          relativePosition = (k - j) + 1; // holds position relative to starting horizontal iterator
          tempArrayList.add(a[i][k]); // adds int to arraylist to hold possible values equalling the
                                      // sum to find
          sum += a[i][k]; // holds sum

          // when sum to find is found, this loop adds the temporary array list in the appropriate
          // position into the output array
          if (sum == sumToFind) {

            // for loop replaces 0s in output array with numbers adding up to sum to find
            for (int l = 0; l < relativePosition; l++) {
              b[i][j + l] = tempArrayList.get(l);
            }
          }
        }
      }
    }

    // returns b array with only numbers adding up to sum horizontally left, other elements are 0
    return b;
  }

  // inputs a 2 dimensional array and a sum to find in the array and outputs array containing only
  // numbers adding up to said sum vertically
  public static int[][] verticalSums(int[][] a, int sumToFind) {
    // initialize output array as empty copy of input array
    int[][] b = new int[a.length][a[0].length];
    
    // for loops to initially populate output array with 0
    for (int i = 0; i < b.length; i++) {
      for (int j = 0; j < b[i].length; j++) {
        b[i][j] = 0;
      }
    }

    // for loop iterates across columns
    for (int j = 0; j < a[0].length; j++) {

      // for loop iterates vertically down each column
      for (int i = 0; i < a.length; i++) {
        int relativePosition = 0;
        int sum = 0;
        // initialize arraylist to hold temporary possible values adding up to sum
        ArrayList<Integer> tempArrayList = new ArrayList<Integer>();

        // for loop iterates from starting point j horizontally and stops if it overshoots sum to
        // find or equals the sum
        for (int k = i; (k < a.length && sum < sumToFind); k++) {
          relativePosition = (k - i) + 1; // holds position relative to starting vertical iterator
          tempArrayList.add(a[k][j]); // adds int to arraylist to hold possible values equalling the
                                      // sum to find
          sum += a[k][j]; // holds sum

          // when sum to find is found, this loop adds the temporary array list in the appropriate
          // position into the output array
          if (sum == sumToFind) {

            // for loop replaces 0s in output array with numbers adding up to sum to find
            for (int l = 0; l < relativePosition; l++) {
              b[i + l][j] = tempArrayList.get(l);
            }
          }
        }
      }
    }

    // returns b array with only numbers adding up to sum vertically left, other elements are 0
    return b;
  }

}