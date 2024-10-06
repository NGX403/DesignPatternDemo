package org.zuel.iterator;

/**
 * Iterator（迭代器）模式
 */

public class Test {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(3);
        bookShelf.appendBook(new Book("神墓"));
        bookShelf.appendBook(new Book("完美世界"));
        bookShelf.appendBook(new Book("剑来"));
        bookShelf.appendBook(new Book("遮天"));
        bookShelf.appendBook(new Book("图解设计模式"));

        Iterator iterator = bookShelf.iteraotr();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
