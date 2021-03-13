public class StringManipulation {
    public static void main(String[] args) {
        System.out.println("StringManipulation.java exercise");
        System.out.println("getStringSize:");
        getStringSize("I am a really long string");
        System.out.println("stringPrinter:");
        stringPrinter();
        System.out.println("stringSaw:");
        stringSaw();
        System.out.println("parseMe:");
        parseMe();
    }
    public static void getStringSize(String s){
        //Code here(Find the size of s)
        System.out.println(s.length());
    }
    public static void stringPrinter(){
        //FIX the line below
        System.out.println("We are \"DANCERS\", so all we do is \"DANCE\"!");
    }
    public static void stringSaw(){
        String info = "Tom Jackson 35";//DO NOT CHANGE ME
        String fName, lName;
        String age;
        //Code here
        fName = info.substring(0,3);
        lName = info.substring(4,11);
        age = info.substring(12,14);
        System.out.println(fName);
        System.out.println(lName);
        System.out.println(age);

    }
    public static void parseMe(){
        String stringA = "30";//DO NOT CHANGE ME
        String stringB = "15";//DO NOT CHANGE ME
        //Code here
        System.out.println(Integer.parseInt(stringA)+Integer.parseInt(stringB));
    }

}
