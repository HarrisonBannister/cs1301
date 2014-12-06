package lab13;

public class FindTheSumsTester {
  /* Example array used for testing */
  private static int[][] array1 = { 
      {3, 2, 1, 1},
      {2, 5, 6, 2},
      {1, 2, 9, 8}
  };
  
  /* Example array used for testing */
  private static int[][] array2 = {
      {7, 3, 8, 5, 6, 7, 4, 1, 9, 5},
      {8, 1, 6, 1, 8, 4, 6, 9, 9, 6},
      {9, 2, 4, 8, 6, 1, 1, 3, 6, 2},
      {3, 6, 8, 3, 1, 9, 2, 7, 9, 6},
      {5, 7, 7, 6, 3, 5, 6, 4, 2, 1},
      {6, 4, 5, 5, 7, 6, 8, 1, 9, 7},
      {8, 4, 5, 4, 3, 7, 1, 2, 1, 8},
      {6, 8, 6, 7, 8, 6, 2, 4, 6, 2},
      {7, 8, 6, 8, 3, 8, 2, 2, 8, 5},
      {8, 7, 7, 6, 6, 2, 9, 9, 5, 8}
  };
  
  /*
   * Test the required methods in FindTheSums
   * parameter args not used
   */
  public static void main(String[] args){
      arrayToStringTest();
      horizontalSumsTest();
      verticalSumsTest();
  }
  
  /*
   * Test the arrayToString method in FindTheSums
   */
  private static void arrayToStringTest() {
      String methodCallResult, correctAnswer;
      System.out.println("Testing arrayToString method:");
      System.out.println(array1.length);
      
      methodCallResult = FindTheSums.arrayToString(array1);
      correctAnswer = "3 2 1 1\n2 5 6 2\n1 2 9 8";
      if(methodCallResult.equals(correctAnswer)){
          System.out.println("arrayToString(array1) test passed");
      }
      else{
          System.out.println("arrayToString(array1) test failed");
      }
      methodCallResult = FindTheSums.arrayToString(array2);
      correctAnswer = "7 3 8 5 6 7 4 1 9 5\n8 1 6 1 8 4 6 9 9 6\n9 2 4 8 6 1 1 3 6 2\n3 6 8 3 1 9 2 7 9 6\n5 7 7 6 3 5 6 4 2 1\n6 4 5 5 7 6 8 1 9 7\n8 4 5 4 3 7 1 2 1 8\n6 8 6 7 8 6 2 4 6 2\n7 8 6 8 3 8 2 2 8 5\n8 7 7 6 6 2 9 9 5 8";
      if(methodCallResult.equals(correctAnswer)){
          System.out.println("arrayToString(array2) test passed");
      }
      else{
          System.out.println("arrayToString(array2) test failed");
      }
      System.out.println();
  }

  /*
   * Test the horizontalSums method in FindTheSums
   */ 
  private static void horizontalSumsTest(){
      int[][] horizontalSums;
      String arrayAsString;
      System.out.println("Testing horizontalSums method:");
      System.out.println("array1:");
      arrayAsString = FindTheSums.arrayToString(array1);
      System.out.println(arrayAsString);
      System.out.println("horizontalSums(array1, 7):");
      horizontalSums = FindTheSums.horizontalSums(array1, 7);
      arrayAsString = FindTheSums.arrayToString(horizontalSums);
      System.out.println(arrayAsString);
      System.out.println("array2:");
      arrayAsString = FindTheSums.arrayToString(array2);
      System.out.println(arrayAsString);
      System.out.println("horizontalSums(array2, 20):");
      horizontalSums = FindTheSums.horizontalSums(array2, 20);
      arrayAsString = FindTheSums.arrayToString(horizontalSums);
      System.out.println(arrayAsString);
      System.out.println("horizontalSums(array2, 25):");
      horizontalSums = FindTheSums.horizontalSums(array2, 25);
      arrayAsString = FindTheSums.arrayToString(horizontalSums);
      System.out.println(arrayAsString);
      System.out.println();
  }

  /*
   * Test the verticalSums method in FindTheSums
   */
  private static void verticalSumsTest() {
    int[][] verticalSums;
    String arrayAsString;
    System.out.println("Testing verticalSums method:");
    System.out.println("array1:");
    arrayAsString = FindTheSums.arrayToString(array1);
    System.out.println(arrayAsString);
    System.out.println("verticalSums(array1, 22):");
    verticalSums = FindTheSums.verticalSums(array1, 22);
    arrayAsString = FindTheSums.arrayToString(verticalSums);
    System.out.println(arrayAsString);
    System.out.println("array2:");
    arrayAsString = FindTheSums.arrayToString(array2);
    System.out.println(arrayAsString);
    System.out.println("verticalSums(array2, 14):");
    verticalSums = FindTheSums.verticalSums(array2, 14);
    arrayAsString = FindTheSums.arrayToString(verticalSums);
    System.out.println(arrayAsString);
    System.out.println("verticalSums(array2, 33):");
    verticalSums = FindTheSums.verticalSums(array2, 33);
    arrayAsString = FindTheSums.arrayToString(verticalSums);
    System.out.println(arrayAsString);
    System.out.println();
  }
}
