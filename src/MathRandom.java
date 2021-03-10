public class MathRandom {
    public static void main(String[] args) {
        System.out.println("MathRandom.java exercise");
        randomGen();
    }
    public static void randomGen(){
        double numA;
        int numB;
        int numC;
        //Code goes here
        numA=Math.random();
        numB= (int) (Math.random()*101);
        System.out.println(numA);
        System.out.println(numB);
    }
}
