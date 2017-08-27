package com.company;

public class HashTable {
    private int key;
    private Long value;

    HashTable(int key, Long value) {
        this.key = key;
        this.value = value;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public int getKey() {
        return key;
    }

}
