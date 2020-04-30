load(
    "@bazel_tools//tools/jdk:default_java_toolchain.bzl",
    "default_java_toolchain",
)

# NB: If adding jvm_opts or javac_opts, ensure that default options defined
# in [1] are copied into the list of options passed to this rule (it does not
# attempt to merge default and custom options, and only uses the opts that
# are provided the call to default_java_toolchain):
#  [1]: from https://github.com/bazelbuild/bazel/blob/master/tools/jdk/default_java_toolchain.bzl
default_java_toolchain(
    name = "jdk11_toolchain",
    source_version = "11",
    target_version = "11",
    visibility = ["//visibility:public"],
)
