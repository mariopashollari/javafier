import riperseritje.Human;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Human human2= new Human("kevin");
        Human human3= new Human("j8e","Kevi",26);

        human.emri = "Mario";


        System.out.println("emri:"+ human.emri);
        System.out.println("emri:"+ human2.emri);
        System.out.println("id:"+human3.id);
        System.out.println("emri:"+human3.emri);
        System.out.println("mosha:"+human3.mosha);

    }
}