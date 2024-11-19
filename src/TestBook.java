public class TestBook {
    public static void main(String[] args) {
        // Tạo các tác giả
        Author author1 = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'M');
        Author author2 = new Author("Paul Tan", "Paul@nowhere.com", 'M');

        // Tạo mảng các tác giả
        Author[] authors = { author1, author2 };

        // Tạo sách
        Book book = new Book("Java for Dummy", authors, 19.99);
        book.setQty(20);

        // In thông tin sách
        System.out.println(book);
    }
}
