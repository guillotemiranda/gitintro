public class PetMaster {
    public static void main(String[] args) {

        Dog myDog = new Dog();
        myDog.talk();
        myDog.swim(7);
        myDog.dive(2);  // will use default method

        Fish myFish = new Fish();
        myFish.swim(50);
        myFish.dive(20);
    }
}
