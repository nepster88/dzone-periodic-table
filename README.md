

# Solution Overview

 Input the test data in dzone-periodic-table/periodic-table/test/periodic-table-input.properties and execute test class.
 
 
* Main class --> dzone-periodic-table/periodic-table/src/me/tejas/dzone/trigger/Executor.java
* Service Class --> dzone-periodic-table/periodic-table/src/me/tejas/dzone/service/PeriodTableValidatorService.java
* Junit test case --> dzone-periodic-table/periodic-table/test/me/tejas/dzone/service/test/PeriodicTableTest.java
 


# Dzone Java Challange 

The inhabitants of the planet Splurth are building their own periodic table of the elements. Just like Earth's periodic table has a chemical symbol for each element (H for Hydrogen, Li for Lithium, etc.), so does Splurth's. However, their chemical symbols must follow certain rules:

* All chemical symbols must be exactly two letters, so B is not a valid symbol for Boron.
* Both letters in the symbol must appear in the element name, but the first letter of the element name does not necessarily need to appear in the symbol. So Hg is not valid for Mercury, but Cy is.
* The two letters must appear in order in the element name. So Vr is valid for Silver, but Rv is not. To be clear, both Ma and Am are valid for Magnesium, because there is both an a that appears after an m, and an m that appears after an a.
* If the two letters in the symbol are the same, it must appear twice in the element name. So Nn is valid for Xenon, but Xx and Oo are not.

As a member of the Splurth Council of Atoms and Atom-Related Paraphernalia, you must determine whether a proposed chemical symbol fits these rules.

## Details
Write a function that, given two strings, one an element name and one a proposed symbol for that element, determines whether the symbol follows the rules. If you like, you may parse the program's input and output the result, but this is not necessary.

The symbol will have exactly two letters. Both element name and symbol will contain only the letters a-z. Both the element name and the symbol will have their first letter capitalized, with the rest lowercase. (If you find that too challenging, it's okay to instead assume that both will be completely lowercase.)

## Examples
* Spenglerium, Ee -> true
* Zeddemorium, Zr -> true
* Venkmine, Kn -> true
* Stantzon, Zt -> false
* Melintzum, Nn -> false
* Tullium, Ty -> false

### Optional Bonus Challenges
* Given an element name, find the valid symbol for that name that's first in alphabetical order. E.g.Gozerium -> Ei, Slimyrine -> Ie.
* Given an element name, find the number of distinct valid symbols for that name. E.g. Zuulon -> 11.

