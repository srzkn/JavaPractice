package day10_Ternaries;

public class statusCodes {
    public static void main(String[] args) {
     int statusCode=604;
     String sr="";
     sr= (statusCode==200)? "OK" :(statusCode==201)? "Created" :(statusCode==202)? "Accepted"
             :(statusCode==301)? "Moved Permanently" :(statusCode==303)? "See Other"
             :(statusCode==304)? "Not Modified" :(statusCode==307)? "Nor Modified"
             :(statusCode==400)? "Bad Request" :(statusCode==401)? "Unauthorized"
             :(statusCode==403)? "Forbidden" :(statusCode==404)? "Not Found"
             :(statusCode==410)? "Gone" :(statusCode==500)? "Internal Server Error"
             :(statusCode==503)? "Service Unavailable" : "It is not a Known Status Code";
        System.out.println(sr);
    }
}
