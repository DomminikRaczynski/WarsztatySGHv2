package com.skni.warsztatysghv2.registration;

import org.springframework.stereotype.Component;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
@Component
public class FileSaver {
    public void saveToFile(Student student) {
        try {
            PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter("students.txt", true)));
            printWriter.println(student);
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
