package APITest;

import com.intuit.karate.junit5.Karate;

public class getRunner {
  @Karate.Test
  public Karate runGet() {
    return Karate.run("getRequest").relativeTo(getClass());
  }

  @Karate.Test
  public Karate runGetWithTag() {
    return Karate.run("getRequest").tags("@usertest").relativeTo(getClass());
  }
}
