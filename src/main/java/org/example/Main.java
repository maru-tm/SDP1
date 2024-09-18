package org.example;


import org.example.Ass0for5per.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Создаем новую книгу
        Book book = new Book("Clean Code", "Robert C. Martin", "978-0132350884");

        // Проверяем доступность книги
        BookAvailability availability = new BookAvailability(true);
        System.out.println("Is the book available? " + availability.isAvailable());

        // Форматирование книги в строковом формате
        Formatter stringFormatter = new StringFormatter();
        System.out.println(stringFormatter.format(book));

        // Форматирование книги в формате JSON
        Formatter jsonFormatter = new JsonFormatter();
        System.out.println(jsonFormatter.format(book));

        // Форматирование книги в формате XML
        Formatter xmlFormatter = new XmlFormatter();
        System.out.println(xmlFormatter.format(book));        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}