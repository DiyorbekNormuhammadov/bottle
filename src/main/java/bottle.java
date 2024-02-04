import java.util.Scanner;

public class bottle {

    private int capacity=100;
    private int water;

    public void addWater(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Qancha suv qo'shmoqchisiz:");
        int x=scanner.nextInt();
        if(x>capacity-water){
            System.out.println("Buncha suv qo'sha olmaysiz.");
            return;
        }
        water+=x;
        System.out.println("Suv qo'shildi.");
    }

}
