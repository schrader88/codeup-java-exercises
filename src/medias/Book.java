package medias;

class Book extends Media{
    @Override
    public String findLiterature() {
        return "A book has been found!";
    }

    @Override
    public String checkOut() {
        return "Checking out the book...";
    }


}
