package com.company;

public class Dog
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

    public void run()
    {
        System.out.println(getName()+" runs on all fours !");
    }

    public void bark()
    {
        System.out.println(getName()+" barked ");
    }
}
