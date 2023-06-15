package Home_work_05.presenters;

import java.util.Date;

public interface ViewObserver {
    void onReservationTable(Date orgerDate, int tableNo, String name);
    void onChangeReservationTable(int oldReservation, Date orderDate, int tableNo, String name);
}
