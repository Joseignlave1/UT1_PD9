public class Ejercicio2 {
        public static void main(String[] args) {
            int n = 10;//Le pasamos el valor de N, en este caso 10
            int base = 2;//Se inicializa en 2 verificando si N es divisible  por algún número entre 2 y su raíz cuadrada
            int par = 2;
            int imp = 1;
            int sum = 0;
            double raiz = Math.sqrt(n);
            boolean isPrime = true;

            while(base <= raiz) {
                while(n % base == 0) {//Sí es divisible con la base(base empieza en 2 pero aumenta en cada iteracción hasta que sea menor o igual a su raíz cuadrada
                    isPrime = false; // Entonces no es primo, salimos del while
                    break;
                }
                base += 1;
            }
            //Si no encontramos un divisor, entonces es primo.
            System.out.println("es primo? " + isPrime);
            while(isPrime && par <= n) {//Par <= n, ya qué par empieza en 2 ya qué es el menor par en números positivos, le sumamos 2 en cada iteracción,
                //No puede ser mayor que n ya qué sino estamos contando pares más allá de N
                sum += par; // sum = sum + par = 0 + 2 = 2;
                par += 2; //Par aumenta 2 en cada iteracción así recorremos los pares hasta N
            }
            while(!isPrime && imp <= n) {
                sum += imp;
                imp += 2; //Impar empieza en 1 y en cada iteracción recorremos los Impares hasta N
            }

            System.out.println("La suma es " + sum);
        }
    }

    //Propiedad
    //Cualquier número compuesto(NO primo) tiene al menos un divisor, distinto de 1 y si mismo que no excede su raíz cuadrada
    //O sea que es <= a su raiz cuadrada

