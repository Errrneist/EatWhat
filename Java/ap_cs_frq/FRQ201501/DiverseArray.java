package com.Trinnect.FRQ201501;

/**
 * Auto Generated Java Class.
 */
public class DiverseArray {
  
  /* ADD YOUR CODE HERE */
  public static int arraySum(int[] arr)
  {
    if(arr == null || arr.length == 0)
      return 0;
    int sum = 0;
    /**
    for (int i=0; i<arr.length; i++)
      sum += arr[i];
      */
    for(int x : arr)
      sum += x;
    return sum;
  }
  //####################################################################################
  public static int[] rowSums(int[][] arr2D)
  {
    if (arr2D == null || arr2D.length == 0)
      return null;
    int[] rowSums = new int[arr2D.length];
    
    for (int i=0; i<arr2D.length; i++)
      rowSums[i] = arraySum(arr2D[i]);
    
    return rowSums;
  }
  //####################################################################################
  public static boolean isDiverse(int[][] arr2D)
  {
    if (arr2D == null || arr2D.length == 0)
      return true;
    
    int[] rowSums = rowSums(arr2D);
    boolean isDiverse = true;
    /**
    HashSet <Integer> s = new HashSet<Integer>();
    for (int x : rowSumes)
      s.add(x);
    return s.size() == rowSums.length;
    */
    
    for (int i=0; i<rowSums.length; i++)
    {
      for(int j=0; j < rowSums.length; j++)
      {
        if(i != j && rowSums[i] == rowSums[j])
        {
          isDiverse = false;
        }
      }
    }
    return isDiverse;
   }
    
}
  

