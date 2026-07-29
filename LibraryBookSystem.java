package idea.project.Task4.Task4.Task4.Task4;

import java.util.ArrayList;

public class LibraryBookSystem {
    public static void main(String[] args){


        ArrayList<String> bookTitles = new ArrayList<>();

        ArrayList<String> authors = new ArrayList<>();

        ArrayList<Boolean> availability = new ArrayList<>();

        bookTitles.add("Java Programming");
        authors.add("James");
        availability.add(true);

        bookTitles.add("Clean Code");
        authors.add("Robert");
        availability.add(true);

        bookTitles.add("Design Patterns");
        authors.add("Erich");
        availability.add(false);

        bookTitles.add("Data Structures");
        authors.add("Mark");
        availability.add(true);

        bookTitles.add("Effective Java");
        authors.add("Joshua");
        availability.add(true);

        bookTitles.add("Head First Java");
        authors.add("Kathy");
        availability.add(false);

        bookTitles.add("Spring in Action");
        authors.add("Craig");
        availability.add(true);

        bookTitles.add("Database Concepts");
        authors.add("Abraham");
        availability.add(true);

        bookTitles.add("Operating Systems");
        authors.add("Silberschatz");
        availability.add(false);

        bookTitles.add("Computer Networks");
        authors.add("Andrew");
        availability.add(true);

        for(int i=0; i < bookTitles.size(); i++){

            System.out.println("Book "+i+": ");
            System.out.println("Title: "+bookTitles.get(i));
            System.out.println("Name: "+authors.get(i));
            System.out.println("Availability: "+availability.get(i));
        }

        IO.println("Enter Book Title: ");
        String bookTitle = IO.readln();

        IO.println("Enter Author: ");
        String authorName = IO.readln();

        IO.println("Available: ");
        boolean available = Boolean.parseBoolean(IO.readln());

        bookTitles.add(bookTitle);
        authors.add(authorName);
        availability.add(available);
        System.out.println("Book added successfully");



        IO.println("Please enter the index position: ");
        int index = Integer.parseInt(IO.readln());

        if (index >= 0 && index < bookTitles.size()) {

            IO.println("New Title: ");
            String updatedTitle= IO.readln();

            IO.println("New Author: ");
            String updatedAuthor = IO.readln();


            IO.println("Available: ");
            boolean updatedAvailability = Boolean.parseBoolean(IO.readln());

            bookTitles.set(index, updatedTitle);
            authors.set(index,updatedAuthor);
            availability.set(index, updatedAvailability);
            IO.println("Book updated successfully");
        } else {
            IO.println("Invalid index!");
        }



        IO.println("Please enter book title you want to search for: ");
        String searchBook = IO.readln();


        int searchIndex = -1;
        for (int i = 0; i < bookTitles.size(); i++) {
            if (bookTitles.get(i).equals(searchBook)){
                searchIndex = i;
                break;
            }
        }
        if (searchIndex != -1) {

            IO.println("Book index:  " + searchIndex);
            IO.println("Author name:  " + authors.get(searchIndex));
            IO.println("Availability status: " + availability.get(searchIndex));
        } else {
            IO.println("Book not found");
        }
    }
}

