package com.company;

//Класс использует интерфейс pet
public class Cat implements Pet
{

    private String name="Cat";

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
        System.out.println(getName()+" runs gracefully !");
    }

    //Переписываю функцию make_noise
    @Override
    public void make_noise()
    {
        System.out.println(getName()+" meowed !");
    }
}
