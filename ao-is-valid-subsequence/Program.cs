static bool IsValidSubsequence(List<int> array, List<int> sequence) {
    //two pointers
    //sequence 0 and array 0
    int s = 0;

    for (int i = 0; i < array.Count; i++) {
        if (array[i] == sequence[s]) {
            s++;
        }
        if (s == sequence.Count) {
            return true;
        }
    }
    return false;
  }

  List<int> testArray = [5, 1, 22, 25, 6, -1, 8, 10];
  List<int> testSubsequence = [1, 6, -1, 10];

Console.WriteLine(IsValidSubsequence(testArray, testSubsequence));