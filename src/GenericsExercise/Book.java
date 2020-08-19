package GenericsExercise;

// 泛型类的定义
public class Book<E, T> {
    private int bookNum;
    private E price;
    private T name;
    public Book() {}

    public Book(int bookNum)
    {
        this.bookNum = bookNum;
    }

    public Book(E e, T t)
    {
        this.price = e;
        this.name = t;
    }

    public int getBookNum() {
        return bookNum + 1;
    }

    public E getPrice() {
        return this.price;
    }

    public T getName() {
        return this.name;
    }

    public static void main(String[] args) {
        Book book = new Book(3);
        System.out.println(book.bookNum);
        System.out.println(book.getBookNum());

        Book<Float, String> book1 = new Book(1.01, "语文书");
        System.out.println(book1.getPrice());
    }
}
