import qwe.Person;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Aaaa", 20, "qwertz", "1234567");

        person1.dysplayName();      //  public виден везде и в других классах и в других папках
        //  person1.dysplayAge();    //   void  виден везде и в других классах в пределах папки
        //   person1.dysplayAddress();  private виден только в своём классе
        //   person1.dysplayPhone();  //  protected виден везде и в других классах в пределах папки
        
    }
}