/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.tejas.dzone.service;

/**
 *
 * @author tmshah
 */
public class PeriodTableValidatorService {
    
    private String ELEMENT_SYMBOL_REGEX = "[A-Z][a-z]";
    private String ELEMENT_NAME_REGEX = "[A-Z]([a-z])+";

    public boolean isValidSymbolForElementName(String elementName, String symbol){
        
        boolean result = false;//System.out.println("name"+isValidElementName(elementName) + "  symbol "+isValidSymbol(symbol));
        if(isValidElementName(elementName) && isValidSymbol(symbol)){
            elementName = elementName.toLowerCase();
            symbol = symbol.toLowerCase();
            int index1 = elementName.indexOf(symbol.charAt(0));
            if(index1 > -1){
                int index2 = elementName.indexOf(symbol.charAt(1), index1 + 1);
                if(index2 > 0){
                    result = true;
                }
            }
        }               
        
        return result;                
                
    }
    
    private boolean isValidElementName(String elementName){
        return elementName.matches(ELEMENT_NAME_REGEX);
    }
    
    private boolean isValidSymbol(String symbol){
        return symbol.matches(ELEMENT_SYMBOL_REGEX);
        
    }
}
