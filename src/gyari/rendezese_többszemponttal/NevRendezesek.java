
package gyari.rendezese_tobbszemponttal;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class NevRendezesek implements Comparator<Ember>{

    @Override
    public int compare(Ember egyik, Ember masik) {
        Collator coll=Collator.getInstance(new Locale("hu","HU"));
        return egyik.getNev().compareTo(masik.getNev());
    }
    
}
