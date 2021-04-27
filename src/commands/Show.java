package commands;

import domain.Vehicle;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * класс, реализуюший вывод элементов
 */
public class Show implements Command {

    /**
     * вывод элементов
      * @param LinkedList
     */
    @Override
    public void execute(LinkedList<Vehicle> LinkedList) {
        Iterator iterator = LinkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
