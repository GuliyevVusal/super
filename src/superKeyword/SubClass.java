package superKeyword;

public class SubClass extends SuperClass {

    public SubClass(String name, String sruname) {
        super(name, sruname);
    }

    public void foo() {
        System.out.println("Foo in Sub-Class");
    }

    public void accessToSuperClass() {
        super.foo();
    }

    @Override
    public String toString() {
        return getName() + " " + getSruname();


    }
}
