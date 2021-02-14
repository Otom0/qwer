import javafx.scene.text.FontWeight;

public class Loader
{
    public static void main(String[] args)
    {
        //System.out.println("Dead".equals("Dead"));
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        System.out.println("Количество котов " +  Cat.getCount());
        //if ()

        System.out.println("cat1 " + cat1.getWeight());
        cat1.feed((double)100);
        System.out.println(cat1.getEatable());
        System.out.println("cat1 " + cat1.getWeight());

        cat1.pee((double) 10);
        System.out.println("hgj " + cat1.getWeight());
        System.out.println("asd " + cat2.getWeight());
        System.out.println("zxc " + cat3.getWeight());
        System.out.println("qaz " + cat4.getWeight());
        System.out.println("wsx " + cat5.getWeight());

        cat3.feed((double) 1);
        System.out.println("qwe " + cat3.getWeight());

        cat2.feed((double) 1);
        System.out.println("asd " + cat2.getWeight());

        System.out.println("\n=====================================================\n");

        while (cat5.getWeight() <=9000) {
            cat5.feed((double) 1);

        }
        System.out.println("qwer " + cat5.getStatus());


            while (cat4.getWeight() >= 1000) {

                cat4.meow();
            }

        System.out.println("[pop] " + cat4.getStatus());

        System.out.println("Количество котов " +  Cat.getCount());

        cat4.pee((double) 10);
        cat4.feed((double) 1);
        cat4.meow();
        cat4.drink((double) 1);
        cat5.meow();
        cat5.drink((double) 1);
        cat5.pee((double) 1);
        cat5.feed((double) 1);

        //if (cat1.getStatus().equals("Exploded")) System.out.println("Ymer");


    }
}