package org.java.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Interi {

    private int[] arrayInteri;
    private List<Integer> listaNumeri;
    private Iterator<Integer> iterator;

    public Interi (int[] arrayInteri) {

        this.arrayInteri = arrayInteri;
        this.listaNumeri = new ArrayList<>();

        for (int numero : arrayInteri) {
            listaNumeri.add(numero);
        }

        this.iterator = listaNumeri.iterator();
    }

    public int getElementoSuccessivo() {
        if(hasAncoraElementi()) {
            return iterator.next();
        }
            return -1; 
        
    }

    public boolean hasAncoraElementi(){
        return iterator.hasNext();
    }

    public static void main(String[] args) {

        int[] arrayInteri = {1, 2, 3, 4, 5, 6};
        Interi listaInteri = new Interi(arrayInteri);

        while (listaInteri.hasAncoraElementi()) {
            System.out.println(listaInteri.getElementoSuccessivo());
        }
        
    }

}
