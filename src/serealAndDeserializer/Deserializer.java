package serealAndDeserializer;

import domain.*;
import java.io.File;
import java.util.LinkedList;

/**
 * интерфейс для десериализатора
 */
public interface Deserializer {
    /**
     *
     * @param file
     * @param linkedList
     */
    void deserialize(File file, LinkedList<Vehicle> linkedList);
}
