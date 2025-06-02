package Inheritance;

public class Son extends Father{

    public void investment() {
        System.out.println("Son invested in MF");
    }

    public static void main(String[] args) {
            Son son = new Son();
            son.investment();
            son.assets();
    }
}
