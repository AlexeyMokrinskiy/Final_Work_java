public class LapTop {
    
    String brand;
    int ram;
    int hhd;
    String os;
    String color;
    int price;

    LapTop(String b, int r, int h, String o, String c, int p){
        brand = b;
        ram = r;
        hhd = h;
        os = o;
        color = c;
        price = p;
    }

    public LapTop(LapTop notebook12) {
    }

    public String getBrand() {
        return brand;
    }

    public Integer getRam() {
        return ram;
    }

    public Integer getHhd() {
        return hhd;
    }

    public String getOS() {
        return os;
    }
    
    public String getColor() {
        return color;
    }

    public Integer getPrice() {
        return price;
    }

    static LapTop notebook1 = new LapTop("ASUS   ", 20, 128, "Windows 10", "black", 4480);
    static LapTop notebook2 = new LapTop("Lenovo ", 64, 100, "Windows XP", "grey ", 3690);
    static LapTop notebook3 = new LapTop("Dell   ", 120, 256, "Windows 10", "whait", 7900);
    static LapTop notebook4 = new LapTop("MacBook", 128, 512, "MacOS     ", "whait", 9100);
    static LapTop notebook5 = new LapTop("HP     ", 12, 20, "Windows 7 ", "red  ", 2400);
    
}
