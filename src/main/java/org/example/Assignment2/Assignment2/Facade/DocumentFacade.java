package org.example.Assignment2.Assignment2.Facade;

import org.example.Assignment2.Assignment2.Bridge.DocumentRenderer;
import org.example.Assignment2.Assignment2.Bridge.RenderEngine;
import org.example.Assignment2.Assignment2.Bridge.SimpleDocumentRenderer;
import org.example.Assignment2.Assignment2.Decorator.WatermarkDecorator;
import org.example.Assignment2.Assignment2.Document;
import org.example.Assignment2.Assignment2.Flyweight.DocumentFactory;
import org.example.Assignment2.Assignment2.RealDocument;

// Фасад для работы с документами
public class DocumentFacade {
    //Задачи:
    //Метод для отображения документа:
    //Используйте фабрику документов, чтобы получить документ по заданному заголовку.
    //Вызовите метод для отображения документа.

    private Document getFromFactory(String filename){
        return DocumentFactory.getDocument(filename);
    }

    public void displayDocument(String filename) {
        System.out.println("Document info:\nTitle:" + filename + "\nDocument: ");
        getFromFactory(filename).display();
    }

    //Метод для отображения документа с водяным знаком:
    //Получите документ по заголовку с помощью фабрики документов.
    //Оберните полученный документ декоратором, который добавляет водяной знак.
    //Вызовите метод для отображения обёрнутого документа.

    public void displayDocumentWithWatermark(String filename){
        WatermarkDecorator docToDecorate = new WatermarkDecorator(DocumentFactory.getDocument(filename));
        docToDecorate.display();
    }

    //Метод для рендеринга документа:
    //Создайте объект рендерера, передав в конструктор выбранный движок рендеринга.
    //Вызовите метод рендеринга в рендерере для заданного документа.
    public void renderDocument(String filename, RenderEngine engine) {
        DocumentRenderer renderer = new SimpleDocumentRenderer(engine);

        Document document = new RealDocument(filename);
        renderer.render(document.toString());
    }


}
