package get;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.response.Response;
import org.junit.Test;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class ReqRes {
    //deserialization json -> java
    //serialization java -> json
    @Test
    public void ReqRes(){
        Response response = RestAssured.given().header("Accept", "application/json")
                .when().get("https://reqres.in/api/users?page=2")
                .then().statusCode(200).extract().response();
        Map<Object, Object> deserializedResponse = response.as(new TypeRef<>() {});
            System.out.println(deserializedResponse.get("per_page"));
        System.out.println(deserializedResponse.get("total_pages"));
        System.out.println(deserializedResponse.get("support"));
        List<Map<Object, Object>> dataList = (List<Map<Object, Object>>) deserializedResponse.get("data");
        //System.out.println(dataList);
        for (int i = 0;i<dataList.size();i++){
            System.out.println(dataList.get(i).get("email"));
            System.out.println(dataList.get(i).get("avatar"));
        }
    }
}
