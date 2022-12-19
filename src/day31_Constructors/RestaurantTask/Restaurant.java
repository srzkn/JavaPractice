package day31_Constructors.RestaurantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    public String owner, location;
    public int numberOfStars;
    public ArrayList<Server>myServers=new ArrayList<>();
    public ArrayList<Chef>myChefs=new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    public void hireServer(Server server){
        myServers.add(server);
    }
    public void hireServer(Server[] servers){
        myServers.addAll(Arrays.asList(servers));
    }

    public void hireChef(Chef chef){
        myChefs.add(chef);
    }
    public void hireChef(Chef[] chefs){
        myChefs.addAll(Arrays.asList(chefs));
    }

    public void terminateChef(int employeeID){
        myChefs.removeIf(p-> p.employeeID==employeeID);
    }
    public void terminateServer(int employeeID){
        myServers.removeIf(p-> p.employeeID==employeeID);
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", number of Chefs=" + myChefs.size() +
                ", number of Servers=" + myServers.size() +
                '}';
    }
}
