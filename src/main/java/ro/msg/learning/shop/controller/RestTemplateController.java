package ro.msg.learning.shop.controller;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ro.msg.learning.shop.service.DistanceTimeService;


@Controller
@RequestMapping("/api")
public class RestTemplateController {

    private DistanceTimeService distance;

    @Autowired
    public void setDistance(DistanceTimeService distance) {
        this.distance = distance;
    }
    @GetMapping("/distance")
    public ModelAndView Api(){
        try {
            //method of DistanceTime Class
            String response=distance.calculate(); 

            System.out.println(response);

            JSONParser parser = new JSONParser();
            try {

                Object obj = parser.parse(response);
                JSONObject jsonobj=(JSONObject)obj;

                JSONArray dist=(JSONArray)jsonobj.get("rows");
                JSONObject obj2 = (JSONObject)dist.get(0);
                JSONArray disting=(JSONArray)obj2.get("elements");
                JSONObject obj3 = (JSONObject)disting.get(0);
                JSONObject obj4=(JSONObject)obj3.get("distance");
                JSONObject obj5=(JSONObject)obj3.get("duration");
                System.out.println(obj4.get("text"));
                System.out.println(obj5.get("text"));

            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }

        catch(Exception e) {
            System.out.println(e+"Exception Occurred");
        }

        return new ModelAndView("home");

    }
}
