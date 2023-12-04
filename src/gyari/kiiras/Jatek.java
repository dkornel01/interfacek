/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gyari.kiiras;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class Jatek {
     public static void main(String[] args) throws FileNotFoundException, IOException {
     Karakter healer=new Karakter("Adam", "Healer", 10);
     Karakter harcos=new Karakter("Dávid", "harcos", 1);
     Karakter varazslo=new Karakter("Gründi", "varazsló",1);
     Karakter[] jatekos=new Karakter[]{harcos,varazslo};
     harcos.szintlepes();
     harcos.szintlepes();
     harcos.felvesz("pajzs");
     varazslo.szintlepes();
     varazslo.felvesz("tekercs");
     varazslo.szintlepes();
     varazslo.szintlepes();
     KiirKonzolra("---bekapcsolás után",jatekos);
     FileOutputStream fout=new FileOutputStream("karakterek.bin");
     //try (ObjectOutputStream objki=new ObjectOutputStream(new FileOutputStream("karakterek.bin")));        
     ObjectOutputStream objKi=new ObjectOutputStream(fout);
     objKi.writeObject(jatekos);
     objKi.close();
     //Kiirfajlba("---bekapcsolás után", jatekos)
     harcos=null;
     varazslo=null;
     jatekos=null;
     try (ObjectInputStream objBe= new ObjectInputStream(new FileInputStream("karakterek.bin"))){
      jatekos=(Karakter[]) objBe.readObject();
         KiirKonzolra("---bekapcsolás után", jatekos);
     }
     catch (FileNotFoundException ex){
         Logger.getLogger(Jatek.class.getName()).log(Level.SEVERE,null,ex);
     }
     private static void KiirKonzolra(String cim,Karakter[] tomb){
         System.out.println(cim);
        for (Karakter jatekos:tomb){
            System.out.println(jatekos);
        }
     }
     private static String Kiirfajlba(String cim,Karakter[] tomb){
        String teszt;
        teszt=cim;
        for (Karakter jatekos:tomb){
            teszt+=jatekos.toString();
        }
        return teszt;
     }

}
