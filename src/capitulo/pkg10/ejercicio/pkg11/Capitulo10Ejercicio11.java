package capitulo.pkg10.ejercicio.pkg11;

public class Capitulo10Ejercicio11 {
    public static void main(String[] args) {
        Die d1=new Die();
        Die d2=new Die();
        LoadedDie ld1=new LoadedDie();
        int i=0;
        int cd1=0;
        while(i<=1000){
        if(d1.getValue()>d2.getValue()){
            cd1++;
        }
        d1=new Die();
        ld1=new LoadedDie();
        i++;
        }
        i=0;
        int cd2=0;
        while(i<=1000){
        if(d1.getValue()>ld1.getValue()){
            cd2++;
        }
        d1=new Die();
        ld1=new LoadedDie();
        i++;
        }
        System.out.println("con dos dados regulares el primero gano:"+cd1+" veces de 1000");
        System.out.println("con un dado regular y otro cargado el primero gano:"+cd2+" veces de 1000");
    }
    
}
