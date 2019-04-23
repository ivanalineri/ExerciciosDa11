package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {
    private static List<String> lista = new ArrayList<>();

    public static void main(String[] args) {

        try{
        lista.add("Pato");
        lista.add("Cachorro");
        lista.add("Gato");

        System.out.println(lista.get(5));


    }catch (Exception ex){
            System.out.println("Deu erro de novo cara? " + ex.getMessage());
            ex.getStackTrace();
        }
}}
