package day11_SwitchScanner;

public class CydeoBatchesSwitch {
    public static void main(String[] args) {
        String batch="EU", message;
        switch (batch)
        {
            case "EU":
                message="Class times are  10-5 EST. M, T, W, Th, F.";
                break;
            case "US morning":
                message="Class times are 10-5 EST. M, T, Th, F.";
                break;
            case "US evening":
                message="Class times are 7-10 EST. M, T, W, Th, S, S";
                break;
            default:
                message="Invalid Batch";
        }
        System.out.println(message);
        System.out.println("-------------------------------------------------");
        if (batch=="EU" || batch=="US morning" || batch=="US evening")
        {
switch (batch)
{
    case "EU":
        message="Class times are  10-5 EST. M, T, W, Th, F.";
        break;
    case "US morning":
        message="Class times are 10-5 EST. M, T, Th, F.";
        break;
    case "US evening":
        message="Class times are 7-10 EST. M, T, W, Th, S, S";
        break;
}
        }
        else{
                message="Invalid Batch";
        }
        System.out.println(message);
    }
}
