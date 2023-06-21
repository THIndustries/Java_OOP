package Home_work_07;

public interface Publisher {
    /*
    Интерфейс, который описывает обьект, который в состоянии рассылать вакансии.
     */

    /**
     * Регистрация нового наблюдателя
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * Убрать соискателя из списка.
     * @param observer
     */
    void removeObserver(Observer observer);


    /**
     * Компания отправляет новую вакансию
     * @param companeName
     * @param salary
     */
    void sendOffer(String companeName, double salary, VacancyType vacancyType); //лектор уточнил, что этот метод мы будем перерабатывать в дз
}
