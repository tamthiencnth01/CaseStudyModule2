package com.Service;

import com.Dal.DocumentDB;
import com.Model.Book;
import com.Model.Document;

import java.io.IOException;

public class DocumentService {
    public static DocumentDB data = new DocumentDB();
    public void showDocumentBook() throws IOException {
        data.ReadFromFileBook();
        for (int i = 0; i < DocumentDB.listBook.size(); i++) {
            System.out.println(DocumentDB.listBook.get(i).toString());
        }
    }
    public void showDocumentMagazines() throws IOException {
        data.ReadFromFileMagazines();
        for (int i = 0; i < DocumentDB.listMagazines.size(); i++) {
            System.out.println(DocumentDB.listMagazines.get(i).toString());
        }
    }
    public void showDocumentNewspaper() throws IOException {
        data.ReadFromFileNewPaper();
        for (int i = 0; i < DocumentDB.listNews.size(); i++) {
            System.out.println(DocumentDB.listNews.get(i).toString());
        }
    }
    public void UpdateDataBook() throws IOException {
        data.SaveToFileBook();
    }
    public void UpdateDataMagazines() throws IOException {
        data.SaveToFileMagazines();
    }
    public void UpdateDataNewspaper() throws IOException {
        data.SaveToFileNewPaper();
    }

    public Document findID(String id){
        for (Document book:
             DocumentDB.listBook) {
            if (book.getCodeDocument().contains(id)) return book;
        }
        for (Document magazines:
             DocumentDB.listMagazines) {
            if (magazines.getCodeDocument().contains(id)) return magazines;
        }
        for (Document newspaper:
             DocumentDB.listNews) {
            if (newspaper.getCodeDocument().contains(id)) return newspaper;
        }
        return null;
    }
    public void deleteBook(String id){
        DocumentDB.listBook.removeIf(book -> book.getCodeDocument().equals(id));
    }
    public void deleteMagazine(String id){
        DocumentDB.listMagazines.removeIf(magazines -> magazines.getCodeDocument().equals(id));
    }
    public void deleteNewspaper(String id){
        DocumentDB.listNews.removeIf(news -> news.getCodeDocument().equals(id));
    }
}
