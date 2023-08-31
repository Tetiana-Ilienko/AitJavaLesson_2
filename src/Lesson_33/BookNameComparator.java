package Lesson_33;

import java.util.Comparator;

public class BookNameComparator implements Comparator<Author> { //  под компаратор нужно создавать отдельный класс

    @Override
    public int compare(Author author1, Author author2) { // сортируем по названию книги
        return author1.bookName.compareTo(author2.bookName);
    }
}
