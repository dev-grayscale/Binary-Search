/**
 * Binary search is an algorithm which has outstanding performance compared to linear search, if the input is sorted.
 *
 * At each step we get the element in the middle, comparing it to the element we're looking for. If they match -> return true.
 * If the search element is > than the element in the middle -> we discard the subset less than or equal to middle element.
 * If the element is < instead -> we discard the subset bigger than or equal to the middle element.
 * We're only interested in the subset which could have a value as big/small as one we're searching. We repeat that process until we establish that
 * there are no more elements to visit, and we couldn't find the one we were looking for.
 */
public class Main {

  /**
   * The first approach of solving this challenge will use recursion.
   *
   * Info: With linear search and collection of 100 000 elements, you would've visited 100 000 elements in the worst case.
   * With binary search you will visit only log2 100000 ~ 17 elements.
   *
   * Time Complexity: O(log n)
   * Space Complexity: O(log n)
   */
  public static boolean binarySearchV1(int search, int[] elements) {
    if (elements.length == 0) {
      return false;
    }

    // Grasping the whole collection initially [0, elements.length - 1]
    return binarySearchV1(search, elements, 0, elements.length - 1);
  }

  private static boolean binarySearchV1(int search, int[] elements, int start, int end) {
    // If start exceeds the end at some point, we cannot go any further -> false
    if (start > end) {
      return false;
    }

    // continuously getting the middle index
    int mid = (start + end) / 2;

    if (elements[mid] == search) {
      return true;
    } else if (search > elements[mid]) {
      // Proceed only to the right side
      return binarySearchV1(search, elements, mid + 1, end);
    } else {
      // Proceed only to the left side
      return binarySearchV1(search, elements, start, mid - 1);
    }
  }

  /**
   * The second version will solve it in a non-recursive manner.
   *
   * We'll need 2 variables again: start and end that will hold the subset we're interested in.
   *
   * The core logic will be handled by a while loop being accessed as long as start <= end (we're in the collection length)
   * and everything else is exactly the same as in the definition. We'll simply update the start/end variables accordingly to
   * make sure we're dealing with the right subset.
   *
   * Time Complexity: O(log n)
   * Space Complexity: O(1)
   */
  public static boolean binarySearchV2(int search, int[] elements) {
    if (elements.length == 0) {
      return false;
    }

    int start = 0;
    int end = elements.length - 1;
    int mid;

    while (start <= end) {
      mid = (start + end) / 2;

      if (search == elements[mid]) {
        return true;
      } else if (search > elements[mid]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }

    return false;
  }
}
