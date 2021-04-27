package commands;

import domain.Vehicle;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * класс реализация добавления элемента,
 */
public class AddIfMax extends Add {
    /**
     * метод реализация занесения максимального элемента
     * @param LinkedList
     */
    public void checkIfMax(LinkedList<Vehicle> LinkedList, Scanner scanner) {
        System.out.println("Введите величину EnginePower, используемой в качестве сравнения");
        GetterKeyParam getterKeyParam = new GetterKeyParam();

        if ((LinkedList.get(LinkedList.size() - 1).getEnginePower()) < getterKeyParam.get()) {
            System.out.println("Введенное значение EnginePower больше, чем у максимального элемента коллекции");
            System.out.println("Добавление элемента разрешено");
            execute(LinkedList,scanner);
        } else {
            System.out.println("Введенное значение EnginePower меньше, добавление элемента запрещено");

        }


    }
}
