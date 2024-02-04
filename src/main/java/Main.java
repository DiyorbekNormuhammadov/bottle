import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        bottle bottle = new bottle();
        Scanner scanner = new Scanner(System.in);
        stopF:
        while (true){
            System.out.println("""
                    
                    1 - suv quyish
                    2 - suv to'kish
                    
                    0 - chiqish
                    
                    """);
            switch (scanner.nextInt()){
                case 1 -> {
                    bottle.addWater();
                }
                case 2 -> {

                }
                case 0 ->{
                    break stopF;
                }
            }
        }
    }
}
