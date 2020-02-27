public class Zoo {

    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
        Bear po = new Bear("Po");
        Unicorn corona = new Unicorn("Corona");
        Bee buzz = new Bee("Buzz");
        Giraffe tali = new Giraffe("Tali");
        Zookeeper zuco = new Zookeeper("Zuco");

        tigger.yummy("bacon");
        po.yummy("fish");
        corona.yummy("marshmallows");
        buzz.yummy("pollen");
        tali.yummy("leaves");

        Animal[] animals = {tigger,po,corona,buzz,tali};
        zuco.feedAnimals(animals,"Rice");
    }
}

