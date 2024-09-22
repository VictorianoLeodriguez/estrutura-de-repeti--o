public class Continue {
    public static void main(String[] args) {
        for (int numero = 0; numero <= 10; numero++){
            if (numero == 5)
                continue;
            System.out.println(numero);
        }
    }
}

