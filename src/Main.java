public class Main {
    public static void main(String[] args) {
        System.out.println("La respuets de sumar 5+3+7 es: ");
        suma(5, 3, 7);

        coche carrito = new coche();

        carrito.incrementar_puertas();
        carrito.incrementar_puertas();

        System.out.println("Numero de puertas:");
        System.out.println(carrito.puertas);
    }

    public static void suma(int a, int b, int c){
        System.out.println(a + b + c);
    }
}

class coche{
    int puertas = 0;

    void incrementar_puertas(){
        puertas++;
    }
}