package com.json;

import org.json.JSONObject;

/**
 * Created by kang on 18/9/11.
 */
public class JsonObjectSample {

    public static void main(String[] args){

        JsonObject();
        System.out.println(WeekEnum.SATURDAY.name() );

    }

    /**
     * {
     "name":"名航",
     "alexa":10000,
     "sites": {
     "site1":"www.runoob.com",
     "site2":"m.runoob.com",
     "site3":"c.runoob.com"
     },
     "major":[
     "理发师",
     "程序员"
     ]
     }
     */
    //创建一个jsonObject
    private static void JsonObject() {

        JSONObject nullObject = null;
        JSONObject jsonObject = new JSONObject();
        JSONObject jsonObject1 = new JSONObject();

        jsonObject.put("name","名航");
        jsonObject.put("major",new String[]{"理发师","程序员"});
        jsonObject.put("car",nullObject);

        jsonObject1.put("site1","1");
        jsonObject1.put("site2","2");
        jsonObject1.put("site3","3");

        jsonObject.put("sites",jsonObject1);


        System.out.println(jsonObject.toString());

    }

}
