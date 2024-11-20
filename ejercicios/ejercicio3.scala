package Examen

import org.apache.spark.sql.functions._
import org.apache.spark.sql.DataFrame

object ejercicio3 {
  def unir2DF(estudiantes: DataFrame, calificaciones: DataFrame): DataFrame = {
   val resultado = estudiantes.join(calificaciones, "id")
    resultado

  }
  def promedio(estudiantes: DataFrame, calificaciones: DataFrame):DataFrame = {
    val unirDF = unir2DF(estudiantes, calificaciones)
    unirDF.groupBy("id").agg(avg("nota").as("promedio"))

  }

}
