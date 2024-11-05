public class Main {
    public static void main(String[] args) {

        Contact contactOne = new Contact("Matheesha", new PhoneNumber("0725634781"));
        Contact contactTwo = new Contact("Kushmi", new PhoneNumber(23,"0735678954"));
        Contact contactThree = new Contact("Anuja", new PhoneNumber("0735678954"));
        Contact contactFour = new Contact("Thanuga", "Thanuga@gmail.com");
        Contact contactFive = new Contact("Akila", new PhoneNumber("074537892"), "Akila@gmail.com");

        System.out.println(contactOne);
        System.out.println(contactTwo);
        System.out.println(contactThree);
        System.out.println(contactFour);
        System.out.println(contactFive);

    }
}

