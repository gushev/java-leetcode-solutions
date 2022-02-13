package dailycodingproblem.imperialsystemconversion;

import java.util.HashMap;
import java.util.Map;

public class Main {
  static final Map<String, Double> units = new HashMap<>() {{
    put("twip", 1/17280d);
    put("thou", 1/12000d);
    put("barleycorn", 1/36d);
    put("inch", 1/12d);
    put("hand", 1/3d);
    put("foot", 1d);
    put("yard", 3d);
    put("chain", 66d);
    put("furlong", 660d);
    put("mile", 5280d);
    put("league", 15840d);
  }};

  public static void main(String[] args) {
    System.out.println(convert("foot", "foot", 1));
  }

  private static double convert(String from, String to, int quantity) {
    double inFeet = units.get(from) * quantity;
    return inFeet / units.get(to);
  }
}
