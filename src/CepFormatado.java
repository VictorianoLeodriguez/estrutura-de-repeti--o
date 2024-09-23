public class CepFormatado {
    public static void main(String[] args) {
        String cepFormatado;
        try {
            cepFormatado = FormatarCep("2536996");
                System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            //Neste exato momento estou com uma fome mas o err serve para printar o erro :3
            System.err.println("Cep é invalido conforme as regra de negocio");
        }
            
    }
    static String FormatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8 )
            throw new CepInvalidoException();
        return "25.369-965";

    }
}
