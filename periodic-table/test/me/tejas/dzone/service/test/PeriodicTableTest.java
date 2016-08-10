/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.tejas.dzone.service.test;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import me.tejas.dzone.service.PeriodTableValidatorService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tmshah
 */
public class PeriodicTableTest {
    
    private PeriodTableValidatorService service;
    private Properties testData;
    
    public PeriodicTableTest() {
        super();
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws IOException {
        this.service = new PeriodTableValidatorService();
        this.testData = new Properties();
        testData.load(this.getClass().getResourceAsStream("/periodic-table-input.properties"));
   }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
      @Test
      public void isValidSymbolForElementNameTest() {
        Enumeration<Object> keys = testData.keys();
        while(keys.hasMoreElements()){
            String key = (String) keys.nextElement();
            String[] periodicTableEntry = key.split(",");System.out.println("key"+periodicTableEntry.length);
            if(periodicTableEntry.length == 2){
                assertEquals( service.isValidSymbolForElementName(periodicTableEntry[0], periodicTableEntry[1]), Boolean.parseBoolean(testData.getProperty(key)));
            } else {
                throw new InvalidInputException("Please check periodic-table-input.peroeprties file entries.");
            }
            
        }
          
      }
}
