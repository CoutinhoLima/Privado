package Atividade2;



public class funcao {

public static int fatorial(int num){
    num=4;
    if (num == 1) {
        return num;
    }else{
        int res = num * fatorial(num-2);
        System.out.println(res);
        return res;
    }

}




    public static void main(String[] args) {
    
    }
    
}
