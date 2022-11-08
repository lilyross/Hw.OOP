public class Human {
    public String name;
    public int yearOfBirth;
    public String town;
    public String jobTitle;

    Human(String name, int yearOfBirth, String town, String jobTitle) {
        if (name == null || name.isBlank()) {
            this.name = " Информация не указана ";
        } else {
            this.name = name;
        }
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
        if (town == null||town.isBlank()) {
            this.town = " Информация не указана ";
        } else {
            this.town = town;
        }
        if (jobTitle == null||jobTitle.isBlank()) {
            this.jobTitle = " Информация не указана ";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    void greeting() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы! ");
    }
    }
