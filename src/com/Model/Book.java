package com.Model;

public class Book extends Document{
    private String nameAuthor;
    private int numberOfPages;

    public Book() {
    }

    public Book(String nameAuthor, int numberOfPages) {
        this.nameAuthor = nameAuthor;
        this.numberOfPages = numberOfPages;
    }

    public Book(String codeDocument, String company, int numberRelease, String nameAuthor, int numberOfPages) {
        super(codeDocument, company, numberRelease);
        this.nameAuthor = nameAuthor;
        this.numberOfPages = numberOfPages;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "codeDocument='" + codeDocument + '\'' +
                ", company='" + company + '\'' +
                ", numberRelease=" + numberRelease +
                ", nameAuthor='" + nameAuthor + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}'+"\n";
    }

    public String toStringCSV() {
        return codeDocument  +
                "," + company +
                "," + numberRelease  +
                "," + nameAuthor +
                "," + numberOfPages +
                "\n";
    }
}
