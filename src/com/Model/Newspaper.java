package com.Model;

public class Newspaper extends Document{
    private int dayRelease;

    public Newspaper() {
    }

    public Newspaper(int dayRelease) {
        this.dayRelease = dayRelease;
    }

    public Newspaper(String codeDocument, String company, int numberRelease, int dayRelease) {
        super(codeDocument, company, numberRelease);
        this.dayRelease = dayRelease;
    }

    public int getDayRelease() {
        return dayRelease;
    }

    public void setDayRelease(int dayRelease) {
        this.dayRelease = dayRelease;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "codeDocument='" + codeDocument + '\'' +
                ", company='" + company + '\'' +
                ", numberRelease=" + numberRelease +
                ", dayRelease=" + dayRelease +
                '}'+"\n";
    }
    public String toStringCSV() {
        return codeDocument  +
                "," + company +
                "," + numberRelease +
                "," + dayRelease +
                "\n";
    }
}
