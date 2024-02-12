using System.Collections.Generic;
using System.Collections;
using System;


string TournamentWinner(
    List<List<string> > competitions, List<int> results
  ) {
    Hashtable scores = new Hashtable(); 
    int rv = 0;
    string result = "";
    //scores key value data structure
    //"team" : 3 

    //if it wins and doesn't exist, add it, else do nothing
    //if it wins and exists, update value (e.g. "team": 6)

    //option 1 - for loops
    for (int i = 0; i < competitions.Count; i++){
        //get the string name
        List<string> k = competitions[i];
        //swap it to work with the correct index
        int r = results[i] == 0 ? 1 : 0;
        //DictionaryEntry result = 

        //check if key exists
        bool containsKey = scores.ContainsKey(k[r]);

        //if no key
        if (!containsKey) {
            scores[k[r]] = 3;
        }
        //if key
        if (containsKey) {
            //cast value as int to retrieve it for increment
            int old = (int)scores[k[r]];
            scores[k[r]] = old + 3;
        }
 
        if ((int)scores[k[r]] > rv) {
            //update rv with current if higher
            rv = (int)scores[k[r]];
            //update string with string from original collections array
            result = k[r];
        }
         
        
    }

    return result;
  }


List<List<string>> competition = [
  ["HTML", "C#"],
  ["C#", "Python"],
  ["Python", "HTML"]
];

List<int> results = [0,0,1];

Console.WriteLine(TournamentWinner(competition, results)); //Python
