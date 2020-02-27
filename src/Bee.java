public class Bee extends Animal {
    public Bee(String n) {
        super(n, "honey");
    }

    public void sleep() {
        System.out.println(name + " never sleeps");
    }
    public void yummy (String food){
        System.out.println(name + " eats " + food);
        if(food==favoriteFood){
            System.out.println("Yum!!! " + name + " wants more " + favoriteFood);
        }else{
            System.out.println("Yuck!!" + name + " will not eat " + food);
        }
    }

}