public class Main {
    public static void main(String[] args) {
        Email person=new Email("joe","aneuman1@cscc.edu");
        Phone person2=new Phone("bob","123-456-7890");
        person.Contact();
        person2.Contact();
    }
}
abstract class Contacts{
    private String name;

    public Contacts(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                '}';
    }
    abstract void Contact();
}
class Email extends Contacts{
    private String email;

    public Email(String name, String email) {
        super(name);
        this.email = email;
    }

    @Override
    void Contact() {
        System.out.println("Email "+email);
    }
}
class Phone extends Contacts{
    private String phone;

    public Phone(String name, String phone) {
        super(name);
        this.phone = phone;
    }

    @Override
    void Contact() {
        System.out.println("Calling "+phone);
    }
}

/*Create an abstract class for contacts that stores a contact's
name and defines an abstract method contact(). Create one class
that makes use of the abstract contact class that stores an email
 address and implements the contact() method using the email address
 and another class that stores a phone number and implements the
  contact() method using the phone number. The implementation of
   the contact() method should simply print a string with the
   appropriate information like "Emailing aneuman1@cscc.edu" or
    "Calling 123-456-7890".*/