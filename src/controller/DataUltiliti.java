/**
 * Lớp này dùng để thao tác với file: ghi file, xoá file,...
 */
package controller;

import model.Book;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DataUltiliti {
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private PrintWriter printWriter;
    private Scanner scanner;
void openFileToWrite (String fileName ){
    try {
        fileWriter = new FileWriter(fileName,true);
        bufferedWriter = new BufferedWriter(fileWriter);
        printWriter = new PrintWriter(bufferedWriter);
    }catch (IOException e){
        e.printStackTrace();
    }

}
void writeBookToFile (Book book, String fileName){
    openFileToWrite(fileName);
    printWriter.println(book.getBookID()+"|"+book.getBookName()+"|"+book.getAuthor()+"|"+book.getSpecialization()
    +"|"+book.getPublishYear()+"|"+book.getQuantity());
    closeFileAfterWrite(fileName);
}

void closeFileAfterWrite (String fileName){
    try {
        printWriter.close();
        bufferedWriter.close();
        fileWriter.close();
    }catch (Exception e){
        e.printStackTrace();
    }
}
}
