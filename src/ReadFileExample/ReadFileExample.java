package ReadFileExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFileExample {
    public void readFileText(String filePath) throws RuntimeException{
        try {
            File file = new File(filePath);
            if (!file.exists()){
                throw new RuntimeException();
            }
            BufferedReader br =new BufferedReader(new FileReader(file));
            String line ="";
            int sum=0;
            while ((line = br.readLine())!=null){
                System.out.println(line);
                sum+= Integer.parseInt(line);
            }
            br.close();
            System.out.println("tổng "+sum);
        }catch (Exception e){
            System.out.println("file ko tồn tại");
        }
    }

}
