package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("kim",19,8.7);
        Student student2 = new Student("thành",20,8.7);
        Student student3 = new Student("nam",21,8.7);
        Student student4 = new Student("mạnh",22,8.7);
        List<Student> list=new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        try {
//            khai báo một đối tượng file
            FileReader fr = new FileReader("data.txt");
//            Tạo một bộ đệm
            BufferedReader br = new BufferedReader(fr);
            String line ="";
//            đọc hết một dòng
            while (true){
                line = br.readLine();
                if (line==null){
                    break;
                }
                line = br.readLine();
                System.out.println(line);
            }
        }catch (Exception e){

        }
    }
    public void writeToFile(List<Student> list){
        try {
            FileWriter fw = new FileWriter("data.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (Student o:list) {
                bw.write(o.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        }catch (Exception e) {
        }
    }
}
