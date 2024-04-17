//Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.
public class ConversorMoeda implements ConversaoFinanceira {
    private double dolar;
    private double real;
    @Override
    public double converterDolarParaReal(double dolar) {
        real = dolar * 5;
        System.out.println("o valor em real fica " + real + " reais");
        return real;
    }


}
