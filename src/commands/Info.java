package commands;

import domain.Vehicle;

import java.util.LinkedList;

/**
 * реализация команды Info
 */
public class Info implements Command {

    /**
     * вывод информации о коллекции
     * @param LinkedList
     *
     */
    @Override
    public void execute(LinkedList<Vehicle> LinkedList) {
        try {
            System.out.println("Тип коллекции: " + LinkedList.getClass() +
                    "\nДата инициализации коллекции:" + LinkedList.get(0).getCreationDate() // дата создания коллекции совпадает с внесением первого элемента в коллекцию
                    + "\nКоличество элементов: " + (LinkedList.size() - 1));

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Коллекция пуста");
        }
    }
}
