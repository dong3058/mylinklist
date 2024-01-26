
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Link <String>link=new Link<>();

        link.add("a");
        link.add("B");
        link.add("c");
        link.get(1);
        link.get(2);
        link.get(3);
        link.get(4);

        link.delete(3);
        link.get(2);
        link.get(1);
        link.get(3);

    }
}