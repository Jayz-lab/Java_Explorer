/*
Modeling Classes
- Objects & Classess: Objs are based on Classes, Classess are used for design and objs are made during runtime.
- analysis according to use cases.

Modeling Properties/Attributes and Behaviours
- Classes are modeled using Unified Modelling Language(UML)diagrams.
- UML model would contain descriptions of datd types, method, parameters and so on.

Benefits of Modeling is that it prevents future costly and time consumer remodelling of the app/program.
Modeling helps to get close to the ideal of the business needs and requiremeents.

*/

package duke.choice;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JJ
 */
public class Customer {
    private String name;
    private String size;
    //private int measurement = 3;
    
    //Exercise 5-1: Apply encapsulation
    /*
    //right click select insert code: Getter & Setter plus encapsulate
    //netBeans will replace all direct Clothing & Customer variable references 
    //in the main method of the ShopApp classn with corresponding set & get method invocations.
    */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    //Exercise 5-2: Overload a method
    //Add a new method to the customer class called setSize.
    //It should be similar to the existing setSize method, except it should accpt the int measurement paramter
    public void setSize(int measurement) {  
        //switch is different from orginal code
        //suggestion by netbeans to change to "rule switch"
        //looks cleaner and more compact compared to the first iteration
          switch (measurement) {
            case 1,2,3 -> setSize("S");
            case 4,5,6 -> setSize("M");
            case 7,8,9 -> setSize("L");
            default -> setSize("XL");
        }
    }
   
}

//Define Methods
//components of a method definition
/*
<access modifier- private, public.etc> <return type- void, double, int.etc> <method name> () {
        <method body>
        <return statement> 
}

//in code
public void printWishlist () {
    //method body
    String[] list = {"Golden hat", "Iron Boots";
for (String idea: list) {
    System.out.println(idea);
    }
}
public double getTotal(double price, int quality) {
    double total = price*quantity*tax;
    return total;
}
*/
