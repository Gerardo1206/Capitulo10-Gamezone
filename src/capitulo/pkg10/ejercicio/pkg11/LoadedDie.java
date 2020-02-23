package capitulo.pkg10.ejercicio.pkg11;

public class LoadedDie {
    protected Integer value;
    
    public LoadedDie(){
        Integer randomValue = ((int)(Math.random() * 5)+2);
        value=randomValue;
    }

    public Integer getValue() {
        return value;
    }
    
}