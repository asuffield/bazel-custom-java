load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive", "http_file")

http_archive(
    name = "openjdk11_linux_archive",
    build_file_content = "java_runtime(name = 'runtime', srcs =  glob(['**']), visibility = ['//visibility:public'])",
    sha256 = "df0de67998ac0c58b3c9e83c86e2a81daca05dc5adc189d942bc5d3f4691e749",
    strip_prefix = "zulu11.39.15-ca-jdk11.0.7-linux_x64",
    urls = [
        "https://cdn.azul.com/zulu/bin/zulu11.39.15-ca-jdk11.0.7-linux_x64.tar.gz",
    ],
)
