package OO.exercicio19segundo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class SupermercadoTest1 {

    public static void main(String[] args) throws InterruptedException {
        Cliente cliente1 = new Cliente();
        ArrayList<Produto> bebidas = new ArrayList<>();
        ArrayList<Produto> comidas = new ArrayList<>();
        Pedido pedido = new Pedido();
        boolean loopBebidaComida = true, loopTipoBebida, loopTipoComida, loopPagamento=true;
        int quantidade, estoque;
        String nomeProduto;


        System.out.print("Nome do cliente: ");
        cliente1.setNome(inputString());
        System.out.println("O cliente: " + cliente1.getNome());

        System.out.println("O Supermercado tem produtos:");

        adicionaProdutosNaListaDeBebidas(bebidas);
        adicionaProdutosNaListaDeComidas(comidas);
        imprimeInformacoesDeProdutosNaTela(bebidas);
        imprimeInformacoesDeProdutosNaTela(comidas);

        clienteFazPedidoProduto(bebidas, comidas, pedido);

        while (loopPagamento){
            // imprimir nome produto e quantidade
            System.out.println(cliente1.getNome() + " tem que pagar: " + pedido.getTotal());
            System.out.println("Forma de pagamento: CARTAO/CHEQUE/DINHEIRO");
            loopPagamento = pagamento(cliente1, inputString(), pedido.getTotal());
        }
        System.out.println("Saiu no supermercado...");
    } // main



    public static void clienteFazPedidoProduto(ArrayList<Produto> bebidas, ArrayList<Produto> comidas, Pedido pedido){
        boolean loopBebidaComida = true, loopTipoBebida, loopTipoComida;
        int quantidade, estoque;
        String nomeProduto;

        while (loopBebidaComida) {
            System.out.println("Qual você quer pedir: BEBIDA ou COMIDA... Se quer terminar 'SAIR'");
            String itemTipo = inputString();
            switch (itemTipo.toUpperCase()) {
                case "BEBIDA":
                    loopTipoBebida = true;
                    while (loopTipoBebida) {
                        System.out.println("Qual pedido de bebida: COCA, PEPSI e GUARANA");
                        nomeProduto = inputString();
                        switch (nomeProduto.toUpperCase()) {
                            case "COCA":
                                while(loopTipoBebida){
                                    imprimirListaUmProduto(bebidas, nomeProduto);
                                    System.out.print("Quantidade que você quer pegar: ");
                                    quantidade = inputInt();
                                    estoque = imprimirUmProdutoEstoque(bebidas, nomeProduto);
                                    if (0 == estoque){
                                        System.out.println("NÃO TEM MAIS ESTOQUE");
                                        loopTipoBebida = false;
                                    }else if (quantidade <= estoque && quantidade > 0) {
                                        clientePedido(bebidas, nomeProduto, quantidade, pedido);
                                        loopTipoBebida = false;
                                    } else {
                                        System.out.println("NÃO EXISTE ESTOQUE");
                                    }
                                }
                                break;
                            case "PEPSI":
                                while (loopTipoBebida){
                                    imprimirListaUmProduto(bebidas, nomeProduto);
                                    System.out.print("Quantidade que você quer pegar: ");
                                    quantidade = inputInt();
                                    estoque = imprimirUmProdutoEstoque(bebidas, nomeProduto);
                                    if (0 == estoque){
                                        System.out.println("NÃO TEM MAIS ESTOQUE");
                                        loopTipoBebida = false;
                                    }else if (quantidade <= estoque && quantidade > 0) {
                                        clientePedido(bebidas, nomeProduto, quantidade, pedido);
                                        loopTipoBebida = false;
                                    } else {
                                        System.out.println("NÃO EXISTE ESTOQUE");
                                    }
                                }
                                break;
                            case "GUARANA":
                                while(loopTipoBebida){
                                    imprimirListaUmProduto(bebidas, nomeProduto);
                                    System.out.print("Quantidade que você quer pegar: ");
                                    quantidade = inputInt();
                                    estoque = imprimirUmProdutoEstoque(bebidas, nomeProduto);
                                    if (0 == estoque){
                                        System.out.println("NÃO TEM MAIS ESTOQUE");
                                        loopTipoBebida = false;
                                    }else if (quantidade <= estoque && quantidade > 0) {
                                        clientePedido(bebidas, nomeProduto, quantidade, pedido);
                                        loopTipoBebida = false;
                                    } else {
                                        System.out.println("NÃO EXISTE ESTOQUE");
                                    }
                                }
                                break;
                            default:
                                System.out.println("NÃO TEM OUTRO NOME BEBIDA");
                                break;
                        }//switch nome bebida
                    }//while bebida
                    break;
                case "COMIDA":
                    loopTipoComida = true;
                    while (loopTipoComida) {
                        System.out.println("Qual pedido de comida: BOLACHA e SALGADINHO");
                        nomeProduto = inputString();
                        switch (nomeProduto.toUpperCase()) {
                            case "BOLACHA":
                                while (loopTipoComida){
                                    imprimirListaUmProduto(comidas, nomeProduto);
                                    System.out.print("Quantidade que você quer pegar: ");
                                    quantidade = inputInt();
                                    estoque = imprimirUmProdutoEstoque(comidas, nomeProduto);
                                    if (0 == estoque){
                                        System.out.println("NÃO TEM MAIS ESTOQUE");
                                        loopTipoComida = false;
                                    }else if (quantidade <= estoque && quantidade > 0) {
                                        clientePedido(comidas, nomeProduto, quantidade, pedido);
                                        loopTipoComida = false;
                                    } else {
                                        System.out.println("NÃO EXISTE ESTOQUE");
                                    }
                                }
                                break;
                            case "SALGADINHO":
                                while (loopTipoComida){
                                    imprimirListaUmProduto(comidas, nomeProduto);
                                    System.out.print("Quantidade que você quer pegar: ");
                                    quantidade = inputInt();
                                    estoque = imprimirUmProdutoEstoque(comidas, nomeProduto);
                                    if (0 == estoque){
                                        System.out.println("NÃO TEM MAIS ESTOQUE");
                                        loopTipoComida = false;
                                    }else if (quantidade <= estoque && quantidade > 0) {
                                        clientePedido(comidas, nomeProduto, quantidade, pedido);
                                        loopTipoComida = false;
                                    } else {
                                        System.out.println("NÃO EXISTE ESTOQUE");
                                    }
                                }
                                break;
                            default:
                                System.out.println("NÃO TEM OUTRO NOME COMIDA");
                                break;
                        }//switch nome comida
                    }//while comida
                    break;
                case "SAIR":
                    loopBebidaComida = false;
                    break;
                default:
                    System.out.println("NÃO TEM OUTRO OPÇÃO");
                    break;
            }//switch(tipo bebida,comida e sair
        }//while inicio
    }

    public static boolean pagamento(Cliente cliente, String pagamento, double valor) throws InterruptedException {
        switch (pagamento.toUpperCase()){
            case "CARTAO":
                System.out.println("O cliente escolheu cartão de pagamento");
                System.out.println("Passando cartão");
                Thread.sleep(2000);
                System.out.println("O cliente faz senha");
                Thread.sleep(2000);
                System.out.println("...");
                Thread.sleep(2000);
                System.out.println("Sucesso");
                return false;
            case "CHEQUE":
                System.out.println("O cliente escolheu cheque de pagamento");
                System.out.println("O cliente pegou cheque");
                Thread.sleep(2000);
                System.out.println("O cliente faz preencher");
                Thread.sleep(2000);
                System.out.println("...");
                Thread.sleep(2000);
                System.out.println("Entregou e pronto");
                return false;
            case "DINHEIRO":
                System.out.print(cliente.getNome() + " vai pagar o valor: ");
                double pagar = inputDouble();
                if (pagar >= valor){
                    double troco;
                    troco = pagar - valor;
                    System.out.println("Caixa está fazendo trocar o valor...");
                    Thread.sleep(2000);
                    System.out.println(cliente.getNome() +" recebeu o troco " + troco);
                    return false;
                }
                break;
            default:
                System.out.println("NÃO TEM OUTRO OPÇÃO DE PAGAMENTO");
                break;
        }
        return true;
    }


    public static void clientePedido(ArrayList<Produto> bebidas, String nome, int quantidade, Pedido pedido) {
        for (Produto object : bebidas) {
            if (nome.equalsIgnoreCase(object.getNome())) {
                System.out.println("Valor: " + (object.getPreco() * quantidade));
                object.setQuantidade(object.getQuantidade() - quantidade);
                pedido.setTotal(pedido.getTotal() + (object.getPreco() * quantidade));

                pedido.setNome(nome.toUpperCase());
                System.out.println("TESTE nome: "+ pedido.getNome());
                System.out.println("TESTE quantidade");
                pedido.guardaProdutoQuantidade(nome, quantidade);
//                pedido.setNome(pedido.getNome()+" "+nome);
            }
        }
    }

    public static void imprimirListaUmProduto(ArrayList<Produto> bebidas, String nome) {
        for (Produto produto : bebidas) {
            if (nome.toLowerCase().equalsIgnoreCase(produto.getNome())) {
                System.out.println("Nome do produto: " + produto.getNome());
                System.out.println("Preço: " + produto.getPreco());
                System.out.println("Quantidade tem estoque: " + produto.getQuantidade());
            }
        }
    }

    public static void adicionaProdutosNaListaDeBebidas(ArrayList<Produto> bebidas) {
        Produto coca = new Produto("Coca", 5.5, 35);
        Produto pepsi = new Produto("Pepsi", 5.0, 25);
        Produto guarana = new Produto("Guarana", 4.5, 30);

        bebidas.add(coca);
        bebidas.add(pepsi);
        bebidas.add(guarana);
    }

    public static int imprimirUmProdutoEstoque(ArrayList<Produto> bebidas, String nome) {
        for (Produto produto : bebidas) {
            if (nome.toLowerCase().equalsIgnoreCase(produto.getNome())) {
                return produto.getQuantidade();
            }
        }
        return -1;
    }

    public static void adicionaProdutosNaListaDeComidas(ArrayList<Produto> comidas) {
        Produto bolacha = new Produto("Bolacha", 2.5, 20);
        Produto salgadinho = new Produto("Salgadinho", 4.0, 15);

        comidas.add(bolacha);
        comidas.add(salgadinho);
    }

    public static void listarCatalogo(ArrayList<Produto> bebidas, ArrayList<Produto> comidas) {
        imprimeInformacoesDeProdutosNaTela(bebidas);
        imprimeInformacoesDeProdutosNaTela(comidas);
    }

    private static void imprimeInformacoesDeProdutosNaTela(ArrayList<Produto> listaDeProdutos) {
        for (Produto object : listaDeProdutos) {
            System.out.println("Nome do produto: " + object.getNome());
            System.out.println("preço do produto: " + object.getPreco());
            System.out.println("Quantidade do produto: " + object.getQuantidade());
            System.out.println("-------------------------");
        }
    }

    public static void clienteFezPedido(String nome, int quantidade) {
//        System.out.println(produto.get().getNome());
//        Pedido item = new Pedido(nome, quantidade);
//        System.out.println(item.getNome());
//        System.out.println(item.getQuantidade());
    }

    public static String inputString() {
        Scanner inputS = new Scanner(System.in);
        return inputS.nextLine();
    }

    public static int inputInt() {
        Scanner inputI = new Scanner(System.in);
        return inputI.nextInt();
    }

    public static double inputDouble() {
        Scanner inputI = new Scanner(System.in);
        return inputI.nextDouble();
    }

}// class
