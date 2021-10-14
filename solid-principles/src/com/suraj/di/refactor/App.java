package com.suraj.di.refactor;


import com.suraj.di.refactor.MySqlDatabase;

public class App {
    public static void main(String[] args){
         DatabaseController controller= new DatabaseController(new MySqlDatabase());
         controller.connect();
         controller.disconnect();
    }
}
