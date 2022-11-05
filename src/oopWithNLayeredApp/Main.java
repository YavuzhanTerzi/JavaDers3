package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1,"Iphone 11",15000);

        ProductManager productManager = new ProductManager(new HibernateProductDao());
        productManager.add(product1);


    }
}