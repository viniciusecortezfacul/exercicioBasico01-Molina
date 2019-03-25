/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao_logica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author federal
 */
public class NumeroDecrescente {
    
    public static List<Integer> numeroDecrescente(int a){
        List<Integer> result = new ArrayList();
        for(int i = 0 ; i <=a ; ++i){
            result.add(a-i);
        }
        return result;
    }
    
    
    
    
    
}
