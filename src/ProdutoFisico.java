public class ProdutoFisico implements Calculavel{
    private double precoProdutoInicial;
    private double taxaImpostoProdutoFisico = 25;
    private boolean precoDefinido = false;
    public void setPrecoProdutoInicial(double precoInicial) {
        if (!precoDefinido) {
            this.precoProdutoInicial = precoInicial;
            precoDefinido = true;
        } else {
            System.out.println("O preço inicial já foi definido e não pode ser alterado.");
        }
    }
    @Override
    public double calcularPrecoFinal() {
        double precoFinal;
        precoFinal = precoProdutoInicial -= taxaImpostoProdutoFisico;
        System.out.println("o preco final para um Produto incluindo suas taxas é de: " + precoFinal);
        return precoFinal;
    }
}
