package Home_work_05.presenters;

import Home_work_05.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {
    Collection<Table> loadTables();
    /**
     * Бронирование столика
     * @param reservDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя клиента
     */
    int reservationTable(Date reservDate, int tableNo, String name);
    int changeReservationTable(int oldReservation, Date orderDate, int tableNo, String name);

}
