package library;

public class PersonInLibrary extends Media{
    @Override
    public String findLiterature() {
        return "The individual finds an item to read.";
    }

    @Override
    public String checkOut() {
        return "The individual checks the item out of the library.";
    }

    @Override
    public String interactWith() {
        return "You begin a conversation about the literature the individual picked up.";
    }

    @Override
    public String grab() {
        return "You grab the individual.";
    }


}
