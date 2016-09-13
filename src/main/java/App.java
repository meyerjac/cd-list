import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import java.util.ArrayList;
import java.util.*;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("cds", request.session().attribute("cds"));
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/cd", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      ArrayList<CD> cds = request.session().attribute("cds");
      if (cds == null) {
        cds = new ArrayList<CD>();
        request.session().attribute("cds", cds);
      }

      String name = request.queryParams("user-cd");
      CD newCD= new CD(name);
      cds.add(newCD);
      Collections.sort(cds, CD.cdSort);

      model.put("template", "templates/success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
