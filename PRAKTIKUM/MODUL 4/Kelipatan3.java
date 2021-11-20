public class Kelipatan3{
    private int N;
    
    public void Kelipatan_Tiga(){
        for(N = 1; N <= 1000; N++){
            if(N % 3 == 0){
                System.out.print(N+", ");
                
                if (N%20 == 0){
                    System.out.println("");
                }
            }
        }
    }
}
