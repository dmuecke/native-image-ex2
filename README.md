
## Fatal error:java.lang.NoClassDefFoundError: org/springframework/web/servlet/config/annotation/WebMvcConfigurer
Getting compile error when trying to build a native image

```shell
mvn clean package -Pbuilder
```

```text
     [/layers/paketo-buildpacks_native-image/native-image/com.sit.adbs.nativeimageex2.NativeImageEx2ApplicationKt:162]     analysis: 109,965.10 ms,  3.56 GB
[INFO]     [creator]     Fatal error:java.lang.NoClassDefFoundError: org/springframework/web/servlet/config/annotation/WebMvcConfigurer
[INFO]     [creator]     	at java.base/java.lang.Class.getDeclaringClass0(Native Method)
[INFO]     [creator]     	at java.base/java.lang.Class.getEnclosingClass(Class.java:1517)
[INFO]     [creator]     	at java.base/sun.reflect.annotation.AnnotatedTypeFactory.nestingForType(AnnotatedTypeFactory.java:96)
[INFO]     [creator]     	at java.base/sun.reflect.annotation.TypeAnnotationParser.buildAnnotatedType(TypeAnnotationParser.java:79)
[INFO]     [creator]     	at java.base/java.lang.reflect.Executable.getAnnotatedReturnType0(Executable.java:642)
[INFO]     [creator]     	at java.base/java.lang.reflect.Constructor.getAnnotatedReturnType(Constructor.java:618)
[INFO]     [creator]     	at com.oracle.svm.reflect.target.Target_java_lang_reflect_Executable$AnnotatedReturnTypeComputer.compute(Target_java_lang_reflect_Executable.java:168)
[INFO]     [creator]     	at com.oracle.svm.hosted.substitute.ComputedValueField.readValue(ComputedValueField.java:269)
[INFO]     [creator]     	at com.oracle.svm.core.meta.ReadableJavaField.readFieldValue(ReadableJavaField.java:35)
[INFO]     [creator]     	at com.oracle.svm.hosted.ameta.AnalysisConstantReflectionProvider.readValue(AnalysisConstantReflectionProvider.java:99)
[INFO]     [creator]     	at com.oracle.svm.hosted.ameta.AnalysisConstantReflectionProvider.readFieldValue(AnalysisConstantReflectionProvider.java:78)
[INFO]     [creator]     	at com.oracle.graal.pointsto.ObjectScanner.scanField(ObjectScanner.java:178)
[INFO]     [creator]     	at com.oracle.graal.pointsto.ObjectScanner.doScan(ObjectScanner.java:346)
[INFO]     [creator]     	at com.oracle.graal.pointsto.ObjectScanner.access$400(ObjectScanner.java:60)
[INFO]     [creator]     	at com.oracle.graal.pointsto.ObjectScanner$2$1.run(ObjectScanner.java:388)
[INFO]     [creator]     	at com.oracle.graal.pointsto.util.CompletionExecutor.lambda$execute$0(CompletionExecutor.java:173)
[INFO]     [creator]     	at java.base/java.util.concurrent.ForkJoinTask$RunnableExecuteAction.exec(ForkJoinTask.java:1426)
[INFO]     [creator]     	at java.base/java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:290)
[INFO]     [creator]     	at java.base/java.util.concurrent.ForkJoinPool$WorkQueue.topLevelExec(ForkJoinPool.java:1020)
[INFO]     [creator]     	at java.base/java.util.concurrent.ForkJoinPool.scan(ForkJoinPool.java:1656)
[INFO]     [creator]     	at java.base/java.util.concurrent.ForkJoinPool.runWorker(ForkJoinPool.java:1594)
[INFO]     [creator]     	at java.base/java.util.concurrent.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:183)
[INFO]     [creator]     Error: Image build request failed with exit status 1
[INFO]     [creator]     unable to invoke layer creator
[INFO]     [creator]     unable to contribute native-image layer
[INFO]     [creator]     error running build
[INFO]     [creator]     exit status 1
[INFO]     [creator]     ERROR: failed to build: exit status 1
```

