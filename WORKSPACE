load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive", "http_file")

http_archive(
    name = "openjdk11_linux_archive",
    build_file_content = "java_runtime(name = 'runtime', srcs =  glob(['**']), visibility = ['//visibility:public'])",
    sha256 = "cd807601c93d2e9c0e524b251d277da0add8026c4a7fb9908c72dcc19135edc6",
    strip_prefix = "zulu11.33.15-ca-jdk11.0.4-linux_x64",
    urls = [
        "https://cdn.azul.com/zulu/bin/zulu11.33.15-ca-jdk11.0.4-linux_x64.tar.gz",
    ],
)
