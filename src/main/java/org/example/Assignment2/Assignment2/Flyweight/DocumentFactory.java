package org.example.Assignment2.Assignment2.Flyweight;

import org.example.Assignment2.Assignment2.Document;
import org.example.Assignment2.Assignment2.RealDocument;

import java.util.HashMap;
import java.util.Map;

// Фабрика для создания и переиспользования документов
public class DocumentFactory {
    private static final Map<String, Document> documentMap = new HashMap<>();

    // Задача: Реализуйте фабрику, которая будет хранить и переиспользовать документы,
    // чтобы не создавать их повторно для одного и того же заголовка.
    public static Document getDocument(String docName) {
        if (documentMap.containsKey(docName)) {
            return documentMap.get(docName);
        } else {
            Document document = new RealDocument(docName);
            documentMap.put(docName, document);
        }
        return documentMap.get(docName);
    }
}

