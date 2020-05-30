package OO.exercicio19segundo;

import java.util.ArrayList;

public class Pedido {

    private String nome;
    private double preco;
    private int quantidade;
    private double total;
    private String produto[];
    private int itens[];


    public Pedido(){

    }

    public Pedido(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String[] getProduto() {
        return produto;
    }

    public void setProduto(String[] produto) {
        this.produto = produto;
    }

    public int[] getItens() {
        return itens;
    }

    public void setItens(int[] itens) {
        this.itens = itens;
    }

    public void guardaProdutoQuantidade(String nome, int quantidade){
        switch (nome.toUpperCase()){
            case "COCA":
                int acuCoca = 0;
                acuCoca = acuCoca+quantidade;
                produto[0] = nome;
                itens[0] = acuCoca;
                System.out.println(acuCoca);
                break;
            case "PEPSI":
                int acuPepsi = 0;
                acuPepsi = acuPepsi+quantidade;
                produto[1] = nome;
                itens[1] = acuPepsi;
                System.out.println(acuPepsi);
                break;
            default:
                System.out.println("Não tem outro");
        }
    }
    public void imprimirProdutoQuantidade(){
        for(int i=0; i<getItens().length;i++){
            if (getProduto().equals(""))
        }

    }
    public void guaranaQuantidade(){

    }
    public void bolachaQuantidade(){

    }
    public void salgadinhoQuantidade(){

    }
}
