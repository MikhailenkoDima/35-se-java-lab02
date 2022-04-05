/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg35.se.java.lab002;

import java.io.*;
//Вывод предыдущих результатов
public class Out {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("D:\\35-se-java-lab02\\35-se-java-lab002\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        SerializableClass serializableClass = (SerializableClass) objectInputStream.readObject();

        System.out.println(serializableClass);
    }
}
