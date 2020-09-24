public class Pet {

    int age;
    float weight;
    float height;
    String color;

    public void sleep(){
        System.out.println(
                "Buenas noches. Nos vemos manana!");
    }

    public void eat(){
        System.out.println(
                "Tengo hambre. Dame algun snack!");
    }

    public String talk(String aWord){
        String petResponse = "OK! OK! " + aWord;
                return petResponse;
    }
}
