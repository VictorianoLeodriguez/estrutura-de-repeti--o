import java.text.NumberFormat;
import java.text.ParseException;
//importa um tipo especifico de exception

public class HierarquiaCustumizavel {
        public static void main(String[] args) {
            try{
                Number valor = NumberFormat.getInstance().parse("a1.75");//pega uma instancia com o parse


            System.out.println(valor);
            }
            catch (ParseException e){
            }
        }
    }

