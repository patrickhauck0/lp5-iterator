package iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Biblioteca implements Iterable<Filme> {
    private List<Filme> filmes;

    public Biblioteca() {
        this.filmes = new ArrayList<>();
    }

    public void addFilmes(Filme... filmes) {
        this.filmes.addAll(Arrays.asList(filmes));
    }

    public List<Filme> getCars() {
        return this.filmes;
    }

    @Override
    public Iterator<Filme> iterator() {
        return filmes.iterator();
    }
}
