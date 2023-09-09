package org.functional_interface.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
public class SupplierExample {
    public static void main(String[] args) {

        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> greeting = () -> "Olá, seja bem vindo!";

        // Usar o Supplier para obter uma lista com 5 saudações
        List<String> listGreeting = Stream.generate(greeting)
                .limit(3)
                .collect(Collectors.toList());

        // Imprimir as saudações geradas
        listGreeting.forEach(System.out::println);

        // Usar o Supplier com uma classe anônima para fornecer uma saudação personalizada
        Supplier<String> saudacao = new Supplier<String>() {
            @Override
            public String get() {
                return "Olá, seja bem vinda classe anônima.";
            }
        };

        // Usar o Supplier para obter uma lista com 5 saudações
        List<String> listSaudacoes = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            listSaudacoes.add(saudacao.get());
        }

        // Imprimir as saudações geradas
        for (String s: listSaudacoes) System.out.println(s);
    }
}
