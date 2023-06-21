package Home_work_07;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {

    List<Observer> observers = new ArrayList<>(); //Список наших потенциальных соискателей.


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendOffer(String companeName, double salary, VacancyType vacancyType) {
        for (Observer i: observers) {
            if (i instanceof Master) {
                Master j = (Master)i;
                if (j.getMasterVacancy().contains(vacancyType)) {//проверяем,
                    // содержит ли masterVacancy соответствующий vacancyType
                    i.receiveOffer(companeName, salary, vacancyType);
                }
            } else if (i instanceof  Student) {
                Student student = (Student)i;
                if (student.getStudentVacancy().contains(vacancyType)) {
                    i.receiveOffer(companeName, salary, vacancyType);
                }
            } else if (i instanceof Professional) {
                Professional professional = (Professional)i;
                if (professional.getProfVacancy().contains(vacancyType)) {
                    i.receiveOffer(companeName, salary, vacancyType);
                }
            }

        }
    }

}
