package com.pavolpluta;

public class Printer {
    private int tonerLevel = 100;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }else{
            this. tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public int fillUpToner (int toner){
        if (toner > 0 && toner < 100){
            if(this.tonerLevel + toner > 100){
                return -1;
            }
            this.tonerLevel += toner;
            System.out.println("Printer filled. Current toner level: " + this.tonerLevel + "%");
            return this.tonerLevel;
        }else{
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.isDuplex){
            pagesToPrint /= 2;
            System.out.println("Duplex mode. Printing on both pages.");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;

    }

    public int getTonerLevel() {
        System.out.println(tonerLevel);
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
