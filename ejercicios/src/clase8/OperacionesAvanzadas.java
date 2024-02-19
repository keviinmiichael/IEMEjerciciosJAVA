package clase8;


public class OperacionesAvanzadas {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public int sumar(int[] numeros) {
        int resultado = 0;
        for (int numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public double sumar(double[] numeros) {
        double resultado = 0;
        for (double numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }

    public int operacionPersonalizada(int a, int b, int c, String operacion) {
        if ("multiplicar".equals(operacion)) {
            return a * b * c;
        } else if ("restar".equals(operacion)) {
            return a - b - c;
        } else {
    
            System.out.println("Operación no válida");
            return 0;
        }
    }

    public static void main(String[] args) {

        OperacionesAvanzadas operaciones = new OperacionesAvanzadas();
        
        System.out.println("Suma de dos enteros: " + operaciones.sumar(5, 3));
        System.out.println("Suma de tres enteros: " + operaciones.sumar(5, 3, 2));

        int[] listaEnteros = {1, 2, 3, 4};
        System.out.println("Suma de una lista de enteros: " + operaciones.sumar(listaEnteros));

        System.out.println("Suma de dos decimales: " + operaciones.sumar(2.5, 3.7));

        double[] listaDecimales = {1.2, 2.5, 3.0};
        System.out.println("Suma de una lista de decimales: " + operaciones.sumar(listaDecimales));

        System.out.println("Operación personalizada (multiplicar): " + operaciones.operacionPersonalizada(2, 3, 4, "multiplicar"));
        System.out.println("Operación personalizada (restar): " + operaciones.operacionPersonalizada(10, 4, 2, "restar"));
    }
}
