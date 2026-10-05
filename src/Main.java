 void main() {
     System.out.println("bumerans...");
        int[] numeros = {2, 1, 2, 3, 3, 4, 2, 4};
        int total = Bumeranes(numeros);
        System.out.println("total de bumeranes: " + total);
    }

    public static int Bumeranes(int[] array) {
        int contador = 0;

        for (int i = 0; i <= array.length - 3; i++) {
            int primero = array[i];
            int segundo = array[i + 1];
            int tercero = array[i + 2];

            if (primero == tercero && primero != segundo) {
                System.out.println("[" + primero + ", " + segundo + ", " + tercero + "]");
                contador++;
            }
        }

        return contador;
    }
