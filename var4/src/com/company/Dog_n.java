package com.company;

//Класс использует интерфейс pet
public class Dog_n implements Pet
{
    private String name="Dog";

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return this.name;
    }

    //Переписываю функцию run
    @Override
    public void run()
    {
        System.out.println(getName()+" runs on all fours !");
    }

    //Переписываю функцию make_noise
    @Override
    public void make_noise()
    {
        System.out.println(getName()+" barked ");
    }
}
