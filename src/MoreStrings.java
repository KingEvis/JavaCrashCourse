public class MoreStrings {
    public static void main(String[] args) {
        System.out.println("MoreStrings.java exercise");

        System.out.println("removeFirstX:");
        System.out.println(removeFirstX("xXX"));
        System.out.println(removeFirstX("Hello Mr.Xman"));
        System.out.println(removeFirstX("I am clean!"));
        System.out.println("-------------------------------");

        System.out.println("addingNot:");
        System.out.println(addingNot("Hes a plant"));
        System.out.println(addingNot("Marrys a bully"));
        System.out.println(addingNot("NoSpacesTest"));
        System.out.println("-------------------------------");

        System.out.println("startsWithHot");
        startsWithHot("No it does not start with hot");
        startsWithHot("Hot Pockets");
        startsWithHot("HOT hot ");
        startsWithHot("So fing hot");
        startsWithHot("hOt or not");


    }

    private static String removeFirstX(String s) {
        String result = "";
        //Code here and store the return value into result
        String sLower = s.toLowerCase();
        int PositionOfX = sLower.indexOf('x');
        if (PositionOfX == -1) {
            result = s;
            return result;
        }
        if (PositionOfX == 0){
            result = s.substring(1);
            return result;
        }
        if (PositionOfX > 0){
            result = (s.substring(0, PositionOfX)+s.substring(PositionOfX+1)); //need to add two strings together here
            return result;
        }
        return result;

    }

    private static String addingNot(String s) {
        String result = "";
        //Code here and store the return value into result
        int PositionOfSpace = s.indexOf(' ');
        if(PositionOfSpace == -1){
            result = s;
        }
        if (PositionOfSpace >= 0) {
            result = (s.substring(0, PositionOfSpace)+" Not " +s.substring(PositionOfSpace+1));
        }
        return result;
    }

    private static void startsWithHot(String s) {
        //Code here
        String sLower = s.toLowerCase();
        String firstThreeChar = sLower.substring(0, 3);
        System.out.println(firstThreeChar);
        System.out.println(firstThreeChar.equals("hot"));
//        if (firstThreeChar=="hot"){
//            System.out.println(true);
//        }
//        else{
//            System.out.println(false);
        }
    }


}

