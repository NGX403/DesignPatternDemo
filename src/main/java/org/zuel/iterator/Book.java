package org.zuel.iterator;

public class Book {
    private String name;

    public Book(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return "Book{name="+this.name+"}";
    }
}
