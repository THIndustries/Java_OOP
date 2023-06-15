package Home_work_05;

import Home_work_05.models.TableModel;
import Home_work_05.presenters.BookingPresenter;
import Home_work_05.presenters.Model;
import Home_work_05.presenters.View;
import Home_work_05.views.BookingView;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Model tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.showTables();
        //колиент нажимает на кнопку зарезервировать, возбуждается событие
        //вызывается метод reservationTable()
        bookingView.reservationTable(new Date(), 1, "John");

        System.out.println("-----------------------------------------------------");

        bookingView.changeReservationTable(9001, new Date(), 3, "John");

        System.out.println("-----------------------------------------------------");
        bookingView.changeReservationTable(9002, new Date(), 2, "John");
        System.out.println("-----------------------------------------------------");
        bookingView.changeReservationTable(9002, new Date(), 1, "John");
    }
}
