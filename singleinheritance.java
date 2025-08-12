package practical;

class Parent { // ✅ Parent class
    void showParent() {
        System.out.println("This is the Parent class");
    }
}

class Child extends Parent { // ✅ Inheriting from Parent
    void showChild() {
        System.out.println("This is the Child class");
    }
}

public class singleinheritance { // ✅ Public class matches file name
    public static void main(String[] args) {
        Child obj = new Child();
        obj.showParent();
        obj.showChild();
    }
}
