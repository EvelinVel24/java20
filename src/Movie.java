public class Movie {
    private String title;
    private int year;
    private boolean isRented;

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
        this.isRented = false;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public boolean isRented() {
        return isRented;
    }

    public void rent() {
        isRented = true;
    }

    public void returnMovie() {
        isRented = false;
    }

    @Override
    public String toString() {
        return title + " (" + year + ") - " + (isRented ? "Arrendada" : "Disponible");
    }
}
