import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

//       Se entrarmos em "II", o programa deve retornar 2.
//        Se inserirmos "III", o programa deve retornar 3.
//        Se inserirmos "VI", o programa deve retornar 6.
//        Se entrarmos no "XVII", o programa deve retornar 17.



public class ConversorTeste {
    @ParameterizedTest
    @CsvSource({"I,1","V,5","X,10","L,50", "C,100","D,500", "M,1000"})
    public void deveRetornarInteiroParaRomanosDeUmChar(String numRomano, int resultadoEsperado){
        Conversor romano = new Conversor();
        int numero = romano.converte(numRomano);
        assertEquals(resultadoEsperado, numero);
    }
    @ParameterizedTest
    @CsvSource({
            "II,2",
            "VII,7",
            "XVII,17",
            "DCCXXIII, 723"
    })
    public void deveRetornarParaRomanosComMaisDeUmChar(String numRomano, int resultadoEsperado){
        //arrange
        Conversor romano = new Conversor();
        //act
        int resultado = romano.converte(numRomano);
        //assert
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void deveRetornarParaRomanosComMaisDeUmCharComSubtracao(){
        //arrange
        Conversor romano = new Conversor();
        //act
        int resultado = romano.converte("IV");
        //assert
        assertEquals(4, resultado);
    }

}
