import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  void binarySearchV1() {
    Assertions.assertFalse(Main.binarySearchV1(1, new int[] { 2, 3, 4, 5 }));
    Assertions.assertFalse(Main.binarySearchV1(2, new int[] { 1,3 }));
    Assertions.assertFalse(Main.binarySearchV1(2, new int[] { 0 }));
    Assertions.assertFalse(Main.binarySearchV1(2, new int[0]));
    Assertions.assertFalse(Main.binarySearchV1(31, new int[] { -10,-9,-8,-7,-6,-5,-4,-3,-2,0,1,2,3,5,10,12,20,30 }));
    Assertions.assertFalse(Main.binarySearchV1(38, new int[] { -10,-9,-8,-7,-6,-5,-4,-3,-2,0,1,2,3,5,10,12,20,30 }));
    Assertions.assertFalse(Main.binarySearchV1(-11, new int[] { -10,-9,-8,-7,-6,-5,-4,-3,-2,0,1,2,3,5,10,12,20,30 }));
    Assertions.assertFalse(Main.binarySearchV1(-55, new int[] { -10,-9,-8,-7,-6,-5,-4,-3,-2,0,1,2,3,5,10,12,20,30 }));

    Assertions.assertTrue(Main.binarySearchV1(12, new int[] { 0,1,2,3,4,5,6,7,8,9,10,11,12 }));
    Assertions.assertTrue(Main.binarySearchV1(-10, new int[] { -10,-9,-8,-7,-6,-5,-4,-3,-2,0,1,2,3,5,10,12,20,30 }));
    Assertions.assertTrue(Main.binarySearchV1(-2, new int[] { -10,-9,-8,-7,-6,-5,-4,-3,-2,0,1,2,3,5,10,12,20,30 }));
    Assertions.assertTrue(Main.binarySearchV1(1, new int[] { -10,-9,-8,-7,-6,-5,-4,-3,-2,0,1,2,3,5,10,12,20,30 }));
    Assertions.assertTrue(Main.binarySearchV1(30, new int[] { -10,-9,-8,-7,-6,-5,-4,-3,-2,0,1,2,3,5,10,12,20,30 }));
    Assertions.assertTrue(Main.binarySearchV1(12, new int[] { 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14 }));
    Assertions.assertTrue(Main.binarySearchV1(7, new int[] { 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14 }));
    Assertions.assertTrue(Main.binarySearchV1(1, new int[] { 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14 }));
    Assertions.assertTrue(Main.binarySearchV1(0, new int[] { 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14 }));
    Assertions.assertTrue(Main.binarySearchV1(13, new int[] { 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14 }));
    Assertions.assertTrue(Main.binarySearchV1(4, new int[] { 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14 }));
    Assertions.assertTrue(Main.binarySearchV1(0, new int[] {
      0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,23,24,25,26,27,28,29,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,58,59,70,220,3340,
      5522,10000,10001,10002,10003,10004,11000,11001,11002,11200,11300
    }));
    Assertions.assertTrue(Main.binarySearchV1(11001, new int[] {
      0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,23,24,25,26,27,28,29,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,58,59,70,220,3340,
      5522,10000,10001,10002,10003,10004,11000,11001,11002,11200,11300
    }));
    Assertions.assertTrue(Main.binarySearchV1(21, new int[] {
      0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,23,24,25,26,27,28,29,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,58,59,70,220,3340,
      5522,10000,10001,10002,10003,10004,11000,11001,11002,11200,11300
    }));
    Assertions.assertTrue(Main.binarySearchV1(3340, new int[] {
      0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,23,24,25,26,27,28,29,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,58,59,70,220,3340,
      5522,10000,10001,10002,10003,10004,11000,11001,11002,11200,11300
    }));
    Assertions.assertTrue(Main.binarySearchV1(11300, new int[] {
      0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,23,24,25,26,27,28,29,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,58,59,70,220,3340,
      5522,10000,10001,10002,10003,10004,11000,11001,11002,11200,11300
    }));
  }

  @Test
  void binarySearchV2() {
    Assertions.assertFalse(Main.binarySearchV2(1, new int[] { 2, 3, 4, 5 }));
    Assertions.assertFalse(Main.binarySearchV2(2, new int[] { 1,3 }));
    Assertions.assertFalse(Main.binarySearchV2(2, new int[] { 0 }));
    Assertions.assertFalse(Main.binarySearchV2(2, new int[0]));
    Assertions.assertFalse(Main.binarySearchV2(31, new int[] { -10,-9,-8,-7,-6,-5,-4,-3,-2,0,1,2,3,5,10,12,20,30 }));
    Assertions.assertFalse(Main.binarySearchV2(38, new int[] { -10,-9,-8,-7,-6,-5,-4,-3,-2,0,1,2,3,5,10,12,20,30 }));
    Assertions.assertFalse(Main.binarySearchV2(-11, new int[] { -10,-9,-8,-7,-6,-5,-4,-3,-2,0,1,2,3,5,10,12,20,30 }));
    Assertions.assertFalse(Main.binarySearchV2(-55, new int[] { -10,-9,-8,-7,-6,-5,-4,-3,-2,0,1,2,3,5,10,12,20,30 }));

    Assertions.assertTrue(Main.binarySearchV2(12, new int[] { 0,1,2,3,4,5,6,7,8,9,10,11,12 }));
    Assertions.assertTrue(Main.binarySearchV2(-10, new int[] { -10,-9,-8,-7,-6,-5,-4,-3,-2,0,1,2,3,5,10,12,20,30 }));
    Assertions.assertTrue(Main.binarySearchV2(-2, new int[] { -10,-9,-8,-7,-6,-5,-4,-3,-2,0,1,2,3,5,10,12,20,30 }));
    Assertions.assertTrue(Main.binarySearchV2(1, new int[] { -10,-9,-8,-7,-6,-5,-4,-3,-2,0,1,2,3,5,10,12,20,30 }));
    Assertions.assertTrue(Main.binarySearchV2(30, new int[] { -10,-9,-8,-7,-6,-5,-4,-3,-2,0,1,2,3,5,10,12,20,30 }));
    Assertions.assertTrue(Main.binarySearchV2(12, new int[] { 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14 }));
    Assertions.assertTrue(Main.binarySearchV2(7, new int[] { 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14 }));
    Assertions.assertTrue(Main.binarySearchV2(1, new int[] { 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14 }));
    Assertions.assertTrue(Main.binarySearchV2(0, new int[] { 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14 }));
    Assertions.assertTrue(Main.binarySearchV2(13, new int[] { 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14 }));
    Assertions.assertTrue(Main.binarySearchV2(4, new int[] { 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14 }));
    Assertions.assertTrue(Main.binarySearchV2(0, new int[] {
      0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,23,24,25,26,27,28,29,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,58,59,70,220,3340,
      5522,10000,10001,10002,10003,10004,11000,11001,11002,11200,11300
    }));
    Assertions.assertTrue(Main.binarySearchV2(11001, new int[] {
      0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,23,24,25,26,27,28,29,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,58,59,70,220,3340,
      5522,10000,10001,10002,10003,10004,11000,11001,11002,11200,11300
    }));
    Assertions.assertTrue(Main.binarySearchV2(21, new int[] {
      0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,23,24,25,26,27,28,29,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,58,59,70,220,3340,
      5522,10000,10001,10002,10003,10004,11000,11001,11002,11200,11300
    }));
    Assertions.assertTrue(Main.binarySearchV2(3340, new int[] {
      0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,23,24,25,26,27,28,29,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,58,59,70,220,3340,
      5522,10000,10001,10002,10003,10004,11000,11001,11002,11200,11300
    }));
    Assertions.assertTrue(Main.binarySearchV2(11300, new int[] {
      0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,23,24,25,26,27,28,29,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,58,59,70,220,3340,
      5522,10000,10001,10002,10003,10004,11000,11001,11002,11200,11300
    }));
  }
}
