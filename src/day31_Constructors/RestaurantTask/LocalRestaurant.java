package day31_Constructors.RestaurantTask;

import java.util.ArrayList;

public class LocalRestaurant {
    public static void main(String[] args) {
        Restaurant myrestaurant=new Restaurant("Esra Toker", "Paris", 5);
        ArrayList<Server>myServers=new ArrayList<>();
        ArrayList<Chef>myChefs=new ArrayList<>();
        Server server1=new Server("server1",31,10,false);
        Server server2=new Server("server2",32,10,false);
        Server server3=new Server("server3",33,10,false);
        Server server4=new Server("server4",34,10,false);
        Server server5=new Server("server5",35,10,false);
        Server[]servers={server1,server5,server2,server4,server3};

        Chef Chef1=new Chef("cook1",31,10,false);
        Chef Chef2=new Chef("cook2",32,10,false);
        Chef Chef3=new Chef("cook3",33,10,false);
        Chef Chef4=new Chef("cook4",34,10,false);
        Chef Chef5=new Chef("cook5",35,10,false);
        Chef[]Chefs={Chef1,Chef5,Chef2,Chef4,Chef3};

        myrestaurant.hireServer(server2);
        myrestaurant.hireServer(server5);
        myrestaurant.hireServer(servers);
        myrestaurant.hireChef(Chef4);
        myrestaurant.hireChef(Chef4);
        myrestaurant.hireChef(Chefs);
        myrestaurant.terminateChef(33);
    System.out.println(myrestaurant);
    }
}
