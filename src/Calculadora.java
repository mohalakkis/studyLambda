public class Calculadora implements CalcSomar{

    private int valor1;
    private int valor2;


    @Override
    public int somar(int valor1, int valor2) {
        return (valor1 + valor2);
    }
}
