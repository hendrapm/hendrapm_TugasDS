package APITest;

import com.intuit.karate.junit5.Karate;

public class postRunner {
  @Karate.Test
  public Karate runPost() {
    return Karate.run("postRequest").relativeTo(getClass());
  }

  @Karate.Test
  public Karate runPostWithTag() {
    return Karate.run("postRequest").tags("@usertest").relativeTo(getClass());
  }
}
