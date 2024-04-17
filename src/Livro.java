public class Livro implements Calculavel{
    private double precoInicial;
    private double taxaImpostoLivro = 5;
    private boolean precoDefinido = false;
    public void setPrecoInicial(double precoInicial) {
        if (!precoDefinido) {
            this.precoInicial = precoInicial;
            precoDefinido = true;
        } else {
            System.out.println("O preço inicial já foi definido e não pode ser alterado.");
        }
    }

    @Override
    public double calcularPrecoFinal() {
        double precoFinal;
        precoFinal = precoInicial -= taxaImpostoLivro;
        System.out.println("o preco final para um livro incluindo suas taxas é de: " + precoFinal);
        return precoFinal;
    }
}
