package Examen
import ejercicio4._
import utils.TestInit


class ejercicio4Test extends TestInit {


  "ocurrencia" should "contar la cantidad de ocurrencias de cada palabra." in {

    val palabras = List("hola", "hola", "que", "tal", "tal", "soy", "pablo", "pablo", "pablo")

    ocurrencia(palabras).collect().foreach(println)

  }


  }