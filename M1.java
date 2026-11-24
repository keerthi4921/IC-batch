package Day2;

class Printer{
    void print(String text){
        System.out.println("Text:"+text);

    }
    void print(int number){
        System.out.println("Integer:"+number);

    }
    void print(double decimal){
        System.out.println("Decimal:"+decimal);

    }

}

public class M1 {
    public static void main(String[] args) {
        Printer p=new Printer();
        p.print("Sneha");
        p.print(7);
        p.print(77.3);
    }
    
}
