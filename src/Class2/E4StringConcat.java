package Class2;

public class E4StringConcat {

    public static void main(String[] args) {

        String name="Clare";
        int age=24;
        int salary=120000;
        String address="259 Gumby Drive Falls Church VA";
        System.out.println(name+age+salary+address);

        System.out.println("My name is "+name);
        System.out.println("My age is "+age);
        System.out.println("My salary is "+salary);
        System.out.println("I live at "+address);

        System.out.println("My name is "+name + " " + "My age is "+age + " " + "My salary is " + " " +salary + " " +  "I live at "+address);

    }
}
