package exercicios.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Diário de Um Banana", "J. K. Rowling", 2006);
        catalogoLivros.adicionarLivro("Diário de Um Banana 2", "J. K. Rowling", 2008);
        catalogoLivros.adicionarLivro("Diário de Um Banana 2", "J. K. Rowling", 2018);
        catalogoLivros.adicionarLivro("Diário de Um Banana 3", "Rowling", 2012);
        catalogoLivros.adicionarLivro("Diário de Um Banana 4", "J. K.", 2014);
        catalogoLivros.adicionarLivro("Diário de Um Banana 5", "Row", 2016);

        System.out.println(catalogoLivros.pesquisarPorAutor("Row"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2006, 2012));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Diário de Um Banana 2"));
    }

}
