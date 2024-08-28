class RevisaoAED1 {

    public static void main(String[] args){//vetor de argumentos, padrão: lista de argumentos, vetor... no plural, vetor sempre de no plural
        int numCirc=Integer.parseInt(args[0]);//percorre a string e transforma para o numero correspondente da ascii
        
        double[]raios=new double[numCirc];
        double[]areas=new double[numCirc];

        for(int i =0; i<numCirc; i++){//for (int i = 0; i < raios.length; i++)da o tamanho
            raios[i]=Math.random();//entre 0 e 1, gera numeros aleatorios
            areas[i]=Math.PI*raios[i]*raios[i];

            System.out.println("area do circulo com raio "+raios[i]+"é igual a"+areas[i]);//print com \n no final
        }
    }
}

