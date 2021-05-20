/**
 * author: AJ Mitchell
 * student nr.: 219024979
 * date: 12/05/2021
 * project description: using collection interface in java
 */
import java.util.Collection;
import java.util.ArrayList;

public class CollectionExample {

    private Collection<String> letters = new ArrayList<String>();

    public boolean add (String letter){
        return letters.add(letter);
    }

    public boolean remove(String letter){
        return letters.remove(letter);
    }

    public boolean find(String letter){
        return letters.contains(letter);
    }

    public Collection<String> getLetters(){
        return letters;
    }

}

