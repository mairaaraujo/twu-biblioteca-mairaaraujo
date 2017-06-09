package com.twu.biblioteca;


import com.twu.util.InputAsker;

public class App {


    public static void main(String[] args) {

        Menu menu = new Menu();
        WelcomeUser welcomeUser = new WelcomeUser(menu);
        InputAsker inputAsker = new InputAsker(System.in, System.out);

        BibliotecaLauncher bibliotecaLauncher = new BibliotecaLauncher(welcomeUser, inputAsker);
        bibliotecaLauncher.startApp();

    }
}
