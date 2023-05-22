package test;

import iterator.Biblioteca;
import iterator.Filme;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {
    @Test
    void iterateCatalogAndShowCars() {
        Filme filme1 = new Filme("Toy Story 4", "Infantil");
        Filme filme2 = new Filme("Creed III", "Drama");
        Filme filme3 = new Filme("Harry Potter e a Pedra Filosofal\n", "Fantasia");

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.addFilmes(filme1, filme2, filme3);

        List<Filme> cars = new ArrayList<>();
        cars.addAll(Arrays.asList(filme1, filme2, filme3));

        Iterator<Filme> iterator = biblioteca.iterator();
        while(iterator.hasNext()) {
            Filme filme = iterator.next();
            assertTrue(cars.contains(filme));
        }
    }
}