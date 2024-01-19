package superKeyword;

public class SuperClass {

    private String name;
    private String sruname;
    private int age;

//    public SuperClass() {
//        System.out.println("Constructor in Super-Class");
//    }

        public SuperClass(String name, String sruname) {
        this.name = name;
        this.sruname = sruname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSruname() {
        return sruname;
    }

    public void setSruname(String sruname) {
        this.sruname = sruname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void foo() {
        System.out.println("Foo in Super-Class: ");
    }
}
