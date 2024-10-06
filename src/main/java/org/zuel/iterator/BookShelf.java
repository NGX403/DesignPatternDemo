package org.zuel.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Agreegate{
    private List<Book> books;
    private  int last = 0;

    public BookShelf(int maxSize){
        this.books = new ArrayList<>(maxSize);
    }

    public Book getBookAt(int idx) {
        return books.get(idx);
    }

    public void appendBook(Book book){
        this.books.add(book);
        last++;
    }
    public int getLength(){
        return last;
    }

    @Override
    public Iterator iteraotr() {
        return new BookShelfIterator(this);
    }
}
