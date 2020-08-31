
scalaVersion := "2.13.2"

PB.targets in Compile := Seq(
  scalapb.gen() -> (sourceManaged in Compile).value / "scalapb"
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.2"
)
