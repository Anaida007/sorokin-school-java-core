package school.sorokin.javacore.basics;

public class VariablesLesson {

    /**
     * 1. Объявляет переменные типов byte, short, int, long, float, double, boolean и char.
     * 2. Инициализирует каждую переменную осмысленным значением (например, температуру, число населения,
     * индикатор истинности условия и т. п.).
     * 3. Выводит каждую переменную на консоль вместе с описанием.
     * 4. Создаёт вторую переменную типа int и присваивает ей значение из
     * long переменной с явным приведением. Проверьте, не будет ли потеря данных.
     * 5. (Дополнительно) С помощью char и математических операций попробуйте вывести в консоль
     * несколько последовательных символов. Например, взяв 'A' и увеличивая код на 1, 2, 3.
     */
    public static void main(String[] args) {

        // количество подъездов в доме
        byte houseEntrance = 12;
        // количество квартир в доме
        short numberOfApartments = 864;
        // количество жильцов в доме
        int numberOfResidents = 2487;
        // количество потребленной воды в доме за год (кубические метры)
        long waterPerYear = 214_617_600;
        // среднее количество человек в квартире
        float midNumberOfResidentsPerApartment = 2.87847F;
        // среднее количество потребляемой воды одним жителем дома в год
        double midWaterPerResidentPerYear = 86_295.77804583836;
        // есть ли задолжности по платежам
        boolean debtOfHouse = false;
        // корпус в номере дома
        char corpusOfHous = 'a';

        System.out.println("Количество подъездов в доме: " + houseEntrance);
        System.out.println("Количество квартир в доме: " + numberOfApartments);
        System.out.println("Количество жильцов в доме: " + numberOfResidents);
        System.out.println("Количество потребленной воды в доме за год (кубические метры): " + waterPerYear);
        System.out.println("Среднее количество человек в квартире: " + midNumberOfResidentsPerApartment);
        System.out.println("Среднее количество потребляемой воды одним жителем дома в год: " + midWaterPerResidentPerYear);
        System.out.println("Есть ли задолжности по платежам: " + (debtOfHouse ? "да" : "нет"));
        System.out.println("Корпус в номере дома: " + corpusOfHous + '\n');

        int intWaterPerYear = (int) waterPerYear;
        boolean isDataLost = !((long) intWaterPerYear == waterPerYear);

        char letter = 'A';
        for (int i = 0; i < 5; i++) {
            System.out.println("Буква: " + letter++);
        }
    }
}
