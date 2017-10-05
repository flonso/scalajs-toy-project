enablePlugins(ScalaJSPlugin)
enablePlugins(JSDependenciesPlugin)

name := "Scala.js Tutorial"
scalaVersion := "2.12.2"

scalaJSUseMainModuleInitializer := true

//libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.3"
libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.9.2"

skip in packageJSDependencies := false
jsDependencies += "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js"
jsDependencies += RuntimeDOM

jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()
