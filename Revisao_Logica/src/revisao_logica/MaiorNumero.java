/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao_logica;

/**
 *
 * @author federal
 */
public class MaiorNumero {

    /**
     *
     * @param n
     * @return
     */
    public static Comparable maiorNumero(Comparable... n){
        Comparable result = null;
        
        for (int i = 0; i < n.length-1; i++) {
            result = (n[i].compareTo(n[i+1]) > 0) ? n[i] : n[i+1];     
        }
        if(result == null){
            return new Comparable(){
                public int compareTo(Object o){
                    return 0;
                }
                
                public String toString(){
                    return "null";
                }
            };
        }else{
            return result;
        }
    }
    
    public static int maiorNumero(int a, int b){
        return (a > b) ? a : b;
    }
    
    
    
    
         
}
 