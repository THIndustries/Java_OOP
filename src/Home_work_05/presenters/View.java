package Home_work_05.presenters;

import Home_work_05.models.Table;

import java.util.Collection;

public interface View {
    /**
     * Отображение списка столиков в приложении
     * @param tables список столиков
     */
    void showTables(Collection<Table> tables);

    /**
     * Установить наблюдателя, отслеживающего действия пользователя
     * @param observer наблюдатель
     */
    void setObserver(ViewObserver observer);

    void printResetvationTableResult(int reservationNo);

    void printReservationTableError(String errorMessege);

    void printChangeReservationTableError(String errorMessage);

    void printChangeReservationTableResult(int reservationId);
}
