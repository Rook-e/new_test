/**
 * author: AJ Mitchell
 * student nr.: 219024979
 * date: 12/05/2021
 * project description: using java collections
 */

import java.util.LinkedList;

public class ListExample {
    private LinkedList<String> names = new LinkedList<String>();

    public LinkedList<String> getList(){
        return this.names;
    }

    public void add (String name){
        names.add(name);
    }

    public void remove(String name){
        names.remove(name);
    }

    public boolean find(String name){
        return names.contains(name);
    }
}

