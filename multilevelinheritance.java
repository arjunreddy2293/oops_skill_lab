package practical;

class GrandParent {
    void showGrandParent() {
        System.out.println("This is the Grandparent class");
    }
}

class ParentLevel extends GrandParent {
    void showParent() {
        System.out.println("This is the Parent class");
    }
}

class ChildLevel extends ParentLevel {
    void showChild() {
        System.out.println("This is the Child class");
    }
}

public class multilevelinheritance {
    public static void main(String[] args) {
        ChildLevel obj = new ChildLevel();
        obj.showGrandParent();
        obj.showParent();
        obj.showChild();
    }
}
