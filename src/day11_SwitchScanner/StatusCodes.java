package day11_SwitchScanner;

public class StatusCodes {
    public static void main(String[] args) {
        int code=200;
        String sr="";
        switch (code)
        {
            case (200):
                sr="OK";
                break;
            case (201):
                sr="Created";
                break;
            case (202):
                sr="Accepted";
                break;
            case (301):
                sr="Moved Permanently";
                break;
            case (303):
                sr="See Other";
                break;
            case 304:
                sr="Not Modified";
                break;
            case 307:
                sr="Temporary Redirected";
                break;
            case 400:
                sr="Bad Request";
                break;
            case 401:
                sr="Unauthorized";
                break;
            case 404:
                sr="Not Found";
                break;
            case 410:
                sr="Gone";
                break;
            case 500:
                sr="Internal Server Error";
                break;
            case 504:
                sr="Service Unavailable";
                break;
            default:
                sr="Not known code number";
        }
        System.out.println(sr);
    }
}
