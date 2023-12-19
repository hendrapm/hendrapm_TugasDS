package APITest;

import com.intuit.karate.junit5.Karate;

public class deleteRunner {
  @Karate.Test
  public Karate runDelete() {
    return Karate.run("deleteRequest").relativeTo(getClass());
  }

  @Karate.Test
  public Karate runDeleteWithTag() {
    return Karate.run("deleteRequest").tags("@usertest").relativeTo(getClass());
  }
}
