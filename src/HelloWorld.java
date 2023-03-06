import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args){
        // Objects
        User user = new User("Titus Williams", "1976-08-07");

        Book book = new Book("Carmilla", "Sheridan Le Fanu");

//        book.title = "Carmilla";
//        book.author = "Sheridan Le Fanu";

        user.borrow(book);

//        System.out.printf("%s was born back in %s and he is now %d years old.%n",
//                user.getName(), user.getBirthdDay(), user.age());
//
//        System.out.printf("%s has borrowed these books: %s%n", user.getName(), user.books.toString());














//       char vowels[] = new char[5];

//        vowels[0] = 'a';
//        vowels[1] = 'e';
//        vowels[2] = 'i';
//        vowels[3] = 'o';
//        vowels[4] = 'u';


        // Sort and Array; sort by index
//        char vowels[] = {'e', 'e', 'a', 'o', 'i'};
//
//        int startingIndex = 1;
//        int endingIndex = 4;
//
//        Arrays.sort(vowels, startingIndex, endingIndex);
//
//        System.out.println(Arrays.toString(vowels));

        // Search within an array (only works on a sorted array)
//        char vowels[] = {'u', 'e', 'a', 'o', 'i'};
//        Arrays.sort(vowels);
//
//        char key = 'o';
//
//        int foundItemIndex = Arrays.binarySearch(vowels, key);
//
//        System.out.println(Arrays.toString(vowels));
//        System.out.println(foundItemIndex);

        // Fill method
//        char vowels[] = {'u', 'e', 'a', 'o', 'i'};

        // fill with all 'x'
//        Arrays.fill(vowels, 'x');
//        System.out.println(Arrays.toString(vowels));
//
        // fill bases on start and ending index

//        int startingIndex = 1;
//        int endingIndex = 4;
//        Arrays.fill(vowels, startingIndex, endingIndex, 'x');
//        System.out.println(Arrays.toString(vowels));

        // Copy an Array

    }
}
