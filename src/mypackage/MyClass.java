package mypackage;

class MyClass {
    String myClassField = "";

    public void MyMethod() {
        MyOtherClass myOtherClass = new MyOtherClass();
        myOtherClass.myOtherClassField = "new myOtherClassField value";
        myOtherClass.MyOtherClassMethod();

    }
}
