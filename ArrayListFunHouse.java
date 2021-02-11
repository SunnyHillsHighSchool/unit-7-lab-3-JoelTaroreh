//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
 public static ArrayList<Integer> getListOfFactors(int number)
 {
    //declare ArrayList<Integer> factors
    ArrayList<Integer> factors = new ArrayList<Integer>();
    //for loop from 2 to number-1 (int i as control variable)
    for(int i = 2; i < number; i++) {
      //if statement, if number % i equals 0
      if(number % i == 0) {
        //add i to factors
        factors.add(i);
      }
    }
    //return factors
    return factors;

 }
 
 public static void keepOnlyCompositeNumbers( List<Integer> nums )
 {
    //initialize int x to 0
    int x = 0;
    //while loop, if x is less than the size of nums - 1
    while(x<nums.size()) {
      //if statement, if the (size of (getListOfFactors of (element x of nums))) is <= 1
      if(getListOfFactors(nums.get(x)).size() <= 1) {
        //remove element x of nums
        nums.remove(x);
      }
      //else
      else {
        //add 1 to x
        x++;
      }
    }

 }
}