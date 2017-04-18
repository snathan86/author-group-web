cp -r libs_local/model/* ~/.ivy2/local/
~/sparkPlace/spark-2.1.0-bin-hadoop2.7/bin/spark-submit --class "medline.articles.Main" --master local[2] libs_local/medline.jar /tmp/exercise/input/med.json >> /tmp/spark_job.log
sbt compile run
