import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    private String name;
    private LocalDate birthDay;
    public ArrayList<Book> books = new ArrayList<Book>();

    // Constructor Classes
    User(String name, String birthday) {
        this.name = name;
        this.birthDay = LocalDate.parse(birthday);
    }

    public String getName() {
        return this.name;
    }

    public String getBirthdDay() {
        return this.birthDay.toString();
    }

    public void borrow(Book book){
        this.books.add(book);
    }

    public int age() {
        int age = Period.between(this.birthDay, LocalDate.now()).getYears();

        return age;
    }
}
