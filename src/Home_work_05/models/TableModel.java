package Home_work_05.models;

import Home_work_05.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {
    private Collection<Table> tables;
    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }


    /**
     * Бронирование столика
     * @param reservDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя клиента
     */
    public int reservationTable(Date reservDate, int tableNo, String name) {
        for(Table table: tables) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(reservDate, name);
                table.getReservation().add(reservation);// добавляем резерв к резервам в рамках столика
                return reservation.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика.");
    }

    /**
     * Поменять бронь столика
     */
    public int changeReservationTable(int oldReservation, Date orderDate, int tableNo, String name){
        for (Table table: tables){
            for (Reservation reservation: table.getReservation()){
                if (reservation.getId() == oldReservation){
                    table.getReservation().remove(reservation);
                    return reservationTable(orderDate, tableNo, name);
                }
            }
        }
        throw new RuntimeException("Некорректный номер бронирования столика.");
        //...
        //TODO: Для создания новой брони, можно воспользоваться уже существующим методом reservationTable
    }

}
