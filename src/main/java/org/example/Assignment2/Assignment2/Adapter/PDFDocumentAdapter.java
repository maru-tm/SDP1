package org.example.Assignment2.Assignment2.Adapter;

import org.example.Assignment2.Assignment2.Document;

// Адаптер для интеграции PDF документа
public class PDFDocumentAdapter implements Document {
    private PDFDocument pdfDocument;

    public PDFDocumentAdapter(String fileName) {
        this.pdfDocument = new PDFDocument(fileName);
    }

    //Задача: Реализуйте логику для адаптера, чтобы методы PDF-документа могли быть использованы через интерфейс Document.
    public void display(){
        pdfDocument.openPDF();
        pdfDocument.showPDF();
    }
}

