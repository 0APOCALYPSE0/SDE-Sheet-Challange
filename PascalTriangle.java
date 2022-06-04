/*
Problem Statement
You are given an integer N. Your task is to return a 2-D ArrayList containing the pascal’s triangle till the row N.
A Pascal's triangle is a triangular array constructed by summing adjacent elements in preceding rows. Pascal's triangle contains the values of the binomial coefficient. For example in the figure below.

1  
1 1 
1 2 1 
1 3 3 1

Here for the third row, you will see that the second element is the summation of the above two-row elements i.e. 2=1+1, and similarly for row three 3 = 1+2 and 3 = 1+2.
*/



import java.util.* ;
import java.io.*;
import java.util.ArrayList;

public class PascalTriangle {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
        ArrayList<ArrayList<Long>> list = new ArrayList<ArrayList<Long>>();
        for(int i=0; i<n; i++){
            ArrayList nestedList = new ArrayList<Long>();
            for(int j=0; j<=i; j++){
                if(i == 0 || j == 0){
                    nestedList.add(1l);
                }else{
                    Long val1;
                    Long val2;
                    if(i == j){
                        val1 = 0l;
                        val2 = list.get(i-1).get(j-1);
                    }else{
                        val1 = list.get(i-1).get(j);
                        val2 = list.get(i-1).get(j-1);
                    }
                    nestedList.add(val1+val2);
                }
            }
            list.add(nestedList);
        }
        for(int i=0; i<n; i++){
          for(int j=0; j<=i; j++){
            System.out.print(list.get(i).get(j));
          }
          System.out.println();
        }
        return list;
	}

  public static void main(String args[]){
    PascalTriangle.printPascal(6);
  }
}
