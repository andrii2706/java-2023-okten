package lesson1.homeworkOne.books;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@ToString
@Getter
@Setter
public class Book {
    public int bookId;
    public int id;
    public String bookName;
    public String bookTitle;
    public String bookAuthor;
    public List<String> bookSellers = new ArrayList<>();

    public Book(int bookId, int id, String bookName, String bookTitle, String bookAuthor,List<String> bookSellers ){
        this.bookId = bookId;
        this.id = id;
        this.bookName = bookName;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookSellers = bookSellers;
    }

    @Override
    public String toString() {
        return "Book : {" +
                "bookId=" + bookId +
                ", id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookSellers=" + bookSellers +
                '}';
    }
}
