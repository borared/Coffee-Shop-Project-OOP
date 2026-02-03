package com.javabean;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
     public static void main( String[] args )
    {

        Products serum = new Products("Latte", 2.5);
        ProductsItem item = new ProductsItem("Matcha", 3.5);
        System.out.println(item);
        
        cart.addProductsItem(Latte, 2);
        cart.addProductsItem(Matcha, 1);
        cart.printInfo();

        // Remove
        cart.removeProductsItem(0);
        cart.printInfo();

        // Update
        cart.updateQuantityProductsItem(0, 1);
        cart.printInfo();
    }

}
