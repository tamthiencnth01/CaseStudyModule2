package com.Model;

import java.io.Serializable;

public class Document implements Serializable {
    protected String codeDocument;
    protected String company;
    protected int numberRelease;

    public Document() {
    }

    public Document(String codeDocument,String company, int numberRelease) {
        this.codeDocument = codeDocument;
        this.company = company;
        this.numberRelease = numberRelease;
    }

    public String getCodeDocument() {
        return codeDocument;
    }

    public void setCodeDocument(String codeDocument) {
        this.codeDocument = codeDocument;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getNumberRelease() {
        return numberRelease;
    }

    public void setNumberRelease(int numberRelease) {
        this.numberRelease = numberRelease;
    }

    @Override
    public String toString() {
        return "Document{" +
                "codeDocument='" + codeDocument + '\'' +
                ", company='" + company + '\'' +
                ", numberRelease=" + numberRelease +
                '}';
    }
    public String toStringCSV() {
        return codeDocument +
                "," + company +
                "," + numberRelease +
                "\n";
    }

}
