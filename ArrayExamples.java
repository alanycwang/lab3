

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    int[] arr_new = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      arr_new[i] = arr[arr.length - i - 1];
    }
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr_new[i];
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[i] = arr[arr.length - i - 1];
    }
    return newArray;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    int idx = 0;
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] < lowest) { 
        lowest = arr[i]; 
        idx = i;
        }
    }
    double sum = 0;
    for(int i = 0; i < arr.length; i++) {
      if(i != idx) { sum += arr[i]; }
    }
    return sum / (arr.length - 1);
  }


}

