//initial version -> running a recursive function, time complexity is bad O(2^n) space is O(n)

static int GetNthFib(int n)
{
    if (n == 2)
    {
        return 1;
    }
    if (n == 1)
    {
        return 0;
    }
    //every time you calculate the number, you handle
    //the base cases, (1 and 2) and if not, recursion begins

    return GetNthFib(n - 1) + GetNthFib(n - 2);
}

Console.WriteLine(GetNthFib(6));


//optimised version can be created with memoization that leads to less calls in the call stack
//if n occurs more than once, memoize it in a hash table. This way, you calculate f(n) once, 
//and if the number occurs again, it can be grabbed from a hashtable at constant time.