package Examen

import org.apache.spark.sql.functions.col
import org.apache.spark.sql.{DataFrame, SparkSession}


object ejercicio5 {
  def readCSV(pathCSV: String)(spark: SparkSession):DataFrame={
    val df = spark.read
      .option("header", "true")
      .option("inferSchema", "true")
      .csv(pathCSV)
    df

  }
  def ingresoTotal(df:DataFrame):DataFrame={
    df.withColumn("ingreso_total", col("cantidad") * col("precio_unitario"))

  }
}
