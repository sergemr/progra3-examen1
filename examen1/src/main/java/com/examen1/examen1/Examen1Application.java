package com.examen1.examen1;
/*EXAMEN
 * GABRIEL JIMENEZ
 * ERICK VILLEGAS
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Examen1Application {

/*Se necesita un API para hacer pedidos en un almacen. Cada pedido lleva, cantidad, precio y descripcion. El api debe responder al URL /pedidos/ Deberia tener un controlador rest que administre una lista de pedidos. El API deberia tener 4 endpoints que hagan lo siguiente.

GET Endpoint que enumere los pedidos de la lista y la imprima en consola.
POST Endpoint que añada el pedido a la lista y la imprima en consola.
PUT que actualice el pedido (puede reemplazar el elemento un mediante el indice) y la imprima en consola
DELETE que remueva el pedido de la lista mediante el indice y la imprima en consola.
(Opcional) crear un webcontroller que contenga una descripcion breve del proyecto.
(Opcional) crear un metodo getTotal que calcule el monto del pedido + el IVA (15) y lo imprima en consola.


Evaluación
15% clonar y actualizar correctamente el GIT, commit y Pull request. S

10% Inicializar correctamente el proyecto y todas sus dependecias. S

15% Uso correcto de clases y controladores. S

15% methodo GET S

15% methodo POST S

15% methodo PUT S

15% methodo DELETE S

2.5% BONO si añade un webcontroller enumerando los endpoints. S
2.5% BONO si añade un un metodo getTotal que calcule el monto del pedido + el IVA (15%).
*/
	public static void main(String[] args) {
		SpringApplication.run(Examen1Application.class, args);
	}

}
