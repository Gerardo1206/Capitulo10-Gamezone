package capitulo.pkg10.ejercicio.pkg11;

public class Die {
    private Integer value;
    
    public Die(){
        Integer randomValue = ((int)(Math.random() * 6)+1);
        value=randomValue;
    }

    public Integer getValue() {
        return value;
    }

    
    
}