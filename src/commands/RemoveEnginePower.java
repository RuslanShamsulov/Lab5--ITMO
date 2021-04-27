package commands;

import domain.Vehicle;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * класс, удаляющий элемент с введенным EnginePower
 */
public class RemoveEnginePower {

    /**
     *
     * @param LinkedList
     * @param input
     */
    public void execute(LinkedList<Vehicle> LinkedList, String input) {
        FinderNumbers finder = new FinderNumbers();
        int power = finder.find(input);
        Iterator<Vehicle> iterator = LinkedList.iterator();
        while (iterator.hasNext()) {
            Vehicle currentVehicle = iterator.next();
            if (currentVehicle.getEnginePower() == power) {
                LinkedList.remove(currentVehicle);
                System.out.println("Элемент"+currentVehicle.toString()+ "был успешно удален" );
                break;
            }
        }
    }

}

