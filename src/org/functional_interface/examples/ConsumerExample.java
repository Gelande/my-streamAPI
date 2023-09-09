package org.functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar ou
 * retornar um valor.
 */
public class ConsumerExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        // Usar o Consumer com expressão lambda para imprimir números pares
        Consumer<Integer> printPairNumbers = number -> {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        };

        // Usar o Consumer para imprimir números pares no Stream
        numbers.stream().forEach(printPairNumbers);

        //*Outra forma;
        numbers.forEach(number -> {
                if (number % 2 == 0) System.out.println("*" + number);
            });

        // Usar o Consumer para imprimir números pares da lista
        for (Integer number: numbers) printPairNumbers.accept(number);
    }
}
