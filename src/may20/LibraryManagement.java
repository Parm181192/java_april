package may20;

public class LibraryManagement {
    String studentName;
    String bookTitle;
    String author;
    static int totalBooksIssued;

    public LibraryManagement(String studentName,String bookTitle, String author)
    { this.studentName=studentName;
        this.bookTitle=bookTitle;
        this.author=author;
       // System.out.println("Student Name: "+ studentName);
        //System.out.println("Book Title: "+bookTitle);
        totalBooksIssued++;
    }

    public void printInfo()
    {
        System.out.println("Student Name: "+ studentName);
        System.out.println("Book issued: "+ bookTitle);
        System.out.println("Author: "+author);
        System.out.println();
    }
    public static void showTotalIssued()
    {
        System.out.println("Total books issued: "+totalBooksIssued);

    }
}
