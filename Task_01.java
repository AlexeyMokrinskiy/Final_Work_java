import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Task_01 {
    
    // 1. Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет выборку: 
    // имя ноутбука и выбранный критерий. Критерии фильтрации можно хранить в Map.

    public static void main(String[] args) {
        
        System.out.println("Выберите действие:\n1 - сортировка по ОЗУ\n2 - сортировка по HHD"
        + "\n3 - сортировка по OS\n4 - сортировка по цвету");
        Scanner iScanner = new Scanner(System.in);
        Integer choice = iScanner.nextInt();
        if (choice == 1) {
      
            Map<String, Integer> ramMap = new HashMap<>();
            ramMap.put(LapTop.notebook1.getBrand(), LapTop.notebook1.getRam());
            ramMap.put(LapTop.notebook2.getBrand(), LapTop.notebook2.getRam());
            ramMap.put(LapTop.notebook3.getBrand(), LapTop.notebook3.getRam());
            ramMap.put(LapTop.notebook4.getBrand(), LapTop.notebook4.getRam());
            ramMap.put(LapTop.notebook5.getBrand(), LapTop.notebook5.getRam());

            System.out.println("\n| Бренд | ОЗУ  |");
            Map<String, Integer> sortedMap = Methods.sortByValueSI(ramMap);
            Methods.printMap(sortedMap);

        }
        else if (choice == 2){

            Map<String, Integer> hhdMap = new HashMap<>();
            hhdMap.put(LapTop.notebook1.getBrand(), LapTop.notebook1.getHhd());
            hhdMap.put(LapTop.notebook2.getBrand(), LapTop.notebook2.getHhd());
            hhdMap.put(LapTop.notebook3.getBrand(), LapTop.notebook3.getHhd());
            hhdMap.put(LapTop.notebook4.getBrand(), LapTop.notebook4.getHhd());
            hhdMap.put(LapTop.notebook5.getBrand(), LapTop.notebook5.getHhd());

            System.out.println("\n| Бренд | HHD  |");
            Map<String, Integer> sortedMap = Methods.sortByValueSI(hhdMap);
            Methods.printMap(sortedMap);

        }
        else if (choice == 3){

            Map<String, String> osMap = new HashMap<>();
            osMap.put(LapTop.notebook1.getBrand(), LapTop.notebook1.getOS());
            osMap.put(LapTop.notebook2.getBrand(), LapTop.notebook2.getOS());
            osMap.put(LapTop.notebook3.getBrand(), LapTop.notebook3.getOS());
            osMap.put(LapTop.notebook4.getBrand(), LapTop.notebook4.getOS());
            osMap.put(LapTop.notebook5.getBrand(), LapTop.notebook5.getOS());

            System.out.println("\n| Бренд |  OS      |");
            Map<String, String> sortedMap = Methods.sortByValueSS(osMap);
            Methods.printMapS(sortedMap);
        }
        else if (choice == 4){

            Map<String, String> colorMap = new HashMap<>();
            colorMap.put(LapTop.notebook1.getBrand(), LapTop.notebook1.getColor());
            colorMap.put(LapTop.notebook2.getBrand(), LapTop.notebook2.getColor());
            colorMap.put(LapTop.notebook3.getBrand(), LapTop.notebook3.getColor());
            colorMap.put(LapTop.notebook4.getBrand(), LapTop.notebook4.getColor());
            colorMap.put(LapTop.notebook5.getBrand(), LapTop.notebook5.getColor());

            System.out.println("\n| Бренд |Цвет |");
            Map<String, String> sortedMap = Methods.sortByValueSS(colorMap);
            Methods.printMapS(sortedMap);
        }
        else {
            System.out.println("Ошибка ввода");
            iScanner.close();
        }
    }
}


