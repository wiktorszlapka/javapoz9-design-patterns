package com.sda.builder;

import com.sda.builder.model.Document;
import com.sda.builder.model.DocumentLombok;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
    //builder
        //all args constructor
        Document document = new Document(
                Instant.now(),
                "Opis dnia szkoleniowego",
                "Opis dnia szkoleniowego",
                "Szymon Nowak",
                Arrays.asList("długopis", "zeszyt", "laptop")
        );

        //setters
        //new Document.var + enter: wynik:
        Document documentBySetters = new Document();
        documentBySetters.setTitle("Plan tygodnia");
        documentBySetters.setDescription("Lorem ipsum");
        documentBySetters.setAuthor("Jan Kowalski");
        documentBySetters.setCreationDate(Instant.now());
        documentBySetters.setItems(Arrays.asList("Ala", "aa", "kota"));

        //builder
        Document documentByBuilder = Document.builder()
                .title("Plan działania")
                .description("COs innego")
                .creationDate(Instant.now())
                .items(Arrays.asList("abc", "rfs")) //lista
                .items("fds") //to jest String, czytelniejsze
                .author("Inny autor")
                .bulid();


        DocumentLombok build = DocumentLombok.builder()
                .author("Szymon nowak")
                .description("Lorek mom")
                .build();

        //nowa lista strinów
        List<String> items = Arrays.asList("ALa", "ma", "Kota");
        //pusty string
        String result = "";
        //loop który przechodzi po całej liście
        for (String item : items) {
        //dodaje listę stringów do result
            result += item + ' ';
        //ten zapis powoduje że tworzy się najpierw "ala ma", dopiero potem "ala ma kota" - zawsze ilość NIEPOTRZEBNYCH zapisów
        //wynosi n -1, bo program leci po kolei i dodaje kolejne elementy

        //analogiczny zapis - ale poprawny! TAK TWORZYĆ ŁĄCZENIA, konkatenacja
        StringBuilder stringBuilder = new StringBuilder();
        for (String itemm : items) {
            stringBuilder.append(itemm).append(" ");
        }
        String massage = stringBuilder.toString();
            System.out.println(massage);
        }

    }
}
