package com.pruebaluis


import org.apache.spark.{SparkConf, SparkContext}

object HelloWorld extends App {
  // Set up Spark configuration
  //private val conf = new SparkConf().setAppName("HelloSpark").setMaster("local[*]")

  // Create a Spark context
  //private val sc = new SparkContext(conf)

  // Actual Spark code here
  //private val helloRDD = sc.parallelize(Seq("Hello", "Spark"))
  //helloRDD.foreach(println)

  // Stop the Spark context
  //sc.stop()

  private val sparkContext = new SparkContext(master = "local", appName = "Hello World")
  private val sourceRDD = sparkContext.textFile(path = "C:\\Users\\LEnriquez\\3D Objects\\Downloads\\testFile.txt")
  sourceRDD.take(num = 3).foreach(println)
}
