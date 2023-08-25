package Class7;
//Create an array of names and store all names of your group. Then print your name from that array. (use 2 different ways of creating an array).
public class HW3GroupNames {
    public static void main(String[] args) {

        String[] names={"Clare","Uzair","Michelle","Avis","Adem","Rkia"};
        System.out.println(names[0]);

        String[] name=new String[6];
        name[0]="Avis";
        name[1]="Michelle";
        name [2]="Uzair";
        name [3]="Rkia";
        name[4]="Clare";
        name[5]="Adem";
        System.out.println(name[4]);



    }
}
