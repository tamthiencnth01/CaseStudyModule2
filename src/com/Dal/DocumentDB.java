package com.Dal;

import com.Model.Book;
import com.Model.Document;
import com.Model.Magazines;
import com.Model.Newspaper;

import java.io.*;
import java.util.ArrayList;

public class DocumentDB {
    public static ArrayList<Document> listBook = new ArrayList<>();
    public static ArrayList<Document> listMagazines = new ArrayList<>();
    public static ArrayList<Document> listNews = new ArrayList<>();
    public static String pathBook= "book.csv";
    public static String pathMagazines= "magazines.csv";
    public static String pathNews= "newspaper.csv";
    public void SaveToFileBook() throws IOException {
        File file = new File(pathBook);
        if (!file.exists()){
            file.createNewFile();
        }
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(pathBook,true));
        for (int i = 0; i < listBook.size(); i++) {
            bos.write(listBook.get(i).toStringCSV().getBytes());
        }
        bos.flush();
        bos.close();
    }
    public void ReadFromFileBook() throws IOException {
        File file = new File(pathBook);
        if (!file.exists()){
            return;
        }
        BufferedReader br = new BufferedReader(new FileReader(pathBook));
        String line;
        while ((line = br.readLine())!=null){
            String[] str = line.split(",");
            Document book = new Book(str[0],str[1],Integer.parseInt(str[2]),str[3],Integer.parseInt(str[4]));
            listBook.add(book);
        }
        br.close();
    }
    public void SaveToFileMagazines() throws IOException {
        File file = new File(pathMagazines);
        if (!file.exists()){
            file.createNewFile();
        }
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(pathMagazines,true));
        for (int i = 0; i < listMagazines.size(); i++) {
            bos.write(listMagazines.get(i).toStringCSV().getBytes());
        }
        bos.flush();
        bos.close();
    }
    public void ReadFromFileMagazines() throws IOException {
        File file = new File(pathBook);
        if (!file.exists()){
            return;
        }
        BufferedReader br = new BufferedReader(new FileReader(pathMagazines));
        String line;
        while ((line = br.readLine())!=null){
            String[] str = line.split(",");
            Document magazines = new Magazines(str[0],str[1],Integer.parseInt(str[2]),Integer.parseInt(str[3]),Integer.parseInt(str[4]));
            listMagazines.add(magazines);
        }
        br.close();
    }
    public void SaveToFileNewPaper() throws IOException {
        File file = new File(pathNews);
        if (!file.exists()){
            file.createNewFile();
        }
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(pathNews,true));
        for (int i = 0; i < listNews.size(); i++) {
            bos.write(listNews.get(i).toStringCSV().getBytes());
        }
        bos.flush();
        bos.close();
    }
    public void ReadFromFileNewPaper() throws IOException {
        File file = new File(pathNews);
        if (!file.exists()){
            return;
        }
        BufferedReader br = new BufferedReader(new FileReader(pathNews));
        String line;
        while ((line = br.readLine())!=null){
            String[] str = line.split(",");
            Document newspaper = new Newspaper(str[0],str[1],Integer.parseInt(str[2]),Integer.parseInt(str[3]));
            listNews.add(newspaper);
        }
        br.close();
    }
}
