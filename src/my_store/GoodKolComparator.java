
package my_store;

import java.util.Comparator;

/*
 * @author kuznetsova_a
 */
public class GoodKolComparator implements Comparator<goods>{
  
    public int compare(goods a, goods b){
      
        if(a.getKol()> b.getKol())
            return 1;
        else if(a.getKol()< b.getKol())
            return -1;
        else
            return 0;
    }
}