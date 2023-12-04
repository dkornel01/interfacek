
package gyari.rendezese_tobbszemponttal;

import java.util.Comparator;

public class korRendezesek implements Comparator<Ember>{
    
     @Override
    public int compare(Ember egyik, Ember masik) {
        return egyik.getSzuletes()-masik.getSzuletes();
    }
}
