package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Преступление и наказание")
    public String name;

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    @Value("Ф.М.Достоевский")
    public String author;

    @Value("1866")
    public int yearOfPublication;

    public String getName() {
        return name;
    }
}
