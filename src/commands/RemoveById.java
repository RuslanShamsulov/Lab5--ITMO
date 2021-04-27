package commands;

import domain.Vehicle;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * класс для реализации замены по ID
 */
public class RemoveById {
    /**
     *
     * @param textFromScanner
     * @param LinkedList
     */
    public void execute(String textFromScanner,LinkedList<Vehicle> LinkedList) {
        FinderNumbers finder = new FinderNumbers();
        int id = finder.find(textFromScanner);
        Iterator<Vehicle> iterator =  LinkedList.iterator();
        while (iterator.hasNext()){
            Vehicle currentVehicle =iterator.next();
            if (currentVehicle.getId()==id){
                LinkedList.remove(currentVehicle);
                break;
            }
        }
    }
}
