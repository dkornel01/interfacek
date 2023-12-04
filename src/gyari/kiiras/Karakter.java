
package gyari.kiiras;

import java.io.Serial;
import java.io.Serializable;
import java.lang.annotation.Annotation;


public class Karakter implements Serializable{
    private String nev,kaszt,felszereles;
    private int szint;

    public Karakter(String nev, String kaszt, int szint) {
        this.nev = nev;
        this.kaszt = kaszt;
        this.szint = szint;
    }
    public void felvesz(String targy){
        felszereles+= targy+ "\n";
    }
    public void szintlepes(){
        szint++;
    }
    @Override
    public String toString() {
        String f=felszereles.isEmpty() ? "üres" : felszereles;
        return "Karakter{" + "nev=" + nev + ", kaszt=" + kaszt + ", felszereles=" + felszereles + ", szint=" + szint + '}';
    }


    
}

