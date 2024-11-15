public class Library {
    private String name;
    private Book[] library;

    // בנאי שמקבל שם בלבד ומכין מערך של 1417 ספרים
    public Library(String name) {
        this.name = name;
        this.library = new Book[1417];
    }

    // מתודה להחזרת מספר הספרים הקיימים (שאינם null)
    public int numBooks() {
        int count = 0;
        for (int i = 0; i < library.length; i++) {
            if (this.library[i] != null)  // בדיקה שהמקום במערך מכיל ספר
                count++;
        }
        return count;
    }

    public void printComics(){
        for (int i = 0; i < library.length; i++) {
            if (this.library[i] != null && this.library[i].getComics()==true)
                System.out.println(this.library[i].getName());
        }
    }

    public static void main(String[] args) {

        // יצירת אובייקט ספרייה ללא ספרים בשלב זה
        Library lib = new Library("place");  // כאן לא מעבירים מערך כפרמטר

        // הוספת ספרים למערך הספרים של הספרייה
        lib.library[0] = new Book("roy", "bro", true);
        lib.library[1] = new Book("alice", "wonderland", true);

        // הדפסת מספר הספרים הקיימים
        System.out.println("Number of books in library: " + lib.numBooks());

        //הדפסת שמות ספרי הקומיקס
        System.out.println("Names of the comics books in library: ");
        lib.printComics();
    }
}

