def insertionSort(array):
    # Write your code here.
    # range(0, len(array)) = range(len(array))
    """
    1. scan left to right (outer loop)
    on 0, the outer loop says 
    'can we start the while?'
    while says no.
    
    on 1, outer loop set i to 1,
    so j is 1, so the inner loop starts.
    
    2. scan left to right (inner loop)
    3. compare current with previous
    4. if prev > curr then swap positions
    
    [ 2, 3, 1 ] 
    
    if i = 0, scan is [2 3 1]
    inner loop at 0, 
    j = 0 so skip.
    
    
    j = 1, so compare 3 (array[1]) with 2 (array[0])
    we skip 0, but still use it.
    
    3 not less than 2, so skip.

    j = 1, 1 3 4 5 6 7 8 9 10 2
    j = 9, 1 3 4 5 6 7 8 9 10 2
    while (2 < 10)
    swap 2 and 10
    1 3 4 5 6 7 8 9 2 10
    j = 8
    1 3 4 5 6 7 8 2 9 10
    j = 7
    1 3 4 5 6 7 2 8 9 10
    j = 6... etc
    j = 1
    1 2 3 4 5 6 7 8 9 10
    """
    for i in range(0, len(array)):

        j = i
        while(j > 0 and array[j] < array[j-1]):
            swap(array, j, j-1)
            j-=1

    return array
            

def swap(array, j, c):
    temp = array[j]
    array[j] = array[c]
    array[c] = temp
        

