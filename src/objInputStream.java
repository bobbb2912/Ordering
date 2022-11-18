
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import order.infor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dell
 */
public class objInputStream {

    public static void main(String[] args) {
//        infor i4 = null;

        try(FileInputStream fin = new FileInputStream("danhsach1.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);
                
                ) {
            
                ArrayList<infor> list = (ArrayList<infor>) ois.readObject();
            
            for (infor object : list) {
                System.out.println("Name: " + object.getName());
                System.out.println("Phone: " + object.getTel());
                System.out.println("Address: " + object.getAdd());
            }
//            i4 = (infor) ois.readObject();
//            System.out.println(i4.getName());
//            System.out.println(i4.getName());
//            System.out.println(i4.getName());
//            System.out.println(i4.getName());
//            System.out.println(i4.getName());
//            System.out.println(i4.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
//    catch (IOException | ClassNotFoundException e
//
//    
//        ) {
        
//        if (i4 == null) {
//            System.out.println("nothing");
//        } else {
//            System.out.println(i4);
//        }
//    }
}
