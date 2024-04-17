//Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public double celsiusParaFahrenheit(double temperatura) {
        double resultadoF;
        resultadoF = (temperatura * 1.8) + 32;
        System.out.println("o valor convertido é de: " + resultadoF);
        return resultadoF;
    }

    @Override
    public double fahrenheitParaCelsius(double temperatura) {
        double resultadoC;
        resultadoC = (temperatura - 32) / 1.8;
        System.out.println("o valor convertido é de: " + resultadoC);
        return resultadoC;
    }
}
