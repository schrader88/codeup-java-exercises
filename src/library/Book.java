package library;

class Book extends Media{
    @Override
    public String findLiterature() {
        return "A book has been found!";
    }

    @Override
    public String checkOut() {
        return "Checking out the book...";
    }

    @Override
    public String grab() {
        return "You grab a book.";
    }

    @Override
    public String interactWith() {
        return "A book is read.";
    }


}
