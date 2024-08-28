public class App {
    public static void main(String[] args) throws Exception {
        RevisaoAed revisaoaAed;
        revisaoaAed=new RevisaoAed();

        System.out.println("elemento n de fibo é: "+ revisaoaAed.fibLoop(3));
        System.out.println("elemento n de fibo na recursiva é: "+ revisaoaAed.fibRec(3));



    }
}
