public class Main {
    public static void main(String[] args){
        Phones phone = new Phones();
        System.out.println(phone.add_phone("Сергей", "88005553535"));
        System.out.println(phone.add_phone("Сергей", "88005553545"));
        System.out.println(phone.add_phone("Сергей", "88005553555"));
        System.out.println("--------------------");
        System.out.println(phone.get_phone("Сергей"));
        System.out.println("--------------------");
        System.out.println(phone.get_name("88005553535"));
        System.out.println(phone.get_name("88005553545"));
        System.out.println(phone.get_name("88005553555"));
        System.out.println("--------------------");
//        System.out.println(phone.delete_man("Сергей"));
//        System.out.println("After removing");
//        System.out.println(phone.get_phone("Сергей"));

        System.out.println(phone.delete_phone("Сергей","88005553535"));
        System.out.println("After removing phone 88005553535");
        System.out.println(phone.get_name("88005553535"));
        System.out.println("--------------------");

        System.out.println(phone.add_phone("Иван", "99009999999"));
        System.out.println(phone.add_phone("Иван", "99009999998"));
        System.out.println(phone.add_phone("Иван", "99009999997"));
        System.out.println("--------------------");
        System.out.println(phone.get_phone("Иван"));
        System.out.println("--------------------");
        System.out.println(phone.get_name("99009999999"));
        System.out.println(phone.get_name("99009999998"));
        System.out.println(phone.get_name("99009999997"));
        System.out.println("--------------------");

    }
}
