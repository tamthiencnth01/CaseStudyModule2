package com.Presentation;

import com.Dal.DocumentDB;
import com.Service.DocumentService;
import com.Service.MenuService;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static MenuService menu = new MenuService();
    public static DocumentService service = new DocumentService();
    public static void main(String[] args) {
        int choose;
        do {
            showMenu();
            System.out.print("Please choose: ");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    try {
                        insertDocument();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    deleteDocument();
                    break;
                case 3:
                    try {
                        showInfo();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    searchDocument();
                    break;
                case 5:
                    System.out.println("See you again!");
                    break;
                default:
                    System.out.println("Please choose again!");
                    break;
            }
        }while (choose!=5);
    }

    private static void insertDocument() throws IOException {
        System.out.println("Enter a: to insert Book");
        System.out.println("Enter b: to insert Magazines");
        System.out.println("Enter c: to insert Newspaper");
        String type = sc.nextLine();
        switch (type){
            case "a":
                menu.insertBook();
                return;
            case "b":
                menu.insertMagazines();
                return;
            case "c":
                menu.insertNewspaper();
                return;
            default:
                System.out.println("Nhap lai: ");
                insertDocument();
        }
    }

    private static void deleteDocument() {
        System.out.println("Enter a: to insert Book");
        System.out.println("Enter b: to insert Magazines");
        System.out.println("Enter c: to insert Newspaper");
        String type = sc.nextLine();
        String id;
        switch (type){
            case "a":
                System.out.println("Please Input ID to delete: ");
                id = sc.nextLine();
                if (service.findID(id)==null){
                    System.out.println("Not found! ");
                    return;
                }
                else {
                    System.out.println("Information Document to delete: ");
                    System.out.println(service.findID(id));
                    service.deleteBook(id);
                    return;
                }
            case "b":
                System.out.println("Please Input ID to delete: ");
                id = sc.nextLine();
                if (service.findID(id)==null){
                    System.out.println("Not found! ");
                    return;
                }
                else {
                    System.out.println("Information Document to delete: ");
                    System.out.println(service.findID(id));
                    service.deleteMagazine(id);
                    return;
                }
            case "c":
                System.out.println("Please Input ID to delete: ");
                id = sc.nextLine();
                if (service.findID(id)==null){
                    System.out.println("Not found! ");
                    return;
                }
                else {
                    System.out.println("Information Document to delete: ");
                    System.out.println(service.findID(id));
                    service.deleteNewspaper(id);
                    return;
                }
            default:
                System.out.println("Nhap lai: ");
                deleteDocument();
        }

    }

    private static void showInfo() throws IOException {
        System.out.println("Enter a: to insert Book");
        System.out.println("Enter b: to insert Magazines");
        System.out.println("Enter c: to insert Newspaper");
        String type = sc.nextLine();
        switch (type){
            case "a":
                service.showDocumentBook();
                return;
            case "b":
                service.showDocumentMagazines();
                return;
            case "c":
                service.showDocumentNewspaper();
                return;
            default:
                System.out.println("Nhap lai: ");
                showInfo();
        }
    }

    private static void searchDocument() {
        System.out.println("Please Input ID to search: ");
        String id = sc.nextLine();
        if (service.findID(id)==null){
            System.out.println("Not found! ");
        }
        else {
            System.out.println(service.findID(id).toString());
        }
    }

    public static void showMenu(){
        System.out.println("----MENU----");
        System.out.println("Application Manager Document: ");
        System.out.println("Enter 1. To insert document");
        System.out.println("Enter 2. To remove document by id:");
        System.out.println("Enter 3. To show information documents");
        System.out.println("Enter 4. To search document by category: ");
        System.out.println("Enter 5. Exit application");
    }
}
