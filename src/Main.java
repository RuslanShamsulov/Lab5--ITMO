import serealAndDeserializer.*;
import domain.*;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;


import commands.*;


/**
 * основной класс, запускающий интерактивное приложение
 */
public class Main {

    /**
     * метод Main
     * происходит десериализация, вызов команды define , сериализация обратно в файл
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        LinkedList<Vehicle> mylist = new LinkedList<>(); // создание linkedList для хранения объектов
        String path = Arrays.toString(args).replaceAll("]", "").replaceAll("\\[", ""); // обработка аргументов командной строки
        System.out.println("Задан путь к файлу  " + path);

        File file = new File(path);
        if (file.exists()) {
            System.out.println("путь к файлу найден");
        } else {
            System.out.println("Путь к файлу неверный, измените аргументы командной строки и запустите программу снова");
            System.exit(0); // выход из программы
        }

        Vehicle.file = file;

        DeserializerImpl reader = new DeserializerImpl();
        reader.deserialize(Vehicle.file, mylist);

        CommandDefiner definer = new CommandDefiner();
        definer.define(mylist);

        SerializerImpl writer = new SerializerImpl();

        writer.serialize(mylist, Vehicle.file);

    }
}









































