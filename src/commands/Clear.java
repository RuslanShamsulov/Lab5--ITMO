package commands;

import domain.Vehicle;

import java.util.LinkedList;

/**
 * класс, реализующий очистку коллекцию
 */
public class Clear implements Command {
    @Override
    public void execute(LinkedList<Vehicle> LinkedList) {
        LinkedList.clear();
    }
}
