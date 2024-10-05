package org.example.Assignment2;

// Adapter imports
import org.example.Assignment2.Assignment2.Adapter.PDFDocument;
import org.example.Assignment2.Assignment2.Adapter.PDFDocumentAdapter;

// Bridge imports
import org.example.Assignment2.Assignment2.Bridge.DocumentRenderer;
import org.example.Assignment2.Assignment2.Bridge.HighlightRenderEngine;
import org.example.Assignment2.Assignment2.Bridge.RenderEngine;
import org.example.Assignment2.Assignment2.Bridge.SimpleDocumentRenderer;
import org.example.Assignment2.Assignment2.Bridge.SimpleRenderEngine;

// Composite imports
import org.example.Assignment2.Assignment2.Composite.DocumentGroup;

// Decorator imports
import org.example.Assignment2.Assignment2.Decorator.DocumentDecorator;
import org.example.Assignment2.Assignment2.Decorator.WatermarkDecorator;

// Facade imports
import org.example.Assignment2.Assignment2.Facade.DocumentFacade;

// Flyweight imports
import org.example.Assignment2.Assignment2.Flyweight.DocumentFactory;

// Proxy imports
import org.example.Assignment2.Assignment2.Proxy.ProxyDocument;

// Document and Main imports
import org.example.Assignment2.Assignment2.RealDocument;
import org.example.Assignment2.Assignment2.Document;
import org.example.Assignment2.Main;

public class Main {
    public static void main(String[] args) {

        DocumentFacade facade = new DocumentFacade();

        // 1. Использование Proxy для ленивой загрузки
        System.out.println("1. Ленивая загрузка документов:");
        facade.displayDocument("Report");

        // 2. Использование декоратора для добавления водяного знака
        System.out.println("\n2. Добавление водяного знака:");
        facade.displayDocumentWithWatermark("Report");

        // 3. Использование Flyweight для повторного использования документа
        System.out.println("\n3. Повторное использование документа:");
        facade.displayDocument("Report");

        // 4. Использование Composite для работы с группой документов
        System.out.println("\n4. Работа с группами документов:");
        DocumentGroup group = new DocumentGroup();
        group.addDocument(DocumentFactory.getDocument("Report"));
        group.addDocument(DocumentFactory.getDocument("Presentation"));
        group.display();

        // 5. Использование Adapter для работы с PDF
        System.out.println("\n5. Работа с PDF документами через Adapter:");
        Document pdfDocument = new PDFDocumentAdapter("document.pdf");
        pdfDocument.display();

        // 6. Использование Bridge для рендеринга
        System.out.println("\n6. Рендеринг документа через движок:");
        RenderEngine simpleEngine = new SimpleRenderEngine();
        facade.renderDocument("Report", simpleEngine);

        RenderEngine highlightEngine = new HighlightRenderEngine();
        facade.renderDocument("Report", highlightEngine);
    }
}