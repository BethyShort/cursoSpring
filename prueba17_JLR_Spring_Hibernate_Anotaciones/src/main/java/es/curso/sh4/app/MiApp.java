package es.curso.sh4.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import es.curso.sh4.configuracion.AppConfig;
import es.curso.sh4.pojo.Pedidos;
import es.curso.sh4.service.IPedidosService;

public class MiApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext contexto;
		
		contexto = new AnnotationConfigApplicationContext(AppConfig.class);
		
		IPedidosService servicio = (IPedidosService) contexto.getBean("pedidosServicio");
		
		Pedidos p = servicio.readPedidos(10248);
		
		System.out.println("recupero un pedido-->"+p.getIdpedido()+" "+p.getPais());
	}

}
