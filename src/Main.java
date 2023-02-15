public class Main {
    public static void main(String[] args) {


       Backend []backends={new CSsharp(),new Python(), new Java()};
        for (Backend a :backends) {
            System.out.println(a.getClass());
            if (a instanceof CSsharp){
                CSsharp cSsharp = (CSsharp) a;
                cSsharp.dotNet();
            }else if (a instanceof Python){
                Python python = (Python) a;
                python.django();
            } else if (a instanceof  Java) {
                Java java = (Java) a;
                java.spring();
            }
        }

    }
}