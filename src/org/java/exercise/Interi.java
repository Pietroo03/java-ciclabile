package org.java.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Interi {

    private int[] arrayInteri;
    private int count;

    public Interi (int[] arrayInteri) {

        this.arrayInteri = arrayInteri;
        this.count = 0;

    }

    public int getElementoSuccessivo() {
        int toReturn = this.arrayInteri[this.count]; 
        this.count++;
        return toReturn;
    }

    public boolean hasAncoraElementi(){
        /* if (count < arrayInteri.length) {
            return true;
        }
        return false; */
        return count < arrayInteri.length;
    }

}
