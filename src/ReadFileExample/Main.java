package ReadFileExample;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("nhập đường dẫn file ");
        String path = scanner.nextLine();

        ReadFileExample example=new ReadFileExample();
        example.readFileText(path);
    }
}
