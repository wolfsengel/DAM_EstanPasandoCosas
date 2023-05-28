package boletinesPedro2;

import java.util.*;

public class Modas{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int n = sc.nextInt();
            if(n==0) break;
            
            Map<Integer, Integer> frecuencias= new HashMap<>();
            int moda= -1;
            int maxFrecuencia=0;
            
            for(int i=0; i<n; i++){
                int x= sc.nextInt();
                frecuencias.put(x,frecuencias.getOrDefault(x,0) + 1);
                
                if(frecuencias.get(x)> maxFrecuencia){
                    moda = x ;
                    maxFrecuencia= frecuencias.get(x);
                }
            }
            System.out.println(moda);
        }
        sc.close();
    }
}