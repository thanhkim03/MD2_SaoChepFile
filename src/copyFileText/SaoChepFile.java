package copyFileText;

import java.io.*;

public class SaoChepFile {
    public  static void copyFileText(String l1,String l2){
        try{
            File file1 = new File(l1);
            File file2=new File(l2);
            InputStream inputStream =new FileInputStream(file1);
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String line ="";
            String str = "";
            while ((line= br.readLine())!=null){
                str+=line+"\n";
            }
            OutputStream outputStream = new FileOutputStream(file2);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
            outputStreamWriter.write(str);
            outputStreamWriter.flush();
            System.out.println("chữ số = "+kiTu(str));
        } catch (IOException e) {
            System.out.println("target file đã tồn tại hoặc src file không có dữ liệu");
        }
    }
    public static int kiTu(String str){
        String[] arr = str.split(" ");
        return arr.length;
    }
}
