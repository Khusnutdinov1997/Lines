import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      Задание 1
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = in.nextLine();
        System.out.println("Введите выше отчество: ");
        String patronymic = in.nextLine();
        System.out.println("Введиет вашу фамилию: ");
        String surname = in.nextLine();
        in.close();
        String fullName = surname + " " + name + " " + patronymic;
        System.out.println("ФИО сотрудника - " + fullName);

//      Задание 2
        String report = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнеия отчета - " + report);

//      Задание 3
        String change = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО Сотрудника - " + change);


    }
}