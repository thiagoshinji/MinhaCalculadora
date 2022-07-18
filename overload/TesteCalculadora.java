package overload;

public class TesteCalculadora {

    public static void main(String[] args) {

        MinhaCalculadora calc = new MinhaCalculadora();
        
        calc.soma(1, 2);
        calc.soma(1.00, 2.00);

    }
    
}
