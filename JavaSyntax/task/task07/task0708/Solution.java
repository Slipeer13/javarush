package com.javarush.task.task07.task0708;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
import java.util.ArrayList;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
import java.io.BufferedReader;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
import java.io.InputStreamReader;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
/*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
Самая длинная строка                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
*/                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
public class Solution {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
    private static ArrayList<String> strings;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
    public static void main(String[] args) throws Exception {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
        strings = new ArrayList<String>();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
            for (int i = 0; i < 5; i++){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                strings.add(buff.readLine());                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
            }                                                                                                                                                                                                                         
                                                                                                                                                                                                                                                                                                                                                                                                                                                         
        int max = strings.get(0).length();                                                                                                                                                                                                                                                                                                             
                                                                                                                                                                                                                                                                                                                                                                    
            for (int i = 1; i < strings.size(); i++) {                                                                                                                                                                                                                                                                                                            
                if(strings.get(i).length() >= max)                                                                                                                                                                                                                                                                                                            
                    max = strings.get(i).length();                                                                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                                                                                        
            }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
            for (int i = 0; i < strings.size(); i++) {                                                                                                                                                                                                                                                                                                            
                if(strings.get(i).length() == max)                                                                                                                                                                                                                                                                                                            
                    System.out.println(strings.get(i));                                                                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                                                                                        
            }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
//напишите тут ваш код                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
}                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
