public class RevisaoAed {

    public int fibLoop(int n){//deu um erro aq pq esqueci de colocar o tipo, TEM Q TER O TIPO
      //tem q criar as variaveis
      int ultimo=0;
      int segundo=1;
      int primeiro=0;
  
      //colocar condições para n=1 e n=2 pq ambos são 1
      if (n<=1) {
        return n;//n pd ser 1
      }

      for(int i=2; i<=n; i++){
        ultimo=primeiro+segundo;
        primeiro=segundo;
        segundo=ultimo;
      }
      return ultimo;
    }

    public int fibRec(int n){
        //parte do codigo q precisa utilizar a função recursiva para resolver
        if (n<=1) {
            return n;
        }else{
            return fibRec(n-1)+fibRec(n-2);
        }
    }

  }
  