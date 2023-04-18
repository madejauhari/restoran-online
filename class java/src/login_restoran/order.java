package login_restoran;

import java.util.ArrayList;
import java.util.HashMap;

public class order {

    private restaurant restaurant;
    private HashMap<menu, Integer> menus;
    private int distance;

    public order(restaurant restaurant) {
        this.restaurant = restaurant;
        this.menus = new HashMap<>();
    }

    public restaurant getRestaurant() {
        return this.restaurant;
    }
    public HashMap<menu, Integer> getMenus() {
        return this.menus;
    }
    public int getDistance() {
        return this.distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
    public int getTotalPrice() {
        int totalPrice = 0;
        for (menu menu : this.menus.keySet()) {
            totalPrice += menu.getHarga() * this.menus.get(menu);
        }
        totalPrice += this.distance * 1000;
        return totalPrice;
    }

    public void addMenu(menu menu, int quantity){
        if (this.menus.containsKey(menu)){
            int currentQuantity = this.menus.get(menu);
            this.menus.put(menu, currentQuantity + quantity);
        } else {
            this.menus.put(menu, quantity);
        }
    }
}
