public class Library {
    private String[] bookTitles = new String[8];
    private String[] authors = new String[4];
    private int[] publicationYears = new int[4];
    private String[] genres = new String[4];
    private int index = 0;

    public void setBookTitle(String title) {
        System.out.println("Book Title: " + title);
        if (this.index < this.getBookCapacity()) {
            bookTitles[index] = title;
            System.out.println("Book title added.");
            index++;
        } else {
            System.out.println("No more space for book titles.");
        }
    }

    public int getBookCapacity() {
        return bookTitles.length;
    }

    public void setAuthor(String author) {
        System.out.println("Author: " + author);
        if (this.index < this.getAuthorCapacity()) {
            authors[index] = author;
            System.out.println("Author added.");
            index++;
        } else {
            System.out.println("No more space for authors.");
        }
    }

    public int getAuthorCapacity() {
        return authors.length;
    }

    public void setPublicationYear(int year) {
        System.out.println("Publication Year: " + year);
        if (this.index < this.getPublicationYearCapacity()) {
            publicationYears[index] = year;
            System.out.println("Publication year added.");
            index++;
        } else {
            System.out.println("No more space for publication years.");
        }
    }

    public int getPublicationYearCapacity() {
        return publicationYears.length;
    }

    public void setGenre(String genre) {
        System.out.println("Genre: " + genre);
        if (this.index < this.getGenreCapacity()) {
            genres[index] = genre;
            System.out.println("Genre added.");
            index++;
        } else {
            System.out.println("No more space for genres.");
        }
    }

    public int getGenreCapacity() {
        return genres.length;
    }


}
