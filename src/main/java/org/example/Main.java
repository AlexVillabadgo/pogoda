package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            String url = "https://www.stackoverflow.com";
            Document document = Jsoup.connect(url).get();
            System.out.println(document);

        }catch(IOException e){
            System.out.println(e);
        }
    }
}
