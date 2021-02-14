
public class Cat {
    private double originWeight;
    private double weight;
    public static int count;
    private double minWeight;
    private double maxWeight;
    private double eatable;


    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;

    }


    public void meow()
    {
        if (getStatus().equals("Dead") || getStatus().equals("Exploded"))
        {

            System.out.println("can't meow");
        } else
            {
            weight = weight - 100;
            System.out.println("Meow");

        }


    }
    public void pee(Double amount){
        if (getStatus().equals("Dead") || getStatus().equals("Exploded")) {

            System.out.println("can't pee");
        }
        else {
            weight = weight + amount;

            System.out.println("пописал");
        }
    }


    public void feed(Double amount)
    {
        if (getStatus().equals("Dead") || getStatus().equals("Exploded")) {

            System.out.println("can't feed");
        }
        else {
            weight = weight + amount;
        }
    }

    public void drink(Double amount)
    {
        if (getStatus().equals("Dead") || getStatus().equals("Exploded")) {

            System.out.println("can't drink");
        }
        else {
            weight = weight + amount;
        }
    }

    public Double getWeight()
    {
        return weight;
    }


    public String getStatus()
    {
        if(weight < minWeight) {
            count--;
            return "Dead";
        }
        else if(weight > maxWeight) {
            count--;
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public double getEatable() {
        eatable = weight - originWeight;
        return eatable;
    }

    public static double getCount() {
        return count;
    }
}