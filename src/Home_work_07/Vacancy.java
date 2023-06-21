package Home_work_07;

public class Vacancy {
    //private String title;
    //private String description;
    public VacancyType vacancyType;

    public Vacancy(VacancyType vacancyType) {
        //this.title = title;
        //this.description = description;
        this.vacancyType = vacancyType;
    }



    public VacancyType getVacancyType() {
        return vacancyType;
    }
}

