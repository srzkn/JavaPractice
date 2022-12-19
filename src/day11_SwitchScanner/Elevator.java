package day11_SwitchScanner;

public class Elevator {
    public static void main(String[] args) {
        int floorNumber=2;
        String message="", companies;
        if (floorNumber==1 || floorNumber==2 || floorNumber==3)
        {
            if (floorNumber==1)
            {
                companies="Lobby, Verizon, Starbucks";
            }
            else if (floorNumber==2)
            {
                companies="Cybertek, NASA, Intelsat";
            }
            else {
                companies="Lyft, BofA, Stake house";
            }
            message="Floor "+floorNumber+" selected. Companies: "+companies;
        }
        else
        {
            message="Invalid floor - "+floorNumber;
        }
        System.out.println(message);
        System.out.println("---------------------------------------------------");
        switch (floorNumber)
        {
            case 1:
                companies="Lobby, Verizon, Starbucks";
                message="Floor "+floorNumber+" selected. Companies: "+companies;
                break;
            case 2:
                companies="Cybertek, NASA, Intelsat";
                message="Floor "+floorNumber+" selected. Companies: "+companies;
                break;
            case 3:
                companies="Lyft, BofA, Stake house";
                message="Floor "+floorNumber+" selected. Companies: "+companies;
                break;
            default:
                message="Invalid floor - "+floorNumber;
        }
        System.out.println(message);
        System.out.println("--------------------------------------");
        if (floorNumber==1 || floorNumber==2 || floorNumber==3)
        {
            switch (floorNumber)
            {
                case 1:
                    companies="Lobby, Verizon, Starbucks";
                    break;
                case 2:
                    companies="Cybertek, NASA, Intelsat";
                    break;
                case 3:
                    companies="Lyft, BofA, Stake house";
                    break;
                default:
                    message="Invalid floor - "+floorNumber;
                    companies="";
            }
            message="Floor "+floorNumber+" selected. Companies: "+companies;
        }
        else {
            message="Invalid floor - "+floorNumber;
        }
        System.out.println(message);
    }
}
