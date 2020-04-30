load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive", "http_file")
load("@bazel_tools//tools/build_defs/repo:git.bzl", "git_repository", "new_git_repository")

http_archive(
    name = "openjdk11_linux_archive",
    build_file_content = "java_runtime(name = 'runtime', srcs =  glob(['**']), visibility = ['//visibility:public'])",
    sha256 = "df0de67998ac0c58b3c9e83c86e2a81daca05dc5adc189d942bc5d3f4691e749",
    strip_prefix = "zulu11.39.15-ca-jdk11.0.7-linux_x64",
    urls = [
        "https://cdn.azul.com/zulu/bin/zulu11.39.15-ca-jdk11.0.7-linux_x64.tar.gz",
    ],
)

RULES_JVM_EXTERNAL_TAG = "3.2"

http_archive(
    name = "rules_jvm_external",
    sha256 = "82262ff4223c5fda6fb7ff8bd63db8131b51b413d26eb49e3131037e79e324af",
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    artifacts = [
        "com.squareup.okhttp3:okhttp:3.14.3",
    ],
    fetch_sources = True,
    maven_install_json = "//:maven_install.json",
    repositories = [
        "https://repo1.maven.org/maven2",
    ],
    version_conflict_policy = "pinned",
)

load("@maven//:defs.bzl", "pinned_maven_install")

pinned_maven_install()
