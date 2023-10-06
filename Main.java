package ASS1;

public class Main {
        public static void main(String[] args) {

            Library library = new Library();

            // String title, String author, int year, boolean isBorrowed, LibraryItemType itemType,int pageCount
            Book book1 = new Book("The kite runner", " khaled husseini", 2019,true, LibraryItemType.Book, 125 );
            Book book2 = new Book("The Reluctant Fundamentalist", "Mohsin Hamid", 2007, true, LibraryItemType.Book, 184);
            Magazine magazine1 = new Magazine("Dastaan-e-Pakistan", "History Dept", 2022, true,LibraryItemType.Magazine, 5);


            library.addItem(book1);
            library.addItem(book2);
            library.addItem(magazine1);

            library.borrowItem(book1);

            System.out.println("\nAvailable Items are:");
            library.displayAvailableItems();

            System.out.println("\nBorrowed Items are:");
            library.displayBorrowedItems();
            library.returnItem(book1);

        }
    }

