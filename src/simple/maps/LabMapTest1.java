
package simple.maps;
import common.Pokemon;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author agajkowski
 */
public class LabMapTest1 {
    public static void main(String[] args) {
        
   
    
    Pokemon p1 = new Pokemon("Charmander", 1, 10, true);
    Pokemon p2 = new Pokemon("Bulbasaur", 4, 10, true);
    Pokemon p3 = new Pokemon("Squirtle", 7, 10, true);
    
    Map map = new HashMap();
    map.put(new Integer(1),p1);
    map.put(new Integer(4),p2);
    map.put(new Integer(7),p3);
    
    Pokemon test = (Pokemon)map.get(1);
        System.out.println(test);
    
    
    Map<Integer,Pokemon> map2 = new HashMap<Integer,Pokemon>();
    map2.put(1,p1);
    map2.put(4, p2);
    map2.put(7, p3);
    
    Pokemon genTest1 = map2.get(4);
        System.out.println(genTest1);
    }
 }