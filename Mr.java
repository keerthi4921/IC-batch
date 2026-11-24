package Day2;
class Bank{
    double getInterestRate(){
        return 0.0;

    }
}
class SBI extends Bank{
    @Override 
    double getInterestRate(){
        return 6.5;
    }
}
class HDFC extends Bank{
    @Override 
    double getInterestRate(){
        return 7.0;
    }
}

public class Mr{
    public static void main(String[] args) {
        SBI s=new SBI();
        HDFC h=new HDFC();
        System.out.println("SBI:"+s.getInterestRate()+"%");
        System.out.println("HDFC:"+h.getInterestRate()+"%");
    }
    
}
