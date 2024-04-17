//Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros.

public class CalculadoraSalaRetangular implements CalculoGeometrico {


    @Override
    public double calcularArea(double altura, double largura) {
        double resultadoArea;
        resultadoArea = altura * largura;
        System.out.println("valor calculado para area de: " + resultadoArea);
        return resultadoArea;
    }

    @Override
    public double calcularPerimetro(double altura, double largura) {
        double resultadoPerimetro;
        resultadoPerimetro = (2 * altura) + (2 * largura);
        System.out.println("valor calculado para o perimetro de: " + resultadoPerimetro);
        return resultadoPerimetro;
    }
}
