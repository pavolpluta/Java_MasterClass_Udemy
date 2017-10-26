package com.pavolpluta;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(20,false);
       int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed " + pagesPrinted + " Total pages: " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed " + pagesPrinted + " Total pages: " + printer.getPagesPrinted());


    }
}
