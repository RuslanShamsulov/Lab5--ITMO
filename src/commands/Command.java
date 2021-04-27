package commands;
import domain.*;


import java.util.LinkedList;

/**
 * базовый интерфейс для комманд
 */
public interface Command {
    /**
     *
     * @param LinkedList
     */
    void execute(LinkedList<Vehicle> LinkedList);

}
