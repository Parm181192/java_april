package may20;

public class MainLib {
    public static void main(String[] args) {

        LibraryManagement Lib=new LibraryManagement("Sam", "Tom and Jerry","ABC");
        Lib.printInfo();
        //LibraryManagement.showTotalIssued();

        LibraryManagement Lib1=new LibraryManagement("Pam", "School Life","BCD");
        Lib1.printInfo();
        //LibraryManagement.showTotalIssued();

        LibraryManagement Lib3=new LibraryManagement("Amrita", "College Life","XYZ");
        Lib3.printInfo();
        LibraryManagement.showTotalIssued();

    }
}
