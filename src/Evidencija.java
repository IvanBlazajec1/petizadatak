import jdk.dynalink.beans.StaticClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Evidencija{
    private  ArrayList<String> student;
    public Evidencija(){
        student=new ArrayList<String>();
    }
    public static void addStudents(){
        List<String> arrayList=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Unesi ime");
        System.out.print("Unesi prezime");
        System.out.println("Unesi godinu studija");
        System.out.println("Unesi broj indeksa");

    }
    public void printStudents(){

    }
    public ArrayList<String> addStudent(){
        ArrayList<String> strings=new ArrayList<String>();
        return new ArrayList<String>(student);
    }


}

