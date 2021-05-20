/**
 * author: AJ Mitchell
 * student nr.: 219024979
 * date: 12/05/2021
 * project description: using java collections
 */

import java.util.HashMap;

public class MapExample {
    private HashMap<Integer,String> brandsMap = new HashMap<Integer,String>();

    public HashMap<Integer,String> getMap(){
        return this.brandsMap;
    }

    public void add (Integer num, String brand){
        brandsMap.put(num,brand);
    }

    public void remove(Integer num){
        brandsMap.remove(num);
    }

    public boolean find(String brand){
        return brandsMap.containsValue(brand);
    }
}

