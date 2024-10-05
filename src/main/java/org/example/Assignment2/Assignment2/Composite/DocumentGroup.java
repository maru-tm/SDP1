package org.example.Assignment2.Assignment2.Composite;

import org.example.Assignment2.Assignment2.Document;

import java.util.ArrayList;
import java.util.List;

// Класс для работы с группами документов (категориями)
public class DocumentGroup implements Document {
    private List<Document> documents = new ArrayList<>();

    // Задача: Реализуйте методы для добавления и удаления документов из группы,
    // а также отображение всех документов в группе через метод display().
    public void display(){
        System.out.println(documents);
    }

    public void addDocument(Document document){
        documents.add(document);
    }

    public void removeDocument(Document document){
        documents.remove(document);
    }
}

