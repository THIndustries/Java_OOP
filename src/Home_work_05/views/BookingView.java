package Home_work_05.views;

import Home_work_05.models.Table;
import Home_work_05.presenters.View;
import Home_work_05.presenters.ViewObserver;

import java.util.Date;

import java.util.Collection;

public class BookingView implements View {

    private ViewObserver observer;

    /**
     * Установить наблюдателя, отслеживающего действия пользователя
     * @param observer наблюдатель
     */
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    @Override
    public void printResetvationTableResult(int reservationNo) {
        System.out.printf("Столик успешно забронирован. Номер вашей брони: #%d\n", reservationNo);
    }


    @Override
    public void printReservationTableError(String errorMessege) {
        System.out.printf("Невозможно забронировать столик. \n%s\n", errorMessege);
    }

    @Override
    public void printChangeReservationTableError(String errorMessage) {
        System.out.printf("Невозможно забронировать столик.\n%s", errorMessage);
    }

    @Override
    public void printChangeReservationTableResult(int reservationId) {
        System.out.printf("Ваше бронирование столика успешно изменено. Номер вашей текущей брони: #%d\n",
                reservationId);
    }

    @Override
    public void showTables(Collection<Table> tables) {
        for (Table i: tables) {
            System.out.println(i);
        }
    }

    public void reservationTable(Date reservationDate, int tableNo, String name) {
        observer.onReservationTable(reservationDate, tableNo, name);
    }


    /**
     * Действие клиента (пользователь нажал на кнопку изменения бронирования столика)
     * @param oldReservation старый id
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя
     */
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        observer.onChangeReservationTable(oldReservation,reservationDate,tableNo,name);
    }
}
