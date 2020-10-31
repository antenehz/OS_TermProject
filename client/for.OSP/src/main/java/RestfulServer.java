import spark.Spark;
import spark.Request;
import spark.Response;

public class RestfulServer{
    public RestfulServer(){
        this.configureRestfulApiServer();
        this.processRestfulAPIRequests();
        }

        private void configureRestfulApiServer(){
        //Starting a Spark Microserver listening on the port specified
        Spark.port(8080);
        System.out.println("Server Configured to listen on port 8080");
        }
        // configure Spark's API request routs
        private void  processRestfulAPIRequests(){
        //stub for the http get method and first
            Spark.get("/", this::echoRequest);
        }
        // mathod that implements a spark rout
        private String echoRequest(Request request, Response response){
        //set a response content type to application/json
        response.type(contentType:"applcation/json");
        response.head("Access-Control-Allow-Origin", "*");
        response.status(200); // status is successful
        return HttpRequestToJson;
        }

        //return all the properties of the requests coming in
        private String HttpRequestToJson(Request request){
        return "{\n"
                +
                    "\"body\":\"" + request.body() + "\", \n"
                + "}";
        }
        public static void main(String[] argv){

        RestfulServer restfulServer = new RestfulServer();
        }
        }