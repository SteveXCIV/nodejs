// Resolvers
resolvers ++= Seq(
  Classpaths.typesafeReleases,
)

// Scala.js
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.2.0")

// Publishing
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.3")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "2.0.1")

