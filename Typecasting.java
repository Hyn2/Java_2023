public class Typecasting {
    private String name;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int square(int num) {
        return num*num;
    }

    double square(double df) {
        return df*df;
    }

    public static void main(String[] args) {
        Typecasting tc = new Typecasting(); 
        int result = tc.square(3); //squareInt method argument = 3
        System.out.println(result); // will return 3 * 3
        double result2 = tc.square(3.14); //squareDouble method argument = 3.14
        System.out.println(result2); // will return 3.14 * 3.14
        System.out.println(result * result2); // double로 typeCasting
    }
}
