public class Main {
    //Ejercicio 1
    public static int calcularFactorial(int num) {
        int factorial = 1;
        for(int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
        return factorial;
    }

    public static void main(String[] args) {
        calcularFactorial(6);
    }


}