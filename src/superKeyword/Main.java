package superKeyword;

public class Main {
    public static void main(String[] args) {
//        1.
//        SubClass sb = new SubClass();
//        sb.foo();// Foo in SubClass
//        SuperClass s = sb;
//        s.foo();//Foo in SubClass because subClass overrides SuperClass foo method here Linking process is happening
//
//        //If we want to access the foo method in the SuperClass  we use the Super keyword
//        // We create a method in the Subclass  We can access the foo method of the SuperClass with it
//
//        sb.accessToSuperClass(); // Now, access the foo method in SuperClass

//        2.
        //I have an empty constructor in SuperClass. It says Constructor in Super-Class
        // Although I did not declare a constructor in my SubClass, I used SubClass sb= new SubClass();
        // in the Main method. When I say that, the constructor in SuperClas is dropped, that is
        // there is a default constructor in SubClass whether I declare it or not and it contains super();
        // there is. This super invokes the constructor of the SuperClas it inherits

//        3.
        //  Calling the constructor with super
        //It is not possible to access Name Surname and Age in our SuperClas because they are private
        // only the get and set methods of SuperClas are public for example this.setName(name); this.setSurname(surname);
        // But there is this type of constructor in SuperClas this.name =name; this.surname = surname; This time
        // superKeyword comes to help us. So if I send the name, surname, age as full in the Main class this will
        // go to the constructor in the Subclass and from here it will go to the constructor in the SuperClass.

        SubClass sb = new SubClass("Vusal", "Guliyev");
        System.out.println(sb);
        //When we say println(sb) here, it returns SubClass@1b6d3586 Class name, @ sign and HasCode, that is, our
        // SubClas does not have a toString Method, so it goes to the Object's toString method and it returns it to
        // us SubClass@1b6d3586. By handling Polymorphism Inheritance and override, well, we have the object of the
        // SubClas full. When we create it as , how can we do it so that it returns the name and surname we gave ourselves?
        // This time, we must override the toString method in SubClass.
        // @Override
        //    public String toString() {
        //        return getName() + " " + getSruname();


    }
}
