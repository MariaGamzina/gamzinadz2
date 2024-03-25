//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной мили

        int ticket = 24_675; // стоимость билета
        int mile = 20; // стоимость одной мили

        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран

        int bonus = ticket / mile; // количество бонусных миль
        System.out.println("Вы получили " + bonus + " бонусные(ых) мили(ль) ");
    }
}