package com.company;

public class OpenHashMap {
    HashTable[] table;
    private int size;

    //Constructor
    OpenHashMap(int size) {
        this.size = Math.max(3 * size / 2, size) + 1;
        table = new HashTable[this.size];
        for (int i = 0; i < this.size; i++){
            table[i] = null;
        }
    }

    //return index throw value of hash-function
    private int index(int key) {
        int hash = (key >> 15) ^ key;
        return Math.abs(hash) % size;
    }

    public void put(int key, Long value) {
        int hash = (key % size);
        while (table[hash] != null && table[hash].getKey() != key) {
            hash = (hash + 1) % size;
        }
        if (table[hash] != null && table[hash].getKey() == key){
            table[hash].setValue(value);
        }
        else{
            table[hash] = new HashTable(key, value);
        }
    }


    public Long get(int key) {
        int hash = (key % size);
        while (table[hash] != null && table[hash].getKey() != key) {
            hash = (hash + 1) % size;
        }
        if (table[hash] == null){
            System.out.println("No such key!");
            return -1L;
        }
        else {
            return table[hash].getValue();
        }
    }

    public int size(){
        int amountOfItems = 0;
        for (int i = 0; i < size; i++) {
            if (table[i] != null) {
                amountOfItems++;
            }
        }
        return amountOfItems;
    }

}
