package com.company;

public class Main {

    public static void main(String[] args)
    {
        //Создаю экземпляр класса Cat
        Cat Oliver=new Cat();
        //Задаю имя Oliver
        Oliver.setName("Oliver");
        //Вызываю функцию make_noise
        Oliver.make_noise();

        //Создаю экземпляр класса Dog_n
        Dog_n Rex=new Dog_n();
        //Задаю имя Rex
        Rex.setName("Rex");
        //Вызываю функцию run
        Rex.run();

    }
}
