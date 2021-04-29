package edu.upc.eetac.dsa;

//import junit para el test
import edu.upc.eetac.dsa.Models.Pedido;
import edu.upc.eetac.dsa.Models.Producto;
import edu.upc.eetac.dsa.Models.Usuario;
import org.junit.Before;        //porq no me salia antes de escribir before
import org.junit.After;
import org.junit.Test;
import org.junit.Assert;


//import logger para mensajes
import org.apache.log4j.Logger;


public class ProductManagerImplTest {

    private static Logger logger = Logger.getLogger(ProductManagerImplTest.class);
    public ProductManager manager = null;



    Producto producto1, producto2, producto3;
    Usuario usuario1, usuario2, usuario3;
    Pedido pedido1, pedido2, pedido3;




    @Before
    public void setUp(){

        logger.info("Mensaje de informacion");
        logger.warn("Mensaje de alerta!!!!!");
        logger.error("Error!!!!!");

        //log4j properties????????????

        manager = ProductManagerImpl.getInstance();   //es correcto??????   sii!!!

        producto1 = new Producto("cocacola",10,2.3);
        producto2 = new Producto("pan",10,1.5);
        producto3 = new Producto("queso", 20,2.0);

        usuario1 = new Usuario("Manel");
        usuario2 = new Usuario("Juan");
        usuario3 = new Usuario("Juan");


        pedido1 = new Pedido();
        pedido1.addProduct("cocacola",2);
        pedido1.addProduct("pan",1);
        pedido1.addProduct("queso",3);
        pedido2 = new Pedido();
        pedido2.addProduct("cocacola",1);
        pedido3= new Pedido();
        pedido3.addProduct("pan",1);


        manager.addProducto(producto1);
        manager.addProducto(producto2);
        manager.addProducto(producto3);

        manager.addUser(001,usuario1);
        manager.addUser(002,usuario2);
        manager.addUser(003, usuario3);








    }

    @Test

    public void realizarPedido(){


        manager.newPedido(pedido1,usuario2);  //añadimos pedido a la cola de pedidos
        manager.newPedido(pedido2,usuario3);
        manager.newPedido(pedido3,usuario3);

        //logger.error();

        Assert.assertEquals(pedido2.getUser(), usuario3.getId());
        Assert.assertEquals(pedido3.getUser(), usuario3.getId());

        Assert.assertEquals(3, manager.getColaPedidos().size() );
        Assert.assertEquals(2, usuario3.getPedidosUser().size());


    }


    @Test

    public void servirTest(){

        manager.newPedido(pedido1,usuario2);
        Assert.assertEquals(1, manager.getColaPedidos().size());
        manager.servirPedido();
        Assert.assertEquals(0, manager.getColaPedidos().size());
        Assert.assertEquals(2, producto1.getNumVentas());



    }


    @Test
    public void ordenarPorVentas(){
        manager.newPedido(pedido1,usuario2);
        manager.servirPedido();

        Assert.assertEquals(3, manager.getProductsSales().get(0).getNumVentas());






    }



   @After

    public void tearDown(){
        manager.clearInstances();
   }











}
