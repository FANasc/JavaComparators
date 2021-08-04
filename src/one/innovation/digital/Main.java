package one.innovation.digital;

import java.util.*;

/***********************************************************************************************
 *
 * Objetivo: 1) Criar uma lista de um objeto complexo.
 *           2) Adicionar elementos nesta lista.
 *           3) Ordenar implementando a interface java.util.Comparator no seu objeto complexo.
 *           4) Ordenar implementando um novo objeto com a interface java.util.Comparable.
 *           5) Ordenar usando uma expressão lambda na chamada de sua Lista.sort().
 *           6) Ordenar usando referências de métodos e os métodos estáticos de Comparator.
 * Autor   : Fernando Aguiar
 * Data    : 04.08.2021
 *
 ***********************************************************************************************/

public class Main {
    public static void main(String[] args) {

        // (1) Criar uma lista de um objeto complexo.
        List<Carro> carro = new ArrayList<>();

        // (2) Adicionar elementos nesta lista.
        carro.add(new Carro("Gol", 1987));
        carro.add(new Carro("Passat", 1990));
        carro.add(new Carro("Uno", 1988));
        carro.add(new Carro("Celta", 2010));
        carro.add(new Carro("Marea", 2001));
        carro.add(new Carro("Fusca", 1969));

        System.out.println("--- Ordem de inserção ---");
        System.out.println(carro);

        // (3) Ordenar implementando a interface java.util.Comparator no seu objeto complexo.
        carro.sort(Comparator.comparingInt(Carro::getAno));

        System.out.println("--- Ordenar implementando a interface java.util.Comparator no seu objeto complexo ---");
        System.out.println(carro);

        // (4) Ordenar implementando um novo objeto com a interface java.util.Comparable.
        System.out.println("--- Ordenar implementando um novo objeto com a interface java.util.Comparable ---");
        Collections.sort(carro);
        System.out.println(carro);

        // (5) Ordenar usando uma expressão lambda na chamada de sua Lista.sort().
        carro.sort((first, second) -> first.getAno() - second.getAno());
        System.out.println("--- Ordenar usando uma expressão lambda na chamada de sua Lista.sort() ---");
        System.out.println(carro);

        // (6) Ordenar usando referências de métodos e os métodos estáticos de Comparator.
        System.out.println("--- Ordenar usando referências de métodos ---");
        carro.sort(Comparator.comparingInt(Carro::getAno));
        System.out.println(carro);

        System.out.println("--- Ordenar usando métodos estáticos ---");
        carro.sort(Comparator.comparingInt(Carro::getAno).reversed());
        System.out.println(carro);

    }
}
