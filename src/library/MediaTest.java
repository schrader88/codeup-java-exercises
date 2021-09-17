package library;

public class MediaTest {
    public static void main(String[] args) {
        Media myBook = new Book();
        Media myNewspaper = new Newspaper();
        Media william = new PersonInLibrary();

//        System.out.println(myBook.findLiterature());
//        System.out.println(myBook.checkOut());
//        myBook.afterThisThing();

//        System.out.println(myNewspaper.findLiterature());
//        System.out.println(myNewspaper.checkOut());
//        myNewspaper.afterThisThing();


        System.out.println(william.grab());
        System.out.println(myBook.grab());
        System.out.println(myNewspaper.grab());

        System.out.println(william.interactWith());
        System.out.println(myBook.interactWith());
        System.out.println(myNewspaper.interactWith());

    }
}
