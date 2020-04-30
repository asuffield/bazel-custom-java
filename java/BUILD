

java_library(
    name = "JavaBuildTestLib",
    srcs = ["JavaBuildTest.java"],
    deps = ["@maven//:com_squareup_okhttp3_okhttp"]
)
java_binary(
    name = "JavaBuildTest",
    srcs = ["JavaBuildTest.java"],
    deps = ["@maven//:com_squareup_okhttp3_okhttp", "@remote_java_tools_linux//:toolchain"]
)

java_binary(
    name = "JdkBug",
    srcs = ["JdkBug.java"],
)

