package serealAndDeserializer;

import java.time.LocalDate;
import java.util.Date;

/**
 * интерфейс для дальнейшей реализации автоматической генерации даты
 */
public interface DateGenerator {
     /**
      *
      * @return
      */
     LocalDate generateDate();
}
