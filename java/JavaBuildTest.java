// A simple java file to test building java sources.

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class JavaBuildTest {

  public static void main(String[] args) {
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
