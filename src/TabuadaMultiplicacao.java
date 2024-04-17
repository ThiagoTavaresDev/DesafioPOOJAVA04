//Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada() para exibir a tabuada de um número. A classe deve receber o número como parâmetro.
public class TabuadaMultiplicacao implements Tabuada{

    @Override
    public void tabuadaNumero(int numero) {
        for(int i = 0; i <= 10; i++){
            System.out.println("o numero " + numero + " multiplicado por " + i + " é igual a: " + numero * i);
        }
    }
}
