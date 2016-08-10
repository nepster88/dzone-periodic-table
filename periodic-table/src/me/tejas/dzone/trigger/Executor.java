/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.tejas.dzone.trigger;

import me.tejas.dzone.service.PeriodTableValidatorService;

/**
 *
 * @author tmshah
 */
public class Executor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PeriodTableValidatorService service = new PeriodTableValidatorService();
        
        System.out.println("Spenglerium, Ee --> " +  service.isValidSymbolForElementName("Spenglerium", "Ee"));
        System.out.println("Zeddemorium, Zr --> " +  service.isValidSymbolForElementName("Zeddemorium", "Zr"));
        System.out.println("Venkmine, Kn --> " +  service.isValidSymbolForElementName("Venkmine", "Kn"));
        System.out.println("Stantzon, Zt --> " +  service.isValidSymbolForElementName("Stantzon", "Na"));
        System.out.println("Melintzum, Nn --> " + service.isValidSymbolForElementName("Melintzum", "Nn"));
        System.out.println("Tullium, Ty --> " + service.isValidSymbolForElementName("Tullium", "Ty"));
       
        
    }
    
}
