public class Main {
    public static void main(String[] args) {

        System.out.println(" Задание 1 ");

        Human max = new Human( " Максим " , 1988, "Минск","бренд-менеджером ");
        max.greeting();
        Human ania = new Human( " Анна ", 1993 , " Москва ","методистом образовательных программ ");
        ania.greeting();
        Human katya = new Human( " Катя ", 1992, " Калининград ","продакт-менеджером ");
        katya.greeting();
        Human artem= new Human(" Артем ",1995, " Москва","директором по развитию бизнеса ");
        artem.greeting();
    }
}