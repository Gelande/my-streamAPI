package org.functional_interface.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
 */
public class FunctionExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        // Usar a Function com expressão lambda para dobrar todos os números
        Function<Integer, Integer> doubleNumbers = number -> number * 2;

        // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
        List<Integer> doubleNumbersOtherList = numbers.stream()
                .map(doubleNumbers)
                .toList();

        // Imprimir a lista de números dobrados
        doubleNumbersOtherList.forEach(System.out::println);

        //Forma mais "trabalhosa"
        // Usar a Function com uma classe anônima para dobrar todos os números
        Function<Integer, Integer> doubleNumbers2 = (new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer number) {
                return number * 2;
            }
        });

        // Usar a função para dobrar todos os números e armazená-los em outra lista
        List<Integer> doubleNumbers2New = new ArrayList<>();
        for (Integer n: numbers) {
            doubleNumbers2New.add(doubleNumbers2.apply(n));
        }

        // Imprimir a lista de números dobrados
        for (Integer n: doubleNumbers2New) {
            System.out.println(n);
        }
    }
}
