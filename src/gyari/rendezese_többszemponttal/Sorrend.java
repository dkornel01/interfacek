
package gyari.rendezese_tobbszemponttal;

import java.util.Arrays;
import java.util.Comparator;

public class Sorrend {
    
    public static void main(String[] args) {
    String [] szoveg=new String[3];
    szoveg[0]="gad";
    szoveg[1]="ed";
    szoveg[2]="ad";
    Arrays.sort(szoveg);
    for (int i=0;i<szoveg.length;i++){
     System.out.println(szoveg[i]);
    }
    Ember e0=new Ember("Xé","Érd",1999);
    Ember e1=new Ember("Peti","BP",2000);
    Ember e2=new Ember("Ádam","Göd",1989);
    Ember e3=new Ember("Anna","Veres",1979);
    Ember e4=new Ember("Márk","BP",1991);
    Ember e5=new Ember("Leo","Miskolc",1991);
    Ember[] emberek=new Ember[]{e0,e1,e2,e3,e4,e5};
    kiirEmberTomb("---eredeti (Ember):",emberek);
    Arrays.sort(emberek,new NevRendezesek());
    kiirEmberTomb("---eredeti (Ember):",emberek);
    Arrays.sort(emberek,new korRendezesek());
    kiirEmberTomb("---eredeti (Ember):", emberek);
    Arrays.sort(emberek,new Comparator<Ember>() {
        @Override
        public int compare(Ember o1, Ember o2) {
           return o1.getCim().compareTo(o2.getCim());
        }
    });
    kiirEmberTomb("---eredeti (Ember):", emberek);
    }
    
    private static void kiirEmberTomb(String cim, Ember[]tomb){
        System.out.println(cim);
        for (Ember ember:tomb){
            System.out.println(ember);
        }
    }
    
}
