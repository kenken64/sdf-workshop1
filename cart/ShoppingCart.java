package cart;

import java.util.*;
import java.io.Console;

public class ShoppingCart {
    public static void main(String[] args){
        System.out.println("Shopping cart");
        List<String> cart = new LinkedList<>();
        Console cons = System.console();
        String input;
        int delIndex;
        boolean stop= false;

        cart.add("apple");
        cart.add("orange");
        cart.add("pear");

        // main loop
        while(!stop){
            input = cons.readLine("> ");
            System.out.printf("READ: %s\n", input);
            String[] terms = input.split(" ");
            String cmd = terms[0];
            
            switch(cmd){
                case "add":
                    String fruitsStr = terms[1];
                    String fruitsReplaced = fruitsStr.replace(",", " ");
                    String[] fruits = fruitsReplaced.split(" ");
            
                    for(int i=0; i < fruits.length; i++){
                        boolean found = false;
                        for(int j=0; j <cart.size(); j++){
                            if(fruits[i].equals(cart.get(j))){
                                found = true ;
                                break;
                            }
                        }
                        if(!found){
                            cart.add(fruits[i]);
                            System.out.printf("Added %s to cart\n", fruits[i]);
                        }
                    }
                    break;
                case "list":
                    if(cart.size()> 0){
                        for(int i=0; i < cart.size(); i++){
                            System.out.printf("%d. %s\n", (i+1), cart.get(i));
                        }
                    }else{
                        System.out.println("Your cart is empty!");
                    }
                    break;
            }
        }
        
    }
}