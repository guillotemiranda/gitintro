public class Fish implements Swimmable {
    public void swim(int howFar){
        System.out.println("OK, will swim " + howFar + " feet");
    }
    public void dive(int howDeep){
        System.out.println("OK, will dive " + howDeep + " feet");
    }


    public void surface(){
        System.out.println("Going up " + currentDepth + " feet.");
    }

 }

