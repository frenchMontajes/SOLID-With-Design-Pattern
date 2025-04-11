public class Book implements Resource{
    private String bookName;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public void borrow() {
        System.out.println("A student has taken out the book titled '" + bookName + "'.");
    }
}