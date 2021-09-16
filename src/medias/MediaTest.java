package medias;

public class MediaTest {
    public static void main(String[] args) {
        Media myBook = new Book();
        Media myNewspaper = new Newspaper();

        System.out.println(myBook.findLiterature());
        System.out.println(myBook.checkOut());
        myBook.afterThisThing();

        System.out.println(myNewspaper.findLiterature());
        System.out.println(myNewspaper.checkOut());
        myNewspaper.afterThisThing();
    }
}
