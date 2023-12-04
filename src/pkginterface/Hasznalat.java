
package pkginterface;


public class Hasznalat {

    public static void main(String[] args) {
        Ajto ajto=new Ajto();
        Esernyo esernyo = new Esernyo();
        Konzerdoboz konzerv=new Konzerdoboz();
        Nyithato[] nyithato=new Nyithato[5];
        nyithato[0]=(Nyithato) ajto;
        nyithato[1]=(Nyithato) esernyo;
        nyithato[2]=(Nyithato) konzerv;
        for (Nyithato ny:nyithato){
            if (ny instanceof Nyithato){
                ny.kinyit();
            }
        }
        Nyithato nyithato2=new Nyithato() {
            @Override
            public void kinyit() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
    }
    
}
