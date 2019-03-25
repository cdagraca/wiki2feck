
name := "wiki2feck"

version := "1.0"

scalaVersion := "2.11.12"
crossScalaVersions  := Seq("2.11.2", "2.10.4")

resolvers ++= Seq(
  "opennlp sourceforge repo" at "http://opennlp.sourceforge.net/maven2",
  Resolver.jcenterRepo,
  "Twitter Maven Repository" at "https://maven.twttr.com"
)

libraryDependencies += "com.google.guava" % "guava" % "16.0.1"

libraryDependencies += "xerces" % "xercesImpl" % "2.11.0"

libraryDependencies += "com.github.jponge" % "lzma-java" % "1.3"

libraryDependencies += "org.apache.commons" % "commons-compress" % "1.5"

libraryDependencies += "commons-compress" % "commons-compress" % "20050911"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.2.0" % "provided"

libraryDependencies += "com.bizo" % "mighty-csv_2.10" % "0.2"

libraryDependencies += "net.debasishg" %% "redisclient" % "2.13"

libraryDependencies += "org.scalanlp" % "chalk_2.10" % "1.3.2"  excludeAll (
  ExclusionRule(organization = "com.typesafe.sbt", name = "sbt-pgp"),
  ExclusionRule(organization = "com.typesafe.akka")
  )

libraryDependencies += "org.apache.opennlp" % "opennlp-tools" % "1.5.2-incubating"

libraryDependencies += "com.github.rholder" % "snowball-stemmer" % "1.3.0.581.1"




