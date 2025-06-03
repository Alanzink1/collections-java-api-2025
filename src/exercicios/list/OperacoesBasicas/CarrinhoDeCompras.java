package exercicios.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nomeProduto) {
        listaItens.add(new Item(nomeProduto));
    }

    public void removerItem(String nomeProduto){
        List itensParaRemover = new ArrayList<>();
        for(Item item : listaItens) {
            if(item.getNome().equalsIgnoreCase(nomeProduto)){
                itensParaRemover.add(item);
            }
        }
        listaItens.removeAll(itensParaRemover);
    }

    public int obterTotalItensNoCarrinho(){
        return listaItens.size();
    }

    public void obterNomesItens(){
        System.out.println(listaItens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras minhaLista = new CarrinhoDeCompras();
        minhaLista.adicionarItem("Desodorante Old Spice");
        minhaLista.adicionarItem("Sabonete Dove");
        minhaLista.adicionarItem("Sabonete Dove");
        minhaLista.adicionarItem("Travesseiro");

        System.out.println("Estamos com " + minhaLista.obterTotalItensNoCarrinho() +  " itens no carrinho.");
        minhaLista.obterNomesItens();
        
        minhaLista.removerItem("Sabonete Dove");
        System.out.println("Estamos com " + minhaLista.obterTotalItensNoCarrinho() +  " itens no carrinho.");
        
        minhaLista.obterNomesItens();

    }

}
