package library;

class Newspaper extends Media{
    @Override
    public String findLiterature() {
        return "A newspaper has been found!";
    }

    @Override
    public String checkOut() {
        return "Checking out the newspaper...";
    }



    @Override
    public String grab() {
        return "You grab a newspaper.";
    }

    @Override
    public String interactWith() {
        return "A newspaper is read.";
    }
}
