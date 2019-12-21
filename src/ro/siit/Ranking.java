package ro.siit;

import java.util.Arrays;

/**
 * @author Cosmin Stanjic
 *
 * The Ranking class implements a method for sorting the array of objects and one for displaying the results on the screen
 */

public class Ranking {
  /**
   * Inside the main() method we are creating 4 objects of type SalesRepresentative which we are then including in an array
   * of the same type.
   * We are printing on the console the content of the newly created array reps.
   * We create an instance of type Ranking called sorter on which we call the bubbleSort() and the showResult() methods.
   * On the console we can see the contents of the reps array printed in descending order based on revenue figure..
   */
  public static void main(String[] args) {
    SalesRepresentative rep1 = new SalesRepresentative("Razvan",16, 120);
    SalesRepresentative rep2 = new SalesRepresentative("Flavia", 4, 400);
    SalesRepresentative rep3 = new SalesRepresentative("Victor", 7, 350);
    SalesRepresentative rep4 = new SalesRepresentative("Dana",10, 380);

    SalesRepresentative[] reps = {rep1, rep2, rep3, rep4};

    for (SalesRepresentative rep : reps) {
      System.out.println(rep);
    }

    Ranking sorter = new Ranking();
    sorter.bubbleSort(reps, 0, reps.length);
    sorter.showResult(reps);
  }

  /**
   * This method takes in 3 parameters:
   * @param array is an array of objects
   * @param fromIndex of type int
   * @param toIndex of type int
   * It is used to sort an array of objects of type SalesRepresentative according to their revenue figure in descending order.
   * It is implementing a bubble sort mechanism and the compareTo() method defined in the SalesRepresentative class.
   */
  public void bubbleSort(Object[] array, int fromIndex, int toIndex) {
    Object d;
    for (int i = toIndex - 1; i > fromIndex; i--) {
      boolean isSorted = true;
      for (int j = fromIndex; j < i; j++) {
        // If elements in wrong order then swap them
        if (((Comparable) array[j]).compareTo(array[j + 1]) < 0) {
          isSorted = false;
          d = array[j + 1];
          array[j + 1] = array[j];
          array[j] = d;
        }
      }
      // If no swapping then array is already sorted
      if (isSorted)
        break;
    }
  }

  /**
   * This method takes in 1 parameter:
   * @param reps of type SalesRepresentative
   * The method uses a foreach loop to print the results of the sorted array of SalesRepresentative objects.
   */
  public void showResult(SalesRepresentative[] reps) {
    System.out.println("\nThe sorted array of sales reps in descending order of revenue:\n");
    for (SalesRepresentative rep : reps) {
      System.out.println(rep);
    }
  }
}
