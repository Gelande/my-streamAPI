package org.functional_interface.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro oufalso).
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */
public class PredicateExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // Usar o Predicate com expressão lambda para filtrar números pares
        Predicate<Integer> isPar1 = number -> number % 2 == 0;

        // Usar o predicado para filtrar números pares no Stream e armazená-los em outra lista
        List<Integer> parNumbers = numbers.stream().filter(isPar1).toList();

        // Imprimir a lista de números pares
        parNumbers.forEach(System.out::println);

        // Usar o Predicate com uma classe anônima para filtrar números pares
        Predicate<Integer> isPar = new Predicate<Integer>() {
            @Override
            public boolean test(Integer number) {
                return number % 2 == 0;
            }
        };

        // Usar o predicado para filtrar números pares e armazená-los em outra lista
        List<Integer> pars = new ArrayList<>();
        for (Integer n: numbers) {
            if (isPar.test(n)) {
                pars.add(n);
            }
        }

        // Imprimir a lista de números pares
        for (Integer n: pars) {
            System.out.println(n);
        }
    }
}
