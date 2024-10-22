public class Book
{
    private String title;
    private Author[] authors; // Mảng tác giả
    private double price;
    private int qty = 0;

    public Book(String title, Author[] authors, double price) {
        this.title = title;
        this.authors = authors;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        StringBuilder authorsList = new StringBuilder();
        for (Author author : authors) {
            authorsList.append(author.toString()).append(", ");
        }
        // Xóa dấu phẩy và khoảng trắng cuối cùng
        if (authorsList.length() > 0) {
            authorsList.setLength(authorsList.length() - 2);
        }
        return "Book[title=" + title + ", authors={" + authorsList + "}, price=" + price + ", qty=" + qty + "]";
    }
}

