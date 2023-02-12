import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task_02 {
    
    // 2. Отфильтровать ноутбуки первоначального множества. 
    // По имени ноутбука в алфавитном порядке, по цене по убыванию
    public static void main(String[] args) {

        List<LapTop> Laptops = Arrays.asList(
        new LapTop("ASUS   ", 20, 128, "Windows 10", "black", 4480), 
        new LapTop("Lenovo ", 64, 100, "Windows XP", "grey ", 3690),
        new LapTop("Dell   ", 120, 256, "Windows 10", "whait", 7900),
        new LapTop("MacBook", 128, 512, "MacOS     ", "whait", 9100),
        new LapTop("HP     ", 12, 20, "Windows 7 ", "red  ", 2400));   
        
        System.out.println("Выберите действие:\n1 - сортировка по Бренду\n2 - сортировка по цене");
        Scanner iScanner = new Scanner(System.in);
        Integer choice = iScanner.nextInt();
        if (choice == 1) {
            System.out.println("|Бренд  |ОЗУ |Цена|");
            Laptops.stream().sorted((p1, p2) -> ((String)p1.getBrand()).compareTo(p2.getBrand()))
            .forEach(Laptop -> System.out.println("|" + Laptop.getBrand() + "|" + Laptop.getRam() + "ГБ|" +
            Laptop.getPrice() + "|"));
            }
        else if (choice == 2) {
            System.out.println("|Бренд  |ОЗУ  |Цена|");
            Laptops.stream().sorted((p2, p1) -> ((Integer)p1.getPrice()).compareTo(p2.getPrice()))
            .forEach(Laptop -> System.out.println("|" + Laptop.getBrand() + "|" + Laptop.getRam() + "ГБ|" +
            Laptop.getPrice() + "|"));
            }
        else System.out.println("Ошибка ввода");
        iScanner.close();
    }
}
