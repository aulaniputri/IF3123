public class Kelipatan5 {
    private int N;
    
    public void kelipatan_lima(){
        for(N = 1; N <= 1000; N++){
            if(N % 5 == 0){
                System.out.print(N+", ");
                
                if (N%50 == 0){
                    System.out.println("");
                }
            }
        }
    }
}
