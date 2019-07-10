import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class imageEditor {

    //ImageEditorApi
    public static void main(String[] args) {
        RestAssured.baseURI = "https://image-editor.dev.api.ebt.albelli.com";
        //"/api/EditGet/editByUrl?url=https%3A%2F%2Fwww.gstatic.com%2Fwebp%2Fgallery%2F1.jpg"
            given().
                param("url", "https%3A%2F%2Fwww.gstatic.com%2Fwebp%2Fgallery%2F1.jpg");
            when().
                get("/api/EditGet/editByUrl").
                then().assertThat().statusCode(200);

    }
}
