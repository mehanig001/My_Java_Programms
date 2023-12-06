import java.util.Scanner;

public class funcn {

    public static void showMyName(String name) {
        System.out.println(name);
        return;
        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        showMyName(name);

        
    }
    
}
