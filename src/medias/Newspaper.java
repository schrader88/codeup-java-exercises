package medias;

class Newspaper extends Media{
    @Override
    public String findLiterature() {
        return "A newspaper has been found!";
    }

    @Override
    public String checkOut() {
        return "Checking out the newspaper...";
    }


}
