public class MetodosOrdenamiento {

    /// metodo que devuelve un arreglo de enteros ordenados por Burbuja

    public int[] sortByBubble(int[] arreglo, boolean logs) {

        /// Code to sort

        /// Obtener el tamaño del arreglo

        int tamano = arreglo.length;

        /// Bucle externo que va a recorrer todo el arreglo
        for (int i = 0; i < tamano; i++) {
            if (logs) {
                System.out.println("\n Pasado numero " + i);
            }

            /// bucle for interno que compara el elemento actual con los siguientes
            for (int j = i + 1; j < tamano; j++) {
                if (logs) {
                    System.out.println("i=" + arreglo[i] + " j=" + arreglo[j]);
                }
                if (arreglo[i] > arreglo[j]) {
                    /// intercambiamos los elementos

                    if (logs) {
                        System.out.println(" -Si es mayor asi que cambio ");
                    }
                    int temporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;
                    if (logs) {
                        System.out.println(" ");
                        imprime(arreglo);
                    }

                }
            }

        }

        return arreglo;
    }
    /// 2. metodo que devuelve un arreglo de enteros ordenados por Seleccion

    /// 3. metodo que devuelve un arreglo de enteros ordenados por Insercion

    /// 4. Metodo que imprime un arreglo
    public void imprime(int[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {

            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

    }

}
