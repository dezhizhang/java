/*
 * :file description: 
 * :name: /java/src/this01/This03.java
 * :author: 张德志
 * :copyright: (c) 2022, Tungee
 * :date created: 2022-10-02 19:15:41
 * :last editor: 张德志
 * :date last edited: 2022-10-02 19:23:47
 */
package this01;

class Book {
    double price;
    String name;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void updatePrice(double price) {
        if (price > 150) {
            this.price = 150;
        } else if (price > 100) {
            this.price = 100;
        } else {
            this.price = price;
        }

    }

    public void showBook() {
        System.out.println("书名:" + this.name + "价格:" + this.price);
    }
}

public class This03 {
    public static void main(String[] args) {
        Book book = new Book("三国", 22);
        book.updatePrice(120);
        book.showBook();

    }
}
