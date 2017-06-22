package ejerciciofibonacci;

/**
 * Sucesión de Fibonacci:  1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377...
 * ecuacion f(n) = f(n-1) + f(n-2)
 * partiendo de estos 2 valores f(0)=0 y f(1)=1
 * se obtienen el siguiente f(2) = f(2-1) + f(2-2) = f(1) + f(0) = 1
 * y así sucesivamente, por tanto nuestro algoritmo para calcular el fibonacci en java sería
 * si n es menor que 2 entonces devuelve n, en otro caso devuelve fib(n-1) + fib(n-2)
 * @author JUAN
 */
public class EjercicioFibonacci {
    
    // declaramos la función fuera del método main que es quien la va a llamar
    static int fib(int n) {
        
        if(n<2)
            return n;
        else
            return fib(n-1)+fib(n-2);
    }
    
    // llamamos a la función declarada anteriormente desde el método main
    public static void main(String[] args) {
        
        for (int i = 0; i <= 30; i++) {
            System.out.println("El fibonacci("+i+") es: "+fib(i));
        }
        
        
        
    }
    
}
