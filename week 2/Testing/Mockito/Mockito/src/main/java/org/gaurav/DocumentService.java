package org.gaurav;

public class DocumentService {
    private Printer printer;

    public DocumentService(Printer printer){
        this.printer = printer;
    }

    public void printDocument(String message){
        printer.print(message);
    }
}
