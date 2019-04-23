package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {

    private static List<String> lista = new ArrayList<>();

    public static void main(String[] args) {
        try{

        lista.add("Pato");
        lista.add("Cachorro");
        lista.add("Gato");

        System.out.println(lista.get(3));

    }catch (Exception ex){
            System.out.println("Ferrou malandro, deu erro " + ex.getMessage());
            ex.getStackTrace();
        }

}}
