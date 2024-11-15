public class Book {
    private String name;
    private String author;
    private boolean comics;

    // בנאי
    public Book(String name , String author , boolean comics){
        this.name=name;
        this.author=author;
        this.comics=comics;
    }

    // בנאי העתקה
    public Book(Book other){
        this.name=other.name;
        this.author=other.author;
        this.comics=other.comics;
    }

    public Book(String name){
        if (name.equals("J.l.Rolling") && comics==false)
        this.name=name;
    }

    public boolean getComics(){
        return this.comics;
    }

    public String getAuthor(){
        return this.author;
    }
    public String getName(){
        return this.name;
    }

    public static void printName(Book book){
        System.out.println(book.getName());
    }


    public static void main(String[] args) {

    }
}

