package javarecapsubtypes;

public class Example {

    public static void run()
    {
        //Operations available to the variable of type MyInterface are just interfaceMethodA()
        MyInterface myInterface = new E();
        myInterface.interfaceMethodA();

//Operations available to the variable of type D are interfaceMethodA() and methodA()
        D d = new E();
        d.interfaceMethodA();
        d.methodA();

//Operations available to the variable of type E interfaceMethodA(), methodA() and methodB();
        E e = new E();
        e.interfaceMethodA();
        e.methodA();
        e.methodB();



    }


}
