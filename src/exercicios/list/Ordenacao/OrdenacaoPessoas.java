package exercicios.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoa = new OrdenacaoPessoas();
        ordenacaoPessoa.adicionarPessoa("Alan", 18, 1.78);
        ordenacaoPessoa.adicionarPessoa("José", 12, 1.89);
        ordenacaoPessoa.adicionarPessoa("Isaac", 10, 1.43);
        ordenacaoPessoa.adicionarPessoa("Miguel", 13, 1.58);
        ordenacaoPessoa.adicionarPessoa("João", 35, 1.78);
        
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println("--------------------");
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }

}
