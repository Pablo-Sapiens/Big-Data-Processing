package Examen
import org.apache.spark.sql.functions._
import org.apache.spark.sql.{DataFrame}

object ejercicio1 {

    def filter(estudiantes: DataFrame,nota:Int): DataFrame = {
      estudiantes.filter(col("nota") > nota)

    }
    def order(funcion:DataFrame):DataFrame ={
      funcion.sort(desc("nombre"))

    }
    def filterAndOrder(estudiantes:DataFrame, nota:Int):DataFrame = {
      val filtrado = filter(estudiantes, nota)
      order(filtrado)

    }
}

