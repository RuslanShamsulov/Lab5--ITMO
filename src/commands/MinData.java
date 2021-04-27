package commands;

import domain.Vehicle;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * класс, реализующий поиск элемента с минимальной датой
 */
public class MinData implements Command {
    static Vehicle minDataVehicle = null;
    static LocalDate minDate = null;

    /**
     * нахождение самой ранней даты
      * @param LinkedList
     */
    @Override
    public void execute(LinkedList<Vehicle> LinkedList) {
        Iterator<Vehicle> iterator = LinkedList.iterator();
        minDate = LinkedList.get(0).getCreationDate();
        minDataVehicle =LinkedList.get(0);
        while (iterator.hasNext()) {
            Vehicle currentVehicle = iterator.next();


            if (currentVehicle.getCreationDate().isBefore(minDate)) {
                minDate = currentVehicle.getCreationDate();
                minDataVehicle = currentVehicle;
            }

        }
        System.out.println("Элемент с самой ранней датой создания это\n" + minDataVehicle.toString());
    }
}