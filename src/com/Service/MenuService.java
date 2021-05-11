package com.Service;

import com.Dal.DocumentDB;
import com.Model.Book;
import com.Model.Document;
import com.Model.Magazines;
import com.Model.Newspaper;

import java.io.IOException;
import java.util.Scanner;

public class MenuService {
    public static Scanner sc = new Scanner(System.in);
    public static DocumentService service = new DocumentService();
    public static DocumentDB dtb = new DocumentDB();
    public void insertBook() throws IOException {
        System.out.println("Enter CodeDocument: ");
        String code = sc.nextLine();
        System.out.println("Enter Publisher: ");
        String nameCompany = sc.nextLine();
        System.out.println("Enter Number Release: ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Name Author: ");
        String nameAuthor = sc.nextLine();
        System.out.println("Enter Number Of Pages");
        int nop = Integer.parseInt(sc.nextLine());
        Document book = new Book(code, nameCompany,number,nameAuthor,nop);
        DocumentDB.listBook.add(book);
        service.UpdateDataBook();
    }
    public void insertMagazines() throws IOException {
        System.out.println("Enter CodeDocument: ");
        String code = sc.nextLine();
        System.out.println("Enter Publisher: ");
        String nameCompany = sc.nextLine();
        System.out.println("Enter Number 1 Release: ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Number 2 Release: ");
        int number1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Month Release: ");
        int month = Integer.parseInt(sc.nextLine());
        Document magazines = new Magazines(code, nameCompany,number,number1,month);
        DocumentDB.listMagazines.add(magazines);
        service.UpdateDataMagazines();
    }
    public void insertNewspaper() throws IOException {
        System.out.println("Enter CodeDocument: ");
        String code = sc.nextLine();
        System.out.println("Enter Publisher: ");
        String nameCompany = sc.nextLine();
        System.out.println("Enter Number 1 Release: ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Day Release: ");
        int day = Integer.parseInt(sc.nextLine());
        Document newspaper = new Newspaper(code, nameCompany,number,day);
        DocumentDB.listNews.add(newspaper);
        service.UpdateDataNewspaper();
    }
}
