
package gyari;

import java.util.Arrays;

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
    Ember e0=new Ember("Peti","Érd",1999);
    Ember e1=new Ember("Xénia","BP",2000);
    Ember e2=new Ember("Adam","Göd",1989);
    Ember[] emberek=new Ember[]{e0,e1,e2};
    kiirEmberTomb("---eredeti (Ember):",emberek);
    Arrays.sort(emberek);
    kiirEmberTomb("---eredeti (Ember):",emberek);
    }
    
    private static void kiirEmberTomb(String cim, Ember[]tomb){
        System.out.println(cim);
        for (Ember s:tomb){
            System.out.println(s);
        }
    }
    
}
