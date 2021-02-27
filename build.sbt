scalaVersion := "3.0.0-RC1"

scalacOptions ++= Seq(
  "-encoding:utf-8",
  "-deprecation",
  "-unchecked",
  "-feature",
  "-target:jvm-15",
  "-release:15",
  "-explain",
  "-explain-types",
  "-indent",
  "-new-syntax",
  "-source:future",
  "-language:adhocExtensions",
  "-language:strictEquality",
  "-language:experimental.macros",
  "-language:higherKinds",
  "-Ycheck-init"
)

enablePlugins(JmhPlugin)

Jmh / run / javaOptions := Seq(
  "--add-opens=java.base/jdk.internal.misc=ALL-UNNAMED",
  "--add-opens=jdk.unsupported/sun.misc=ALL-UNNAMED",
  "--illegal-access=permit",
  "-server",
  "-Xss16m",
  "-XX:+IgnoreUnrecognizedVMOptions",
  "-XX:-RestrictContended",
  "-XX:+AlwaysPreTouch",
  "-XX:+DisableExplicitGC",
  "-XX:+TieredCompilation",
  "-XX:+UnlockDiagnosticVMOptions",
  "-XX:+UnlockExperimentalVMOptions",
  "-XX:+TrustFinalNonStaticFields",
  "-XX:+EnableJVMCI",
  "-XX:+EagerJVMCI",
  "-XX:+UseJVMCICompiler",
  "-XX:+UseCompressedOops",
  "-XX:+UseNUMA",
  "-XX:+UseNUMAInterleaving",
  "-XX:+UseStringDeduplication",
  "-XX:InitiatingHeapOccupancyPercent=33",
  "-XX:MaxInlineLevel=18",
  "-XX:MaxInlineSize=270",
  "-XX:MaxTrivialSize=12",
  "-XX:MaxGCPauseMillis=200",
  "-XX:ReservedCodeCacheSize=256m",
  "-XX:TargetSurvivorRatio=90",
  "-XX:+UseParallelGC",
  "-XX:+ClassUnloadingWithConcurrentMark",
  "-XX:+ScavengeBeforeFullGC",
  "-XX:+UseTLAB",
  "-XX:+ResizeTLAB",
  "-XX:+ExplicitGCInvokesConcurrent",
  "-XX:+ParallelRefProcEnabled",
  "-XX:+ExitOnOutOfMemoryError",
  "-XX:ConcGCThreads=8",
  "-XX:ParallelGCThreads=8"
)
