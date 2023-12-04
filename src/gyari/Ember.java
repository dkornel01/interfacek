
package gyari;


public class Ember implements Comparable<Ember>{

private String nev,cim;
private int szuletes;

    public Ember(String nev, String cim, int szeletes) {
        this.nev = nev;
        this.cim = cim;
        this.szuletes = szuletes;
    }

    @Override
    public String toString() {
        return "Ember{" + "nev=" + nev + ", cim=" + cim + ", szeletes=" + szuletes + '}';
    }
    @Override
    public int compareTo(Ember masik) {
        if(this.szuletes<masik.szuletes){
           return -1;
       }
       else if (this.szuletes>masik.szuletes){
           return 1;
       }
       else {
           return 0;
       }
    }
}
