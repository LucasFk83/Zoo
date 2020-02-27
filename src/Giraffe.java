public class Giraffe extends Animal {
    public Giraffe(String n) {
        super(n, "leaves");
    }
    public void yummy (String food){
        System.out.println(name + " eats " + food);
        if(food==favoriteFood){
            System.out.println("Yum!!! " + name + " wants more " + favoriteFood);
        }else{
            System.out.println(" Yuck!!" + name + " will not eat " + food);
        }
    }
}