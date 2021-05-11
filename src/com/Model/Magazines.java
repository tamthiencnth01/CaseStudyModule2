package com.Model;

public class Magazines extends Document{
    private int dayRelease;
    private int monthRelease;

    public Magazines() {
    }

    public Magazines(int dayRelease, int monthRelease) {
        this.dayRelease = dayRelease;
        this.monthRelease = monthRelease;
    }

    public Magazines(String codeDocument, String company, int dayRelease, int numberRelease1, int monthRelease) {
        super(codeDocument, company, dayRelease);
        this.dayRelease = dayRelease;
        this.monthRelease = monthRelease;
    }


    public int getDayRelease() {
        return dayRelease;
    }


    public void setDayRelease(int dayRelease) {
        this.dayRelease = dayRelease;
    }

    public int getMonthRelease() {
        return monthRelease;
    }

    public void setMonthRelease(int monthRelease) {
        this.monthRelease = monthRelease;
    }

    @Override
    public String toString() {
        return "Magazines{" +
                "codeDocument='" + codeDocument + '\'' +
                ", company='" + company + '\'' +
                ", numberRelease=" + numberRelease +
                ", dayRelease=" + dayRelease +
                ", monthRelease=" + monthRelease +
                '}'+"\n";
    }
    public String toStringCSV() {
        return codeDocument  +
                "," + company +
                "," + numberRelease +
                "," + dayRelease +
                "," + monthRelease +
                "\n";
    }
}
