// A simple java file to test building java sources.

import okhttp3.OkHttpClient;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class JavaBuildTest {

  public static void main(String[] args) {
    OkHttpClient ok = new OkHttpClient.Builder()
            .readTimeout(500, TimeUnit.MILLISECONDS)  // Don't dawdle
            .writeTimeout(500, TimeUnit.MILLISECONDS)
            .build();

    System.out.println(ok);

    var lst = new ArrayList<String>();
    lst.add("string1");
    lst.add("string2");

    var modded = lst.stream()
      .map((var s) -> s + "-" + s)
      .collect(Collectors.toUnmodifiableList());

    for (String item : modded) {
      System.out.println("Item: " + item);
    }

    RuntimeMXBean mxBean = ManagementFactory.getRuntimeMXBean();
    System.out.println("JVM Name: " + mxBean.getName());
    System.out.println("JVM SpecVersion: " + mxBean.getSpecVersion());
    System.out.println("JVM vmVersion: " + mxBean.getVmVersion());
  }
}
