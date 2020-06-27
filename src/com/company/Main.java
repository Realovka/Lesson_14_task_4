package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
//        Car car=new Car("Audi", 250, 25000);
//        try(ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("car"))){
//            objectOutputStream.writeObject(car);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            try(ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("car"))){
                Car car1 = (Car) objectInputStream.readObject();
                System.out.println(car1);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
