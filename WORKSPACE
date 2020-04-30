load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive", "http_file")
load("@bazel_tools//tools/build_defs/repo:git.bzl", "git_repository", "new_git_repository")

http_archive(
    name = "remote_jdk12_linux",
    build_file_content = "java_runtime(name = 'runtime', srcs =  glob(['**']), visibility = ['//visibility:public'])",
    sha256 = "529c99841d69e11a85aea967ccfb9d0fd40b98c5b68dbe1d059002655e0a9c13",
    strip_prefix = "zulu12.2.3-ca-jdk12.0.1-linux_x64",
    urls = [
        "https://mirror.bazel.build/openjdk/azul-zulu12.2.3-ca-jdk12.0.1/zulu12.2.3-ca-jdk12.0.1-linux_x64.tar.gz",
    ],
)

http_archive(
    name = "remote_java_tools_linux",
    sha256 = "fc199be2c7873b0792e00743679fedc1d249fa779c3fe7676111f8d7ced9f2b4",
    urls = ["https://mirror.bazel.build/bazel_java_tools/releases/javac12/v2.0/java_tools_javac12_linux-v2.0.zip"],
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
