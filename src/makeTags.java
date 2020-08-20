public class makeTags {
  public String makeTags(String tag, String word) {
    String result = "";
    result = "<" + tag + ">" + word + "</" + tag + ">";
    return result;
  }
}
