





//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConversorMoeda moeda = new ConversorMoeda();
        moeda.converterDolarParaReal(100);
        //
        CalculadoraSalaRetangular sala1 = new CalculadoraSalaRetangular();
        sala1.calcularArea(10,8);
        sala1.calcularPerimetro(10,8);
        //
        TabuadaMultiplicacao numero = new TabuadaMultiplicacao();
        numero.tabuadaNumero(7);
        //
        ConversorTemperaturaPadrao temp1 = new ConversorTemperaturaPadrao();
        temp1.celsiusParaFahrenheit(0);
        temp1.fahrenheitParaCelsius(32);
        //
        Livro livro1 = new Livro();
        livro1.setPrecoInicial(100);
        livro1.calcularPrecoFinal();
        ProdutoFisico produto1 = new ProdutoFisico();
        produto1.setPrecoProdutoInicial(100);
        produto1.calcularPrecoFinal();
    }

}