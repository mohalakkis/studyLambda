public class Main {
    public static void main(String[] args) {
        CalcSomar somaLambda = (a, b) -> a + b;

        int result1 = somaLambda(1,2);

        int result = somaLambda.somar(3,9);
        System.out.println(result);

        Calculadora calc = new Calculadora();

        System.out.println(calc.somar(5, 10));

    }
}
