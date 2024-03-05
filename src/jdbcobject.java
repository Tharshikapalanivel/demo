public class jdbcobject {
    public static void main(String[] args){
       Pqr obj=new Pqr();
    }
}

class Pqr{
    static {
        System.out.println("in static");
    }
    {
        System.out.println("in instance");
    }
}