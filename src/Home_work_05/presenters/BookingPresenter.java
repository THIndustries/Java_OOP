package Home_work_05.presenters;

import Home_work_05.models.Table;
import Home_work_05.models.TableModel;
import Home_work_05.views.BookingView;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver{

    private final Model tableModel;
    private final View bookingView;

    public BookingPresenter(Model tableModel, View bookingView) {
        //передаем ссылки на представления и на модель данных
        this.tableModel = tableModel;
        this.bookingView = bookingView;
        bookingView.setObserver(this);
    }
    private Collection<Table> loadTables() {
        return tableModel.loadTables();
    }
    public void showTables() {
        bookingView.showTables(loadTables());
    }

    public void printResetvationTableResult(int reservationId) {
        bookingView.printResetvationTableResult(reservationId);
    }
    private void  printReservationTableError(String errorMessege){
        bookingView.printReservationTableError(errorMessege);
    }
    //-------------------------------------------------------------------------------------
    public void printChangeReservationTableError(String errorMessage){
        bookingView.printChangeReservationTableError(errorMessage);
    }
    public void printChangeReservationTableResult(int reservationId) {
        bookingView.printChangeReservationTableResult(reservationId);
    }
    //-------------------------------------------------------------------------------------

    @Override
    public void onReservationTable(Date orgerDate, int tableNo, String name) {
        try {
            int resetvationId = tableModel.reservationTable(orgerDate, tableNo, name);
            printResetvationTableResult(resetvationId);
        }
        catch (RuntimeException e) {
            printReservationTableError(e.getMessage());
        }

    }

    @Override
    public void onChangeReservationTable(int oldReservation, Date orderDate, int tableNo, String name) {
        try
        {
            int reservationId = tableModel.changeReservationTable(oldReservation, orderDate, tableNo,name);
            printChangeReservationTableResult(reservationId);
        }
        catch (RuntimeException e){
            printChangeReservationTableError(e.getMessage());
        }
    }
}
