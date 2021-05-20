/**
 * author: AJ Mitchell
 * student nr.: 219024979
 * date: 12/05/2021
 * project description: using java collections
 */

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    private Set<String> wordSet = new HashSet<String>();

    public Set<String> getSet(){
        return this.wordSet;
    }

    public void add (String word){
        wordSet.add(word);
    }

    public void remove(String word){
        wordSet.remove(word);
    }

    public boolean find(String word){
        return wordSet.contains(word);
    }
}


