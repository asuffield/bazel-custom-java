load(                                                                                                                                                                                                                                 
    "@bazel_tools//tools/jdk:default_java_toolchain.bzl",                                                                                                                                                                             
    "JDK9_JVM_OPTS",                                                                                                                                                                                                                  
    "default_java_toolchain",                                                                                                                                                                                                         
)

JDK11_JVM_OPTS = [
    # In JDK9 we have seen a ~30% slow down in JavaBuilder performance when using
    # G1 collector and having compact strings enabled.
    "-XX:+UseParallelOldGC",
    "-XX:-CompactStrings",
    # Allow JavaBuilder to access internal javac APIs.
    "--add-exports=jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED",
    "--add-exports=jdk.compiler/com.sun.tools.javac.code=ALL-UNNAMED",
    "--add-exports=jdk.compiler/com.sun.tools.javac.comp=ALL-UNNAMED",
    "--add-exports=jdk.compiler/com.sun.tools.javac.file=ALL-UNNAMED",
    "--add-exports=jdk.compiler/com.sun.tools.javac.main=ALL-UNNAMED",
    "--add-exports=jdk.compiler/com.sun.tools.javac.tree=ALL-UNNAMED",
    "--add-exports=jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED",
    "--add-opens=jdk.compiler/com.sun.tools.javac.file=ALL-UNNAMED",

    # override the javac in the JDK.
    # "--patch-module=java.compiler=$(location @bazel_tools//tools/jdk:java_compiler_jar)",
    # "--patch-module=jdk.compiler=$(location @bazel_tools//tools/jdk:jdk_compiler_jar)",

    # quiet warnings from com.google.protobuf.UnsafeUtil,
    # see: https://github.com/google/protobuf/issues/3781
    # and: https://github.com/bazelbuild/bazel/issues/5599
    "--add-opens=java.base/java.nio=ALL-UNNAMED",
    "--add-opens=java.base/java.lang=ALL-UNNAMED",
]

JAVAC_OPTS = [
    # From https://github.com/bazelbuild/bazel/blob/e70f12162d18159c4ef2506e7d9d24fb6642f2c6/tools/jdk/default_java_toolchain.bzl
    "-XDskipDuplicateBridges=true",
    "-g",
    "-parameters",
]

# NB: If adding jvm_opts or javac_opts, ensure that default options defined
# in [1] are copied into the list of options passed to this rule (it does not
# attempt to merge default and custom options, and only uses the opts that
# are provided the call to default_java_toolchain):
#  [1]: from https://github.com/bazelbuild/bazel/blob/master/tools/jdk/default_java_toolchain.bzl
default_java_toolchain(
    name = "jdk11_toolchain",
    jvm_opts = JDK11_JVM_OPTS,
    source_version = "11",
    target_version = "11",
    visibility = ["//visibility:public"],
    javacopts = JAVAC_OPTS,
)
