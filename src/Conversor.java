import java.util.HashMap;
import java.util.Map;

public class Conversor {

    private final Map<Character,Integer> tabela = new HashMap<>(){{
        put('I',1);
        put('V',5);
        put('X',10);
        put('L',50);
        put('C',100);
        put('D',500);
        put('M',1000);
    }};
    public int converte(String numeroEmRomano) {
        int numeroArabico = 0;
        int ultimoVisitado=0;
        int multiplicador = 1;

        for (int i =  numeroEmRomano.length() -1; i>=0 ; i--) {
            int numAtual =tabela.get(numeroEmRomano.charAt(i));
            if(numAtual<ultimoVisitado)
                multiplicador = -1;

            numeroArabico+=numAtual*multiplicador;
            ultimoVisitado=numAtual;
        }
        return numeroArabico;
    }
}